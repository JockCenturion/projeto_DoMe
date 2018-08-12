package heranca.DoMe;

public class DVD extends Item {
	//Atributos
	String diretor;

	public DVD(String titulo, int tempReprod, String diretor) {
		super(titulo, tempReprod);
		this.diretor = diretor;
	}
	
	public String getDiretor() {
		return this.diretor;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\n" + 
				"Diretor: " + this.diretor);
	}
	
	@Override
	public boolean equals(Object obj) {
		DVD dvd = (DVD) obj;
		return (super.equals(obj) && diretor.equalsIgnoreCase(dvd.diretor));
	}
	
	@Override
	public DVD clone() {
		return new DVD(getTitulo(), getTempReprod(), getDiretor());
	}
;	
	
	
	
	
}
