package com.com.dat.proyectofinal.tutelov1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

	final int PAGE_COUNT = 2;

	/** Constructor of the class */
	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	/** This method will be invoked when a page is requested to create */
	@Override
	public Fragment getItem(int arg0) {
		Bundle data = new Bundle();
		switch (arg0) {
		/** Android tab is selected */
		case 0:
			SearchFragment searchFragment = new SearchFragment();
			data.putInt("current_page", arg0 + 1);
			searchFragment.setArguments(data);
			return searchFragment;
			

			/** Apple tab is selected */
		case 1:
			HistoryFragment historyFragment = new HistoryFragment();
			data.putInt("current_page", arg0 + 1);
			historyFragment.setArguments(data);
			return historyFragment;
		}
		return null;
	}

	/** Returns the number of pages */
	@Override
	public int getCount() {
		return PAGE_COUNT;
	}
}
