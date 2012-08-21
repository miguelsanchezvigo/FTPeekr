package com.oldcherokee.ftpeekr.fragments;

import com.oldcherokee.ftpeekr.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListConnectionFragment extends android.app.ListFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	    String[] values = new String[] { "New" };
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
	    setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
	    DetailConnectionFragment fragment = (DetailConnectionFragment) getFragmentManager().findFragmentById(R.id.detail_connection_fragment);
	    if (fragment != null && fragment.isInLayout()) {
	    	fragment.setText(item);
	    } else {
	    	Intent intent = new Intent(getActivity().getApplicationContext(), Detail.class);
	    	intent.putExtra("value", item);
	    	startActivity(intent);
	    }
	}
}
