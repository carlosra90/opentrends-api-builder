package co.com.cramirez.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public interface RestClient <R,C>{
	
	public ResponseEntity<C> executeGet(final String serviceUrl, final HttpEntity<R> request, final Class<C> responseClass);
	
	public ResponseEntity<C> executePost(final String serviceUrl, final HttpEntity<R> request, final Class<C> responseClass);

}
