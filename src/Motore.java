
public class Motore {
	private String marca ;
	private String modello;
	private float cilindrata;
	
	public Motore (String marca, String modello, float cilindrata) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String toString() {
		return "Motore [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + "]";
	}
}
