package payroll;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;



@Configuration
public class LoadDatabase {
	
	private static final Logger log= LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args ->{
			log.info("Preloading"+ repository.save(new Employee("Biblo Baggins", "burblar")));
			log.info("Preloading" + repository.save(new Employee("Froda Baggins", "thief")));
			
		};
	}

}
