package orng.drgn.oekofen.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HeatingMetric {
	private String L_roomtemp_act;
	private String L_roomtemp_set;
	private String L_flowtemp_act;
	private String L_flowtemp_set;
	private String L_state;
	private String L_statetext;
	private String L_pump;
	private String mode_auto;
	private String time_prg;
	private String temp_setback;
	private String temp_heat;
	private String temp_vacation;
	private String name;
	private String oekomode;
}
