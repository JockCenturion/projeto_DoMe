package heranca.DoMe;

public abstract class Item {
	//Atributos
	private String titulo, comentario;
	private int tempReprod;
	private boolean gotIt;
	
	//Metodos Especiais
	public Item(String titulo, int tempReprod) {
		this.titulo = titulo;
		this.tempReprod = tempReprod;
		this.comentario = "Sem Comentarios";
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getTempReprod() {
		return this.tempReprod;
	}
		
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public String getComentario() {
		return this.comentario;
	}
	
	public void setGotIt(boolean gotIt) {
		this.gotIt = gotIt;
	}
	
	public boolean getGotIt() {
		return this.gotIt;
	}
	
	@Override
	public String toString() {
		return ("Titulo: " + this.titulo + "\n" +
				"Tempo de Reproducao: " + this.tempReprod + " minutos\n" +
				"Comentario: " + this.comentario + "\n" + 
				"Tenho? " + (this.gotIt ? "Sim" : "Nao"));
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Item) ) return false;
		if ( this == obj ) 			  return true;
		
		Item it = (Item) obj;
		return (titulo.equalsIgnoreCase(it.titulo) && tempReprod == it.tempReprod && 
				comentario.equalsIgnoreCase(it.comentario) && gotIt == it.gotIt);
	}

}
	
	
	
	
	

