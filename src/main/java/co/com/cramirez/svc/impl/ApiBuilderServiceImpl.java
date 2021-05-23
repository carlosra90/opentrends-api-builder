package co.com.cramirez.svc.impl;

import java.io.Serializable;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import co.com.cramirez.client.RestClient;
import co.com.cramirez.model.dto.ExternalServiceDto;
import co.com.cramirez.model.dto.request.ApiBuilderRequestDto;
import co.com.cramirez.model.dto.response.ApiBuilderResponseDto;
import co.com.cramirez.model.entity.ApiBuilderEntity;
import co.com.cramirez.model.repository.ApiBuilderRepository;
import co.com.cramirez.svc.ApiBuilderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@Service
public class ApiBuilderServiceImpl implements ApiBuilderService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3877369242235710141L;
	private final RestClient<String, String> restClient;
	private final ExternalServiceDto externalDto;
	private final ApiBuilderRepository repository;

	public ApiBuilderServiceImpl(RestClient<String, String> restClient, ExternalServiceDto externalDto,
			ApiBuilderRepository repository) {
		super();
		this.restClient = restClient;
		this.externalDto = externalDto;
		this.repository = repository;
	}

	@Override
	public ResponseEntity<ApiBuilderResponseDto> doRestCall(ApiBuilderRequestDto request) {
		log.info("request received {}", request.toString());
		saveEntity(request);

		HttpEntity<String> entity = null;
		ApiBuilderResponseDto response = null;
		try {
			ResponseEntity<String> responseExternal = restClient.executeGet(externalDto.getUrl(), entity, String.class);
			log.info("Finalizing consume ... [Exteral response= {}]", responseExternal.getBody());
			response = ApiBuilderResponseDto.builder().message("ok".concat(" ").concat(responseExternal.getBody()))
					.build();
			return new ResponseEntity<ApiBuilderResponseDto>(response, HttpStatus.OK);
		} catch (Exception e) {
			response = ApiBuilderResponseDto.builder().message(e.getMessage()).build();
			return new ResponseEntity<ApiBuilderResponseDto>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	private void saveEntity(final ApiBuilderRequestDto request) {
		ApiBuilderEntity entity = ApiBuilderEntity.builder().externalId(request.getExternalId()).name(request.getName())
				.repositoryPath(request.getRepositoryPath()).version(request.getVersion()).build();
		repository.save(entity);
		log.info("Entity saved {}", entity);
	}

}
