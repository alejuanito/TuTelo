package com.com.dat.proyectofinal.tutelo.clases;

public class ListHoteles {

	private String strnomhotel;
	private String strdireccion;
	private double decdx;
	private double decdy;
	private double decdxactual;
	private double decdyactual;
	private float decpreciomin;
	private float decpreciomax;
	private boolean boroomdisponible;
	private int intnumestrellas;
	private int intcalificacion;
	private byte[] byfotoportada;
	private String strnamefotoportada;
	private String strrutafotoportada;
	private String strurelfotoportada;
	private float distancia;
	private String strtelefono;
	
	public ListHoteles() {

	}

	public ListHoteles(String _strnomhotel, String _strdireccion,
			double _decdx, double _decdy, double _decdxactual,
			double _decdyactual, float _decpreciomin, float _decpreciomax,
			boolean _boroomdisponible, int _intnumestrellas,
			int _intcalificacion, String _strnamefotoportada,
			String _strrutafotoportada, String _strurelfotoportada,String _strtelefono) {

		strnomhotel = _strnomhotel;
		strdireccion = _strdireccion;
		decdx = _decdx;
		decdy = _decdy;
		decdxactual = _decdxactual;
		decdyactual = _decdyactual;
		decpreciomin = _decpreciomin;
		decpreciomax = _decpreciomax;
		boroomdisponible = _boroomdisponible;
		intnumestrellas = _intnumestrellas;
		intcalificacion = _intcalificacion;
		strnamefotoportada = _strnamefotoportada;
		strrutafotoportada = _strrutafotoportada;
		strurelfotoportada = _strurelfotoportada;
		strtelefono=_strtelefono;
		distancia = distancia(decdx, decdy, decdxactual, decdyactual);
	}

	public ListHoteles(String _strnomhotel, String _strdireccion,
			double _decdx, double _decdy, double _decdxactual,
			double _decdyactual, float _decpreciomin, float _decpreciomax,
			int _intnumestrellas, int _intcalificacion,
			String _strnamefotoportada, String _strrutafotoportada,
			String _strurelfotoportada,String _strtelefono) {

		strnomhotel = _strnomhotel;
		strdireccion = _strdireccion;
		decdx = _decdx;
		decdy = _decdy;
		decdxactual = _decdxactual;
		decdyactual = _decdyactual;
		decpreciomin = _decpreciomin;
		decpreciomax = _decpreciomax;
		intnumestrellas = _intnumestrellas;
		intcalificacion = _intcalificacion;
		strnamefotoportada = _strnamefotoportada;
		strrutafotoportada = _strrutafotoportada;
		strurelfotoportada = _strurelfotoportada;
		strtelefono=_strtelefono;
		distancia = distancia(decdx, decdy, decdxactual, decdyactual);
	}

	public String getStrtelefono() {
		return strtelefono;
	}

	public void setStrtelefono(String strtelefono) {
		this.strtelefono = strtelefono;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public String getStrnomhotel() {
		return strnomhotel;
	}

	public void setStrnomhotel(String strnomhotel) {
		this.strnomhotel = strnomhotel;
	}

	public String getStrdireccion() {
		return strdireccion;
	}

	public void setStrdireccion(String strdireccion) {
		this.strdireccion = strdireccion;
	}

	public double getDecdx() {
		return decdx;
	}

	public void setDecdx(double decdx) {
		this.decdx = decdx;
	}

	public double getDecdy() {
		return decdy;
	}

	public void setDecdy(double decdy) {
		this.decdy = decdy;
	}

	public double getDecdxactual() {
		return decdxactual;
	}

	public void setDecdxactual(double decdxactual) {
		this.decdxactual = decdxactual;
	}

	public double getDecdyactual() {
		return decdyactual;
	}

	public void setDecdyactual(double decdyactual) {
		this.decdyactual = decdyactual;
	}

	public float getDecpreciomin() {
		return decpreciomin;
	}

	public void setDecpreciomin(float decpreciomin) {
		this.decpreciomin = decpreciomin;
	}

	public float getDecpreciomax() {
		return decpreciomax;
	}

	public void setDecpreciomax(float decpreciomax) {
		this.decpreciomax = decpreciomax;
	}

	public boolean isBoroomdisponible() {
		return boroomdisponible;
	}

	public void setBoroomdisponible(boolean boroomdisponible) {
		this.boroomdisponible = boroomdisponible;
	}

	public int getIntnumestrellas() {
		return intnumestrellas;
	}

	public void setIntnumestrellas(int intnumestrellas) {
		this.intnumestrellas = intnumestrellas;
	}

	public int getIntcalificacion() {
		return intcalificacion;
	}

	public void setIntcalificacion(int intcalificacion) {
		this.intcalificacion = intcalificacion;
	}

	public byte[] getByfotoportada() {
		return byfotoportada;
	}

	public void setByfotoportada(byte[] byfotoportada) {
		this.byfotoportada = byfotoportada;
	}

	public String getStrnamefotoportada() {
		return strnamefotoportada;
	}

	public void setStrnamefotoportada(String strnamefotoportada) {
		this.strnamefotoportada = strnamefotoportada;
	}

	public String getStrrutafotoportada() {
		return strrutafotoportada;
	}

	public void setStrrutafotoportada(String strrutafotoportada) {
		this.strrutafotoportada = strrutafotoportada;
	}

	public String getStrurelfotoportada() {
		return strurelfotoportada;
	}

	public void setStrurelfotoportada(String strurelfotoportada) {
		this.strurelfotoportada = strurelfotoportada;
	}

	float distancia(double decdx, double decdy, double decdxactual,
			double decdyactual) {
		return 2;
	}

}
