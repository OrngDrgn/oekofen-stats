package orng.drgn.oekofen.repo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WarmWaterMetric {
	private String L_temp_set;
	private String L_ontemp_act;
	private String L_offtemp_act;
	private String L_pump;
	private String L_state;
	private String L_statetext;
	private String time_prg;
	private String sensor_on;
	private String sensor_off;
	private String mode_auto;
	private String mode_dhw;
	private String heat_once;
	private String temp_min_set;
	private String temp_max_set;
	private String name;
	private String smartstart;
	private String use_boiler_heat;
	private String oekomode;

}
