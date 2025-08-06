package io.app.indiantourister.swagger.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI touristerOpenApi(){
        return new OpenAPI().info(new Info().title("Indian Tourister").version("V1.0")
                .summary("Document containing all the APIs related to Indian Tourister"));
    }
}
