package dev.Java10x.CadastroDeninjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.h2.tools.Server;
import java.sql.SQLException;

@SpringBootApplication
public class CadastroDeNinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDeNinjasApplication.class, args);
	}

	// Força a inicialização do Console do H2 em uma porta separada
	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
		return Server.createWebServer(
				"-web", "-webAllowOthers", "-webPort", "8082");
	}
}