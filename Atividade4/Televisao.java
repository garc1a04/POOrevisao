package Atividades.Quarto;

public class Televisao {
	private int Volume;
	private int Canal;
	
	public int getVolume() {
		return Volume;
	}
	public void setVolume(int volume) {
		if(volume<=100 && volume>=0)
			Volume = volume;
	}
	public int getCanal() {
		return Canal;
	}
	public void setCanal(int canal) {
		if(canal>0 && canal<1000)
			Canal = canal;
		else
			System.out.println("Canal não existe");
	}
}
