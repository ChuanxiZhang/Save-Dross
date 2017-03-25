package com.SaveDross.Activity;

import org.pzn.common.activity.CommonActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class SD_StartWindowActivity extends CommonActivity implements
OnClickListener {
	ImageView imageView;
	AnimationDrawable draw;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.setContentView(R.layout.sd_start_window);

		AlphaAnimation animation = new AlphaAnimation(1.0f, 1.0f);
		animation.setDuration(3000);
		ImageView img_logo = (ImageView) this.findViewById(R.id.picture);
		img_logo.setAnimation(animation);

		animation.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(SD_StartWindowActivity.this,
						MainActivity.class);
				startActivity(intent);
				SD_StartWindowActivity.this.finish();
			}

			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}
		});
	}

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}
