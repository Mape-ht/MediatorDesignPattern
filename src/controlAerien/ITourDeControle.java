package controlAerien;

public interface ITourDeControle {

	public void enregistrerVol(Vol vol);
	public void enregistrerPiste(Piste piste);
	public void rendreDisponibilite(Boolean status);
	public Boolean estDisponible(); 
}
 