
public class Prodotti {
	private long codice;
	private String descrizione;
	private double prezzo;
	private double sconto;
	private double scontato;
	public Prodotti(long codice, String descrizione, double prezzo) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public long getCodice() {
		return codice;
	}
	public void setCodice(long codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public void applicaSconto() {
		sconto=(prezzo*5)/100;
		scontato=prezzo-sconto;
	}
	
}
