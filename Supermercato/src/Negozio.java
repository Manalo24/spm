import java.time.LocalDate;

public class Negozio {	
	final  LocalDate attuale=LocalDate.of(2019, 1, 8);
	private LocalDate[] data = new LocalDate[10];
	public Prodotti [] array = new Prodotti [20];
	private int a=0;
	private int na=0;
	int i=0;
	Alimentari qweq;
	private double sconto;
	private double scontato;
	private boolean cond=true;
	private boolean cond1=true;
	public void AggiungiProdotto(Prodotti p) {
		if (i<array.length) {
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
	
		}
		
	}
	public void elenco() {
		for (int g=0; g<i;g++) {
			System.out.println(array[g].toString());
		}
	}
		public void ApplicaSconto(String p) {
			for (int k=0;k<i;k++) {
				if(array[k].getNome().equalsIgnoreCase(p)) {
					if(qweq.n.array[k].<10){
						System.out.println(array[k].getPrezzo());
						sconto=(array[k].getPrezzo()*20)/100;
						scontato=array[k].getPrezzo()-sconto;
						System.out.println(""+scontato);
					} else {
						System.out.println("Mi spiace non puoi applicare lo scondo del 20%");
					}
				}
			}

}
}