package orng.drgn.oekofen.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WeatherMetric {
	private String L_temp;
	private String L_clouds;
	private String L_forecast_temp;
	private String L_forecast_clouds;
	private String L_forecast_today;
	private String L_starttime;
	private String L_endtime;
	private String L_source;
	private String L_location;
	private String cloud_limit;
	private String hysteresys;
	private String offtemp;
	private String lead;
	private String refresh;
	private String oekomode;
}
