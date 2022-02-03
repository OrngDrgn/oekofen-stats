package orng.drgn.oekofen.client;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
public class ClientConfiguration {

	@Bean
	MappingJackson2HttpMessageConverter messageConverter() {
		MappingJackson2HttpMessageConverter result = new MappingJackson2HttpMessageConverter();
		result.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
		return result;
	}
}
