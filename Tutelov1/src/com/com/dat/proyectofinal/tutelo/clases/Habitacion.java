package com.com.dat.proyectofinal.tutelo.clases;

public class Habitacion {

	private int intidhabitacion;
	private int intidhotel;
	private String strdescripcion;

	private int intidtipotarifa;
	private byte[] byfoto;
	private int intidestado;

	public int getIntIdHabitacion() {
		return intidhabitacion;
	}

	public void setIntIdHabitacion(int intIdHabitacion) {
		this.intidhabitacion = intIdHabitacion;
	}

	public int getIntIdHotel() {
		return intidhotel;
	}

	public void setIntIdHotel(int intIdHotel) {
		this.intidhotel = intIdHotel;
	}

	public String getStrDescripcion() {
		return strdescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strdescripcion = strDescripcion;
	}

	public int getIntIdTipoTarifa() {
		return intidtipotarifa;
	}

	public void setIntIdTipoTarifa(int intIdTipoTarifa) {
		this.intidtipotarifa = intIdTipoTarifa;
	}

	public byte[] getByFoto() {
		return byfoto;
	}

	public void setByFoto(byte[] byFoto) {
		this.byfoto = byFoto;
	}

	public int getIntIdEstado() {
		return intidestado;
	}

	public void setIntIdEstado(int intIdEstado) {
		this.intidestado = intIdEstado;
	}

}
