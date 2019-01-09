import java.lang.reflect.Array;
import java.time.LocalDate;
public class Alimentari extends Prodotti {
	 Negozio n;
	
	
	private LocalDate dataScadenza;
	private LocalDate[] data = new LocalDate[10];
	private double  sconto=0;
	private double  scontato=0;
	private int q =0;
	private String [] name = new String[10];
	public Alimentari(long codice, String descrizione, double prezzo, String nome, LocalDate dataScadenza) {
		super(codice, descrizione, prezzo, nome);
		this.dataScadenza = dataScadenza;
	}




	public LocalDate getDataScadenza() {
		return dataScadenza;
		
	}




	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public void addDat(LocalDate d) {
		if (q<data.length) {
			data[q]=d;
			q++;
			
		} else {
			System.out.println("hai superato il MAX");
		}
	}

	
	public void ApplicaSconto(String p) {
		for (int k=0;k<8;k++) {
			/*if (n.array[k].getNome().equalsIgnoreCase(p)) {
				if(data[k].compareTo(attuale)<10){
					sconto=(n.array[k].getPrezzo()*20)/100;
					scontato=n.array[k].getPrezzo()-sconto;
				} else {
					System.out.println("Mi spiace non puoi applicare lo scondo del 20%");
				}
			}*/
		}
		
	}




	@Override
	public String toString() {
		return "Alimentari [dataScadenza=" + dataScadenza+ " "  + super.toString() ;
	}




	
	
	
}
