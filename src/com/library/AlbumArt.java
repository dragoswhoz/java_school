package com.library;

public class AlbumArt extends Book {
	private String paperQuality;

	public AlbumArt() {
		super();
		
	}

	public AlbumArt(int numOfPages, String title, String paperQuality) {
		super(numOfPages, title);
		this.paperQuality = paperQuality;
		
	}

	public String getPaperQuality() {
		return paperQuality;
	}

	public void setPaperQuality(String paperQuality) {
		this.paperQuality = paperQuality;
	}
}
