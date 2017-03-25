/**
 * 
 */
package com.SaveDross.Adapter;

import java.util.ArrayList;

import com.SaveDross.Activity.R;
import com.SaveDross.Holder.GeneralHolder;
import com.SaveDross.Model.ContentModel;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * @author Linciycuans
 * @date 2013-12-3
 * @file name ContentAdapter.java
 */
public class ContentAdapter extends BaseAdapter{
	 private Context mContext;    
	 private ArrayList<ContentModel> list = new ArrayList<ContentModel>();  
	 public ContentAdapter(Context context,ArrayList<ContentModel> list){    
	    mContext=context; 
	    this.list = list;
	 }    

	private LayoutInflater inflater = null;
	/* (non-Javadoc)
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(final int position, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub
		GeneralHolder holder =new GeneralHolder();
		inflater = LayoutInflater.from(mContext);
		if (view == null) {
			view = inflater.inflate(R.layout.content_item,null);
			holder.textView=(TextView) view.findViewById(R.id.question);
			holder.imageView=(ImageView) view.findViewById(R.id.picture);
			holder.checkBox=(CheckBox) view.findViewById(R.id.checkBox);
			holder.textView.setText(list.get(position).getName());
			view.setTag(holder);
		}
		return view;
	}

}
