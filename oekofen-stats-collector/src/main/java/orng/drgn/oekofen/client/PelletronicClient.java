package orng.drgn.oekofen.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import orng.drgn.oekofen.repo.Metric;

@FeignClient(name = "${orng.drgn.oekofen.url}/${orng.drgn.oekofen.password}")
public interface PelletronicClient {

	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	Metric getMetric();
}