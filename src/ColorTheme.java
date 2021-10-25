
import javafx.application.Application;

import javafx.event.ActionEvent;

import java.util.Random;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

import javafx.stage.Stage;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.geometry.Pos;



public class ColorTheme extends Application{

	private Button button;
	
	boolean refresh = false;
	
	Random rand = new Random();
	
	GridPane gridPane = new GridPane();
	GridPane gridPane2 = new GridPane();
	GridPane gridPane3 = new GridPane();
	
	public void start(Stage primaryStage){
		
		StackPane rootPane = new StackPane();
		
		// Title - gridPane2
		
		Text title = new Text("Random Color Theme");
		title.setFont(new Font(24));	
		
		button = new Button("Get New Colors");
		button.setOnAction(this::processButtonClick);

		gridPane2.setAlignment(Pos.TOP_CENTER);
		gridPane2.setHgap(20);
		gridPane2.setVgap(30);
		//gridPane2.setGridLinesVisible(true);
		
		gridPane2.add(title, 1, 2);
		
		// Button - gridPane3
		
		button = new Button("Get New Colors");
		button.setOnAction(this::processButtonClick);

		gridPane3.setAlignment(Pos.TOP_CENTER);
		gridPane3.setHgap(20);
		gridPane3.setVgap(35);
		//gridPane3.setGridLinesVisible(true);
		
		gridPane3.add(button, 1, 3);
		
		// Boxes - gridPane
		
		gridPane.setStyle("-fx-background-color: white");
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(20);
		gridPane.setVgap(20);
		//gridPane.setGridLinesVisible(true);
		
		Group group = new Group();
		
		
		  int x = -55;
		  int position = 0;
		  
		  for (int i = 0; i < 5; i++) {
		  
		  x =+ 105;
		  
		  Rectangle box = new Rectangle(x, 200, 100, 400);
		  
		  int r = rand.nextInt(255) + 1;
		  int g = rand.nextInt(255) + 1;
		  int b = rand.nextInt(255) + 1;
		  
		  box.setFill(Color.rgb(r, g, b));
		  
		  Text rgb = new Text("R: " + r + " G: " + g + " B: " + b);
		    
		  position++;
		  
		  gridPane.add(box, position, 5);
		  gridPane.add(rgb, position, 6);
		  
		  }
		 
		
		rootPane.getChildren().addAll(gridPane, gridPane2, gridPane3);
		  
		Scene scene = new Scene(rootPane, 700, 700);

		primaryStage.setTitle("Random Color Theme");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void processButtonClick(ActionEvent event) {
		if (event.getSource() == button)
			
			refresh();
		
	}
	
	public void refresh() {
		
		  int x = -55;
		  int position = 0;
		  
		  for (int i = 0; i < 5; i++) {
		  
		  x =+ 105;
		  
		  Rectangle box = new Rectangle(x, 200, 100, 400);
		  
		  int r = rand.nextInt(255) + 1;
		  int g = rand.nextInt(255) + 1;
		  int b = rand.nextInt(255) + 1;
		  
		  box.setFill(Color.rgb(r, g, b));
		  
		  Text rgb = new Text("R: " + r + " G: " + g + " B: " + b);	 
		  
		  Rectangle whiteOut = new Rectangle(x, 600, 114, 50);
		  whiteOut.setFill(Color.WHITE);
		  
		  position++;
		  
		  gridPane.add(box, position, 5);
		  gridPane.add(whiteOut, position, 6);
		  gridPane.add(rgb, position, 6);
		  
		  }
		  
	}
	
	public static void main (String[] args) {
		
		launch(args);
	}

}

