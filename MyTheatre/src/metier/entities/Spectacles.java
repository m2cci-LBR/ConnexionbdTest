package metier.entities;

import java.io.Serializable;

public class Spectacles implements Serializable {

	private int numS;
	private String nomS;

	public Spectacles(int numS, String nomS) {
		super();
		this.numS = numS;
		this.nomS = nomS;
	}

	public Spectacles() {
		super();
	}

	public int getNumS() {
		return numS;
	}

	public void setNumS(int numS) {
		this.numS = numS;
	}

	public String getNomS() {
		return nomS;
	}

	public void setNomS(String nomS) {
		this.nomS = nomS;
	}

}
