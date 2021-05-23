package co.com.cramirez.svc;

import org.springframework.http.ResponseEntity;

import co.com.cramirez.model.dto.request.ApiBuilderRequestDto;
import co.com.cramirez.model.dto.response.ApiBuilderResponseDto;

public interface ApiBuilderService {

	public ResponseEntity<ApiBuilderResponseDto> doRestCall(ApiBuilderRequestDto request);
}
