import java.time.LocalDate;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Negozio objn=new Negozio(); 
		LocalDate a1=LocalDate.of(2019, 1, 10);
		LocalDate a2=LocalDate.of(2019, 1, 15);
		LocalDate a3=LocalDate.of(2019, 1, 13);
		LocalDate a4=LocalDate.of(2019, 1, 12);
		LocalDate a5=LocalDate.of(2019, 1, 14);
		LocalDate a6=LocalDate.of(2019, 1, 20);
		LocalDate a7=LocalDate.of(2019, 1, 23);
		LocalDate a8=LocalDate.of(2019, 1, 28);
		LocalDate a9=LocalDate.of(2019, 1, 18);
		LocalDate a0=LocalDate.of(2019, 1, 11);
		NonAlimentari obja=new NonAlimentari (1235, null, 0, null, null);
		Alimentari obj = new Alimentari(34543, "Alimentare", 1, "mela", a1);
		objn.AggiungiProdotto(obj);
		Alimentari obj1 = new Alimentari(543534, "Alimentare", 2, "pizza", a2);
		objn.AggiungiProdotto(obj1);
		Alimentari obj2 = new Alimentari(213213, "Alimentare", 3, "pollo", a3);
		objn.AggiungiProdotto(obj2);
		Alimentari obj3 = new Alimentari(231423, "Alimentare", 4, "uovo", a4);
		objn.AggiungiProdotto(obj3);
		Alimentari obj4 = new Alimentari(4324, "Alimentare", 4, "latte", a5);
		objn.AggiungiProdotto(obj4);
		Alimentari obj5 = new Alimentari(1324, "Alimentare", 5, "pane", a6);
		objn.AggiungiProdotto(obj5);
		Alimentari obj6 = new Alimentari(1233, "Alimentare", 6, "torta", a7);
		objn.AggiungiProdotto(obj6);
		Alimentari obj7 = new Alimentari(3213, "Alimentare", 7, "biscotti", a8);
		objn.AggiungiProdotto(obj7);
		Alimentari obj8 = new Alimentari(1232, "Alimentare", 3, "caffe", a9);
		objn.AggiungiProdotto(obj8);
		Alimentari obj9 = new Alimentari(1111, "Alimentare", 8, "boh", a0);
		objn.AggiungiProdotto(obj9);
	
		NonAlimentari n = new NonAlimentari(0, null, 0, null, "tre");
		Scanner input = new Scanner(System.in);
		
		int finale=0;
		int pick=0;
		String user;
		String product;
		while(finale==0) {
			System.out.println("0)Exit");
			System.out.println("1)Visualizza i prodotti");
			System.out.println("2)Applicare lo sconto");
			System.out.println("3)Visualizza la tua lista");
			System.out.println("4)Per scegliere un prodotto");
			pick=input.nextInt();
			switch(pick) {
			case 0: finale=1;
			break;
			case 1:
				
				objn.elenco();
				break;
			case 2:
				System.out.println("Tipo di prodotto:");
				product=input.next();
				if (product.equalsIgnoreCase("A")) {
					System.out.println("Inserisci nome prodotto:");
					user=input.next();
					obj.ApplicaSconto("boh");
				} else {
					System.out.println("Inserisci nome prodotto:");
					obja.applicaSconto();
				}
	}

}
}
}