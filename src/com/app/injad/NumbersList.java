package com.app.injad;

import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class NumbersList extends ListActivity
{
	/** Called when the activity is first created. */
	public void onCreate(Bundle icicle) 
	{
		super.onCreate(icicle);
		Resources res = getResources();
		String[] labels = res.getStringArray(R.array.numbers_labels);
		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, labels));
	}

	protected void onListItemClick(ListView l, View v, int position, long id) 
	{
		super.onListItemClick(l, v, position, id);
		Resources res = getResources();
		String[] numbers = res.getStringArray(R.array.numbers);
		startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+numbers[position])));
	}
}
