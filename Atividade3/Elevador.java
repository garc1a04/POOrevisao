package Atividades.terceiro;
/*
	3. Crie uma classe denominada Elevador para armazenar as informações de um elevador
	dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
	no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
	presentes nele. 
	
	A classe deve também disponibilizar os seguintes métodos:
	
	Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
	andares no prédio (os elevadores sempre começam no térreo e vazio);
	
	Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
	espaço);
	
	Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
	dentro dele);
	
	Sobe : para subir um andar (não deve subir se já estiver no último andar);
	
	Desce : para descer um andar (não deve descer se já estiver no térreo);
	
	Encapsular todos os atributos da classe (criar os métodos set e get).
 */
public class Elevador {
	private int AndarAtual;
	private int TotalAndares;
	private int CapacidadeElevador;
	private int PessoasPresentes;
	
	public Elevador(int CapacidadeElevador,int TotalAndares) {
		Inicializar(CapacidadeElevador, TotalAndares);
	}
	
	public void Inicializar(int CapacidadeElevador,int TotalAndares){
		setCapacidadeElevador(CapacidadeElevador);
		setTotalAndares(TotalAndares);
		setAndarAtual(0);
		setPessoasPresentes(0);
	}
	
	public void setCapacidadeElevador(int capacidadeElevador) {
		CapacidadeElevador = capacidadeElevador;
	}
	public void setTotalAndares(int totalAndares) {
		TotalAndares = totalAndares;
	}
	public void setAndarAtual(int andarAtual) {
		AndarAtual = andarAtual;
	}
	public void setPessoasPresentes(int pessoasPresentes) {
		PessoasPresentes = pessoasPresentes;
	}
	
	public void Entrar() {
		if(getPessoasPresentes() < getCapacidadeElevador()) {
			PessoasPresentes++;
		} else {
			System.out.println("CABE MAIS GENTE NÃO MAN...");
		}
	}
	
	public void Sair() {
		if(getPessoasPresentes() != 0) {
			PessoasPresentes--;
		} else {
			System.out.println("Ta tirando fantasma é?");
		}
	}
	
	public int getPessoasPresentes() {
		return PessoasPresentes;
	}
	public int getCapacidadeElevador() {
		return CapacidadeElevador;
	}
	
	public void Sobe() {
		if(getAndarAtual() < getTotalAndares())
			AndarAtual++;
		else 
			System.out.println("Impossivel Subir...");
	}
	
	public void Desce() {
		if(getAndarAtual() != 0)
			AndarAtual--;
		else {
			System.out.println("Impossivel Descer...");
		}
	}
	
	public int getAndarAtual() {
		return AndarAtual;
	}
	public int getTotalAndares() {
		return TotalAndares;
	}
}