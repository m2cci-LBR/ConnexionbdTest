package DAO;

import java.util.List;

import metier.entities.Spectacles;

public interface ISpectacleDAO {
	
	
	/**la phase de conception est definie au niveau de cette interface 
	 * on connait les operations qu'on doit definir dans notre application
	 * 
	 * */
	
	public Spectacles save (Spectacles s);   //retourne le spectacle ajoute.
	public List<Spectacles> spectaclesParMC(String mc) ; //permet de rechercher les spectacles par mots cles.
    public Spectacles getSpectacles (int nums) ; //permet de consulter un spectacles.
    public Spectacles update (Spectacles s);  //permet la mise a jour
    //l'objet spectacles va etre a jour y compris le numS
    public void deleteSpectacles(int nums); //pour supprimer un spectacle
	public List<Spectacles> ListSpectacles();
}
