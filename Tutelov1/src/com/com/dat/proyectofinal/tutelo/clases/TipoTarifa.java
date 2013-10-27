package com.com.dat.proyectofinal.tutelo.clases;

public class TipoTarifa {

	private int intidtipotarifa;
	private String strtipotarifa;
	private int intidhabitacion;
	private float dbpreciolista;
	private float dbdescuento;
	private int intidestado;
	private int intimgtipotarifa;
	private boolean boroomdisponible;

	public TipoTarifa(int _intidtipotarifa, String _strtipotarifa,
			int _intidhabitacion, float _dbpreciolista, boolean _boroomdisponible, int _intimgtipotarifa) {

		this.intidtipotarifa = _intidtipotarifa;
		this.strtipotarifa = _strtipotarifa;
		this.intidhabitacion = _intidhabitacion;
		this.dbpreciolista = _dbpreciolista;
		this.boroomdisponible=_boroomdisponible;
		this.intimgtipotarifa=_intimgtipotarifa;

	}

	public String toString()
    {
        return strtipotarifa;
    }
	
	public boolean isBoroomdisponible() {
		return boroomdisponible;
	}

	public void setBoroomdisponible(boolean boroomdisponible) {
		this.boroomdisponible = boroomdisponible;
	}

	public int getIntimgtipotarifa() {
		return intimgtipotarifa;
	}

	public void setIntimgtipotarifa(int intimgtipotarifa) {
		this.intimgtipotarifa = intimgtipotarifa;
	}

	public int getIntIdTipoTarifa() {
		return intidtipotarifa;
	}

	public void setIntIdTipoTarifa(int intIdTipoTarifa) {
		this.intidtipotarifa = intIdTipoTarifa;
	}

	public String getStrTipoTarifa() {
		return strtipotarifa;
	}

	public void setStrTipoTarifa(String strTipoTarifa) {
		this.strtipotarifa = strTipoTarifa;
	}

	public int getIntIdHabitacion() {
		return intidhabitacion;
	}

	public void setIntIdHabitacion(int intIdHabitacion) {
		this.intidhabitacion = intIdHabitacion;
	}

	public float getDbPrecioLista() {
		return dbpreciolista;
	}

	public void setDbPrecioLista(float dbPrecioLista) {
		this.dbpreciolista = dbPrecioLista;
	}

	public float getDbDescuento() {
		return dbdescuento;
	}

	public void setDbDescuento(float dbDescuento) {
		this.dbdescuento = dbDescuento;
	}

	public int getIntIdEstado() {
		return intidestado;
	}

	public void setIntIdEstado(int intIdEstado) {
		this.intidestado = intIdEstado;
	}

}
