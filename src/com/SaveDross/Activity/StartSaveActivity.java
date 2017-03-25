package com.SaveDross.Activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class StartSaveActivity extends Activity implements OnGestureListener {

	private GestureDetector detector;
	private ViewFlipper flipper;
	Intent getMainActivity = null;
	int count = 1;
	Button mathButton;
	Button linearButton;
	Button statisticButton;
	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		overridePendingTransition(R.anim.alpha_rotate, R.anim.my_alpha_action);
		drawBackground();
		LayoutInflater inflater = LayoutInflater.from(this);
		final View layout = inflater.inflate(R.layout.view_flipper, null);
		setContentView(layout);
		flipper = (ViewFlipper) findViewById(R.id.view_flipper);
		detector = new GestureDetector(this);
		mathButton=(Button) findViewById(R.id.math_button);
		linearButton=(Button) findViewById(R.id.linear_button);
		statisticButton=(Button) findViewById(R.id.statistic_button);
		mathButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StartSaveActivity.this,MathUpActivity.class);
				startActivity(intent);
			}
		});
		linearButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		statisticButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
		
	public void drawBackground() {
		GradientDrawable grad = new GradientDrawable(Orientation.TL_BR,
				new int[] { Color.rgb(0, 0, 127), Color.rgb(0, 0, 255),
						Color.rgb(127, 0, 255), Color.rgb(127, 127, 255),
						Color.rgb(127, 255, 255), Color.rgb(255, 255, 255) });

		this.getWindow().setBackgroundDrawable(grad);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		return this.detector.onTouchEvent(event);
	}

	public boolean onDown(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean onFling(MotionEvent e1, MotionEvent e2, float arg2,
			float arg3) {
		Log.i("Fling", "Fling Happened!");
		if (e1.getX() - e2.getX() > 5) {
			this.flipper.setInAnimation(AnimationUtils.loadAnimation(this,
					R.anim.push_left_in));
			this.flipper.setOutAnimation(AnimationUtils.loadAnimation(this,
					R.anim.push_left_out));
			if (count < 3) {
				this.flipper.showNext();
				count++;
			}

			return true;
		} else if (e1.getX() - e2.getX() < -5) {
			this.flipper.setInAnimation(AnimationUtils.loadAnimation(this,
					R.anim.push_right_in));
			this.flipper.setOutAnimation(AnimationUtils.loadAnimation(this,
					R.anim.push_right_out));
			if (count > 1) {
				this.flipper.showPrevious();
				count--;
			}
			return true;
		}
		return true;
	}

	public void onLongPress(MotionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public boolean onScroll(MotionEvent arg0, MotionEvent arg1, float arg2,
			float arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	public void onShowPress(MotionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public boolean onSingleTapUp(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}
