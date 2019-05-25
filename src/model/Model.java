package model;
import java.util.*;
import java.io.*;


public class Model {

	private ArrayList<Theme> themes;
	
	public Model() {
		themes = new ArrayList<Theme>();
	}
	
	public ArrayList<String> getTitles(){
		ArrayList<String> toR = new ArrayList<String>();
		for(Theme t : themes) {
			toR.add(t.getTitle());
		}
		return toR;
	}
	
	public ArrayList<String> getContent(){
		ArrayList<String> toR = new ArrayList<String>();
		for(Theme t : themes) {
			toR.add(t.getContent());
		}
		return toR;
	}
	
	public void generateDummyThemes() throws IOException{
		int i = 0;
		BufferedReader fr = new BufferedReader(new FileReader(new File("data/archivo.txt")));
		while(i<10) {
			String line = fr.readLine();
			Theme t = new Theme();
			if(line.startsWith("$")) {
				t.setTitle(line);
			}else {
				t.setContent(line);
				System.out.println(line);
			}
			themes.add(t);
			i++;
		}
		fr.close();
	}
}
