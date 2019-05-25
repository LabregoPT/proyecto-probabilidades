package model;

public class Theme {
	private String title;
	private String content;
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setTitle(String t){
		title = t;
	}
	
	public void setContent(String c) {
		content = c;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+content;
	}
}
