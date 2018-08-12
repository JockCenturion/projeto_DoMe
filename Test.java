package heranca.DoMe;


public class Test {
	public static void main(String[] args) {
		Item it = new DVD("Veloze", 120, "Ruan");
		Item it1 = new CD("NCS", 300, "RK3", 12);
		
		Acervo base = new Acervo(5);
		base.addItem(it);
		base.addItem(it1);
		base.listaItens();
	}
}
