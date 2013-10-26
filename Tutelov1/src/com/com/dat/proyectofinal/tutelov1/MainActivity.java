package com.com.dat.proyectofinal.tutelov1;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockFragmentActivity {
	public static int THEME = R.style.Theme_Sherlock;

	ActionBar mActionBar;
	ViewPager mPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(THEME); // Used for theme switching in samples
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/** Getting a reference to action bar of this activity */
        mActionBar = getSupportActionBar();
 
        /** Set tab navigation mode */
        mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 
        /** Getting a reference to ViewPager from the layout */
        mPager = (ViewPager) findViewById(R.id.pager);
 
        /** Getting a reference to FragmentManager */
        FragmentManager fm = getSupportFragmentManager();
 
        /** Defining a listener for pageChange */
        ViewPager.SimpleOnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mActionBar.setSelectedNavigationItem(position);
            }
        };
 
        /** Setting the pageChange listner to the viewPager */
        mPager.setOnPageChangeListener(pageChangeListener);
 
        /** Creating an instance of FragmentPagerAdapter */
        MyFragmentPagerAdapter fragmentPagerAdapter = new MyFragmentPagerAdapter(fm);
 
        /** Setting the FragmentPagerAdapter object to the viewPager object */
        mPager.setAdapter(fragmentPagerAdapter);
 
        mActionBar.setDisplayShowTitleEnabled(true);
 
        /** Defining tab listener */
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
 
            @Override
            public void onTabUnselected(Tab tab, FragmentTransaction ft) {
            }
 
            @Override
            public void onTabSelected(Tab tab, FragmentTransaction ft) {
                mPager.setCurrentItem(tab.getPosition());
            }
 
            @Override
            public void onTabReselected(Tab tab, FragmentTransaction ft) {
            }
        };
		
        /** Creating Android Tab */
        Tab tab = mActionBar.newTab()
                .setText(R.string.texto_tab_busqueda)
                .setTabListener(tabListener);
 
        mActionBar.addTab(tab);
 
        /** Creating Apple Tab */
        tab = mActionBar.newTab()
                .setText(R.string.texto_tab_historial)
                .setTabListener(tabListener);
        mActionBar.addTab(tab);
		
		
//		ActionBar.Tab tab1 = getSupportActionBar().newTab();
//		tab1.setText(R.string.texto_tab_busqueda);
//		tab1.setTabListener(this);
//		getSupportActionBar().addTab(tab1);
//
//		ActionBar.Tab tab2 = getSupportActionBar().newTab();
//		tab2.setText(R.string.texto_tab_historial);
//		tab2.setTabListener(this);
//		getSupportActionBar().addTab(tab2);

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
