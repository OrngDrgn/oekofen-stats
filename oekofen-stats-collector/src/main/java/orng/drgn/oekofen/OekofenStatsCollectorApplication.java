package orng.drgn.oekofen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class OekofenStatsCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OekofenStatsCollectorApplication.class, args);
	}

}
