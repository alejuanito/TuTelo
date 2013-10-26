package com.com.dat.proyectofinal.tutelo.clases;

import java.sql.Date;

import android.location.Address;

public class Reserva {

	private int intidreserva;
	private int intidhabitacion;
	private String strdniusuario;
	private Date dtfechareserva;
	private Date dtfechaconfirmacionreserva;
	private Date dtfechafin;
	private Address dxsolicitud;
	private Address dysolititud;
	private double dbpreciofinal;
	private int intcalificacion;
	private int intidestado;
	private String strtelefonoreserva;
	private String strobservacion;

	public int getIntIdReserva() {
		return intidreserva;
	}

	public void setIntIdReserva(int intIdReserva) {
		this.intidreserva = intIdReserva;
	}

	public int getIntIdHabitacion() {
		return intidhabitacion;
	}

	public void setIntIdHabitacion(int intIdHabitacion) {
		this.intidhabitacion = intIdHabitacion;
	}

	public String getStrDNIUsuario() {
		return strdniusuario;
	}

	public void setStrDNIUsuario(String strDNIUsuario) {
		this.strdniusuario = strDNIUsuario;
	}

	public Date getDtFechaReserva() {
		return dtfechareserva;
	}

	public void setDtFechaReserva(Date dtFechaReserva) {
		this.dtfechareserva = dtFechaReserva;
	}

	public Date getDtFechaConfirmacionReserva() {
		return dtfechaconfirmacionreserva;
	}

	public void setDtFechaConfirmacionReserva(Date dtFechaConfirmacionReserva) {
		this.dtfechaconfirmacionreserva = dtFechaConfirmacionReserva;
	}

	public Date getDtFechaFin() {
		return dtfechafin;
	}

	public void setDtFechaFin(Date dtFechaFin) {
		this.dtfechafin = dtFechaFin;
	}

	public Address getDxSolicitud() {
		return dxsolicitud;
	}

	public void setDxSolicitud(Address dxSolicitud) {
		this.dxsolicitud = dxSolicitud;
	}

	public Address getDySolititud() {
		return dysolititud;
	}

	public void setDySolititud(Address dySolititud) {
		this.dysolititud = dySolititud;
	}

	public double getDbPrecioFinal() {
		return dbpreciofinal;
	}

	public void setDbPrecioFinal(double dbPrecioFinal) {
		this.dbpreciofinal = dbPrecioFinal;
	}

	public int getIntCalificacion() {
		return intcalificacion;
	}

	public void setIntCalificacion(int intCalificacion) {
		this.intcalificacion = intCalificacion;
	}

	public int getIntIdEstado() {
		return intidestado;
	}

	public void setIntIdEstado(int intIdEstado) {
		this.intidestado = intIdEstado;
	}

	public String getStrTelefonoReserva() {
		return strtelefonoreserva;
	}

	public void setStrTelefonoReserva(String strTelefonoReserva) {
		this.strtelefonoreserva = strTelefonoReserva;
	}

	public String getStrObservacion() {
		return strobservacion;
	}

	public void setStrObservacion(String strObservacion) {
		this.strobservacion = strObservacion;
	}

}
