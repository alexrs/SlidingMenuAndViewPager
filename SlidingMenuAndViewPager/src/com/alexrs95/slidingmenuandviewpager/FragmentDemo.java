package com.alexrs95.slidingmenuandviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentDemo extends SherlockFragment {

	public static final String ARG_OBJECT = "object";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_main, container,
				false);
		Bundle args = getArguments();
		((TextView) rootView.findViewById(R.id.text1)).setText(Integer
				.toString(args.getInt(ARG_OBJECT)));

		return rootView;
	}

}
