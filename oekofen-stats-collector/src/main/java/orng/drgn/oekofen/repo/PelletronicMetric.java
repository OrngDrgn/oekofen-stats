package orng.drgn.oekofen.repo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PelletronicMetric {
	private String L_temp_act;
	private String L_temp_set;
	private String L_ext_temp;
	private String L_frt_temp_act;
	private String L_frt_temp_set;
	private String L_br;
	private String L_ak;
	private String L_not;
	private String L_stb;
	private String L_modulation;
	private String L_uw_speed;
	private String L_state;
	private String L_statetext;
	private String L_type;
	private String L_starts;
	private String L_runtime;
	private String L_avg_runtime;
	private String L_uw_release;
	private String L_uw;
	private String L_storage_fill;
	private String L_storage_min;
	private String L_storage_max;
	private String L_storage_popper;
	private String storage_fill_yesterday;
	private String mode;
}
