package heranca.DoMe;

import java.util.ArrayList;
import java.util.Iterator;

public class Acervo {
	//Atributos
	private ArrayList<Item> acervo;
	
	//Metodos Especiais
	public Acervo(int capacidade) {
		acervo = new ArrayList<>(capacidade);
	}
	
	public void addItem(Item it) {
		acervo.add(it);
	}
	
	public void removeItem(Item it) {
		acervo.remove(it);
	}
	
	public void listaItens() {
		Iterator<Item> it = acervo.iterator();
		while (it.hasNext()) System.out.println(it.next() + "\n");
	}

}
