package net.tataryn.swagger.issue320.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import com.wordnik.swagger.model.ApiInfo;

@EnableSwagger
@Configuration
public class SwaggerConfig {

	@Autowired
	private SpringSwaggerConfig springSwaggerConfig;

	@Autowired
	public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
		this.springSwaggerConfig = springSwaggerConfig;
	}

	@Bean
	public SwaggerSpringMvcPlugin swaggerSpringMvcPlugin() {
		return new SwaggerSpringMvcPlugin(springSwaggerConfig)
				.swaggerGroup("my-api").includePatterns("/outages/.*")
				.apiInfo(apiInfo()).build();
	}
	
	/**
	 * API Info as it appears on the swagger-ui page
	 */
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("My App API",
				"REST API for My App front-end", "",
				"somecontact@somewhere.com", "", "");
		return apiInfo;
	}
	
}
