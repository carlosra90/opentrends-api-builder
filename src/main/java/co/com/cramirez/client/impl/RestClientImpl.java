package co.com.cramirez.client.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import co.com.cramirez.client.RestClient;
import lombok.Data;

@Configuration
@Data
public class RestClientImpl<R, C> implements RestClient<R, C> {

	private final @Qualifier("restClient") RestTemplate restTemplate;

	@Override
	public ResponseEntity<C> executeGet(String serviceUrl, HttpEntity<R> request, Class<C> responseClass) {
		return restTemplate.exchange(serviceUrl, HttpMethod.GET, request, responseClass);
	}

	@Override
	public ResponseEntity<C> executePost(String serviceUrl, HttpEntity<R> request, Class<C> responseClass) {
		return restTemplate.exchange(serviceUrl, HttpMethod.POST, request, responseClass);
	}

}
