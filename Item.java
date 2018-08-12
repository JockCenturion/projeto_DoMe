
/**
 * A classe Item é uma classe abstrata que serve como base para qualquer classe que seja um Item
 *
 * @author: jocknaylson
 * @version: 12.22.2017
 */

public class Item {
	private String title, comment;
	private boolean gotIt;
	private int playingTime;


	public Item(String title, boolean gotIt, int playingTime) {
		this.title 			= title;
		this.gotIt 			= gotIt;
		this.playingTime 	= playingTime;
		this.comment   		= "no comment";
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override 
	public String toString() {
		return this.title + ", " + gotIt + ", " + playingTime + ", " + comment;
	}

	@Override 
	public int hashCode() {
		return title.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Item)) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		Item it = (Item) obj;
		return title.equalsIgnoreCase(it.title) && comment.equalsIgnoreCase(it.comment) &&
			   gotIt == it.gotIt && playingTime == it.playingTime;
	}


}