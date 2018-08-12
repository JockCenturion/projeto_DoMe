package heranca.DoMe;

public class CD extends Item{
	//Atributos
	private String artista;
	private int numFaixas;
	
	//Metodos Especiais
	public CD(String titulo, int tempReprod, String artista, int numFaixas) {
		super(titulo, tempReprod);
		this.artista = artista;
		this.numFaixas = numFaixas;
	}
	
	public String getArtista() {
		return this.artista;
	}
	
	public int getNumFaixas() {
		return this.numFaixas;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nArtista: " + this.artista + "\n" +
				"Numero de Faixas: " + this.numFaixas);
	}
	
	@Override
	public boolean equals(Object obj) {
		CD cd = (CD) obj;
		return (super.equals(obj) && artista.equalsIgnoreCase(cd.artista) && 
				numFaixas == cd.numFaixas);
	}
	
	@Override
	public CD clone() {
		return new CD(getTitulo(), getTempReprod(), getArtista(), getNumFaixas());
	}
}
