package com.SaveDross.Activity;

import org.pzn.common.activity.CommonActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

/**
 * @author Linciycuans
 * @date 2013-11-28
 * @file name MainActivity.java
 */

// This is main
public class MainActivity extends CommonActivity {
	private ImageButton startSaveButton;
	private ImageButton drenchButton;
	private ImageButton mainOptionButton;
	private ImageButton exitButton;
	private Intent musicIntent = new Intent(
			"com.SaveDross.Service.MusicService");

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		overridePendingTransition(0, 0);
		setContentView(R.layout.main);
		startService(musicIntent);

		startSaveButton = (ImageButton) findViewById(R.id.startSave);
		startSaveButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,StartSaveActivity.class);
				startActivity(intent);
		
			}
		});
		drenchButton = (ImageButton) findViewById(R.id.drench);
		drenchButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(MainActivity.this,DrenchActivity.class);
				startActivity(intent);
			}
		});
		mainOptionButton = (ImageButton) findViewById(R.id.mainOption);
		mainOptionButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(MainActivity.this,OptionActivity.class);
				startActivity(intent);
				overridePendingTransition(0, 0);
			}
		});
		exitButton = (ImageButton) findViewById(R.id.exit);
		exitButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(MainActivity.this,MathUpActivity.class);
				startActivity(intent);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem mi) {
		if (mi.isCheckable()) {
			mi.setChecked(true);
		}

		switch (mi.getItemId()) {
		case R.id.main_about:
			Intent intent = new Intent(MainActivity.this, AboutActivity.class);
			startActivity(intent);
		

		}
		return true;
	}

	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		this.stopService(musicIntent);
	}
}
