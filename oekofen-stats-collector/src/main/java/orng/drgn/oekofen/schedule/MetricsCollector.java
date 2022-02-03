package orng.drgn.oekofen.schedule;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import orng.drgn.oekofen.client.Metric;
import orng.drgn.oekofen.client.PelletronicClient;
import orng.drgn.oekofen.repo.MetricsRepo;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class MetricsCollector {
	
	private final PelletronicClient client;
	private final MetricsRepo repo;

	@Scheduled(fixedRateString = "${orng.drgn.oekofen.rate}")
	public void collect() {
		Metric metric = client.getMetric();
		ZonedDateTime now = ZonedDateTime.now();
		metric.setTimestamp(now.format(DateTimeFormatter.ISO_DATE_TIME));
		metric.setId(String.format("pe1-%d", now.toEpochSecond()));
		repo.save(metric);
	}
}
