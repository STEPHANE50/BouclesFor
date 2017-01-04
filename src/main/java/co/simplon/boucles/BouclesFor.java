package co.simplon.boucles;

public class BouclesFor {
	public static final int MAX_SUPPORTED = 100;

	private Integer debut = null;
	private Integer fin = null;

	public BouclesFor() {
	}

	public BouclesFor(int debut, int fin) {
		this.debut = debut;
		this.fin = fin;
	}

	public int[] construireTableau() {
		int[] tableau = new int[10];
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = (i + 1);
		}
		if (debut == null || fin == null) {
			return construireTableauSansBornes();
		} else {
			return tableau; // construireTableauAvecBornes();
		}
	}

	public int[] construireTableauInverse() {
		int[] tableau = construireTableau();
		int[] inverse = new int[10];
		int j = 0;
		for (int i = 9; i >=0 ; i--) {
			
			inverse[i] = tableau[j];
			j++;
		}
		return inverse;// tableau inverse
	}
	

	
	public int[] construireTableauEntiersPairs() {
		return null;
	}

	private int[] construireTableauAvecBornes() {
		return null;
	}

	private int[] construireTableauSansBornes() {
		return null;
	}

	public String[] suffixerTableau(String[] tableauEntree, String suffixe) {
		return null;
	}

	public Integer[] applanirMatrice(Integer[][] matrice) {
		return null;
	}

	public int[] construireTableauAvecWhile() {
		return null;
	}

	public int[] construireTableauEntiersPairsAvecWhile() {
		return null;
	}

}
