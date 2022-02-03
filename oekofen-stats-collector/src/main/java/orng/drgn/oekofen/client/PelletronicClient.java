package orng.drgn.oekofen.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "oekofen", url = "${orng.drgn.oekofen.url}/${orng.drgn.oekofen.password}")
public interface PelletronicClient {

	@GetMapping(path = "/all", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_OCTET_STREAM_VALUE})
	Metric getMetric();
}
