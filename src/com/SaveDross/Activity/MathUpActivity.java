/**
 * 
 */
package com.SaveDross.Activity;



import java.util.ArrayList;

import com.SaveDross.Adapter.ContentAdapter;
import com.SaveDross.Model.ContentModel;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * @author Linciycuans
 * @date 2013-12-3
 * @file name MathUpActivity.java
 */
public class MathUpActivity extends Activity{
	ListView list;
	ContentAdapter adapter;
	ArrayList<ContentModel> math_list;
	ImageView[] b;
	ImageButton returnup; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		overridePendingTransition(R.anim.alpha_rotate, R.anim.my_alpha_action);
		setContentView(R.layout.content_view);
		math_list = new ArrayList<ContentModel>();
		String[] a ={"我","总","算","重","写","了","适","配","器","谢","天","凯"};
		for(int i = 0;i<a.length;i++)
		{
			ContentModel temp = new ContentModel();
			temp.setName(a[i]);
			math_list.add(temp);
		}
		adapter = new ContentAdapter(this,math_list);
		list =(ListView) findViewById(R.id.listView);
		list.setAdapter(adapter);
		returnup =(ImageButton) findViewById(R.id.returnup);
		returnup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MathUpActivity.this,MainActivity.class);
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
