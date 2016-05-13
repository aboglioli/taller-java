package main;

public class Casa {
	private String domicilio;
	private Familia familia;
	private int num;

	public Casa(String dom, Familia family, int tel) {
		domicilio = dom;
		familia = family;
		num = tel;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public Familia getFamilia() {
		return familia;
	}

	public int getTel() {
		return num;
	}

	public void setDomicilio(String dom) {
		domicilio = dom;
	}

	public void setFamilia(Familia fami) {
		familia = fami;
	}

	public void setTel(int num) {
		this.num = num;
	}
}
