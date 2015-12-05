package deber2;

public class tv {

	private int volumen_actual;
	private int canal_actual;
	boolean encendido;
	
	public void tv (){
		
	}
	public tv(int volumen_param, int canal_param) {
		this.volumen_actual=volumen_param;
		this.canal_actual=canal_param;
	}
	public void establecer_volumen(int volumen){
		volumen_actual=volumen;
	}
	public void establecer_canal(int canal){
		canal_actual=canal;
	}
	public int obetener_volumen(){
		return volumen_actual;
	}
	public int obtener_canal(){
		return canal_actual;
	}
	public void encender_tv(){
		encendido=true;
	}
	public void apagar_tv(){
		encendido=false;
	}
	public void subir_volumen(){
		if (encendido=true && volumen_actual>=100)
		volumen_actual++;
	}
	public void bajar_volumen(){
		if (encendido=true && volumen_actual<=0)
			volumen_actual--;
	}
	public void cambiar_canal_arriba(){
		if (encendido=true && canal_actual<=50)
			canal_actual++;
	}
	public void cambiar_canal_abajo(){
		if (encendido=true && canal_actual>=1)
			canal_actual++;
	}
	public String toString(){
		return "canal_actual: ["+canal_actual+"]: volumen_actual: ["+volumen_actual+":]";
	}
}
