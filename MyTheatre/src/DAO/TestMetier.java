package DAO;

import java.util.List;
import metier.entities.Spectacles;

public class TestMetier {

	public static void main(String[] args) {
		ISpectacleDAO metier = new SpectacleDAOImpl();

		/*--------------------------Insertion des Spectacles ----------------------------------*/
		/*
		 * metier.save(new Spectacles(5,"Show")); metier.save(new
		 * Spectacles(3,"bidul")); metier.save(new Spectacles(20,"toto"));
		 */

		/*-----------------Consulter les Spectacles par mots cles-------------------------------------*/

		/*
		 * List<Spectacles> specs2=metier.ListSpectacles(); for (Spectacles s:specs2) {
		 * System.out.println(s.getNumS()); System.out.println(s.getNomS()); }
		 */

		/*
		 * List<Spectacles> specs3=metier.spectaclesParMC("1"); for (Spectacles
		 * s:specs3) { System.out.println(s.getNomS()); }
		 */
	}

}
