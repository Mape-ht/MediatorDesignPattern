package controlAerien;

public class TourDeControleImpl implements ITourDeControle{

	private Piste piste;
	private Vol vol;
	public Boolean disponible;
	
	

	public TourDeControleImpl() {
		super();
	}

	@Override
	public void enregistrerVol(Vol vol) {
		this.vol=vol;
		
	}

	@Override
	public void enregistrerPiste(Piste piste) {
		this.piste=piste;
		
	}

	@Override
	public void rendreDisponibilite(Boolean status) {
		this.disponible=status;
		
	}

	@Override
	public Boolean estDisponible() {
		return disponible;
	}

	
}
