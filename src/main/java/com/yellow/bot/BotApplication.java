package com.yellow.bot;

import com.yellow.bot.model.DialogFlowQuery;
import com.yellow.bot.service.abstracts.IntentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@SpringBootApplication
public class BotApplication implements CommandLineRunner {

	private final IntentService intentService;

	public BotApplication(IntentService intentService) {
		this.intentService = intentService;
	}


	public static void main(String[] args) {
		SpringApplication.run(BotApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplateBuilder().build();
	}


	@Override
	public void run(String... args) throws Exception {

		String input = "Y";
		Scanner scanner = new Scanner(System.in);

		while(input.equalsIgnoreCase("Y")){
			System.out.println("Enter Your Query : \n");
			//Hello
			String query = scanner.nextLine();
			DialogFlowQuery dialogFlowQuery = new DialogFlowQuery(query);
			System.out.println(dialogFlowQuery);
			String response = intentService.handleQuery(dialogFlowQuery);
			System.out.println(response);
			System.out.println("Want to Continue : ? Press Y/N");
			input = scanner.nextLine();
		}

		System.exit(0);

	}
}
