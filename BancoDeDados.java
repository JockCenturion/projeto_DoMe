
/**
 * A classe bancoDeDados armazenará referencias para objetos do tipo DVD e CD
 *
 * @author: jock
 * @version: 12.22.2017
 * 
 */

import java.util.Collection;

public class BancoDeDados {
	private Collection<Item> bancoDeDados;

	public BancoDeDados(Collection<Item> bd) {
		bancoDeDados = bd;
	} 

	/**
	 * Adiciona um CD ou DVD
	 * @param item pode ser CD ou DVD
	 */
	public void addInBancoDeDados(Item item) {
		bancoDeDados.add(item);
	}

	/**
	 * Remove um CD ou DVD
	 * @param item pode ser CD ou DVD
	 */
	public void removeInBancoDeDados(Item item) {
		bancoDeDados.remove(item);
	}

	/**
	 * Lista todos os Itens no Banco de Dados
	 */
	public void listOfItems() {
		bancoDeDados.forEach(System.out::println);
	}

	/**
	 * Lista todos os CD's de um determinado artista
	 * @param nome do artista
	 */
	public void searchByArtist(String artist) {
		for (Item item : bancoDeDados) {
			if ((item instanceof CD) && (((CD)item).getArtist().equalsIgnoreCase(artist))) {
				System.out.println(item);
			}
		}
	}

	/**
	 * Lista todos os DVD's de um determinado diretor
	 * @param nome do diretor
	 */
	public void searchByDirector(String director) {
		for (Item item : bancoDeDados) {
			if ((item instanceof DVD) && ((DVD)item).getDirector().equalsIgnoreCase(director)) {
				System.out.println(item);
			}
		}
	} 


}