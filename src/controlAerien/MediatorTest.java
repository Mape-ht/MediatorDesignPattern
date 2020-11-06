package controlAerien;

public class MediatorTest {

	public static void main(String[] args) {
		
		ITourDeControle tourDeControleMediator = new TourDeControleImpl();
		Piste piste = new Piste(tourDeControleMediator,"112");
		
		Vol vol747 = new Vol(tourDeControleMediator,"747");
		Vol vol112 = new Vol(tourDeControleMediator,"112");
		
		Piste piste12 = new Piste(tourDeControleMediator, "12");
		
		tourDeControleMediator.enregistrerVol(vol747);
		tourDeControleMediator.enregistrerPiste(piste12);
		
		vol747.pretPourAtterrissage();
		piste12.atterrir();
		vol747.atterrir();
		
		vol112.pretPourAtterrissage();
		
		vol747.Stationner();
		
		vol112.atterrir();
		
	}
}
