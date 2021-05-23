package co.com.cramirez;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.sbb.esta.openshift.gracefullshutdown.GracefulshutdownSpringApplication;

@SpringBootApplication
public class ApiBuilderApplication {

	public static void main(String[] args) {
		GracefulshutdownSpringApplication.run(ApiBuilderApplication.class, args);
	}

}
