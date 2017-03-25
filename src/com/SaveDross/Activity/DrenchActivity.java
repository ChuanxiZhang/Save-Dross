package com.SaveDross.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;

public class DrenchActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		overridePendingTransition(R.anim.alpha_rotate, R.anim.my_alpha_action);
		setContentView(R.layout.drench);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
