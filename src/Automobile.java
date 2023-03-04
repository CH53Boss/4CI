
public class Automobile {
	private String marca;
	private String modello;
	private String targa;
	
	private Motore motore;
	
	public Automobile(String marca, String modello, String targa)
	{
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		
		motore = new Motore ("", "", 0.0f);
		
	}

	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", motore=" + motore + "]";
	}
	

}
