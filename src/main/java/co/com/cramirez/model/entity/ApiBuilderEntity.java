package co.com.cramirez.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "apibuilder")
@ToString
public class ApiBuilderEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "externalid")
	private int externalId;

	@Column(name = "name")
	private String name;

	@Column(name = "repositorypath")
	private String repositoryPath;
	
	@Column(name = "version")
	private String version;
}
