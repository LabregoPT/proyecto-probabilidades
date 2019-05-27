package ui;

import model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;

import java.io.IOException;
import java.util.*;

public class ProbaProjectController {
	//Relacion con el modelo
	private Model model;
	
	private ArrayList<String> titles;
	private ArrayList<String> contents;
	private ArrayList<String> images;
	
	@FXML
	private ComboBox<String> themeCB;
	
	@FXML
	private ImageView mainImage;
	
	@FXML
	private Label titleLabel;
	
	@FXML
	private Text textTXT;
	
	@FXML
	private GridPane calcGP;
	
	@FXML
	private ScrollPane sp;
	
	@FXML
	public void initialize() throws IOException{
		model = new Model();
		model.generateDummyThemes();
		titles = model.getTitles();
		contents = model.getContent();
		images = model.getImages();
		ObservableList<String> titleItems = FXCollections.observableArrayList(titles);
		themeCB.setItems(titleItems);
		themeCB.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				changeTopic();
			}
		});
		sp.setFitToWidth(true);
		textTXT.setWrappingWidth(480);
	}
	
	public void changeTopic() {
		String value = themeCB.getValue();
		titleLabel.setText(value);
		int index = titles.indexOf(value);
		textTXT.setText(contents.get(index));
		mainImage.setFitHeight(0);
		mainImage.setImage(new Image(images.get(index)));
	}
}	
