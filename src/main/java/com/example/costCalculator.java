package com.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;


public class costCalculator extends Application  {
    @Override
    public void start(Stage stage) {
        //Input Labels
        Label costInputLabel = new Label("cost:");
        Label percentageInputLabel = new Label("percentage:");
        Label amountOfPeopleInputLabel = new Label("amount per perrson:");
        //Inputs
        //cost
        Spinner<Integer> costInputSpinner = new Spinner<Integer>();
        SpinnerValueFactory<Integer> costInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        costInputSpinner.setValueFactory(costInputValueFactory);
        costInputSpinner.setEditable(true);
        //percentage
        Spinner<Integer> percentageInputSpinner = new Spinner<Integer>();
        SpinnerValueFactory<Integer> percentageInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        percentageInputSpinner.setValueFactory(percentageInputValueFactory);
        percentageInputSpinner.setEditable(true);
        //Crit cost
        Spinner<Integer> amountOfPeopleInputSpinner = new Spinner<Integer>();
        SpinnerValueFactory<Integer> amountOfPeopleInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        amountOfPeopleInputSpinner.setValueFactory(amountOfPeopleInputValueFactory);
        amountOfPeopleInputSpinner.setEditable(true);
        //Ouput Labels
        Label costOutputLabel = new Label("cost:");
        Label amountOfPeopleOutputLabel = new Label("cost:");
       
        //Outputs
        Label costOutputValueLabel = new Label("");
        Label amountOfPeopleOutputValueLabel = new Label("");
        //Button
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(action -> {
            //Get Inputs
            double cost = costInputSpinner.getValue();
            double percentage = percentageInputSpinner.getValue();
            double amountOfPeople = amountOfPeopleInputSpinner.getValue();
           
            //Results
            double costOutput = ((cost) / (percentage));
            double amountOfPeopleOutput = ((cost) * (percentage/100)) / (amountOfPeople);
            String costOutputString = "" + (costOutput);
            String amountOfPeopleOutputString = "" + amountOfPeopleOutput;
            //Display
            costOutputValueLabel.setText(costOutputString);
            amountOfPeopleOutputValueLabel.setText(amountOfPeopleOutputString);
        });
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 150);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(costInputLabel, 0, 0);
        gridPane.add(costInputSpinner, 1, 0);
        gridPane.add(percentageInputLabel, 0, 1);
        gridPane.add(percentageInputSpinner, 1, 1);
        gridPane.add(amountOfPeopleInputLabel, 0, 2);
        gridPane.add(amountOfPeopleInputSpinner, 1, 2);
        gridPane.add(calculateButton, 0, 3);
        gridPane.add(costOutputLabel, 2, 0);
        gridPane.add(amountOfPeopleOutputLabel, 2, 2);
        gridPane.add(costOutputValueLabel, 2, 1);
        gridPane.add(amountOfPeopleOutputValueLabel, 2, 3);
        Scene scene = new Scene(gridPane);
        stage.setTitle("Hypixel Skyblock cost Calculator");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}

