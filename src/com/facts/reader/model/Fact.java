package com.facts.reader.model;

import android.graphics.Bitmap;

//Class for objects 

public class Fact {
	private Bitmap bitmap;
	private String title;
	private String description;
	private String imageHref;
	private boolean imageurlstatus; 

	public Fact() {
		imageurlstatus= true;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageHref() {
		return imageHref;
	}
	public void setImageHref(String imageHref) {
		this.imageHref = imageHref;
	}
	public Bitmap getBitmap() {
		return bitmap;
	}
	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}
	public boolean getImageurlstatus() {
		return imageurlstatus;
	}
	public void setImageurlstatus(boolean imageurlstatus) {
		this.imageurlstatus = imageurlstatus;
	}

}