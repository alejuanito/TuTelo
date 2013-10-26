package com.com.dat.proyectofinal.tutelov1;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.com.dat.proyectofinal.tutelo.clases.Hotel;

public class HotelHistorialArrayAdapter extends  ArrayAdapter<Hotel> {

	private Context context;
	private List<Hotel> detalle;
	
	public HotelHistorialArrayAdapter(Context context,
							  List<Hotel> detalle){
		
		super(context, R.layout.list_historial_content,detalle);
		this.context=context;
		this.detalle=detalle;
		
	}
	
	public HotelHistorialArrayAdapter(Context context, int resource,  List<Hotel> detalle) {
        super(context, resource, R.layout.list_historial_content, detalle);
        
    }
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		//return super.getView(position, convertView, parent);
		
		final Hotel hotel  = this.detalle.get(position);
		
		LayoutInflater layoutInflater = 
				(LayoutInflater)context.getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
		
		View view = layoutInflater.inflate(
						R.layout.list_historial_content, 
						parent,
						false);
		
		if(position%2==0)
			view.setBackgroundColor(Color.GREEN);
		else
			view.setBackgroundColor(Color.WHITE);
		
		TextView txtNomHotel = (TextView)view.findViewById(R.id.txtnomhotel_historial);
		TextView txtDirHotel = (TextView)view.findViewById(R.id.txtdirhotel_historial);
		TextView txtDisHotel = (TextView)view.findViewById(R.id.txtdishotel_historial);
		RatingBar rtbCalificacion=(RatingBar)view.findViewById(R.id.ratingBarhotel_historial);
		
		txtNomHotel.setText(hotel.getStrNomHotel().toString());
		txtDirHotel.setText(hotel.getStrDireccion().toString());
		rtbCalificacion.setRating((hotel.getIntCalificacion()));
		
		txtDisHotel.setText("A "+ String.valueOf(hotel.getDecDistancia()) + " km");
		

		
		return view;
		
	}
	
}

