package profile.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties
@SpringBootApplication
public class ProfilesApplication {

	@Bean(name = "george")
	@Profile("dev")
	public Person getDevPerson() {
		return new Person("Dave");
	}

	@Bean(name = "george")
	@Profile("prod")
	public Person getProdPerson() {
		return new Person("Paul");
	}

	public static void main(String[] args) {


		ApplicationContext ct = SpringApplication.run(ProfilesApplication.class, args);

		//System.out.println(ct.getBean("person"));
		System.out.println(ct.getBean("george"));
	}

}
