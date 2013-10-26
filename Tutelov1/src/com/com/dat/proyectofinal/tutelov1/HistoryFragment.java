package com.com.dat.proyectofinal.tutelov1;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockListFragment;
import com.com.dat.proyectofinal.tutelo.clases.Hotel;

public class HistoryFragment extends SherlockListFragment {

	private static final String TAG = "ROUTES LIST";
	private View _fragmentView;
	Context context;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		List<Hotel> hoteleshistorial = new ArrayList<Hotel>();
		for (int i = 0; i < 50; i++) {
			Hotel c = new Hotel();
			c.setStrDescripcion("HOTEL LAS BAJAS PASIONES");
			c.setStrDireccion("Av. Alfredo Mendiola 1342");
			c.setStrNomHotel("HOTEL LAS BAJAS PASIONES");
			c.setDecDistancia(2.1);
			c.setIntCalificacion(4);
			hoteleshistorial.add(c);
		}
		_fragmentView = inflater.inflate(R.layout.history_layout,container, false);
		context = getActivity();
//		HotelArrayAdapter adapter = new HotelArrayAdapter(context,
//				R.layout.search_layout, clientes);
		 HotelHistorialArrayAdapter adapter =
				 new HotelHistorialArrayAdapter(context, hoteleshistorial);
		 setListAdapter(adapter);
		 
		 //return super.onCreateView(inflater, container, savedInstanceState);
		return _fragmentView;
		
	}

	
	




	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Log.d(TAG, "Clicked item " + position);
	}

	@Override
	public void onStart() {
		super.onStart();
		/** Setting the multiselect choice mode for the listview */
		getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	}


}
