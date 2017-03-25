/**
 * 
 */
package com.SaveDross.Model;


import android.widget.ImageView;

/**
 * @author Linciycuans
 * @date 2013-12-3
 * @file name ContentModel.java
 */
public class ContentModel {
	public String name;
	public ImageView image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public ImageView getImage(){
		return image;
	}
	public void setImage(ImageView image){
		this.image =image;
	}
}

