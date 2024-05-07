package com.aluracursos.screenMatchSpring;

import com.aluracursos.screenMatchSpring.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchSpringApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi(); //es una variable de consumoApi
		//var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=Mr+robot&apikey=3d51a1ab"); //url de nuestra api
		var json = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
	}
}
