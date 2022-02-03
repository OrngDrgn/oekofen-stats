package orng.drgn.oekofen.client;

import java.time.ZonedDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(indexName = "oekofen-metrics")
@Getter
@Setter
@NoArgsConstructor
public class Metric {
	
	@Id
	private String id;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	private String timestamp;
	
	private SystemMetric system;
	private WeatherMetric weather;
	private ForecastMetric forecast;
	private HeatingMetric hk1;
	private WarmWaterMetric ww1;
	private PelletronicMetric pe1;
	private ErrorMetric error;
	
}
