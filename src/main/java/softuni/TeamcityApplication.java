package softuni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class TeamcityApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(TeamcityApplication.class, args);
//	}
//}

@SpringBootApplication
public class TeamcityApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TeamcityApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TeamcityApplication.class);
    }
}
