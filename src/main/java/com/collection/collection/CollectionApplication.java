package com.collection.collection;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

	@RequestMapping("/V1")
	String veiculo(){
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "Honda";
		meuCarro.cor = "Amarelo";
		meuCarro.anofabricacao = 2022;
		meuCarro.modelo = "civic";

		Cliente cliente = new Cliente();
		cliente.nome = "Marcelo";
		cliente.email = "a@gmail.com";

		Endereco endereco = new Endereco();
		endereco.rua = "M";
		endereco.numero = "10";
		endereco.cep = "a";

		meuCarro.cliente = cliente;
		cliente.endereco = endereco;

		Gson gson = new Gson();
		String json = gson.toJson(meuCarro);
		return json;

	}

}

