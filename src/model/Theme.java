package model;

public class Theme {
	private String title;
	private String content;
	private String image;
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setTitle(String t){
		title = t;
	}
	
	public void setContent(String c) {
		content = c;
	}
	
	public void setImage(String i) {
		image = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+content;
	}
}
