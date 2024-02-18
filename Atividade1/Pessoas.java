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
	boolean FormatacaoCorreta;
	
	public Pessoas() {
		
	}	
	
	public Pessoas(String Nome,String DataNascimento,double AlturaMetros){
		this.setNome(Nome);
		this.setDataNascimento(DataNascimento);
		this.setAlturaMetros(AlturaMetros);
	}
	
	public String Informacoes() {
		
		if(Idade() == -1) {
			return "Idade invalida...";
		} else {
			return  "Nome: "+ getNome() +"\n"+ Idade() +"\n"+ String.format("Altura: %.2fm\n",AlturaMetros);			
		}
	}
	
	public int Idade() {
		Calendar calendar = Calendar.getInstance();
		String[] Ano = getDataNascimento().split("/");
		
		int Idade = calendar.getWeekYear() - Integer.parseInt(Ano[2].trim());
		
		if(Idade < 122 && 1 <= Idade) {
			return Idade;			
		} else {
			return -1;
		}
		
	}
	

	public String getDataNascimento(){
		return "Nasceu em: "+ DataNascimento;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setDataNascimento(String dataNascimento){
		String []Verificacao = dataNascimento.trim().split("/");
		
		if(Verificacao.length == 3) {
			DataNascimento = dataNascimento;			
		}
		else {
			System.out.println("Por favor utilizar essa formatação: dd/mm/aaaa");
		}
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	

	public void setAlturaMetros(double alturaMetros) {
		AlturaMetros = alturaMetros;
	}

	public double getAlturaMetros() {
		return AlturaMetros;
	}

	
}
