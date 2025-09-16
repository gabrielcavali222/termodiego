package br.com.unicuritiba;

import br.com.unicuritiba.repositories.Repository;
import br.com.unicuritiba.repositories.WordRepository;
import br.com.unicuritiba.repositories.PlayerRepository;

public class Application {

	public static void main(String[] args) {
		
		Repository repository = new WordRepository();

		repository.save("CREME");
		repository.save("ARROZ");
		repository.save("PUDIM");
		repository.save("PIZZA");
		repository.save("MILHO");
		
		repository = new PlayerRepository();

		repository.save("Diego");
		repository.save("Aron");
		repository.save("Lucas");
		repository.save("João");
	
		
		
	}

}
