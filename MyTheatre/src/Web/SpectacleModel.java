package Web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Spectacles;

public class SpectacleModel {

	// ici le model permet de stocker les donnees qu on va saisir

	private String motCle;
	private List<Spectacles> spectacles = new ArrayList<Spectacles>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Spectacles> getSpectacles() {
		return spectacles;
	}

	public void setSpectacles(List<Spectacles> spectacles) {
		this.spectacles = spectacles;
	}

}
