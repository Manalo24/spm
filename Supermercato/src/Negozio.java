
public class Negozio {	
	public Prodotti [] array = new Prodotti [20];
	private int a=0;
	private int na=0;
	int i=0;
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
}