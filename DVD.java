/**
 * A classe DVD representa um Objeto de um DVD de filme
 *
 * @author: jocknaylson
 * @version: 12.22.2017
 */


public class DVD extends Item {
	private String director;	

	public DVD(String title, boolean gotIt, int playingTime, String director) {
		super(title, gotIt, playingTime);
		this.director = director;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + director;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof DVD) && super.equals(obj) && director.equalsIgnoreCase(((DVD) obj).director);
	}
}