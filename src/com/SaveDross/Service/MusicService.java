package com.SaveDross.Service;

import com.SaveDross.Activity.R;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/**
 * @author Linciycuans
 * @date 2013-11-28
 * @file name MusicService.java
 */

public class MusicService extends Service {

	private MediaPlayer mediaPlayer;

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);
		if (mediaPlayer == null) {
			mediaPlayer = MediaPlayer.create(this, R.raw.shenhua);
			mediaPlayer.setLooping(true);
			mediaPlayer.start();

		}
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mediaPlayer.stop();
	}
}
