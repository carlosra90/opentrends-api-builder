package co.com.cramirez.model.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.application.services.external")
public class ExternalServiceDto {

	private String url;
}
