import java.time.LocalDate;

public class Negozio {	
	final  LocalDate attuale=LocalDate.of(2019, 1, 8);
	private Prodotti []spesa = new Prodotti[20];
	public Prodotti [] array = new Prodotti [20];
	private int a=0;
	private int na=0;
	int i=0;
	private Alimentari[] caz = new Alimentari[7];
	private double sconto;
	private double scontato;
	private boolean cond=true;
	private boolean cond1=true;
	public void AggiungiProdotto(Prodotti a,Prodotti b,Prodotti c,Prodotti d,Prodotti e,Prodotti f,Prodotti g,Prodotti h,Prodotti l,Prodotti m) {
		array[0]=a;
		array[1]=b;
		array[2]=c;
		array[3]=d;
		array[4]=e;
		array[5]=f;
		array[6]=g;
		array[7]=h;
		array[8]=l;
		array[9]=m;
		
	/*if (i<array.length) {
			array[i]=p;
			i++;
			if (cond==true) {
			if(p.getDescrizione().equalsIgnoreCase("Alimentari")) {
				a++;
			} 			
			} else {
				System.out.println("hai superato il MAX");
			}
			if (cond1==true) {
				if(p.getDescrizione().equalsIgnoreCase("Non Alimentari")) {
					na++;
				} 			
			} else {
				System.out.println("Hai superato il MAX");
			}
			if (a>9) {
				cond=false;
			}
			if (na>9) {
				cond1=false;
			}
	
		}*/
		
	}
	/*public void test(String p) {
		Alimentari aa=new Alimentari(a, null, scontato, null, attuale);
		aa.ApplicaSconto(p, array);
	}*/
	public void AggiungiProdottoA(Alimentari a,Alimentari b,Alimentari c,Alimentari d,Alimentari e,Alimentari f,Alimentari g) {
		caz[0]=a;
		caz[1]=b;
		caz[2]=c;
		caz[3]=d;
		caz[4]=e;
		caz[5]=f;
		caz[6]=g;
	}
	public void elenco() {
		for (int g=0; g<10;g++) {
			System.out.println(array[g].toString());
		}
	}
	public void ApplicaScontoA(String p) {
		for (int k=0;k<caz.length;k++) {
			if (caz[k].getNome().equalsIgnoreCase(p)) {
				int pp=caz[k].getDataScadenza().compareTo(attuale);
				if(caz[k].getDataScadenza().compareTo(attuale)<10){
					//int pp=caz[k].getDataScadenza().compareTo(attuale);
					sconto=(caz[k].getPrezzo()*20)/100;
					scontato=caz[k].getPrezzo()-sconto;
					System.out.println("gago");
				} else {
					System.out.println("Mi spiace non puoi applicare lo scondo del 20%");
				}
			}
		}
		System.out.println("Il prezzo scontato è "+ scontato);
		
	}
	public void spesa(int n) {
		if (i<10) {
		spesa[i]=array[n];
		
		System.out.println("Ok il prodotto "+spesa[i].getNome()+" è stata inserita nella spesa");
		i++;
		}
	}
	public void visualizza() {
		System.out.println("Questa è la tua lista spesa");
		for (int g=0; g<i;g++) {
			System.out.println(spesa[g].toString());
		}
	}
}