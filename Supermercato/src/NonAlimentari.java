
public class NonAlimentari extends Prodotti{
	private String materiale;
	private double scontato;
	private double sconto;
	public NonAlimentari(long codice, String descrizione, double prezzo, String materiale) {
		super(codice, descrizione, prezzo);
		this.materiale = materiale;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	public void applicaSconto(String m,double p) {
		if (m.equalsIgnoreCase("carta")) {
			sconto=(p*20)/100;
			scontato=p-sconto;
		}
if (m.equalsIgnoreCase("plastica")) {
	sconto=(p*20)/100;
	scontato=p-sconto;
		}
if (m.equalsIgnoreCase("vetro")) {
	sconto=(p*20)/100;
	scontato=p-sconto;
}
	}
	
}
