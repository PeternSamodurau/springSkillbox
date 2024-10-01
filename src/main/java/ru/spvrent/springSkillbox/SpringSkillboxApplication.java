package ru.spvrent.springSkillbox;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
public class SpringSkillboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSkillboxApplication.class, args);
		log.info("__________________________________Application started" + new Date());
	}

}
