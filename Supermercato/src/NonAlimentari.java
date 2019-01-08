
public class NonAlimentari extends Prodotti{
	private String materiale;
	private double scontato;
	private double sconto;
	private String [] materials= new String[10];
	private int q=0;
	private Negozio n;
	
	
	public NonAlimentari(long codice, String descrizione, double prezzo, String nome, String materiale) {
		super(codice, descrizione, prezzo, nome);
		this.materiale = materiale;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
		
	}
	public void addMat(String m) {
		if (q<materials.length) {
			materials[q]=m;
			q++;
			
		} else {
			System.out.println("hai superato il MAX");
		}
	}
	public void ApplicaSconto(String p) {
		for(int k=0;k<n.i;k++) {
			if (n.array[k].getNome().equalsIgnoreCase(p)) {
			if (materials[k].equalsIgnoreCase("carta")||materials[k].equalsIgnoreCase("plastica")||materials[k].equalsIgnoreCase("vetro") ) {
			sconto=(n.array[k].getPrezzo()*10)/100;
			scontato=n.array[k].getPrezzo()-sconto;
			} else {
				System.out.println("Mi spiace ma non puoi applicare lo sconto del 10%");
			}
		}
		}
	}

	@Override
	public String toString() {
		return "NonAlimentari [materiale=" + materiale + ", toString()=" + super.toString() + "]";
	}

	
	
}
