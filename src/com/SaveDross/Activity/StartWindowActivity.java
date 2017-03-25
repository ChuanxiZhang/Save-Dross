package com.SaveDross.Activity;







import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/**
 * @author Linciycuans
 * @date 2013-11-27
 * @file name StartWindowActivity.java
 */

public class StartWindowActivity extends Activity {
	ImageView imageView;
	AnimationDrawable draw;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.setContentView(R.layout.start_window);
		imageView = (ImageView) findViewById(R.id.picture);
//		__LinciyStart start = new __LinciyStart();
//		start.startAnimationDynamic(imageView, R.anim.animation_list);
		imageView.setBackgroundResource(R.anim.animation_list);
		draw = (AnimationDrawable) imageView.getBackground(); 
		
		if (draw.isRunning()) {
			draw.stop();
		} else {
			draw.stop();
			draw.start();
		}
		AlphaAnimation animation = new AlphaAnimation(1.0f, 1.0f);
		animation.setDuration(7300);
		ImageView img_logo = (ImageView) this.findViewById(R.id.picture);
		img_logo.setAnimation(animation);
		
		animation.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(StartWindowActivity.this,
						SD_StartWindowActivity.class);
				startActivity(intent);
				StartWindowActivity.this.finish();
			}

			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}
		});
	}


}
