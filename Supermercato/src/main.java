import java.time.LocalDate;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Negozio objn=new Negozio(); 
		Alimentari real = new Alimentari(0, null, 0, null, null);
		LocalDate a1=LocalDate.of(2019, 1, 10);
		LocalDate a2=LocalDate.of(2019, 1, 15);
		LocalDate a3=LocalDate.of(2019, 1, 13);
		LocalDate a4=LocalDate.of(2019, 1, 12);
		LocalDate a5=LocalDate.of(2019, 1, 14);
		LocalDate a6=LocalDate.of(2019, 1, 20);
		LocalDate a7=LocalDate.of(2019, 1, 9);
		//NonAlimentari obja=new NonAlimentari (1235, null, 0, null, null);
		Alimentari obj = new Alimentari(34543, "Alimentare", 1, "mela",LocalDate.of(2019, 1, 10));
		
		
		Alimentari obj1 = new Alimentari(543534, "Alimentare", 2, "pizza", a2);
		
		
		Alimentari obj2 = new Alimentari(213213, "Alimentare", 3, "pollo", a3);
		
	
		Alimentari obj3 = new Alimentari(231423, "Alimentare", 4, "uovo", a4);
		
	
		Alimentari obj4 = new Alimentari(4324, "Alimentare", 4, "latte", a5);
		
		
		Alimentari obj5 = new Alimentari(1324, "Alimentare", 5, "pane", a6);
		
		
		Alimentari obj6 = new Alimentari(1233, "Alimentare", 6, "torta", a7);
		
		
		NonAlimentari obj7 = new NonAlimentari(3213, "Non Alimentare", 7, "piatto", "vetro");
		
		
		NonAlimentari obj8 = new NonAlimentari(1232, "Non Alimentare", 3, "bottiglia", "plastica");
		
		;
		NonAlimentari obj9 = new NonAlimentari(1111, "Non Alimentare", 8, "foglio","carta ");
		
		//real.addDat(a1,a2,a3,a4,a5,a6,a7);
		NonAlimentari n = new NonAlimentari(0, null, 0, null, "tre");
		Scanner input = new Scanner(System.in);
		
		int finale=0;
		int scelta;
		int pick=0;
		String user;
		String product;
		int voglia = 0;
		objn.AggiungiProdotto(obj,obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9);
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
					objn.AggiungiProdottoA(obj,obj1,obj2,obj3,obj4,obj5,obj6);
					objn.ApplicaScontoA(user);
				} else {
					System.out.println("Inserisci nome prodotto:");
					//obja.applicaSconto();
				}
				break;
			case 4: 
			while (voglia==0) {
				System.out.println("Scegli n. del prodotto che vuoi aggiungere nella tua lista");
				System.out.println("Inserisci 99 se non vuoi piu inserire");
			objn.elenco();
			scelta=input.nextInt();
			if(scelta==99) {
				System.out.println("ciao");
				voglia=1;
			} else {
			objn.spesa(scelta);
			}
			}
			break;
			case 3:
				objn.visualizza();
			
	}

}
}
}