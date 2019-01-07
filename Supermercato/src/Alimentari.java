import java.time.LocalDate;
public class Alimentari extends Prodotti {

	private LocalDate dataScadenza;

	public Alimentari(long codice, String descrizione, double prezzo, LocalDate dataScadenza) {
		super(codice, descrizione, prezzo);
		this.dataScadenza = dataScadenza;
	}

	
	
	
}
