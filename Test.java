
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		BancoDeDados bd = new BancoDeDados(new HashSet<>());
		Item cd1 = new CD("CD1", true, 220, "CD2", 26);
		Item cd2 = new CD("CD2", true, 220, "CD2", 26); //tipo Estatico de cd2 é Item, o tipo DINAMICO é CD
		Item cd3 = new CD("CD2", true, 220, "CD2", 26);
		DVD dvd1 = new DVD("DVD1", true, 220, "DVD1");
		Item dvd2 = new DVD("DVD2", true, 220, "DVD1");
		//Item it = dvd1;
		//CD cd = (CD) dvd1;
		String c = new String("test");
		String d = new String("test");
		System.out.println("Igualdade de Conteudo: " + c.equals(d) + " vs Igualde de Referencia: " + (c == d));
		

		bd.addInBancoDeDados(cd1);
		bd.addInBancoDeDados(cd2);
		bd.addInBancoDeDados(cd3);
		bd.addInBancoDeDados(dvd1);
		bd.addInBancoDeDados(dvd2);
		bd.searchByDirector("dvd1");
		//bd.listOfItems();

	}
}