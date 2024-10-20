package br.com.alura.screenmatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.Service.ConsumoApi;
import br.com.alura.Service.ConverteDados;
import br.com.alura.model.DadosSerie;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		
		ConsumoApi consumoApi = new ConsumoApi();
		String json = consumoApi.obterDados("https://www.omdbapi.com/?apikey=26dd9d26&t=oz");

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json,DadosSerie.class);

		System.out.println(dados);


	}

}
