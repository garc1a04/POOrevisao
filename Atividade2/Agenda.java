package Atividades.segundo;

import java.util.ArrayList;
import java.util.List;
import Atividades.primeiro.Pessoas;

/*
 Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as 
 seguintes operações:
	void armazenaPessoa(String nome, int idade, float altura);
	void removePessoa(String nome);
	int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
	void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
	void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
 */
public class Agenda {
	private List<Pessoas> ListaPerson = new ArrayList<>();
	
	public void armazenaPessoa(String nome, int Idade, double altura) {
		Pessoas Persons = new Pessoas(nome,Idade,altura);
		
		if(ListaPerson.size() < 10) {
			if(Persons.Informacoes().equals("Idade invalida..."))
				System.out.println("Impossivel Adicionar essa Pessoa");
			else
				ListaPerson.add(Persons);						
		} else {
			System.out.println("Lotou a Agenda...");
		}
		
	}
	
	public void removePessoa(String nome) {
		for(Pessoas Person: ListaPerson) {
			if(Person.getNome().equals(nome)) { 
				ListaPerson.remove(Person);
				System.out.println("Removido...");
				break;
			}
		}
	}
	
	public int buscaPessoa(String nome) { // informa em que posição da agenda está a pessoa
		int Posicao = 0;
		
		for(Pessoas Person: ListaPerson) {
			if(Person.getNome().equals(nome)) {
				Posicao = ListaPerson.indexOf(Person);
			}
		}
		return Posicao;
	}
	
	public void imprimeAgenda() {  // imprime os dados de todas as pessoas da agenda
		for(Pessoas Person: ListaPerson) {
			System.out.println(Person.Informacoes());
		}
	}
	
	public void imprimePessoa(int index) { // imprime os dados da pessoa que está na posição “i” da agenda.
		System.out.println(ListaPerson.get(index).Informacoes());
		
	}
}
