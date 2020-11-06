package controlAerien;

public class Piste implements Command{

	private ITourDeControle tourDeControlMediator;
	private String nomPiste;
	Piste(ITourDeControle tourDeControlMediator, String nomPiste){
		
		this.tourDeControlMediator=tourDeControlMediator;
		this.nomPiste=nomPiste;
	}
	@Override
	public void atterrir() {
		System.out.println("Piste "+this.nomPiste+ " disponible pour atterissage ");
		tourDeControlMediator.rendreDisponibilite(true);
		
	}

	
}
