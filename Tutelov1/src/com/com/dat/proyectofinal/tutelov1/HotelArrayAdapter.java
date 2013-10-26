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

public class HotelArrayAdapter extends  ArrayAdapter<Hotel> {

	private Context context;
	private List<Hotel> detalle;
	
	public HotelArrayAdapter(Context context,
							  List<Hotel> detalle){
		
		super(context, R.layout.list_search_content,detalle);
		this.context=context;
		this.detalle=detalle;
		
	}
	
	public HotelArrayAdapter(Context context, int resource,  List<Hotel> detalle) {
        super(context, resource, R.layout.list_search_content, detalle);
        
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
						R.layout.list_search_content, 
						parent,
						false);
		
		if(position%2==0)
			view.setBackgroundColor(Color.GREEN);
		else
			view.setBackgroundColor(Color.WHITE);
		
		TextView txtNomHotel = (TextView)view.findViewById(R.id.txtnomhotel);
		TextView txtDirHotel = (TextView)view.findViewById(R.id.txtdirhotel);
		TextView txtDisHotel = (TextView)view.findViewById(R.id.txtdishotel);
		RatingBar rtbCalificacion=(RatingBar)view.findViewById(R.id.ratingBarhotel);
		
		txtNomHotel.setText(hotel.getStrNomHotel().toString());
		txtDirHotel.setText(hotel.getStrDireccion().toString());
		rtbCalificacion.setRating((hotel.getIntCalificacion()));
		
		txtDisHotel.setText("A "+ String.valueOf(hotel.getDecDistancia()) + " km");
		

		
		return view;
		
	}
	
}
