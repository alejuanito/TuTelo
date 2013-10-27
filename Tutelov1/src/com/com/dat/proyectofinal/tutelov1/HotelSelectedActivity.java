package com.com.dat.proyectofinal.tutelov1;

import java.util.ArrayList;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.com.dat.proyectofinal.tutelo.clases.TipoTarifa;

public class HotelSelectedActivity extends SherlockFragmentActivity {

	public static int THEME = R.style.Theme_Sherlock;
	ImageView imagenSeleccionada;
	Gallery gallery;
	Context context;
	Dialog dialog;
	ActionBar mActionBar;
	Spinner sptipotarifa;
	// Button button_UseSelectedItem;
	ArrayList<TipoTarifa> listTipoTarifa;
	private View _fragmentView;

	@Override
	protected void onCreate(Bundle arg0) {
		setTheme(THEME); // Used for theme switching in samples
		super.onCreate(arg0);
		listTipoTarifa = ListadoTipoTarifa();
		setContentView(R.layout.hotelselected_layout);

		sptipotarifa = (Spinner) findViewById(R.id.spi_hotelselected_tipo);
		// button_UseSelectedItem = (Button) findViewById(R.id.buttonUseItem);
		TipoTarifaAdapter myAdapter = new TipoTarifaAdapter(this,
				android.R.layout.simple_spinner_item, listTipoTarifa);

		sptipotarifa.setAdapter(myAdapter);

		/** Getting a reference to action bar of this activity */
		mActionBar = getSupportActionBar();

		mActionBar.setDisplayShowTitleEnabled(true);

		final Integer[] imagenes = { R.drawable.hotel1_room1,
				R.drawable.hotel1_room2, R.drawable.hotel1_room3,
				R.drawable.hotel1_room4 };

		gallery = (Gallery) findViewById(R.id.galleryimghotel);
		gallery.setAdapter(new GalleryAdapter(this, imagenes));

		gallery.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView parent, View v, int position,
					long id) {

				dialog = new Dialog(HotelSelectedActivity.this);
				dialog.setContentView(R.layout.imgroomselected_dialog);
				dialog.setTitle("Casa de campo ***");
				dialog.setCancelable(true);
				TextView text = (TextView) dialog
						.findViewById(R.id.txt_roomselected_tipo);
				text.setText("Matrimonial");
				ImageView img = (ImageView) dialog
						.findViewById(R.id.roomselected_img);
				img.setImageResource(R.drawable.hotel1_room1);
				dialog.show();

			}

		});

	}

	public ArrayList<TipoTarifa> ListadoTipoTarifa() {

		ArrayList<TipoTarifa> listTipoTarifa = new ArrayList<TipoTarifa>();
		listTipoTarifa.add(new TipoTarifa(1, "Simple", 1, (float) 25.00, true,
				R.drawable.img_nodisponible));
		listTipoTarifa.add(new TipoTarifa(2, "Doble", 2, (float) 35.00, true,
				R.drawable.img_disponible));
		listTipoTarifa.add(new TipoTarifa(3, "Matrimonial", 3, (float) 40.00,
				false, R.drawable.img_disponible));
		return listTipoTarifa;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.menu_search, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == R.id.mnuFiltro) {
			// startActivity(new Intent(this, FavoritosActivity.class));
		} else if (item.getItemId() == R.id.mnuMapa) {
			Toast.makeText(this, "configuración pulsado", Toast.LENGTH_SHORT)
					.show();
		}
		return true;
	}

}
