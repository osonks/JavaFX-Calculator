package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class HelloApplication extends Application{
    double num1 = 0;
    double num2 = 0;
    double ans = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox h1 = new HBox();
        h1.setSpacing(10);
        h1.setAlignment(Pos.CENTER);

        HBox h2 = new HBox();
        h2.setSpacing(10);
        h2.setAlignment(Pos.CENTER);

        Label l1 = new Label("Number 1");
        Label l2 = new Label("Number 2");
        Label l3 = new Label("Result");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        t3.setDisable(true);

        h1.getChildren().addAll(l1, t1, l2, t2,l3, t3);

        Button add = new Button("ADD");
        Button sub = new Button("SUB");
        Button mul = new Button("MUL");
        Button div = new Button("DIV");

        add.setOnAction(e -> {
            ans = Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText());
            t3.setText(String.valueOf(ans));
        });

        sub.setOnAction(e -> {
            ans = Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText());
            t3.setText(String.valueOf(ans));
        });

        mul.setOnAction(e -> {
            ans = Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText());
            t3.setText(String.valueOf(ans));
        });

        div.setOnAction(e -> {
            ans = Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText());
            t3.setText(String.valueOf(ans));
        });

        h2.getChildren().addAll(add, sub, mul, div);

        BorderPane borderPane = new BorderPane(h1);
        borderPane.setBottom(h2);

        Scene scene = new Scene(borderPane, 750, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise2");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}