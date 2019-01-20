import java.lang.reflect.Array;
import java.time.LocalDate;
public class Alimentari extends Prodotti {
	 Negozio n = new Negozio();
	
	 final  LocalDate attuale=LocalDate.of(2019, 1, 8);
	private LocalDate dataScadenza;
	
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

	
	
	
	


	

	@Override
	public String toString() {
		return "Alimentari [dataScadenza=" + dataScadenza+ " "  + super.toString() ;
	}




	
	
	
}
