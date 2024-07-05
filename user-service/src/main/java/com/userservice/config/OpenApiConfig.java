package com.userservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

  public static final String API_USER_MANAGEMENT = "User Service";
  @Bean
  public OpenAPI openApi() {
    return new OpenAPI()
            .info(new Info()
                    .title("User Service API")
                    .description("API for managing users")
                    .version("1.0.0")
                    .license(new License().name("Apache License 2.0")
                            .url("https://www.apache.org/licenses/LICENSE-2.0")));
  }
}
