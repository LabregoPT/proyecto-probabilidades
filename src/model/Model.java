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
	
	public ArrayList<String> getImages(){
		ArrayList<String> toR = new ArrayList<String>();
		for(Theme t : themes) {
			toR.add(t.getImage());
		}
		return toR;
	}
	
	public void generateDummyThemes()throws IOException {
		int i = 1;
		while(i < 8) {
			BufferedReader titleReader = new BufferedReader(new FileReader(new File("data/Tema " + i +"/Titulo.txt")));
			BufferedReader contentReader = new BufferedReader(new FileReader(new File("data/Tema " + i +"/Tema.txt")));
			Theme t = new Theme();
			String titulo = titleReader.readLine();
			String content = "";
			String line = contentReader.readLine();
			while(line != null){
				content += line + "\n";
				line = contentReader.readLine();
			}
			t.setTitle(titulo);
			t.setContent(content);
			t.setImage("images/Tema " + i +"/Imagen.jpg");
			themes.add(t);
			titleReader.close();
			contentReader.close();
			i++;
		}
	}
}