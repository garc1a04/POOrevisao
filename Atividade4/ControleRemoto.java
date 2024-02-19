package Atividades.Quarto;
/*
 Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. 
 O controle de volume permite:
	1- aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
	2- aumentar e diminuir o número do canal em uma unidade
	3- trocar para um canal indicado;
	4 - consultar o valor do volume de som e o canal selecionado.
 */

public class ControleRemoto {
	private Televisao TV;
	
	private int Volume = 0;
	private int Canal = 0;
	
	public ControleRemoto(Televisao TV){
		this.TV = TV;
	}
	
	public void AumentarVolume() {
		TV.setVolume(Volume+=1);
	}
	
	public void DiminuirVolume() {
		TV.setVolume(Volume-=1);
	}
	
	public void AumentarNumeroCanal() {
		TV.setCanal(Canal+=1);
	}
	
	public void DiminuirNumeroCanal() {
		TV.setCanal(Canal-=1);
	}
	
	public void TrocarCanal(int Canal) {
		TV.setCanal(Canal);
	}
	
	public int ConsultarVolume() {
		return TV.getVolume();
	}
	
	public int ConsultarCanal() {
		return TV.getCanal();
	}
}
