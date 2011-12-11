package com.app.injad;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class InjadActivity extends Activity implements OnClickListener
{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        View numbersButton = findViewById(R.id.numbers_button);
        numbersButton.setOnClickListener(this);
        View aideButton = findViewById(R.id.aide_button);
        aideButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
    }
    
    public void onClick(View v)
    {
    	switch (v.getId())
    	{
		    case R.id.numbers_button:
		    	startActivity(new Intent(this, NumbersList.class));
		    break;
		    
		    case R.id.aide_button:
		    	startActivity(new Intent(this, SoinsList.class));
		    break;
    	
	    	case R.id.about_button:
	    		startActivity(new Intent(this, About.class));
	    	break;
    	}
    }
}