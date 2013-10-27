package com.com.dat.proyectofinal.tutelo.clases;

public class FotoHotel {
	private int intidhotel;
	private byte[] byfoto;
	private String strnamefoto;
	private String strrutafoto;
	private String strurlfoto;
	private int intidfoto;
	private boolean bofotoportada;

	public FotoHotel(int _intidhotel, String _strnamefoto, String _strrutafoto,
			String _strurlfoto, int _intidfoto) {
		intidhotel = _intidhotel;
		strnamefoto = _strnamefoto;
		strrutafoto = _strrutafoto;
		strurlfoto = _strurlfoto;
		intidfoto = _intidfoto;
	}

	public int getIntidfoto() {
		return intidfoto;
	}

	public void setIntidfoto(int intidfoto) {
		this.intidfoto = intidfoto;
	}

	public boolean isBofotoportada() {
		return bofotoportada;
	}

	public void setBofotoportada(boolean bofotoportada) {
		this.bofotoportada = bofotoportada;
	}

	public int getIntIdHotel() {
		return intidhotel;
	}

	public void setIntIdHotel(int intIdHotel) {
		this.intidhotel = intIdHotel;
	}

	public byte[] getByFoto() {
		return byfoto;
	}

	public void setByFoto(byte[] byFoto) {
		this.byfoto = byFoto;
	}

	public String getStrNameFoto() {
		return strnamefoto;
	}

	public void setStrNameFoto(String strNameFoto) {
		this.strnamefoto = strNameFoto;
	}

	public String getStrRutaFoto() {
		return strrutafoto;
	}

	public void setStrRutaFoto(String strRutaFoto) {
		this.strrutafoto = strRutaFoto;
	}

	public String getStrURLFoto() {
		return strurlfoto;
	}

	public void setStrURLFoto(String strURLFoto) {
		this.strurlfoto = strURLFoto;
	}
}
