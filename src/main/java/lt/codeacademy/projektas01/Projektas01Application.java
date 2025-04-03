package lt.codeacademy.projektas01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Projektas01Application {

	public static void main(String[] args) {
		SpringApplication.run(Projektas01Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)public void test(){
		System.out.println("Aplikacija sukonfiguruota");
	}
}
