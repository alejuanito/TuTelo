package com.com.dat.proyectofinal.tutelov1;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.com.dat.proyectofinal.tutelo.clases.TipoTarifa;

public class TipoTarifaAdapter extends ArrayAdapter<TipoTarifa> {

	private Activity context;
	ArrayList<TipoTarifa> data = null;

	public TipoTarifaAdapter(Activity context, int resource,
			ArrayList<TipoTarifa> data) {

		super(context, resource, data);
		this.context = context;
		this.data = data;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) { 
		
		
		return super.getView(position, convertView, parent);
	}

	// public View getCustomView(int position, View convertView, ViewGroup
	// parent) { // This
	// // view
	// // starts
	// // when
	// // we
	// // click
	// // the
	// // spinner.
	// View row = convertView;
	// if (row == null) {
	// LayoutInflater inflater = context.getLayoutInflater();
	// row = inflater.inflate(R.layout.spinner_tipotarifa_layout, parent,
	// false);
	// }
	//
	// TipoTarifa item = data.get(position);
	// if (item != null) { // Parse the data from each object and set it.
	// ImageView imgdispo = (ImageView) row
	// .findViewById(R.id.img_roomdisponible);
	// TextView strnomtipo = (TextView) row
	// .findViewById(R.id.txtnomtipotarifa);
	// TextView precio = (TextView) row
	// .findViewById(R.id.txtpreciotipotarifa);
	// if (imgdispo != null) {
	// imgdispo.setBackgroundDrawable(context.getResources()
	// .getDrawable(item.getIntimgtipotarifa()));
	// }
	// if (strnomtipo != null)
	// strnomtipo.setText(item.getStrTipoTarifa());
	//
	// }
	//
	// return row;
	// }

	// @SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		if (row == null) {
			LayoutInflater inflater = context.getLayoutInflater();
			row = inflater.inflate(R.layout.spinner_tipotarifa_layout, parent,
					false);
		}

		TipoTarifa item = data.get(position);
		if (item != null) { // Parse the data from each object and set it.
			ImageView imgdispo = (ImageView) row
					.findViewById(R.id.imgroomdisponible);
			TextView strnomtipo = (TextView) row
					.findViewById(R.id.txtnomtipotarifa);
			TextView precio = (TextView) row
					.findViewById(R.id.txtpreciotipotarifa);
			if (imgdispo != null) {
				imgdispo.setBackgroundDrawable(context.getResources()
						.getDrawable(item.getIntimgtipotarifa()));
			}
			if (strnomtipo != null)
				strnomtipo.setText(item.getStrTipoTarifa());
			precio.setText(Double.toString(item.getDbPrecioLista()));
		}

		return row;
	}
}
