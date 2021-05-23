package co.com.cramirez.model.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.com.cramirez.constraint.AlphabeticConstraint;
import co.com.cramirez.constraint.ExternalIdConstraint;
import co.com.cramirez.constraint.PathConstraint;
import co.com.cramirez.constraint.VersionConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ApiBuilderRequestDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2157278525465201100L;
	@JsonProperty("externalId")
	@ExternalIdConstraint
	private Integer externalId;

	@JsonProperty("name")
	@AlphabeticConstraint
	private String name;
	@JsonProperty("repositoryPath")
	@PathConstraint
	private String repositoryPath;
	@JsonProperty("version")
	@VersionConstraint
	private String version;

}
