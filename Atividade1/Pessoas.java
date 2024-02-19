package Atividades.primeiro;

import java.util.Calendar;

/*
 Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. 
 Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma 
 pessoa. Crie um método para calcular a idade da pessoa.
 */

public class Pessoas {
	private String Nome;
	private String DataNascimento;
	private double AlturaMetros;
	private int Idade;
	
	public Pessoas() {
	}
	
	public Pessoas(String Nome2, int idade, double altura) {
		this.setNome(Nome2);
		this.setIdade(idade);
		this.setAlturaMetros(altura);
	}	
	
	public Pessoas(String Nome,String DataNascimento,double AlturaMetros){
		this.setNome(Nome);
		this.setAlturaMetros(AlturaMetros);
		this.setDataNascimento(DataNascimento);
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public void setIdade(int idade) {
		if(idade < 122 && 1 <= idade) {
			Idade = idade;			
		} else {
			Idade = 0;
		}
	}
	
	public void setAlturaMetros(double alturaMetros) {
		AlturaMetros = alturaMetros;
	}
	
	public void setDataNascimento(String dataNascimento) {
		String []Verificacao = dataNascimento.trim().split("/");
		
		if(Verificacao.length == 3) {
			DataNascimento = dataNascimento;
			IdadeNascimento();
		}
		else {
			System.out.println("Por favor utilizar essa formatação: dd/mm/aaaa");
		}
	}
	
	public void IdadeNascimento() {
		Calendar calendar = Calendar.getInstance();
		String[] Ano = getDataNascimento().split("/");
		
		int Idade = calendar.getWeekYear() - Integer.parseInt(Ano[2].trim());
		
		if(Idade < 122 && 1 <= Idade) {
			setIdade(Idade);			
		} else {
			setIdade(0);
		}
	}
	
	public String Informacoes() {
		if(getIdade() == 0)
			return "Idade invalida...";	
		else 
			return  "Nome: "+ getNome() +"\nIdade: "+ getIdade() +"\n"+ String.format("Altura: %.2fm\n",AlturaMetros);		
	}
	
	public int getIdade() {
		return Idade;
	}
	public String getNome() {
		return Nome;
	}
	
	
	public double getAlturaMetros() {
		return AlturaMetros;
	}
	
	public String getDataNascimento(){
		return "Nasceu em: "+ DataNascimento;
	}	
}
