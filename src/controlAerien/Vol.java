package controlAerien;

public class Vol implements Command{

	private ITourDeControle tourDeControlMediator;
	private String nameVol;
	
	Vol(ITourDeControle tourDeControlMediator,String nameVol){
		this.tourDeControlMediator=tourDeControlMediator;
		this.nameVol=nameVol;
	}
	
	
	@Override
	public void atterrir() {
		if(tourDeControlMediator.estDisponible() ) {
			System.out.println("Vol" +this.nameVol+ " Atterrissage terminé");
			tourDeControlMediator.rendreDisponibilite(false);//La piste est occupée
		}
		else {
			System.out.println("Vol" +this.nameVol+ " En attente de piste d'atterrissage");
		}
		
	}
	
	public void pretPourAtterrissage() {
		
		System.out.println("Vol" +this.nameVol+ " Atterrissage imminent" );
		
	}
	
	public void Stationner() {
		
		System.out.println("Le vol "+this.nameVol+ " est au Parking");
		tourDeControlMediator.rendreDisponibilite(true);//La piste est dégagée
	}

	
}
