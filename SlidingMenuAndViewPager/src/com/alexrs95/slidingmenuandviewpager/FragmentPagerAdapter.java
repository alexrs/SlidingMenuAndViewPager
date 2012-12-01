package com.alexrs95.slidingmenuandviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

	public FragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		Fragment fragment = new FragmentDemo();
		Bundle args = new Bundle();
		args.putInt(FragmentDemo.ARG_OBJECT, i + 1); // Our object is just an
														// integer :-P
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public int getCount() {
		return 10;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return "Page " + (position + 1);
	}

}
