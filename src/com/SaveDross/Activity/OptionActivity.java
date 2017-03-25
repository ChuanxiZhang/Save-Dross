package com.SaveDross.Activity;

import com.SaveDross.Activity.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

/**
 * @author Linciycuans
 * @date 2013-11-29
 * @file name OptionActivity.java
 */
	
public class OptionActivity extends Activity{
	Switch musicSwitch;
	ImageButton optionruturnButton;
	private Intent musicIntent = new Intent(
			"com.SaveDross.Service.MusicService");
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.option_main);
		musicSwitch = (Switch) findViewById(R.id.switch1);
		optionruturnButton=(ImageButton) findViewById(R.id.optionreturn);
		musicSwitch.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean ischecked) {
				// TODO Auto-generated method stub			
				if(ischecked)
				{
					startService(musicIntent);
				}
				else{
					stopService(musicIntent);
				}
			}		
		} );
		optionruturnButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(OptionActivity.this,MainActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
