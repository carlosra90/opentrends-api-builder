package co.com.cramirez.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.cramirez.model.dto.request.ApiBuilderRequestDto;
import co.com.cramirez.model.dto.response.ApiBuilderResponseDto;
import co.com.cramirez.svc.ApiBuilderService;

@RestController
public class ApiBuilderController {

	private final ApiBuilderService service;

	public ApiBuilderController(ApiBuilderService service) {
		super();
		this.service = service;
	}

	@PutMapping(value = "/")
	public ResponseEntity<ApiBuilderResponseDto> doRestCall(@Valid @RequestBody ApiBuilderRequestDto request) {
		return service.doRestCall(request);
	}
}
