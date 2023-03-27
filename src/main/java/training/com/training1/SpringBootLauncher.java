package training.com.training1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * This Luncher for the spring boot application.
 * 
 * @author manoj.bardhan
 *
 */
@SpringBootApplication
public class SpringBootLauncher extends SpringBootServletInitializer  {
	public static void main(String[] args) {
	//SpringApplication.run(TrainingController.class, args);
	SpringApplication.run(POAgileCoach.class, args);
	}
}
