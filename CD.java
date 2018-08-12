
/**
 * A classe CD represa um objeto CD de música. Informaões sobre o CD são armazenadas e podem ser recuperadas.
 *
 * @author: jocknaylson
 * @version: 12.22.2017
 */



public class CD extends Item {
	private String artist;
	private int tracks;

	public CD(String title, boolean gotIt, int playingTime, String artist, int tracks) {
		super(title, gotIt, playingTime);
		this.artist	= artist;
		this.tracks = tracks;
	}

	public String getArtist() {
		return artist;
	}

	@Override 
	public String toString() {
		return super.toString() + ", " + artist + ", " + tracks;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof CD) && super.equals(obj) && artist.equalsIgnoreCase(((CD)obj).artist) && 
			   tracks == ((CD)obj).tracks;
	}


}