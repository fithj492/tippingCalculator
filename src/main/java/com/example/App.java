package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets; 
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;


	public static double tip(double billAmt, double percentage) {
		return billAmt * (percentage/100);

	}


    @Override
    public void start(Stage stage) throws IOException {
        
        StackPane layout = new StackPane();
        Button plusbutton = new Button("+");
        Button minusbutton = new Button("-");
        
        Label label = new Label("     15$");  
        Label label1 = new Label(" 1.5$ per person");  
        Label label2 = new Label("     10%");  
        Label label3 = new Label("     1");  
        Spinner cost = new Spinner(1, 12, 4);
        Spinner percent = new Spinner(1, 31, 4);
        minusbutton.setPrefSize(20, 20);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("CodersLegacy");
        layout.getChildren().addAll(plusbutton);
        layout.getChildren().addAll(minusbutton);
        layout.getChildren().addAll(label);
        Text text1 = new Text("cost");
        Text text2 = new Text("percentage");
        Text text3 = new Text("people");     
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        label.setFont(font);
        cost.setEditable(true);
        percent.setEditable(true);
        cost.setPrefSize(75, 25);
        percent.setPrefSize(75, 25);
        //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    

      //Setting size for the pane 
      gridPane.setMinSize(400, 200); 

      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 

      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(10); 
      gridPane.setHgap(10);       

      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 

      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0); 
      gridPane.add(label1, 1, 0); 
      gridPane.add(minusbutton, 1, 0); 
      gridPane.add(plusbutton, 3, 0); 
      gridPane.add(label, 4, 0); 
      gridPane.add(text2, 0, 1);       
      gridPane.add(label2, 1, 1); 
      
      gridPane.add(text3, 0, 2);       
      gridPane.add(label3, 1, 2); 
      


      //Styling nodes  
      plusbutton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      minusbutton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      

      text1.setStyle("-fx-font: normal bold 10px 'sans-serif' "); 
      text2.setStyle("-fx-font: normal bold 10px 'sans-serif' ");  
      text3.setStyle("-fx-font: normal bold 10px 'sans-serif' ");  
      label.setStyle("-fx-font: normal bold 20px 'sans-serif' ");  
      gridPane.setStyle("-fx-background-color: #999999;"); 

      //Creating a scene object 
      Scene scene = new Scene(gridPane); 

      stage.setTitle("CSS Example");
         
      stage.setScene(scene);
         
      stage.show();
       
      



    }



    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();




    }

    

}