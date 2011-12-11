package com.app.injad;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Soins extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		int value = 0;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.soins);
		Bundle extras = getIntent().getExtras();
		if(extras != null)
		{
			value = extras.getInt("index");
		}
		Resources res = getResources();
		String[] soins = res.getStringArray(R.array.soins);
		String[] soinsLabels = res.getStringArray(R.array.soins_labels);
		this.setTitle(soinsLabels[value]);
		TextView tv; 
		tv = (TextView)findViewById(R.id.soins_content); 
		tv.setText(Html.fromHtml(soins[value])); 
		tv.setTextSize(16);
	}
}
