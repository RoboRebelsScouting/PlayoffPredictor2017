package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.awt.SystemColor.text;
import static java.awt.SystemColor.window;
import static javafx.application.Platform.exit;
import static javafx.scene.paint.Color.RED;

public class Main extends Application {

    //public static String userDir = System.getProperty("user.home");
    //public static String dataSheetDir = "C:\\Users\\1153\\Documents\\Datasheets";
    //public static String dataSheetDir = userDir + "\\Documents\\Datasheets";
    public Writer writer = null;
    public ArrayList<RobotData> robotList = new ArrayList<RobotData>();
    public List<AllianceData> adList1 = new ArrayList<AllianceData>();
    public List<AllianceData> adList2 = new ArrayList<AllianceData>();
    public List<AllianceData> adList3 = new ArrayList<AllianceData>();
    public List<AllianceData> adList4 = new ArrayList<AllianceData>();
    public List<AllianceData> adList5 = new ArrayList<AllianceData>();
    public List<AllianceData> adList6 = new ArrayList<AllianceData>();
    public List<AllianceData> adList7 = new ArrayList<AllianceData>();
    public List<AllianceData> adList8 = new ArrayList<AllianceData>();
    public List<AllianceTextData> actualList = new ArrayList<AllianceTextData>();
    public List<Integer> teamList = new ArrayList<Integer>();

    public AllianceData alliance1 = new AllianceData();
    public AllianceData alliance2 = new AllianceData();
    public AllianceData alliance3 = new AllianceData();
    public AllianceData alliance4 = new AllianceData();
    public AllianceData alliance5 = new AllianceData();
    public AllianceData alliance6 = new AllianceData();
    public AllianceData alliance7 = new AllianceData();
    public AllianceData alliance8 = new AllianceData();

    public List<Text> alliance1TextList = new ArrayList<Text>();
    public List<Text> alliance2TextList = new ArrayList<Text>();
    public List<Text> alliance3TextList = new ArrayList<Text>();
    public List<Text> alliance4TextList = new ArrayList<Text>();
    public List<Text> alliance5TextList = new ArrayList<Text>();
    public List<Text> alliance6TextList = new ArrayList<Text>();
    public List<Text> alliance7TextList = new ArrayList<Text>();
    public List<Text> alliance8TextList = new ArrayList<Text>();
    public List<Text> robotTextList = new ArrayList<Text>();



    public Text predictedScore1;
    public Text predictedScore2;
    public Text predictedScore3;
    public Text predictedScore4;
    public Text predictedScore5;
    public Text predictedScore6;
    public Text predictedScore7;
    public Text predictedScore8;

    public Text avgTeleGearsText1;
    public Text avgAutoGearsText1;
    public Text avgTeleFuelText1;
    public Text avgAutoFuelText1;
    public Text avgClimbsText1;

    public Text avgTeleGearsText2;
    public Text avgAutoGearsText2;
    public Text avgTeleFuelText2;
    public Text avgAutoFuelText2;
    public Text avgClimbsText2;

    public Text avgTeleGearsText3;
    public Text avgAutoGearsText3;
    public Text avgTeleFuelText3;
    public Text avgAutoFuelText3;
    public Text avgClimbsText3;

    public Text avgTeleGearsText4;
    public Text avgAutoGearsText4;
    public Text avgTeleFuelText4;
    public Text avgAutoFuelText4;
    public Text avgClimbsText4;

    public Text avgTeleGearsText5;
    public Text avgAutoGearsText5;
    public Text avgTeleFuelText5;
    public Text avgAutoFuelText5;
    public Text avgClimbsText5;

    public Text avgTeleGearsText6;
    public Text avgAutoGearsText6;
    public Text avgTeleFuelText6;
    public Text avgAutoFuelText6;
    public Text avgClimbsText6;

    public Text avgTeleGearsText7;
    public Text avgAutoGearsText7;
    public Text avgTeleFuelText7;
    public Text avgAutoFuelText7;
    public Text avgClimbsText7;

    public Text avgTeleGearsText8;
    public Text avgAutoGearsText8;
    public Text avgTeleFuelText8;
    public Text avgAutoFuelText8;
    public Text avgClimbsText8;

    public int avgAutoFuel1X = 462;
    public int avgAutoFuel1Y = 73;
    public int avgTeleFuel1X = 556;
    public int avgTeleFuel1Y = 73;
    public int avgAutoGears1X = 650;
    public int avgAutoGears1Y = 73;
    public int avgTeleGears1X = 753;
    public int avgTeleGears1Y = 73;
    public int avgClimbs1X = 838;
    public int avgClimbs1Y = 73;

    public int avgAutoFuel2X = 462;
    public int avgAutoFuel2Y = 140;
    public int avgTeleFuel2X = 556;
    public int avgTeleFuel2Y = 140;
    public int avgAutoGears2X = 650;
    public int avgAutoGears2Y = 140;
    public int avgTeleGears2X = 753;
    public int avgTeleGears2Y = 140;
    public int avgClimbs2X = 838;
    public int avgClimbs2Y = 140;

    public int avgAutoFuel3X = 462;
    public int avgAutoFuel3Y = 201;
    public int avgTeleFuel3X = 556;
    public int avgTeleFuel3Y = 201;
    public int avgAutoGears3X = 650;
    public int avgAutoGears3Y = 201;
    public int avgTeleGears3X = 753;
    public int avgTeleGears3Y = 201;
    public int avgClimbs3X = 838;
    public int avgClimbs3Y = 201;

    public int avgAutoFuel4X = 462;
    public int avgAutoFuel4Y = 269;
    public int avgTeleFuel4X = 556;
    public int avgTeleFuel4Y = 269;
    public int avgAutoGears4X = 650;
    public int avgAutoGears4Y = 269;
    public int avgTeleGears4X = 753;
    public int avgTeleGears4Y = 269;
    public int avgClimbs4X = 838;
    public int avgClimbs4Y = 269;

    public int avgAutoFuel5X = 462;
    public int avgAutoFuel5Y = 333;
    public int avgTeleFuel5X = 556;
    public int avgTeleFuel5Y = 333;
    public int avgAutoGears5X = 650;
    public int avgAutoGears5Y = 333;
    public int avgTeleGears5X = 753;
    public int avgTeleGears5Y = 333;
    public int avgClimbs5X = 838;
    public int avgClimbs5Y = 333;

    public int avgAutoFuel6X = 462;
    public int avgAutoFuel6Y = 398;
    public int avgTeleFuel6X = 556;
    public int avgTeleFuel6Y = 398;
    public int avgAutoGears6X = 650;
    public int avgAutoGears6Y = 398;
    public int avgTeleGears6X = 753;
    public int avgTeleGears6Y = 398;
    public int avgClimbs6X = 838;
    public int avgClimbs6Y = 398;

    public int avgAutoFuel7X = 462;
    public int avgAutoFuel7Y = 465;
    public int avgTeleFuel7X = 556;
    public int avgTeleFuel7Y = 465;
    public int avgAutoGears7X = 650;
    public int avgAutoGears7Y = 465;
    public int avgTeleGears7X = 753;
    public int avgTeleGears7Y = 465;
    public int avgClimbs7X = 838;
    public int avgClimbs7Y = 465;

    public int avgAutoFuel8X = 462;
    public int avgAutoFuel8Y = 528;
    public int avgTeleFuel8X = 556;
    public int avgTeleFuel8Y = 528;
    public int avgAutoGears8X = 650;
    public int avgAutoGears8Y = 528;
    public int avgTeleGears8X = 753;
    public int avgTeleGears8Y = 528;
    public int avgClimbs8X = 838;
    public int avgClimbs8Y = 528;

    public int predictedScore1X = 353;
    public int predictedScore1Y = 73;

    public int predictedScore2X = 353;
    public int predictedScore2Y = 140;

    public int predictedScore3X = 353;
    public int predictedScore3Y = 201;

    public int predictedScore4X = 353;
    public int predictedScore4Y = 269;

    public int predictedScore5X = 353;
    public int predictedScore5Y = 333;

    public int predictedScore6X = 353;
    public int predictedScore6Y = 398;

    public int predictedScore7X = 353;
    public int predictedScore7Y = 465;

    public int predictedScore8X = 353;
    public int predictedScore8Y = 528;

    public int predictedScoreLabelX = 315;
    public int predictedScoreLabelY = 25;
    public int avgTeleFuelLabelX = 540;
    public int avgTeleFuelLabelY = 25;
    public int avgAutoFuelLabelX = 445;
    public int avgAutoFuelLabelY = 25;
    public int avgTeleGearsLabelX = 735;
    public int avgTeleGearsLabelY = 25;
    public int avgAutoGearsLabelX = 630;
    public int avgAutoGearsLabelY = 25;
    public int avgClimbsLabelX = 830;
    public int avgClimbsLabelY = 25;


    public int alliance1TextY = 50;
    public int alliance1TextX = 150;
    public int alliance2TextY = 115;
    public int alliance2TextX = 150;
    public int alliance3TextY = 180;
    public int alliance3TextX = 150;
    public int alliance4TextY = 245;
    public int alliance4TextX = 150;
    public int alliance5TextY = 310;
    public int alliance5TextX = 150;
    public int alliance6TextY = 375;
    public int alliance6TextX = 150;
    public int alliance7TextY = 440;
    public int alliance7TextX = 150;
    public int alliance8TextY = 505;
    public int alliance8TextX = 150;
    public int robotTextY = 50;
    public int robotTextX = 5;

    public int startX = 5;
    public int startY = 38;
    public int incrX = 30;
    public int incrY = 25;
    public int currX = startX;
    public int currY = startY;
    public int columns = 4;
    public int robotColumns = 4;
    public int robotYOffset = 30;
    public int robotYIncr = 25;
    public int alliance1Columns = 3;
    public int alliance1YIncr = 25;
    public int alliance1YOffset = 30;
    public int alliance2Columns = 3;
    public int alliance2YIncr = 25;
    public int alliance2YOffset = 30;
    public int alliance3Columns = 3;
    public int alliance3YIncr = 25;
    public int alliance3YOffset = 30;
    public int alliance4Columns = 3;
    public int alliance4YIncr = 25;
    public int alliance4YOffset = 30;
    public int alliance5Columns = 3;
    public int alliance5YIncr = 25;
    public int alliance5YOffset = 30;
    public int alliance6Columns = 3;
    public int alliance6YIncr = 25;
    public int alliance6YOffset = 30;
    public int alliance7Columns = 3;
    public int alliance7YIncr = 25;
    public int alliance7YOffset = 30;
    public int alliance8Columns = 3;
    public int alliance8YIncr = 25;
    public int alliance8YOffset = 30;

    @Override
    public void start(Stage primaryStage) throws Exception{
        getDataFromDB();
        //System.out.println("start");
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        primaryStage.setTitle("Playoff Predictor");
        primaryStage.setScene(new Scene(root, 900, 650));
        Button bracket = new Button();
        bracket.setLayoutX(5);
        bracket.setLayoutY(5);
        bracket.setPrefSize(95, 10);
        bracket.setText("Create Bracket");
        root.getChildren().add(bracket);
        //make new page to show Bracket
        bracket.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        dialog.initOwner(primaryStage);
                        GridPane bracket = new GridPane ();
                        bracket.setHgap(10);
                        bracket.setVgap(10);
                        bracket.setPadding(new Insets(0, 10, 0, 10));
                        Scene dialogScene = new Scene(bracket, 900, 650);

                        Text alliance1Label = new Text("Alliance 1");
                        alliance1Label.setStyle("-fx-font: 15 cambria");
                        alliance1Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance1Label, 0, 0);

                        Text alliance1Score = new Text("");
                        alliance1Score.setStyle("-fx-font: 13 cambria");
                        alliance1Score.setFill(Color.RED);
                        bracket.add(alliance1Score, 0, 1);
                        alliance1Score.setText(predictedScore1.getText().toString());


                        Text A1VA8 = new Text ("Vs.");
                        A1VA8.setStyle("-fx-font: 13 cambria");
                        bracket.add(A1VA8, 0, 2);

                        Text alliance8Label = new Text("Alliance 8");
                        alliance8Label.setStyle("-fx-font: 15 cambria");
                        alliance8Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance8Label, 0, 3);

                        Text alliance8Score = new Text("");
                        alliance8Score.setStyle("-fx-font: 13 cambria");
                        alliance8Score.setFill(Color.RED);
                        bracket.add(alliance8Score, 0, 4);
                        alliance8Score.setText(predictedScore8.getText().toString());

                        Text alliance3Label = new Text("Alliance 3");
                        alliance3Label.setStyle("-fx-font: 15 cambria");
                        alliance3Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance3Label, 0, 18);

                        Text alliance3Score = new Text("");
                        alliance3Score.setStyle("-fx-font: 13 cambria");
                        alliance3Score.setFill(Color.RED);
                        bracket.add(alliance3Score, 0, 19);
                        alliance3Score.setText(predictedScore3.getText().toString());

                        Text A3VA6 = new Text ("Vs.");
                        A3VA6.setStyle("-fx-font: 13 cambria");
                        bracket.add(A3VA6, 0, 20);

                        Text alliance6Label = new Text("Alliance 6");
                        alliance6Label.setStyle("-fx-font: 15 cambria");
                        alliance6Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance6Label, 0, 21);

                        Text alliance6Score = new Text("");
                        alliance6Score.setStyle("-fx-font: 13 cambria");
                        alliance6Score.setFill(Color.RED);
                        bracket.add(alliance6Score, 0, 22);
                        alliance6Score.setText(predictedScore6.getText().toString());

                        Text alliance2Label = new Text("Alliance 2");
                        alliance2Label.setStyle("-fx-font: 15 cambria");
                        alliance2Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance2Label, 0, 12);

                        Text alliance2Score = new Text("");
                        alliance2Score.setStyle("-fx-font: 13 cambria");
                        alliance2Score.setFill(Color.RED);
                        bracket.add(alliance2Score, 0, 13);
                        alliance2Score.setText(predictedScore2.getText().toString());

                        Text A2VA7 = new Text ("Vs.");
                        A2VA7.setStyle("-fx-font: 13 cambria");
                        bracket.add(A2VA7, 0, 14);

                        Text alliance7Label = new Text("Alliance 7");
                        alliance7Label.setStyle("-fx-font: 15 cambria");
                        alliance7Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance7Label, 0, 15);

                        Text alliance7Score = new Text("");
                        alliance7Score.setStyle("-fx-font: 13 cambria");
                        alliance7Score.setFill(Color.RED);
                        bracket.add(alliance7Score, 0, 16);
                        alliance7Score.setText(predictedScore7.getText().toString());

                        Text alliance4Label = new Text("Alliance 4");
                        alliance4Label.setStyle("-fx-font: 15 cambria");
                        alliance4Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance4Label, 0, 6);

                        Text alliance4Score = new Text("");
                        alliance4Score.setStyle("-fx-font: 13 cambria");
                        alliance4Score.setFill(Color.RED);
                        bracket.add(alliance4Score, 0, 7);
                        alliance4Score.setText(predictedScore4.getText().toString());

                        Text A4VA5 = new Text ("Vs.");
                        A4VA5.setStyle("-fx-font: 13 cambria");
                        bracket.add(A4VA5, 0, 8);

                        Text alliance5Label = new Text("Alliance 5");
                        alliance5Label.setStyle("-fx-font: 15 cambria");
                        alliance5Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance5Label, 0, 9);

                        Text alliance5Score = new Text("");
                        alliance5Score.setStyle("-fx-font: 13 cambria");
                        alliance5Score.setFill(Color.RED);
                        bracket.add(alliance5Score, 0, 10);
                        alliance5Score.setText(predictedScore5.getText().toString());

                        Text A1vA8Label = new Text ("");
                        A1vA8Label.setStyle("-fx-font: 15 cambria");
                        A1vA8Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(A1vA8Label, 3, 2);
                        Text A1vA8Score = new Text ("");
                        A1vA8Score.setStyle("-fx-font: 13 cambria");
                        A1vA8Score.setFill(Color.RED);
                        bracket.add(A1vA8Score, 3, 3);
                        if (Double.parseDouble(alliance1Score.getText().toString()) >= (Double.parseDouble(alliance8Score.getText().toString()))){
                            A1vA8Label.setText(alliance1Label.getText().toString());
                            A1vA8Score.setText(predictedScore1.getText().toString());
                        } else if (Double.parseDouble(alliance1Score.getText().toString()) <= (Double.parseDouble(alliance8Score.getText().toString()))){
                            A1vA8Label.setText(alliance8Label.getText().toString());
                            A1vA8Score.setText(predictedScore8.getText().toString());
                        }

                        Text A3vA6Label = new Text ("");
                        A3vA6Label.setStyle("-fx-font: 15 cambria");
                        A3vA6Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(A3vA6Label, 3, 20);
                        Text A3vA6Score = new Text ("");
                        A3vA6Score.setStyle("-fx-font: 13 cambria");
                        A3vA6Score.setFill(Color.RED);
                        bracket.add(A3vA6Score, 3,21);
                        if (Double.parseDouble(alliance3Score.getText().toString()) >= (Double.parseDouble(alliance6Score.getText().toString()))){
                            A3vA6Label.setText(alliance3Label.getText().toString());
                            A3vA6Score.setText(predictedScore3.getText().toString());
                        } else if (Double.parseDouble(alliance3Score.getText().toString()) <= (Double.parseDouble(alliance6Score.getText().toString()))){
                            A3vA6Label.setText(alliance6Label.getText().toString());
                            A3vA6Score.setText(predictedScore6.getText().toString());
                        }

                        Text A7vA2Label = new Text ("");
                        A7vA2Label.setStyle("-fx-font: 15 cambria");
                        bracket.add(A7vA2Label, 3, 14);
                        A7vA2Label.setFill(Color.MEDIUMBLUE);
                        Text A7vA2Score = new Text ("");
                        A7vA2Score.setStyle("-fx-font: 13 cambria");
                        A7vA2Score.setFill(Color.RED);
                        bracket.add(A7vA2Score, 3, 15);
                        if (Double.parseDouble(alliance7Score.getText().toString()) >= (Double.parseDouble(alliance2Score.getText().toString()))){
                            A7vA2Label.setText(alliance7Label.getText().toString());
                            A7vA2Score.setText(predictedScore7.getText().toString());
                        } else if (Double.parseDouble(alliance7Score.getText().toString()) <= (Double.parseDouble(alliance2Score.getText().toString()))){
                            A7vA2Label.setText(alliance2Label.getText().toString());
                            A7vA2Score.setText(predictedScore2.getText().toString());
                        }

                        Text A4vA5Label = new Text ("");
                        A4vA5Label.setStyle("-fx-font: 15 cambria");
                        bracket.add(A4vA5Label, 3, 8);
                        A4vA5Label.setFill(Color.MEDIUMBLUE);
                        Text A4vA5Score = new Text ("");
                        A4vA5Score.setStyle("-fx-font: 13 cambria");
                        A4vA5Score.setFill(Color.RED);
                        bracket.add(A4vA5Score, 3, 9);
                        if (Double.parseDouble(alliance4Score.getText().toString()) >= (Double.parseDouble(alliance5Score.getText().toString()))){
                            A4vA5Label.setText(alliance4Label.getText().toString());
                            A4vA5Score.setText(predictedScore4.getText().toString());
                        } else if (Double.parseDouble(alliance4Score.getText().toString()) <= (Double.parseDouble(alliance5Score.getText().toString()))){
                            A4vA5Label.setText(alliance5Label.getText().toString());
                            A4vA5Score.setText(predictedScore5.getText().toString());
                        }

                        Text vs21 = new Text ("Vs.");
                        vs21.setStyle("-fx-font: 13 cambria");
                        bracket.add(vs21, 3, 6);

                        Text vs22 = new Text ("Vs.");
                        vs22.setStyle("-fx-font: 13 cambria");
                        bracket.add(vs22, 3, 18);

                        Text f1Label = new Text ("");
                        f1Label.setStyle("-fx-font: 15 cambria");
                        f1Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(f1Label, 5, 6);
                        Text f1Score = new Text ("");
                        f1Score.setStyle("-fx-font: 13 cambria");
                        f1Score.setFill(Color.RED);
                        bracket.add(f1Score, 5,7);
                        if (Double.parseDouble(A1vA8Score.getText().toString()) >= (Double.parseDouble(A4vA5Score.getText().toString()))){
                            f1Label.setText(A1vA8Label.getText().toString());
                            f1Score.setText(A1vA8Score.getText().toString());
                        } else if (Double.parseDouble(A1vA8Score.getText().toString()) <= (Double.parseDouble(A4vA5Score.getText().toString()))){
                            f1Label.setText(A4vA5Label.getText().toString());
                            f1Score.setText(A4vA5Score.getText().toString());
                        }

                        Text f2Label = new Text ("");
                        f2Label.setStyle("-fx-font: 15 cambria");
                        f2Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(f2Label, 5, 18);
                        Text f2Score = new Text ("");
                        f2Score.setStyle("-fx-font: 13 cambria");
                        f2Score.setFill(Color.RED);
                        bracket.add(f2Score, 5, 19);
                        if (Double.parseDouble(A7vA2Score.getText().toString()) >= (Double.parseDouble(A3vA6Score.getText().toString()))){
                            f2Label.setText(A7vA2Label.getText().toString());
                            f2Score.setText(A7vA2Score.getText().toString());
                        } else if (Double.parseDouble(A7vA2Score.getText().toString()) <= (Double.parseDouble(A3vA6Score.getText().toString()))){
                            f2Label.setText(A3vA6Label.getText().toString());
                            f2Score.setText(A3vA6Score.getText().toString());
                        }

                        Text vF = new Text("Vs.");
                        vF.setStyle("-fx-font: 13 cambria");
                        bracket.add(vF, 5, 12);

                        Text wLabel = new Text ("");
                        wLabel.setStyle("-fx-font: 18 cambria");
                        bracket.add(wLabel, 7, 12);
                        wLabel.setFill(Color.MEDIUMBLUE);
                        if (Double.parseDouble(f1Score.getText().toString()) >= (Double.parseDouble(f2Score.getText().toString()))){
                            wLabel.setText(f1Label.getText().toString());
                        } else if (Double.parseDouble(f1Score.getText().toString()) <= (Double.parseDouble(f2Score.getText().toString()))){
                            wLabel.setText(f2Label.getText().toString());
                        }

                        dialog.setScene(dialogScene);
                        dialog.show();

                    }});
        Button scores = new Button();
        scores.setLayoutX(105);
        scores.setLayoutY(5);
        scores.setPrefSize(85, 10);
        scores.setText("Show Scores");
        root.getChildren().add(scores);
        //make new page to show scores, high/low/raw
        scores.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        dialog.initOwner(primaryStage);
                        GridPane scores = new GridPane();
                        scores.setHgap(10);
                        scores.setVgap(10);
                        scores.setPadding(new Insets(0, 10, 0, 10));
                        Scene dialogScene = new Scene(scores, 900, 650);

                        Text scoreHighLabel = new Text("Rounded Score");
                        scoreHighLabel.setStyle("-fx-font: 24 cambria");
                        scoreHighLabel.setFill(Color.MEDIUMBLUE);
                        scores.add(scoreHighLabel, 2, 0);

                        Text scoreRawLabel = new Text("Raw Score");
                        scoreRawLabel.setStyle("-fx-font: 24 cambria");
                        scoreRawLabel.setFill(Color.MEDIUMBLUE);
                        scores.add(scoreRawLabel, 3, 0);

                        Text scoreLowLabel = new Text("Low Score");
                        scoreLowLabel.setStyle("-fx-font: 24 cambria");
                        scoreLowLabel.setFill(Color.MEDIUMBLUE);
                        scores.add(scoreLowLabel, 4, 0);

                        Text alliance1Label = new Text("Alliance 1");
                        alliance1Label.setStyle("-fx-font: 24 cambria");
                        alliance1Label.setFill(Color.MEDIUMBLUE);
                        scores.add(alliance1Label, 0, 1);

                        Text alliance2Label = new Text("Alliance 2");
                        alliance2Label.setStyle("-fx-font: 24 cambria");
                        alliance2Label.setFill(Color.MEDIUMBLUE);
                        scores.add(alliance2Label, 0, 2);

                        Text alliance3Label = new Text("Alliance 3");
                        alliance3Label.setStyle("-fx-font: 24 cambria");
                        alliance3Label.setFill(Color.MEDIUMBLUE);
                        scores.add(alliance3Label, 0, 3);

                        Text alliance4Label = new Text("Alliance 4");
                        alliance4Label.setStyle("-fx-font: 24 cambria");
                        alliance4Label.setFill(Color.MEDIUMBLUE);
                        scores.add(alliance4Label, 0, 4);

                        Text alliance5Label = new Text("Alliance 5");
                        alliance5Label.setStyle("-fx-font: 24 cambria");
                        alliance5Label.setFill(Color.MEDIUMBLUE);
                        scores.add(alliance5Label, 0, 5);

                        Text alliance6Label = new Text("Alliance 6");
                        alliance6Label.setStyle("-fx-font: 24 cambria");
                        alliance6Label.setFill(Color.MEDIUMBLUE);
                        scores.add(alliance6Label, 0, 6);

                        Text alliance7Label = new Text("Alliance 7");
                        alliance7Label.setStyle("-fx-font: 24 cambria");
                        alliance7Label.setFill(Color.MEDIUMBLUE);
                        scores.add(alliance7Label, 0, 7);

                        Text alliance8Label = new Text("Alliance 8");
                        alliance8Label.setStyle("-fx-font: 24 cambria");
                        alliance8Label.setFill(Color.MEDIUMBLUE);
                        scores.add(alliance8Label, 0, 8);

                        Text alliance1Raw = new Text(String.format("%3.1f", alliance1.allianceRawStrength));
                        alliance1Raw.setStyle("-fx-font: 22 cambria");
                        alliance1Raw.setFill(Color.RED);
                        scores.add(alliance1Raw, 3, 1);

                        Text alliance1High = new Text(String.format("%3.1f", alliance1.allianceHighStrength));
                        alliance1High.setStyle("-fx-font: 22 cambria");
                        alliance1High.setFill(Color.RED);
                        scores.add(alliance1High, 2, 1);

                        Text alliance1Low = new Text(String.format("%3.1f", alliance1.allianceLowStrength));
                        alliance1Low.setStyle("-fx-font: 22 cambria");
                        alliance1Low.setFill(Color.RED);
                        scores.add(alliance1Low, 4, 1);

                        Text alliance2Raw = new Text(String.format("%3.1f", alliance2.allianceRawStrength));
                        alliance2Raw.setStyle("-fx-font: 22 cambria");
                        alliance2Raw.setFill(Color.RED);
                        scores.add(alliance2Raw, 3, 2);

                        Text alliance2High = new Text(String.format("%3.1f", alliance2.allianceHighStrength));
                        alliance2High.setStyle("-fx-font: 22 cambria");
                        alliance2High.setFill(Color.RED);
                        scores.add(alliance2High, 2, 2);

                        Text alliance2Low = new Text(String.format("%3.1f", alliance2.allianceLowStrength));
                        alliance2Low.setStyle("-fx-font: 22 cambria");
                        alliance2Low.setFill(Color.RED);
                        scores.add(alliance2Low, 4, 2);

                        Text alliance3Raw = new Text(String.format("%3.1f", alliance3.allianceRawStrength));
                        alliance3Raw.setStyle("-fx-font: 22 cambria");
                        alliance3Raw.setFill(Color.RED);
                        scores.add(alliance3Raw, 3, 3);

                        Text alliance3High = new Text(String.format("%3.1f", alliance3.allianceHighStrength));
                        alliance3High.setStyle("-fx-font: 22 cambria");
                        alliance3High.setFill(Color.RED);
                        scores.add(alliance3High, 2, 3);

                        Text alliance3Low = new Text(String.format("%3.1f", alliance3.allianceLowStrength));
                        alliance3Low.setStyle("-fx-font: 22 cambria");
                        alliance3Low.setFill(Color.RED);
                        scores.add(alliance3Low, 4, 3);

                        Text alliance4Raw = new Text(String.format("%3.1f", alliance4.allianceRawStrength));
                        alliance4Raw.setStyle("-fx-font: 22 cambria");
                        alliance4Raw.setFill(Color.RED);
                        scores.add(alliance4Raw, 3, 4);

                        Text alliance4High = new Text(String.format("%3.1f", alliance4.allianceHighStrength));
                        alliance4High.setStyle("-fx-font: 22 cambria");
                        alliance4High.setFill(Color.RED);
                        scores.add(alliance4High, 2, 4);

                        Text alliance4Low = new Text(String.format("%3.1f", alliance4.allianceLowStrength));
                        alliance4Low.setStyle("-fx-font: 22 cambria");
                        alliance4Low.setFill(Color.RED);
                        scores.add(alliance4Low, 4, 4);

                        Text alliance5Raw = new Text(String.format("%3.1f", alliance5.allianceRawStrength));
                        alliance5Raw.setStyle("-fx-font: 22 cambria");
                        alliance5Raw.setFill(Color.RED);
                        scores.add(alliance5Raw, 3, 5);

                        Text alliance5High = new Text(String.format("%3.1f", alliance5.allianceHighStrength));
                        alliance5High.setStyle("-fx-font: 22 cambria");
                        alliance5High.setFill(Color.RED);
                        scores.add(alliance5High, 2, 5);

                        Text alliance5Low = new Text(String.format("%3.1f", alliance5.allianceLowStrength));
                        alliance5Low.setStyle("-fx-font: 22 cambria");
                        alliance5Low.setFill(Color.RED);
                        scores.add(alliance5Low, 4, 5);

                        Text alliance6Raw = new Text(String.format("%3.1f", alliance6.allianceRawStrength));
                        alliance6Raw.setStyle("-fx-font: 22 cambria");
                        alliance6Raw.setFill(Color.RED);
                        scores.add(alliance6Raw, 3, 6);

                        Text alliance6High = new Text(String.format("%3.1f", alliance6.allianceHighStrength));
                        alliance6High.setStyle("-fx-font: 22 cambria");
                        alliance6High.setFill(Color.RED);
                        scores.add(alliance6High, 2, 6);

                        Text alliance6Low = new Text(String.format("%3.1f", alliance6.allianceLowStrength));
                        alliance6Low.setStyle("-fx-font: 22 cambria");
                        alliance6Low.setFill(Color.RED);
                        scores.add(alliance6Low, 4, 6);

                        Text alliance7Raw = new Text(String.format("%3.1f", alliance7.allianceRawStrength));
                        alliance7Raw.setStyle("-fx-font: 22 cambria");
                        alliance7Raw.setFill(Color.RED);
                        scores.add(alliance7Raw, 3, 7);

                        Text alliance7High = new Text(String.format("%3.1f", alliance7.allianceHighStrength));
                        alliance7High.setStyle("-fx-font: 22 cambria");
                        alliance7High.setFill(Color.RED);
                        scores.add(alliance7High, 2, 7);

                        Text alliance7Low = new Text(String.format("%3.1f", alliance7.allianceLowStrength));
                        alliance7Low.setStyle("-fx-font: 22 cambria");
                        alliance7Low.setFill(Color.RED);
                        scores.add(alliance7Low, 4, 7);

                        Text alliance8Raw = new Text(String.format("%3.1f", alliance8.allianceRawStrength));
                        alliance8Raw.setStyle("-fx-font: 22 cambria");
                        alliance8Raw.setFill(Color.RED);
                        scores.add(alliance8Raw, 3, 8);

                        Text alliance8High = new Text(String.format("%3.1f", alliance8.allianceHighStrength));
                        alliance8High.setStyle("-fx-font: 22 cambria");
                        alliance8High.setFill(Color.RED);
                        scores.add(alliance8High, 2, 8);

                        Text alliance8Low = new Text(String.format("%3.1f", alliance8.allianceLowStrength));
                        alliance8Low.setStyle("-fx-font: 22 cambria");
                        alliance8Low.setFill(Color.RED);
                        scores.add(alliance8Low, 4, 8);

                        dialog.setScene(dialogScene);
                        dialog.show();
                    }});

        Button data = new Button();
        data.setLayoutX(195);
        data.setLayoutY(5);
        data.setPrefSize(85, 10);
        data.setText("Sort Data");
        root.getChildren().add(data);
        //make new page to sort data
        data.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        dialog.initOwner(primaryStage);
                        GridPane data = new GridPane();
                        data.setHgap(10);
                        data.setVgap(10);
                        data.setPadding(new Insets(0, 10, 0, 10));
                        Scene dialogScene = new Scene(data, 900, 650);

                        Text alliance1Label = new Text("Alliance 1");
                        alliance1Label.setStyle("-fx-font: 24 cambria");
                        alliance1Label.setFill(Color.MEDIUMBLUE);
                        data.add(alliance1Label, 0, 1);

                        Text alliance2Label = new Text("Alliance 2");
                        alliance2Label.setStyle("-fx-font: 24 cambria");
                        alliance2Label.setFill(Color.MEDIUMBLUE);
                        data.add(alliance2Label, 0, 2);

                        Text alliance3Label = new Text("Alliance 3");
                        alliance3Label.setStyle("-fx-font: 24 cambria");
                        alliance3Label.setFill(Color.MEDIUMBLUE);
                        data.add(alliance3Label, 0, 3);

                        Text alliance4Label = new Text("Alliance 4");
                        alliance4Label.setStyle("-fx-font: 24 cambria");
                        alliance4Label.setFill(Color.MEDIUMBLUE);
                        data.add(alliance4Label, 0, 4);

                        Text alliance5Label = new Text("Alliance 5");
                        alliance5Label.setStyle("-fx-font: 24 cambria");
                        alliance5Label.setFill(Color.MEDIUMBLUE);
                        data.add(alliance5Label, 0, 5);

                        Text alliance6Label = new Text("Alliance 6");
                        alliance6Label.setStyle("-fx-font: 24 cambria");
                        alliance6Label.setFill(Color.MEDIUMBLUE);
                        data.add(alliance6Label, 0, 6);

                        Text alliance7Label = new Text("Alliance 7");
                        alliance7Label.setStyle("-fx-font: 24 cambria");
                        alliance7Label.setFill(Color.MEDIUMBLUE);
                        data.add(alliance7Label, 0, 7);

                        Text alliance8Label = new Text("Alliance 8");
                        alliance8Label.setStyle("-fx-font: 24 cambria");
                        alliance8Label.setFill(Color.MEDIUMBLUE);
                        data.add(alliance8Label, 0, 8);

                        Text autoGears1 = new Text(avgAutoGearsText1.getText().toString());
                        autoGears1.setStyle("-fx-font: 24 cambria");
                        autoGears1.setFill(Color.MEDIUMBLUE);
                        data.add(autoGears1, 1, 1);

                        Text autoGears2 = new Text(avgAutoGearsText2.getText().toString());
                        autoGears2.setStyle("-fx-font: 24 cambria");
                        autoGears2.setFill(Color.MEDIUMBLUE);
                        data.add(autoGears2, 1, 2);

                        Text autoGears3 = new Text(avgAutoGearsText3.getText().toString());
                        autoGears3.setStyle("-fx-font: 24 cambria");
                        autoGears3.setFill(Color.MEDIUMBLUE);
                        data.add(autoGears3, 1, 3);

                        Text autoGears4 = new Text(avgAutoGearsText4.getText().toString());
                        autoGears4.setStyle("-fx-font: 24 cambria");
                        autoGears4.setFill(Color.MEDIUMBLUE);
                        data.add(autoGears4, 1, 4);

                        Text autoGears5 = new Text(avgAutoGearsText5.getText().toString());
                        autoGears5.setStyle("-fx-font: 24 cambria");
                        autoGears5.setFill(Color.MEDIUMBLUE);
                        data.add(autoGears5, 1, 5);

                        Text autoGears6 = new Text(avgAutoGearsText6.getText().toString());
                        autoGears6.setStyle("-fx-font: 24 cambria");
                        autoGears6.setFill(Color.MEDIUMBLUE);
                        data.add(autoGears6, 1, 6);

                        Text autoGears7 = new Text(avgAutoGearsText7.getText().toString());
                        autoGears7.setStyle("-fx-font: 24 cambria");
                        autoGears7.setFill(Color.MEDIUMBLUE);
                        data.add(autoGears7, 1, 7);

                        Text autoGears8 = new Text(avgAutoGearsText8.getText().toString());
                        autoGears8.setStyle("-fx-font: 24 cambria");
                        autoGears8.setFill(Color.MEDIUMBLUE);
                        data.add(autoGears8, 1, 8);

                        Text teleGears1 = new Text(avgTeleGearsText1.getText().toString());
                        teleGears1.setStyle("-fx-font: 24 cambria");
                        teleGears1.setFill(Color.MEDIUMBLUE);
                        data.add(teleGears1, 2, 1);

                        Text teleGears2 = new Text(avgTeleGearsText2.getText().toString());
                        teleGears2.setStyle("-fx-font: 24 cambria");
                        teleGears2.setFill(Color.MEDIUMBLUE);
                        data.add(teleGears2, 2, 2);

                        Text teleGears3 = new Text(avgTeleGearsText3.getText().toString());
                        teleGears3.setStyle("-fx-font: 24 cambria");
                        teleGears3.setFill(Color.MEDIUMBLUE);
                        data.add(teleGears3, 2, 3);

                        Text teleGears4 = new Text(avgTeleGearsText4.getText().toString());
                        teleGears4.setStyle("-fx-font: 24 cambria");
                        teleGears4.setFill(Color.MEDIUMBLUE);
                        data.add(teleGears4, 2, 4);

                        Text teleGears5 = new Text(avgTeleGearsText5.getText().toString());
                        teleGears5.setStyle("-fx-font: 24 cambria");
                        teleGears5.setFill(Color.MEDIUMBLUE);
                        data.add(teleGears5, 2, 5);

                        Text teleGears6 = new Text(avgTeleGearsText6.getText().toString());
                        teleGears6.setStyle("-fx-font: 24 cambria");
                        teleGears6.setFill(Color.MEDIUMBLUE);
                        data.add(teleGears6, 2, 6);

                        Text teleGears7 = new Text(avgTeleGearsText7.getText().toString());
                        teleGears7.setStyle("-fx-font: 24 cambria");
                        teleGears7.setFill(Color.MEDIUMBLUE);
                        data.add(teleGears7, 2, 7);

                        Text teleGears8 = new Text(avgTeleGearsText8.getText().toString());
                        teleGears8.setStyle("-fx-font: 24 cambria");
                        teleGears8.setFill(Color.MEDIUMBLUE);
                        data.add(teleGears8, 2, 8);

                        Text autoFuel1 = new Text(avgAutoGearsText1.getText().toString());
                        autoFuel1.setStyle("-fx-font: 24 cambria");
                        autoFuel1.setFill(Color.MEDIUMBLUE);
                        data.add(autoFuel1, 3, 1);

                        Text autoFuel2 = new Text(avgAutoGearsText2.getText().toString());
                        autoFuel2.setStyle("-fx-font: 24 cambria");
                        autoFuel2.setFill(Color.MEDIUMBLUE);
                        data.add(autoFuel2, 3, 2);

                        Text autoFuel3 = new Text(avgAutoGearsText3.getText().toString());
                        autoFuel3.setStyle("-fx-font: 24 cambria");
                        autoFuel3.setFill(Color.MEDIUMBLUE);
                        data.add(autoFuel3, 3, 3);

                        Text autoFuel4 = new Text(avgAutoGearsText4.getText().toString());
                        autoFuel4.setStyle("-fx-font: 24 cambria");
                        autoFuel4.setFill(Color.MEDIUMBLUE);
                        data.add(autoFuel4, 3, 4);

                        Text autoFuel5 = new Text(avgAutoGearsText5.getText().toString());
                        autoFuel5.setStyle("-fx-font: 24 cambria");
                        autoFuel5.setFill(Color.MEDIUMBLUE);
                        data.add(autoFuel5, 3, 5);

                        Text autoFuel6 = new Text(avgAutoGearsText6.getText().toString());
                        autoFuel6.setStyle("-fx-font: 24 cambria");
                        autoFuel6.setFill(Color.MEDIUMBLUE);
                        data.add(autoFuel6, 3, 6);

                        Text autoFuel7 = new Text(avgAutoGearsText7.getText().toString());
                        autoFuel7.setStyle("-fx-font: 24 cambria");
                        autoFuel7.setFill(Color.MEDIUMBLUE);
                        data.add(autoFuel7, 3, 7);

                        Text autoFuel8 = new Text(avgAutoGearsText8.getText().toString());
                        autoFuel8.setStyle("-fx-font: 24 cambria");
                        autoFuel8.setFill(Color.MEDIUMBLUE);
                        data.add(autoFuel8, 3, 8);

                        Text teleFuel1 = new Text(avgTeleFuelText1.getText().toString());
                        teleFuel1.setStyle("-fx-font: 24 cambria");
                        teleFuel1.setFill(Color.MEDIUMBLUE);
                        data.add(teleFuel1, 4, 1);

                        Text teleFuel2 = new Text(avgTeleFuelText2.getText().toString());
                        teleFuel2.setStyle("-fx-font: 24 cambria");
                        teleFuel2.setFill(Color.MEDIUMBLUE);
                        data.add(teleFuel2, 4, 2);

                        Text teleFuel3 = new Text(avgTeleFuelText3.getText().toString());
                        teleFuel3.setStyle("-fx-font: 24 cambria");
                        teleFuel3.setFill(Color.MEDIUMBLUE);
                        data.add(teleFuel3, 4, 3);

                        Text teleFuel4 = new Text(avgTeleFuelText4.getText().toString());
                        teleFuel4.setStyle("-fx-font: 24 cambria");
                        teleFuel4.setFill(Color.MEDIUMBLUE);
                        data.add(teleFuel4, 4, 4);

                        Text teleFuel5 = new Text(avgTeleFuelText5.getText().toString());
                        teleFuel5.setStyle("-fx-font: 24 cambria");
                        teleFuel5.setFill(Color.MEDIUMBLUE);
                        data.add(teleFuel5, 4, 5);

                        Text teleFuel6 = new Text(avgTeleFuelText6.getText().toString());
                        teleFuel6.setStyle("-fx-font: 24 cambria");
                        teleFuel6.setFill(Color.MEDIUMBLUE);
                        data.add(teleFuel6, 4, 6);

                        Text teleFuel7 = new Text(avgTeleFuelText7.getText().toString());
                        teleFuel7.setStyle("-fx-font: 24 cambria");
                        teleFuel7.setFill(Color.MEDIUMBLUE);
                        data.add(teleFuel7, 4, 7);

                        Text teleFuel8 = new Text(avgTeleFuelText8.getText().toString());
                        teleFuel8.setStyle("-fx-font: 24 cambria");
                        teleFuel8.setFill(Color.MEDIUMBLUE);
                        data.add(teleFuel8, 4, 8);

                        Text climb1 = new Text(avgClimbsText1.getText().toString());
                        climb1.setStyle("-fx-font: 24 cambria");
                        climb1.setFill(Color.MEDIUMBLUE);
                        data.add(climb1, 5, 1);

                        Text climb2 = new Text(avgClimbsText2.getText().toString());
                        climb2.setStyle("-fx-font: 24 cambria");
                        climb2.setFill(Color.MEDIUMBLUE);
                        data.add(climb2, 5, 2);

                        Text climb3 = new Text(avgClimbsText3.getText().toString());
                        climb3.setStyle("-fx-font: 24 cambria");
                        climb3.setFill(Color.MEDIUMBLUE);
                        data.add(climb3, 5, 3);

                        Text climb4 = new Text(avgClimbsText4.getText().toString());
                        climb4.setStyle("-fx-font: 24 cambria");
                        climb4.setFill(Color.MEDIUMBLUE);
                        data.add(climb4, 5, 4);

                        Text climb5 = new Text(avgClimbsText5.getText().toString());
                        climb5.setStyle("-fx-font: 24 cambria");
                        climb5.setFill(Color.MEDIUMBLUE);
                        data.add(climb5, 5, 5);

                        Text climb6 = new Text(avgClimbsText6.getText().toString());
                        climb6.setStyle("-fx-font: 24 cambria");
                        climb6.setFill(Color.MEDIUMBLUE);
                        data.add(climb6, 5, 6);

                        Text climb7 = new Text(avgClimbsText7.getText().toString());
                        climb7.setStyle("-fx-font: 24 cambria");
                        climb7.setFill(Color.MEDIUMBLUE);
                        data.add(climb7, 5, 7);

                        Text climb8 = new Text(avgClimbsText8.getText().toString());
                        climb8.setStyle("-fx-font: 24 cambria");
                        climb8.setFill(Color.MEDIUMBLUE);
                        data.add(climb8, 5, 8);

                        Button autoGearsButton = new Button ("Auto Gears");
                        autoGearsButton.setStyle("-fx-font: 24 cambria");
                        data.add(autoGearsButton, 1, 0);
                        autoGearsButton.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ArrayList<AllianceData> sortList = new ArrayList<AllianceData>();
                                sortList.add(alliance1);
                                sortList.add(alliance2);
                                sortList.add(alliance3);
                                sortList.add(alliance4);
                                sortList.add(alliance5);
                                sortList.add(alliance6);
                                sortList.add(alliance7);
                                sortList.add(alliance8);
                                Collections.sort(sortList, new Comparator<AllianceData>() {
                                    public int compare(AllianceData o1, AllianceData o2) {
                                        if (o1.avgAutoGear == o2.avgAutoGear)
                                            return 0;
                                        return o1.avgAutoGear > o2.avgAutoGear ? -1 : 1;
                                    }
                                });
                                autoGears1.setText(String.format("%3.1f", sortList.get(0).avgAutoGear));
                                autoGears2.setText(String.format("%3.1f", sortList.get(1).avgAutoGear));
                                autoGears3.setText(String.format("%3.1f", sortList.get(2).avgAutoGear));
                                autoGears4.setText(String.format("%3.1f", sortList.get(3).avgAutoGear));
                                autoGears5.setText(String.format("%3.1f", sortList.get(4).avgAutoGear));
                                autoGears6.setText(String.format("%3.1f", sortList.get(5).avgAutoGear));
                                autoGears7.setText(String.format("%3.1f", sortList.get(6).avgAutoGear));
                                autoGears8.setText(String.format("%3.1f", sortList.get(7).avgAutoGear));

                                teleGears1.setText(String.format("%3.1f", sortList.get(0).avgTeleGear));
                                teleGears2.setText(String.format("%3.1f", sortList.get(1).avgTeleGear));
                                teleGears3.setText(String.format("%3.1f", sortList.get(2).avgTeleGear));
                                teleGears4.setText(String.format("%3.1f", sortList.get(3).avgTeleGear));
                                teleGears5.setText(String.format("%3.1f", sortList.get(4).avgTeleGear));
                                teleGears6.setText(String.format("%3.1f", sortList.get(5).avgTeleGear));
                                teleGears7.setText(String.format("%3.1f", sortList.get(6).avgTeleGear));
                                teleGears8.setText(String.format("%3.1f", sortList.get(7).avgTeleGear));

                                autoFuel1.setText(String.format("%3.1f", sortList.get(0).avgAutoFuel));
                                autoFuel2.setText(String.format("%3.1f", sortList.get(1).avgAutoFuel));
                                autoFuel3.setText(String.format("%3.1f", sortList.get(2).avgAutoFuel));
                                autoFuel4.setText(String.format("%3.1f", sortList.get(3).avgAutoFuel));
                                autoFuel5.setText(String.format("%3.1f", sortList.get(4).avgAutoFuel));
                                autoFuel6.setText(String.format("%3.1f", sortList.get(5).avgAutoFuel));
                                autoFuel7.setText(String.format("%3.1f", sortList.get(6).avgAutoFuel));
                                autoFuel8.setText(String.format("%3.1f", sortList.get(7).avgAutoFuel));

                                teleFuel1.setText(String.format("%3.1f", sortList.get(0).avgTeleFuel));
                                teleFuel2.setText(String.format("%3.1f", sortList.get(1).avgTeleFuel));
                                teleFuel3.setText(String.format("%3.1f", sortList.get(2).avgTeleFuel));
                                teleFuel4.setText(String.format("%3.1f", sortList.get(3).avgTeleFuel));
                                teleFuel5.setText(String.format("%3.1f", sortList.get(4).avgTeleFuel));
                                teleFuel6.setText(String.format("%3.1f", sortList.get(5).avgTeleFuel));
                                teleFuel7.setText(String.format("%3.1f", sortList.get(6).avgTeleFuel));
                                teleFuel8.setText(String.format("%3.1f", sortList.get(7).avgTeleFuel));

                                climb1.setText(String.format("%3.1f", sortList.get(0).avgTeleClimb));
                                climb2.setText(String.format("%3.1f", sortList.get(1).avgTeleClimb));
                                climb3.setText(String.format("%3.1f", sortList.get(2).avgTeleClimb));
                                climb4.setText(String.format("%3.1f", sortList.get(3).avgTeleClimb));
                                climb5.setText(String.format("%3.1f", sortList.get(4).avgTeleClimb));
                                climb6.setText(String.format("%3.1f", sortList.get(5).avgTeleClimb));
                                climb7.setText(String.format("%3.1f", sortList.get(6).avgTeleClimb));
                                climb8.setText(String.format("%3.1f", sortList.get(7).avgTeleClimb));

                                alliance1Label.setText("Alliance " + Integer.toString(sortList.get(0).allianceNumber));
                                alliance2Label.setText("Alliance " + Integer.toString(sortList.get(1).allianceNumber));
                                alliance3Label.setText("Alliance " + Integer.toString(sortList.get(2).allianceNumber));
                                alliance4Label.setText("Alliance " + Integer.toString(sortList.get(3).allianceNumber));
                                alliance5Label.setText("Alliance " + Integer.toString(sortList.get(4).allianceNumber));
                                alliance6Label.setText("Alliance " + Integer.toString(sortList.get(5).allianceNumber));
                                alliance7Label.setText("Alliance " +Integer.toString(sortList.get(6).allianceNumber));
                                alliance8Label.setText("Alliance " + Integer.toString(sortList.get(7).allianceNumber));
                            }});
                        Button teleGearsButton = new Button ("Tele Gears");
                        teleGearsButton.setStyle("-fx-font: 24 cambria");
                        data.add(teleGearsButton, 2, 0);
                        teleGearsButton.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ArrayList<AllianceData> sortList = new ArrayList<AllianceData>();
                                sortList.add(alliance1);
                                sortList.add(alliance2);
                                sortList.add(alliance3);
                                sortList.add(alliance4);
                                sortList.add(alliance5);
                                sortList.add(alliance6);
                                sortList.add(alliance7);
                                sortList.add(alliance8);
                                Collections.sort(sortList, new Comparator<AllianceData>() {
                                    public int compare(AllianceData o1, AllianceData o2) {
                                        if (o1.avgTeleGear == o2.avgTeleGear)
                                            return 0;
                                        return o1.avgTeleGear > o2.avgTeleGear ? -1 : 1;
                                    }
                                });
                                autoGears1.setText(String.format("%3.1f", sortList.get(0).avgAutoGear));
                                autoGears2.setText(String.format("%3.1f", sortList.get(1).avgAutoGear));
                                autoGears3.setText(String.format("%3.1f", sortList.get(2).avgAutoGear));
                                autoGears4.setText(String.format("%3.1f", sortList.get(3).avgAutoGear));
                                autoGears5.setText(String.format("%3.1f", sortList.get(4).avgAutoGear));
                                autoGears6.setText(String.format("%3.1f", sortList.get(5).avgAutoGear));
                                autoGears7.setText(String.format("%3.1f", sortList.get(6).avgAutoGear));
                                autoGears8.setText(String.format("%3.1f", sortList.get(7).avgAutoGear));

                                teleGears1.setText(String.format("%3.1f", sortList.get(0).avgTeleGear));
                                teleGears2.setText(String.format("%3.1f", sortList.get(1).avgTeleGear));
                                teleGears3.setText(String.format("%3.1f", sortList.get(2).avgTeleGear));
                                teleGears4.setText(String.format("%3.1f", sortList.get(3).avgTeleGear));
                                teleGears5.setText(String.format("%3.1f", sortList.get(4).avgTeleGear));
                                teleGears6.setText(String.format("%3.1f", sortList.get(5).avgTeleGear));
                                teleGears7.setText(String.format("%3.1f", sortList.get(6).avgTeleGear));
                                teleGears8.setText(String.format("%3.1f", sortList.get(7).avgTeleGear));

                                autoFuel1.setText(String.format("%3.1f", sortList.get(0).avgAutoFuel));
                                autoFuel2.setText(String.format("%3.1f", sortList.get(1).avgAutoFuel));
                                autoFuel3.setText(String.format("%3.1f", sortList.get(2).avgAutoFuel));
                                autoFuel4.setText(String.format("%3.1f", sortList.get(3).avgAutoFuel));
                                autoFuel5.setText(String.format("%3.1f", sortList.get(4).avgAutoFuel));
                                autoFuel6.setText(String.format("%3.1f", sortList.get(5).avgAutoFuel));
                                autoFuel7.setText(String.format("%3.1f", sortList.get(6).avgAutoFuel));
                                autoFuel8.setText(String.format("%3.1f", sortList.get(7).avgAutoFuel));

                                teleFuel1.setText(String.format("%3.1f", sortList.get(0).avgTeleFuel));
                                teleFuel2.setText(String.format("%3.1f", sortList.get(1).avgTeleFuel));
                                teleFuel3.setText(String.format("%3.1f", sortList.get(2).avgTeleFuel));
                                teleFuel4.setText(String.format("%3.1f", sortList.get(3).avgTeleFuel));
                                teleFuel5.setText(String.format("%3.1f", sortList.get(4).avgTeleFuel));
                                teleFuel6.setText(String.format("%3.1f", sortList.get(5).avgTeleFuel));
                                teleFuel7.setText(String.format("%3.1f", sortList.get(6).avgTeleFuel));
                                teleFuel8.setText(String.format("%3.1f", sortList.get(7).avgTeleFuel));

                                climb1.setText(String.format("%3.1f", sortList.get(0).avgTeleClimb));
                                climb2.setText(String.format("%3.1f", sortList.get(1).avgTeleClimb));
                                climb3.setText(String.format("%3.1f", sortList.get(2).avgTeleClimb));
                                climb4.setText(String.format("%3.1f", sortList.get(3).avgTeleClimb));
                                climb5.setText(String.format("%3.1f", sortList.get(4).avgTeleClimb));
                                climb6.setText(String.format("%3.1f", sortList.get(5).avgTeleClimb));
                                climb7.setText(String.format("%3.1f", sortList.get(6).avgTeleClimb));
                                climb8.setText(String.format("%3.1f", sortList.get(7).avgTeleClimb));

                                alliance1Label.setText("Alliance " + Integer.toString(sortList.get(0).allianceNumber));
                                alliance2Label.setText("Alliance " + Integer.toString(sortList.get(1).allianceNumber));
                                alliance3Label.setText("Alliance " + Integer.toString(sortList.get(2).allianceNumber));
                                alliance4Label.setText("Alliance " + Integer.toString(sortList.get(3).allianceNumber));
                                alliance5Label.setText("Alliance " + Integer.toString(sortList.get(4).allianceNumber));
                                alliance6Label.setText("Alliance " + Integer.toString(sortList.get(5).allianceNumber));
                                alliance7Label.setText("Alliance " +Integer.toString(sortList.get(6).allianceNumber));
                                alliance8Label.setText("Alliance " + Integer.toString(sortList.get(7).allianceNumber));
                            }});

                        Button autoFuelButton = new Button ("Auto Fuel");
                        autoFuelButton.setStyle("-fx-font: 24 cambria");
                        data.add(autoFuelButton, 3, 0);
                                autoFuelButton.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        ArrayList<AllianceData> sortList = new ArrayList<AllianceData>();
                                        sortList.add(alliance1);
                                        sortList.add(alliance2);
                                        sortList.add(alliance3);
                                        sortList.add(alliance4);
                                        sortList.add(alliance5);
                                        sortList.add(alliance6);
                                        sortList.add(alliance7);
                                        sortList.add(alliance8);
                                        Collections.sort(sortList, new Comparator<AllianceData>() {
                                            public int compare(AllianceData o1, AllianceData o2) {
                                                if (o1.avgAutoFuel == o2.avgAutoFuel)
                                                    return 0;
                                                return o1.avgAutoFuel > o2.avgAutoFuel ? -1 : 1;
                                            }
                                        });
                                        autoGears1.setText(String.format("%3.1f", sortList.get(0).avgAutoGear));
                                        autoGears2.setText(String.format("%3.1f", sortList.get(1).avgAutoGear));
                                        autoGears3.setText(String.format("%3.1f", sortList.get(2).avgAutoGear));
                                        autoGears4.setText(String.format("%3.1f", sortList.get(3).avgAutoGear));
                                        autoGears5.setText(String.format("%3.1f", sortList.get(4).avgAutoGear));
                                        autoGears6.setText(String.format("%3.1f", sortList.get(5).avgAutoGear));
                                        autoGears7.setText(String.format("%3.1f", sortList.get(6).avgAutoGear));
                                        autoGears8.setText(String.format("%3.1f", sortList.get(7).avgAutoGear));

                                        teleGears1.setText(String.format("%3.1f", sortList.get(0).avgTeleGear));
                                        teleGears2.setText(String.format("%3.1f", sortList.get(1).avgTeleGear));
                                        teleGears3.setText(String.format("%3.1f", sortList.get(2).avgTeleGear));
                                        teleGears4.setText(String.format("%3.1f", sortList.get(3).avgTeleGear));
                                        teleGears5.setText(String.format("%3.1f", sortList.get(4).avgTeleGear));
                                        teleGears6.setText(String.format("%3.1f", sortList.get(5).avgTeleGear));
                                        teleGears7.setText(String.format("%3.1f", sortList.get(6).avgTeleGear));
                                        teleGears8.setText(String.format("%3.1f", sortList.get(7).avgTeleGear));

                                        autoFuel1.setText(String.format("%3.1f", sortList.get(0).avgAutoFuel));
                                        autoFuel2.setText(String.format("%3.1f", sortList.get(1).avgAutoFuel));
                                        autoFuel3.setText(String.format("%3.1f", sortList.get(2).avgAutoFuel));
                                        autoFuel4.setText(String.format("%3.1f", sortList.get(3).avgAutoFuel));
                                        autoFuel5.setText(String.format("%3.1f", sortList.get(4).avgAutoFuel));
                                        autoFuel6.setText(String.format("%3.1f", sortList.get(5).avgAutoFuel));
                                        autoFuel7.setText(String.format("%3.1f", sortList.get(6).avgAutoFuel));
                                        autoFuel8.setText(String.format("%3.1f", sortList.get(7).avgAutoFuel));

                                        teleFuel1.setText(String.format("%3.1f", sortList.get(0).avgTeleFuel));
                                        teleFuel2.setText(String.format("%3.1f", sortList.get(1).avgTeleFuel));
                                        teleFuel3.setText(String.format("%3.1f", sortList.get(2).avgTeleFuel));
                                        teleFuel4.setText(String.format("%3.1f", sortList.get(3).avgTeleFuel));
                                        teleFuel5.setText(String.format("%3.1f", sortList.get(4).avgTeleFuel));
                                        teleFuel6.setText(String.format("%3.1f", sortList.get(5).avgTeleFuel));
                                        teleFuel7.setText(String.format("%3.1f", sortList.get(6).avgTeleFuel));
                                        teleFuel8.setText(String.format("%3.1f", sortList.get(7).avgTeleFuel));

                                        climb1.setText(String.format("%3.1f", sortList.get(0).avgTeleClimb));
                                        climb2.setText(String.format("%3.1f", sortList.get(1).avgTeleClimb));
                                        climb3.setText(String.format("%3.1f", sortList.get(2).avgTeleClimb));
                                        climb4.setText(String.format("%3.1f", sortList.get(3).avgTeleClimb));
                                        climb5.setText(String.format("%3.1f", sortList.get(4).avgTeleClimb));
                                        climb6.setText(String.format("%3.1f", sortList.get(5).avgTeleClimb));
                                        climb7.setText(String.format("%3.1f", sortList.get(6).avgTeleClimb));
                                        climb8.setText(String.format("%3.1f", sortList.get(7).avgTeleClimb));

                                        alliance1Label.setText("Alliance " + Integer.toString(sortList.get(0).allianceNumber));
                                        alliance2Label.setText("Alliance " + Integer.toString(sortList.get(1).allianceNumber));
                                        alliance3Label.setText("Alliance " + Integer.toString(sortList.get(2).allianceNumber));
                                        alliance4Label.setText("Alliance " + Integer.toString(sortList.get(3).allianceNumber));
                                        alliance5Label.setText("Alliance " + Integer.toString(sortList.get(4).allianceNumber));
                                        alliance6Label.setText("Alliance " + Integer.toString(sortList.get(5).allianceNumber));
                                        alliance7Label.setText("Alliance " +Integer.toString(sortList.get(6).allianceNumber));
                                        alliance8Label.setText("Alliance " + Integer.toString(sortList.get(7).allianceNumber));
                                    }});

                        Button teleFuelButton = new Button ("Tele Fuel");
                        teleFuelButton.setStyle("-fx-font: 24 cambria");
                        data.add(teleFuelButton, 4, 0);
                                        teleFuelButton.setOnAction(new EventHandler<ActionEvent>() {
                                            @Override
                                            public void handle(ActionEvent event) {
                                                ArrayList<AllianceData> sortList = new ArrayList<AllianceData>();
                                                sortList.add(alliance1);
                                                sortList.add(alliance2);
                                                sortList.add(alliance3);
                                                sortList.add(alliance4);
                                                sortList.add(alliance5);
                                                sortList.add(alliance6);
                                                sortList.add(alliance7);
                                                sortList.add(alliance8);
                                                Collections.sort(sortList, new Comparator<AllianceData>() {
                                                    public int compare(AllianceData o1, AllianceData o2) {
                                                        if (o1.avgTeleFuel == o2.avgTeleFuel)
                                                            return 0;
                                                        return o1.avgTeleFuel > o2.avgTeleFuel ? -1 : 1;
                                                    }
                                                });
                                                autoGears1.setText(String.format("%3.1f", sortList.get(0).avgAutoGear));
                                                autoGears2.setText(String.format("%3.1f", sortList.get(1).avgAutoGear));
                                                autoGears3.setText(String.format("%3.1f", sortList.get(2).avgAutoGear));
                                                autoGears4.setText(String.format("%3.1f", sortList.get(3).avgAutoGear));
                                                autoGears5.setText(String.format("%3.1f", sortList.get(4).avgAutoGear));
                                                autoGears6.setText(String.format("%3.1f", sortList.get(5).avgAutoGear));
                                                autoGears7.setText(String.format("%3.1f", sortList.get(6).avgAutoGear));
                                                autoGears8.setText(String.format("%3.1f", sortList.get(7).avgAutoGear));

                                                teleGears1.setText(String.format("%3.1f", sortList.get(0).avgTeleGear));
                                                teleGears2.setText(String.format("%3.1f", sortList.get(1).avgTeleGear));
                                                teleGears3.setText(String.format("%3.1f", sortList.get(2).avgTeleGear));
                                                teleGears4.setText(String.format("%3.1f", sortList.get(3).avgTeleGear));
                                                teleGears5.setText(String.format("%3.1f", sortList.get(4).avgTeleGear));
                                                teleGears6.setText(String.format("%3.1f", sortList.get(5).avgTeleGear));
                                                teleGears7.setText(String.format("%3.1f", sortList.get(6).avgTeleGear));
                                                teleGears8.setText(String.format("%3.1f", sortList.get(7).avgTeleGear));

                                                autoFuel1.setText(String.format("%3.1f", sortList.get(0).avgAutoFuel));
                                                autoFuel2.setText(String.format("%3.1f", sortList.get(1).avgAutoFuel));
                                                autoFuel3.setText(String.format("%3.1f", sortList.get(2).avgAutoFuel));
                                                autoFuel4.setText(String.format("%3.1f", sortList.get(3).avgAutoFuel));
                                                autoFuel5.setText(String.format("%3.1f", sortList.get(4).avgAutoFuel));
                                                autoFuel6.setText(String.format("%3.1f", sortList.get(5).avgAutoFuel));
                                                autoFuel7.setText(String.format("%3.1f", sortList.get(6).avgAutoFuel));
                                                autoFuel8.setText(String.format("%3.1f", sortList.get(7).avgAutoFuel));

                                                teleFuel1.setText(String.format("%3.1f", sortList.get(0).avgTeleFuel));
                                                teleFuel2.setText(String.format("%3.1f", sortList.get(1).avgTeleFuel));
                                                teleFuel3.setText(String.format("%3.1f", sortList.get(2).avgTeleFuel));
                                                teleFuel4.setText(String.format("%3.1f", sortList.get(3).avgTeleFuel));
                                                teleFuel5.setText(String.format("%3.1f", sortList.get(4).avgTeleFuel));
                                                teleFuel6.setText(String.format("%3.1f", sortList.get(5).avgTeleFuel));
                                                teleFuel7.setText(String.format("%3.1f", sortList.get(6).avgTeleFuel));
                                                teleFuel8.setText(String.format("%3.1f", sortList.get(7).avgTeleFuel));

                                                climb1.setText(String.format("%3.1f", sortList.get(0).avgTeleClimb));
                                                climb2.setText(String.format("%3.1f", sortList.get(1).avgTeleClimb));
                                                climb3.setText(String.format("%3.1f", sortList.get(2).avgTeleClimb));
                                                climb4.setText(String.format("%3.1f", sortList.get(3).avgTeleClimb));
                                                climb5.setText(String.format("%3.1f", sortList.get(4).avgTeleClimb));
                                                climb6.setText(String.format("%3.1f", sortList.get(5).avgTeleClimb));
                                                climb7.setText(String.format("%3.1f", sortList.get(6).avgTeleClimb));
                                                climb8.setText(String.format("%3.1f", sortList.get(7).avgTeleClimb));

                                                alliance1Label.setText("Alliance " + Integer.toString(sortList.get(0).allianceNumber));
                                                alliance2Label.setText("Alliance " + Integer.toString(sortList.get(1).allianceNumber));
                                                alliance3Label.setText("Alliance " + Integer.toString(sortList.get(2).allianceNumber));
                                                alliance4Label.setText("Alliance " + Integer.toString(sortList.get(3).allianceNumber));
                                                alliance5Label.setText("Alliance " + Integer.toString(sortList.get(4).allianceNumber));
                                                alliance6Label.setText("Alliance " + Integer.toString(sortList.get(5).allianceNumber));
                                                alliance7Label.setText("Alliance " +Integer.toString(sortList.get(6).allianceNumber));
                                                alliance8Label.setText("Alliance " + Integer.toString(sortList.get(7).allianceNumber));
                                            }});

                        Button climbsButton = new Button ("Climbs");
                        climbsButton.setStyle("-fx-font: 24 cambria");
                        data.add(climbsButton, 5, 0);
                        climbsButton.setOnAction(new EventHandler<ActionEvent>() {
                                         @Override
                                             public void handle(ActionEvent event) {
                                             ArrayList<AllianceData> sortList = new ArrayList<AllianceData>();
                                             sortList.add(alliance1);
                                             sortList.add(alliance2);
                                             sortList.add(alliance3);
                                             sortList.add(alliance4);
                                             sortList.add(alliance5);
                                             sortList.add(alliance6);
                                             sortList.add(alliance7);
                                             sortList.add(alliance8);
                                             Collections.sort(sortList, new Comparator<AllianceData>() {
                                                 public int compare(AllianceData o1, AllianceData o2) {
                                                     if (o1.avgTeleClimb == o2.avgTeleClimb)
                                                         return 0;
                                                     return o1.avgTeleClimb > o2.avgTeleClimb ? -1 : 1;
                                                 }
                                             });
                                             autoGears1.setText(String.format("%3.1f", sortList.get(0).avgAutoGear));
                                             autoGears2.setText(String.format("%3.1f", sortList.get(1).avgAutoGear));
                                             autoGears3.setText(String.format("%3.1f", sortList.get(2).avgAutoGear));
                                             autoGears4.setText(String.format("%3.1f", sortList.get(3).avgAutoGear));
                                             autoGears5.setText(String.format("%3.1f", sortList.get(4).avgAutoGear));
                                             autoGears6.setText(String.format("%3.1f", sortList.get(5).avgAutoGear));
                                             autoGears7.setText(String.format("%3.1f", sortList.get(6).avgAutoGear));
                                             autoGears8.setText(String.format("%3.1f", sortList.get(7).avgAutoGear));

                                             teleGears1.setText(String.format("%3.1f", sortList.get(0).avgTeleGear));
                                             teleGears2.setText(String.format("%3.1f", sortList.get(1).avgTeleGear));
                                             teleGears3.setText(String.format("%3.1f", sortList.get(2).avgTeleGear));
                                             teleGears4.setText(String.format("%3.1f", sortList.get(3).avgTeleGear));
                                             teleGears5.setText(String.format("%3.1f", sortList.get(4).avgTeleGear));
                                             teleGears6.setText(String.format("%3.1f", sortList.get(5).avgTeleGear));
                                             teleGears7.setText(String.format("%3.1f", sortList.get(6).avgTeleGear));
                                             teleGears8.setText(String.format("%3.1f", sortList.get(7).avgTeleGear));

                                             autoFuel1.setText(String.format("%3.1f", sortList.get(0).avgAutoFuel));
                                             autoFuel2.setText(String.format("%3.1f", sortList.get(1).avgAutoFuel));
                                             autoFuel3.setText(String.format("%3.1f", sortList.get(2).avgAutoFuel));
                                             autoFuel4.setText(String.format("%3.1f", sortList.get(3).avgAutoFuel));
                                             autoFuel5.setText(String.format("%3.1f", sortList.get(4).avgAutoFuel));
                                             autoFuel6.setText(String.format("%3.1f", sortList.get(5).avgAutoFuel));
                                             autoFuel7.setText(String.format("%3.1f", sortList.get(6).avgAutoFuel));
                                             autoFuel8.setText(String.format("%3.1f", sortList.get(7).avgAutoFuel));

                                             teleFuel1.setText(String.format("%3.1f", sortList.get(0).avgTeleFuel));
                                             teleFuel2.setText(String.format("%3.1f", sortList.get(1).avgTeleFuel));
                                             teleFuel3.setText(String.format("%3.1f", sortList.get(2).avgTeleFuel));
                                             teleFuel4.setText(String.format("%3.1f", sortList.get(3).avgTeleFuel));
                                             teleFuel5.setText(String.format("%3.1f", sortList.get(4).avgTeleFuel));
                                             teleFuel6.setText(String.format("%3.1f", sortList.get(5).avgTeleFuel));
                                             teleFuel7.setText(String.format("%3.1f", sortList.get(6).avgTeleFuel));
                                             teleFuel8.setText(String.format("%3.1f", sortList.get(7).avgTeleFuel));

                                             climb1.setText(String.format("%3.1f", sortList.get(0).avgTeleClimb));
                                             climb2.setText(String.format("%3.1f", sortList.get(1).avgTeleClimb));
                                             climb3.setText(String.format("%3.1f", sortList.get(2).avgTeleClimb));
                                             climb4.setText(String.format("%3.1f", sortList.get(3).avgTeleClimb));
                                             climb5.setText(String.format("%3.1f", sortList.get(4).avgTeleClimb));
                                             climb6.setText(String.format("%3.1f", sortList.get(5).avgTeleClimb));
                                             climb7.setText(String.format("%3.1f", sortList.get(6).avgTeleClimb));
                                             climb8.setText(String.format("%3.1f", sortList.get(7).avgTeleClimb));

                                             alliance1Label.setText("Alliance " + Integer.toString(sortList.get(0).allianceNumber));
                                             alliance2Label.setText("Alliance " + Integer.toString(sortList.get(1).allianceNumber));
                                             alliance3Label.setText("Alliance " + Integer.toString(sortList.get(2).allianceNumber));
                                             alliance4Label.setText("Alliance " + Integer.toString(sortList.get(3).allianceNumber));
                                             alliance5Label.setText("Alliance " + Integer.toString(sortList.get(4).allianceNumber));
                                             alliance6Label.setText("Alliance " + Integer.toString(sortList.get(5).allianceNumber));
                                             alliance7Label.setText("Alliance " +Integer.toString(sortList.get(6).allianceNumber));
                                             alliance8Label.setText("Alliance " + Integer.toString(sortList.get(7).allianceNumber));
                                         }});
                        dialog.setScene(dialogScene);
                        dialog.show();
                    }});


        int currNum = 1;

        final Text alliance1Text = new Text (alliance1TextX,alliance1TextY-3,"Alliance 1");
        alliance1Text.setFill(Color.MEDIUMBLUE);
        alliance1Text.setStyle("-fx-font: 20 cambria");
        final Text alliance2Text = new Text (alliance2TextX,alliance2TextY-3,"Alliance 2");
        alliance2Text.setFill(Color.MEDIUMBLUE);
        alliance2Text.setStyle("-fx-font: 20 cambria");
        final Text alliance3Text = new Text (alliance3TextX,alliance3TextY-3,"Alliance 3");
        alliance3Text.setFill(Color.MEDIUMBLUE);
        alliance3Text.setStyle("-fx-font: 20 cambria");
        final Text alliance4Text = new Text (alliance4TextX,alliance4TextY-3,"Alliance 4");
        alliance4Text.setFill(Color.MEDIUMBLUE);
        alliance4Text.setStyle("-fx-font: 20 cambria");
        final Text alliance5Text = new Text (alliance5TextX,alliance5TextY-3,"Alliance 5");
        alliance5Text.setFill(Color.MEDIUMBLUE);
        alliance5Text.setStyle("-fx-font: 20 cambria");
        final Text alliance6Text = new Text (alliance6TextX,alliance6TextY-3,"Alliance 6");
        alliance6Text.setFill(Color.MEDIUMBLUE);
        alliance6Text.setStyle("-fx-font: 20 cambria");
        final Text alliance7Text = new Text (alliance7TextX,alliance7TextY-3,"Alliance 7");
        alliance7Text.setFill(Color.MEDIUMBLUE);
        alliance7Text.setStyle("-fx-font: 20 cambria");
        final Text alliance8Text = new Text (alliance8TextX,alliance8TextY-3,"Alliance 8");
        alliance8Text.setFill(Color.MEDIUMBLUE);
        alliance8Text.setStyle("-fx-font: 20 cambria");
        final Text robotText = new Text (robotTextX+27,robotTextY-3,"Robots");
        robotText.setFill(Color.MEDIUMBLUE);
        robotText.setStyle("-fx-font: 20 cambria");

        predictedScore1 = new Text(predictedScore1X,predictedScore1Y,"");
        predictedScore1.setFill(RED);
        predictedScore1.setStyle("-fx-font: 25 cambria");
        predictedScore2 = new Text(predictedScore2X,predictedScore2Y,"");
        predictedScore2.setFill(RED);
        predictedScore2.setStyle("-fx-font: 25 cambria");
        predictedScore3 = new Text(predictedScore3X,predictedScore3Y,"");
        predictedScore3.setFill(RED);
        predictedScore3.setStyle("-fx-font: 25 cambria");
        predictedScore4 = new Text(predictedScore4X,predictedScore4Y,"");
        predictedScore4.setFill(RED);
        predictedScore4.setStyle("-fx-font: 25 cambria");
        predictedScore5 = new Text(predictedScore5X,predictedScore5Y,"");
        predictedScore5.setFill(RED);
        predictedScore5.setStyle("-fx-font: 25 cambria");
        predictedScore6 = new Text(predictedScore6X,predictedScore6Y,"");
        predictedScore6.setFill(RED);
        predictedScore6.setStyle("-fx-font: 25 cambria");
        predictedScore7 = new Text(predictedScore7X,predictedScore7Y,"");
        predictedScore7.setFill(RED);
        predictedScore7.setStyle("-fx-font: 25 cambria");
        predictedScore8 = new Text(predictedScore8X,predictedScore8Y,"");
        predictedScore8.setFill(RED);
        predictedScore8.setStyle("-fx-font: 25 cambria");

        avgTeleFuelText1 = new Text (avgTeleFuel1X,avgTeleFuel1Y, "");
        avgTeleFuelText1.setFill(RED);
        avgTeleFuelText1.setStyle("-fx-font: 25 cambria");
        avgAutoFuelText1 = new Text (avgAutoFuel1X,avgAutoFuel1Y, "");
        avgAutoFuelText1.setFill(RED) ;
        avgAutoFuelText1.setStyle("-fx-font: 25 cambria");
        avgTeleGearsText1 = new Text (avgTeleGears1X,avgTeleGears1Y, "");
        avgTeleGearsText1.setFill(RED);
        avgTeleGearsText1.setStyle("-fx-font: 25 cambria");
        avgAutoGearsText1 = new Text (avgAutoGears1X,avgAutoGears1Y, "") ;
        avgAutoGearsText1.setFill(RED);
        avgAutoGearsText1.setStyle("-fx-font: 25 cambria");
        avgClimbsText1 = new Text (avgClimbs1X,avgClimbs1Y, "");
        avgClimbsText1.setFill(RED);
        avgClimbsText1.setStyle("-fx-font: 25 cambria");

        avgTeleFuelText2 = new Text (avgTeleFuel2X,avgTeleFuel2Y, "");
        avgTeleFuelText2.setFill(RED);
        avgTeleFuelText2.setStyle("-fx-font: 25 cambria");
        avgAutoFuelText2 = new Text (avgAutoFuel2X,avgAutoFuel2Y, "");
        avgAutoFuelText2.setFill(RED) ;
        avgAutoFuelText2.setStyle("-fx-font: 25 cambria");
        avgTeleGearsText2 = new Text (avgTeleGears2X,avgTeleGears2Y, "");
        avgTeleGearsText2.setFill(RED);
        avgTeleGearsText2.setStyle("-fx-font: 25 cambria");
        avgAutoGearsText2 = new Text (avgAutoGears2X,avgAutoGears2Y, "") ;
        avgAutoGearsText2.setFill(RED);
        avgAutoGearsText2.setStyle("-fx-font: 25 cambria");
        avgClimbsText2 = new Text (avgClimbs2X,avgClimbs2Y, "");
        avgClimbsText2.setFill(RED);
        avgClimbsText2.setStyle("-fx-font: 25 cambria");

        avgTeleFuelText3 = new Text (avgTeleFuel3X,avgTeleFuel3Y, "");
        avgTeleFuelText3.setFill(RED);
        avgTeleFuelText3.setStyle("-fx-font: 25 cambria");
        avgAutoFuelText3 = new Text (avgAutoFuel3X,avgAutoFuel3Y, "");
        avgAutoFuelText3.setFill(RED) ;
        avgAutoFuelText3.setStyle("-fx-font: 25 cambria");
        avgTeleGearsText3 = new Text (avgTeleGears3X,avgTeleGears3Y, "");
        avgTeleGearsText3.setFill(RED);
        avgTeleGearsText3.setStyle("-fx-font: 25 cambria");
        avgAutoGearsText3 = new Text (avgAutoGears3X,avgAutoGears3Y, "") ;
        avgAutoGearsText3.setFill(RED);
        avgAutoGearsText3.setStyle("-fx-font: 25 cambria");
        avgClimbsText3 = new Text (avgClimbs3X,avgClimbs3Y, "");
        avgClimbsText3.setFill(RED);
        avgClimbsText3.setStyle("-fx-font: 25 cambria");

        avgTeleFuelText4 = new Text (avgTeleFuel4X,avgTeleFuel4Y, "");
        avgTeleFuelText4.setFill(RED);
        avgTeleFuelText4.setStyle("-fx-font: 25 cambria");
        avgAutoFuelText4 = new Text (avgAutoFuel4X,avgAutoFuel4Y, "");
        avgAutoFuelText4.setFill(RED) ;
        avgAutoFuelText4.setStyle("-fx-font: 25 cambria");
        avgTeleGearsText4 = new Text (avgTeleGears4X,avgTeleGears4Y, "");
        avgTeleGearsText4.setFill(RED);
        avgTeleGearsText4.setStyle("-fx-font: 25 cambria");
        avgAutoGearsText4 = new Text (avgAutoGears4X,avgAutoGears4Y, "") ;
        avgAutoGearsText4.setFill(RED);
        avgAutoGearsText4.setStyle("-fx-font: 25 cambria");
        avgClimbsText4 = new Text (avgClimbs4X,avgClimbs4Y, "");
        avgClimbsText4.setFill(RED);
        avgClimbsText4.setStyle("-fx-font: 25 cambria");

        avgTeleFuelText5 = new Text (avgTeleFuel5X,avgTeleFuel5Y, "");
        avgTeleFuelText5.setFill(RED);
        avgTeleFuelText5.setStyle("-fx-font: 25 cambria");
        avgAutoFuelText5 = new Text (avgAutoFuel5X,avgAutoFuel5Y, "");
        avgAutoFuelText5.setFill(RED) ;
        avgAutoFuelText5.setStyle("-fx-font: 25 cambria");
        avgTeleGearsText5 = new Text (avgTeleGears5X,avgTeleGears5Y, "");
        avgTeleGearsText5.setFill(RED);
        avgTeleGearsText5.setStyle("-fx-font: 25 cambria");
        avgAutoGearsText5 = new Text (avgAutoGears5X,avgAutoGears5Y, "") ;
        avgAutoGearsText5.setFill(RED);
        avgAutoGearsText5.setStyle("-fx-font: 25 cambria");
        avgClimbsText5 = new Text (avgClimbs5X,avgClimbs5Y, "");
        avgClimbsText5.setFill(RED);
        avgClimbsText5.setStyle("-fx-font: 25 cambria");

        avgTeleFuelText6 = new Text (avgTeleFuel6X,avgTeleFuel6Y, "");
        avgTeleFuelText6.setFill(RED);
        avgTeleFuelText6.setStyle("-fx-font: 25 cambria");
        avgAutoFuelText6 = new Text (avgAutoFuel6X,avgAutoFuel6Y, "");
        avgAutoFuelText6.setFill(RED) ;
        avgAutoFuelText6.setStyle("-fx-font: 25 cambria");
        avgTeleGearsText6 = new Text (avgTeleGears6X,avgTeleGears6Y, "");
        avgTeleGearsText6.setFill(RED);
        avgTeleGearsText6.setStyle("-fx-font: 25 cambria");
        avgAutoGearsText6 = new Text (avgAutoGears6X,avgAutoGears6Y, "") ;
        avgAutoGearsText6.setFill(RED);
        avgAutoGearsText6.setStyle("-fx-font: 25 cambria");
        avgClimbsText6 = new Text (avgClimbs6X,avgClimbs6Y, "");
        avgClimbsText6.setFill(RED);
        avgClimbsText6.setStyle("-fx-font: 25 cambria");

        avgTeleFuelText7 = new Text (avgTeleFuel7X,avgTeleFuel7Y, "");
        avgTeleFuelText7.setFill(RED);
        avgTeleFuelText7.setStyle("-fx-font: 25 cambria");
        avgAutoFuelText7 = new Text (avgAutoFuel7X,avgAutoFuel7Y, "");
        avgAutoFuelText7.setFill(RED) ;
        avgAutoFuelText7.setStyle("-fx-font: 25 cambria");
        avgTeleGearsText7 = new Text (avgTeleGears7X,avgTeleGears7Y, "");
        avgTeleGearsText7.setFill(RED);
        avgTeleGearsText7.setStyle("-fx-font: 25 cambria");
        avgAutoGearsText7 = new Text (avgAutoGears7X,avgAutoGears7Y, "") ;
        avgAutoGearsText7.setFill(RED);
        avgAutoGearsText7.setStyle("-fx-font: 25 cambria");
        avgClimbsText7 = new Text (avgClimbs7X,avgClimbs7Y, "");
        avgClimbsText7.setFill(RED);
        avgClimbsText7.setStyle("-fx-font: 25 cambria");

        avgTeleFuelText8 = new Text (avgTeleFuel8X,avgTeleFuel8Y, "");
        avgTeleFuelText8.setFill(RED);
        avgTeleFuelText8.setStyle("-fx-font: 25 cambria");
        avgAutoFuelText8 = new Text (avgAutoFuel8X,avgAutoFuel8Y, "");
        avgAutoFuelText8.setFill(RED) ;
        avgAutoFuelText8.setStyle("-fx-font: 25 cambria");
        avgTeleGearsText8 = new Text (avgTeleGears8X,avgTeleGears8Y, "");
        avgTeleGearsText8.setFill(RED);
        avgTeleGearsText8.setStyle("-fx-font: 25 cambria");
        avgAutoGearsText8 = new Text (avgAutoGears8X,avgAutoGears8Y, "") ;
        avgAutoGearsText8.setFill(RED);
        avgAutoGearsText8.setStyle("-fx-font: 25 cambria");
        avgClimbsText8 = new Text (avgClimbs8X,avgClimbs8Y, "");
        avgClimbsText8.setFill(RED);
        avgClimbsText8.setStyle("-fx-font: 25 cambria");

        root.getChildren().add(predictedScore1);
        root.getChildren().add(predictedScore2);
        root.getChildren().add(predictedScore3);
        root.getChildren().add(predictedScore4);
        root.getChildren().add(predictedScore5);
        root.getChildren().add(predictedScore6);
        root.getChildren().add(predictedScore7);
        root.getChildren().add(predictedScore8);

        root.getChildren().add(avgTeleFuelText1);
        root.getChildren().add(avgAutoFuelText1);
        root.getChildren().add(avgTeleGearsText1);
        root.getChildren().add(avgAutoGearsText1);
        root.getChildren().add(avgClimbsText1);

        root.getChildren().add(avgTeleFuelText2);
        root.getChildren().add(avgAutoFuelText2);
        root.getChildren().add(avgTeleGearsText2);
        root.getChildren().add(avgAutoGearsText2);
        root.getChildren().add(avgClimbsText2);

        root.getChildren().add(avgTeleFuelText3);
        root.getChildren().add(avgAutoFuelText3);
        root.getChildren().add(avgTeleGearsText3);
        root.getChildren().add(avgAutoGearsText3);
        root.getChildren().add(avgClimbsText3);

        root.getChildren().add(avgTeleFuelText4);
        root.getChildren().add(avgAutoFuelText4);
        root.getChildren().add(avgTeleGearsText4);
        root.getChildren().add(avgAutoGearsText4);
        root.getChildren().add(avgClimbsText4);

        root.getChildren().add(avgTeleFuelText5);
        root.getChildren().add(avgAutoFuelText5);
        root.getChildren().add(avgTeleGearsText5);
        root.getChildren().add(avgAutoGearsText5);
        root.getChildren().add(avgClimbsText5);

        root.getChildren().add(avgTeleFuelText6);
        root.getChildren().add(avgAutoFuelText6);
        root.getChildren().add(avgTeleGearsText6);
        root.getChildren().add(avgAutoGearsText6);
        root.getChildren().add(avgClimbsText6);

        root.getChildren().add(avgTeleFuelText7);
        root.getChildren().add(avgAutoFuelText7);
        root.getChildren().add(avgTeleGearsText7);
        root.getChildren().add(avgAutoGearsText7);
        root.getChildren().add(avgClimbsText7);

        root.getChildren().add(avgTeleFuelText8);
        root.getChildren().add(avgAutoFuelText8);
        root.getChildren().add(avgTeleGearsText8);
        root.getChildren().add(avgAutoGearsText8);
        root.getChildren().add(avgClimbsText8);

        Text predictedScoreLabel = new Text (predictedScoreLabelX, predictedScoreLabelY, "Predicted Score");
        predictedScoreLabel.setFill(Color.MEDIUMBLUE);
        predictedScoreLabel.setStyle("-fx-font: 16 cambria");
        Text avgTeleFuelLabel = new Text (avgTeleFuelLabelX, avgTeleFuelLabelY, "Tele Fuel");
        avgTeleFuelLabel.setFill(Color.MEDIUMBLUE);
        avgTeleFuelLabel.setStyle("-fx-font: 16 cambria");
        Text avgAutoFuelLabel = new Text (avgAutoFuelLabelX, avgAutoFuelLabelY, "Auto Fuel");
        avgAutoFuelLabel.setFill(Color.MEDIUMBLUE);
        avgAutoFuelLabel.setStyle("-fx-font: 16 cambria");
        Text avgAutoGearsLabel = new Text (avgAutoGearsLabelX, avgAutoGearsLabelY, "Auto Gears");
        avgAutoGearsLabel.setFill(Color.MEDIUMBLUE);
        avgAutoGearsLabel.setStyle("-fx-font: 16 cambria");
        Text avgTeleGearsLabel = new Text (avgTeleGearsLabelX, avgTeleGearsLabelY, "Tele Gears");
        avgTeleGearsLabel.setFill(Color.MEDIUMBLUE);
        avgTeleGearsLabel.setStyle("-fx-font: 16 cambria");
        Text avgClimbsLabel = new Text (avgClimbsLabelX, avgClimbsLabelY, "Climbs");
        avgClimbsLabel.setFill(Color.MEDIUMBLUE);
        avgClimbsLabel.setStyle("-fx-font: 16 cambria");

        root.getChildren().add(predictedScoreLabel);
        root.getChildren().add(avgTeleFuelLabel);
        root.getChildren().add(avgAutoFuelLabel);
        root.getChildren().add(avgAutoGearsLabel);
        root.getChildren().add(avgTeleGearsLabel);
        root.getChildren().add(avgClimbsLabel);
        root.getChildren().add(alliance1Text);
        root.getChildren().add(alliance2Text);
        root.getChildren().add(alliance3Text);
        root.getChildren().add(alliance4Text);
        root.getChildren().add(alliance5Text);
        root.getChildren().add(alliance6Text);
        root.getChildren().add(alliance7Text);
        root.getChildren().add(alliance8Text);
        root.getChildren().add(robotText);

        if (adList1.size() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Database is empty");
            alert.setHeaderText("Check the SQL database");
            alert.showAndWait();
            exit();
        }
        //put in onclicks of buttons
        if ((alliance1TextList.size() <= 3) &&
            (alliance2TextList.size() <= 3) &&
            (alliance3TextList.size() <= 3) &&
            (alliance4TextList.size() <= 3) &&
            (alliance5TextList.size() <= 3) &&
            (alliance6TextList.size() <= 3) &&
            (alliance7TextList.size() <= 3) &&
            (alliance8TextList.size() <= 3)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("24 Robots must be entered into the boxes to open this ");
            alert.setHeaderText("Check the SQL database");
            alert.showAndWait();
            exit();
        }

        final Rectangle robotRect = new Rectangle(robotTextX, robotTextY, 125, 575);
        robotRect.setFill(null);
        robotRect.setStroke(Color.MEDIUMBLUE);
        robotRect.toBack();
        root.getChildren().add(robotRect);

        final TextFlow robotTarget = new TextFlow(
        );
        robotTarget.setLayoutX(robotTextX);
        robotTarget.setLayoutY(robotTextY);
        robotTarget.setPrefSize(125,575);
        robotTarget.toBack();

        final Rectangle alliance1Rect = new Rectangle(alliance1TextX, alliance1TextY, 160, 40);
        alliance1Rect.setFill(null);
        alliance1Rect.setStroke(Color.MEDIUMBLUE);
        alliance1Rect.toBack();
        root.getChildren().add(alliance1Rect);

        final TextFlow alliance1Target = new TextFlow(
        );
        alliance1Target.setLayoutX(alliance1TextX);
        alliance1Target.setLayoutY(alliance1TextY);
        alliance1Target.setPrefSize(160,40);
        alliance1Target.toBack();

        final Rectangle alliance2Rect = new Rectangle(alliance2TextX, alliance2TextY, 160, 40);
        alliance2Rect.setFill(null);
        alliance2Rect.setStroke(Color.MEDIUMBLUE);
        alliance2Rect.toBack();
        root.getChildren().add(alliance2Rect);

        final TextFlow alliance2Target = new TextFlow(
        );
        alliance2Target.setLayoutX(alliance2TextX);
        alliance2Target.setLayoutY(alliance2TextY);
        alliance2Target.setPrefSize(160,40);
        alliance2Target.toBack();

        final Rectangle alliance3Rect = new Rectangle(alliance3TextX, alliance3TextY, 160, 40);
        alliance3Rect.setFill(null);
        alliance3Rect.setStroke(Color.MEDIUMBLUE);
        alliance3Rect.toBack();
        root.getChildren().add(alliance3Rect);

        final TextFlow alliance3Target = new TextFlow(
        );
        alliance3Target.setLayoutX(alliance3TextX);
        alliance3Target.setLayoutY(alliance3TextY);
        alliance3Target.setPrefSize(160,40);
        alliance3Target.toBack();

        final Rectangle alliance4Rect = new Rectangle(alliance4TextX, alliance4TextY, 160, 40);
        alliance4Rect.setFill(null);
        alliance4Rect.setStroke(Color.MEDIUMBLUE);
        alliance4Rect.toBack();
        root.getChildren().add(alliance4Rect);

        final TextFlow alliance4Target = new TextFlow(
        );
        alliance4Target.setLayoutX(alliance4TextX);
        alliance4Target.setLayoutY(alliance4TextY);
        alliance4Target.setPrefSize(160,40);
        alliance4Target.toBack();

        final Rectangle alliance5Rect = new Rectangle(alliance5TextX, alliance5TextY, 160, 40);
        alliance5Rect.setFill(null);
        alliance5Rect.setStroke(Color.MEDIUMBLUE);
        alliance5Rect.toBack();
        root.getChildren().add(alliance5Rect);

        final TextFlow alliance5Target = new TextFlow(
        );
        alliance5Target.setLayoutX(alliance5TextX);
        alliance5Target.setLayoutY(alliance5TextY);
        alliance5Target.setPrefSize(160,40);
        alliance5Target.toBack();

        final Rectangle alliance6Rect = new Rectangle(alliance6TextX, alliance6TextY, 160, 40);
        alliance6Rect.setFill(null);
        alliance6Rect.setStroke(Color.MEDIUMBLUE);
        alliance6Rect.toBack();
        root.getChildren().add(alliance6Rect);

        final TextFlow alliance6Target = new TextFlow(
        );
        alliance6Target.setLayoutX(alliance6TextX);
        alliance6Target.setLayoutY(alliance6TextY);
        alliance6Target.setPrefSize(160,40);
        alliance6Target.toBack();

        final Rectangle alliance7Rect = new Rectangle(alliance7TextX, alliance7TextY, 160, 40);
        alliance7Rect.setFill(null);
        alliance7Rect.setStroke(Color.MEDIUMBLUE);
        alliance7Rect.toBack();
        root.getChildren().add(alliance7Rect);

        final TextFlow alliance7Target = new TextFlow(
        );
        alliance7Target.setLayoutX(alliance7TextX);
        alliance7Target.setLayoutY(alliance7TextY);
        alliance7Target.setPrefSize(160,40);
        alliance7Target.toBack();

        final Rectangle alliance8Rect = new Rectangle(alliance8TextX, alliance8TextY, 160, 40);
        alliance8Rect.setFill(null);
        alliance8Rect.setStroke(Color.MEDIUMBLUE);
        alliance8Rect.toBack();
        root.getChildren().add(alliance8Rect);

        final TextFlow alliance8Target = new TextFlow(
        );
        alliance8Target.setLayoutX(alliance8TextX);
        alliance8Target.setLayoutY(alliance8TextY);
        alliance8Target.setPrefSize(160,40);
        alliance8Target.toBack();

        //final Text allianceTargetText = new Text(allianceTextX, allianceTextY+15,"Add to Alliance");

        Collections.sort(teamList);

        // create text for each team
        for (int teamNum : teamList) {
            //System.out.println(teamNum);
            Text teamText = new Text(0,0,Integer.toString(teamNum));
            teamText.setStyle("-fx-font: 12 cambria");
            if (teamNum == 1153) {
                teamText.setFill(RED);
            }
            // create an event handler to handle drag and drop
            teamText.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                /* drag detected */
                    Dragboard db = teamText.startDragAndDrop(TransferMode.ANY);
                    ClipboardContent content = new ClipboardContent();
                    content.putString(teamText.getText());
                    db.setContent(content);

                    event.consume();
                }
            });
            teamText.setOnDragDone(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    if (event.getTransferMode() == TransferMode.MOVE) {
                        //teamText.setText("");
                        teamText.toFront();
                    }
                    event.consume();
                }
            });
            robotTextList.add(teamText);
            root.getChildren().add(teamText);
        }
        placeTeams();
        ///////////////////////////////////////////////////////////////////////
        // Handle pickedTarget
        ///////////////////////////////////////////////////////////////////////
        // create an event handler for the target
        robotTarget.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != robotTarget &&
                        event.getDragboard().hasString() && isInRobotTextList(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        robotTarget.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != robotTarget &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        robotTarget.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        robotTarget.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        resetData(2);
                        placeAlliance2();

                    } else if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        resetData(1);
                        placeAlliance1();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        resetData(3);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        resetData(4);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        resetData(5);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        resetData(6);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        resetData(7);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
                        resetData(8);
                        placeAlliance8();
                    }
                    robotTextList.add(t);
                    placeRobots();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });
        alliance1Target.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != alliance1Target &&
                        event.getDragboard().hasString() && isInAlliance1(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        alliance1Target.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != alliance1Target &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        alliance1Target.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        alliance1Target.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("draggedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        resetData(2);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        resetData(3);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        resetData(4);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        resetData(5);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        resetData(6);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        resetData(7);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
                        resetData(8);
                        placeAlliance8();
                    }
                    alliance1TextList.add(t);
                    placeAlliance1();
                    getStrongestAlliance1();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });
       ///STOP///
        alliance2Target.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != alliance2Target &&
                        event.getDragboard().hasString() && isInAlliance2(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        alliance2Target.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != alliance2Target &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        alliance2Target.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        alliance2Target.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        resetData(1);
                        placeAlliance1();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        resetData(3);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        resetData(4);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        resetData(5);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        resetData(6);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        resetData(7);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
                        resetData(8);
                        placeAlliance8();
                    }
                    alliance2TextList.add(t);
                    placeAlliance2();
                    getStrongestAlliance2();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });
        alliance3Target.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != alliance3Target &&
                        event.getDragboard().hasString() && isInAlliance3(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        alliance3Target.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != alliance3Target &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        alliance3Target.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        alliance3Target.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        resetData(1);
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        resetData(2);
                        placeAlliance2();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        resetData(3);
                        placeRobots();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        resetData(4);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        resetData(5);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        resetData(6);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        resetData(7);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
                        resetData(8);
                        placeAlliance8();
                    }
                    alliance3TextList.add(t);
                    placeAlliance3();
                    getStrongestAlliance3();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });
        alliance4Target.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != alliance4Target &&
                        event.getDragboard().hasString() && isInAlliance4(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        alliance4Target.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != alliance4Target &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        alliance4Target.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        alliance4Target.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        resetData(1);
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        resetData(2);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        resetData(3);
                        placeAlliance3();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        resetData(5);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        resetData(6);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        resetData(7);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
                        resetData(8);
                        placeAlliance8();
                    }
                    alliance4TextList.add(t);
                    placeAlliance4();
                    getStrongestAlliance4();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });
        alliance5Target.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != alliance5Target &&
                        event.getDragboard().hasString() && isInAlliance5(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        alliance5Target.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != alliance5Target &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        alliance5Target.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        alliance5Target.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        resetData(1);
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        resetData(2);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        resetData(3);
                        placeAlliance3();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        resetData(4);
                        placeAlliance4();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        resetData(6);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        resetData(7);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
                        resetData(8);
                        placeAlliance8();
                    }
                    alliance5TextList.add(t);
                    placeAlliance5();
                    getStrongestAlliance5();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });
        alliance6Target.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != alliance6Target &&
                        event.getDragboard().hasString() && isInAlliance6(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        alliance6Target.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != alliance6Target &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        alliance6Target.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        alliance6Target.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        resetData(1);
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        resetData(2);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        resetData(3);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        resetData(4);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        resetData(5);
                        placeAlliance5();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        resetData(7);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
                        resetData(8);
                        placeAlliance8();
                    }
                    alliance6TextList.add(t);
                    placeAlliance6();
                    getStrongestAlliance6();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });

        alliance7Target.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != alliance7Target &&
                        event.getDragboard().hasString() && isInAlliance7(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        alliance7Target.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != alliance7Target &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        alliance7Target.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        alliance7Target.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        resetData(1);
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        resetData(2);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        resetData(3);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        resetData(4);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        resetData(5);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        resetData(6);
                        placeAlliance6();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
                        resetData(8);
                        placeAlliance8();
                    }
                    alliance7TextList.add(t);
                    placeAlliance7();
                    getStrongestAlliance7();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });
        alliance8Target.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedOver");
                if (event.getGestureSource() != alliance8Target &&
                        event.getDragboard().hasString() && isInAlliance8(event.getDragboard().getString()) == false) {
                    /* allow both copy and move */
                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                }
            }
        });

        alliance8Target.setOnDragEntered(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedEntered");
                if (event.getGestureSource() != alliance8Target &&
                        event.getDragboard().hasString()) {
                    //pickedTarget.setFill(Color.GREEN);
                }
            }
        });

        alliance8Target.setOnDragExited(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedExited");
                //pickedTarget.setFill(Color.BLACK);
            }
        });

        alliance8Target.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                //System.out.println("dragedDropped");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    //target.setText(db.getString());

                    Text t = getTextObject(db.getString());

                    if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        resetData(1);
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        resetData(2);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        resetData(3);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        resetData(4);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        resetData(5);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        resetData(6);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        resetData(7);
                        placeAlliance7();

                    }  else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();
                    }
                    alliance8TextList.add(t);
                    placeAlliance8();
                    getStrongestAlliance8();
                    success = true;
                }

                event.setDropCompleted(success);
                event.consume();
            }
        });

        root.getChildren().add(alliance1Target);
        root.getChildren().add(alliance2Target);
        root.getChildren().add(alliance3Target);
        root.getChildren().add(alliance4Target);
        root.getChildren().add(alliance5Target);
        root.getChildren().add(alliance6Target);
        root.getChildren().add(alliance7Target);
        root.getChildren().add(alliance8Target);
        root.getChildren().add(robotTarget);
        // put the target button in the back of the layout stack
        alliance1Target.toBack();
        alliance2Target.toBack();
        alliance3Target.toBack();
        alliance4Target.toBack();
        alliance5Target.toBack();
        alliance6Target.toBack();
        alliance7Target.toBack();
        alliance8Target.toBack();
        robotTarget.toBack();;
        primaryStage.show();
    }
    // Display Alliance 1 Stats
    public void getStrongestAlliance1() {
        // first sort alliances by strength
        Collections.sort(adList1, new Comparator<AllianceData>() {
            public int compare(AllianceData o1, AllianceData o2) {
                if (o1.allianceLowStrength == o2.allianceLowStrength)
                    return 0;
                return o1.allianceLowStrength > o2.allianceLowStrength ? -1 : 1;
            }
        });

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        double strength = 0.0;
        double avgAutoFuel = 0;
        double avgTeleFuel = 0;
        double avgAutoGears = 0;
        double avgTeleGears = 0;
        double avgClimbs = 0;
        // if there's three robots, show the score
        if (alliance1TextList.size() == 3) {
            // find highest matching alliance with all 3 robots in it
            // find highest matching alliance with robots 1 and 2 in it
            r1 = Integer.parseInt(alliance1TextList.get(0).getText().toString());
            r2 = Integer.parseInt(alliance1TextList.get(1).getText().toString());
            r3 = Integer.parseInt(alliance1TextList.get(2).getText().toString());

            // find highest matching alliance with robot 1 in it
            int c =0;
            boolean keepSearching = true;
            while (keepSearching == true) {
                if ((adList1.get(c).robot1 == r1 || adList1.get(c).robot2 == r1 || adList1.get(c).robot3 == r1) &&
                        (adList1.get(c).robot1 == r2 || adList1.get(c).robot2 == r2 || adList1.get(c).robot3 == r2) &&
                        (adList1.get(c).robot1 == r3 || adList1.get(c).robot2 == r3 || adList1.get(c).robot3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList1.get(c).robot1;
                    r2 = adList1.get(c).robot2;
                    r3 = adList1.get(c).robot3;
                    strength = adList1.get(c).allianceLowStrength;
                    avgAutoFuel = adList1.get(c).avgAutoFuel;
                    avgTeleFuel = adList1.get(c).avgTeleFuel;
                    avgAutoGears = adList1.get(c).avgAutoGear;
                    avgTeleGears = adList1.get(c).avgTeleGear;
                    avgClimbs = adList1.get(c).avgTeleClimb;
                    alliance1.allianceHighStrength = adList1.get(c).allianceHighStrength;
                    alliance1.allianceLowStrength = adList1.get(c).allianceLowStrength;
                    alliance1.allianceRawStrength = adList1.get(c).allianceRawStrength;
                    alliance1.avgAutoGear = adList1.get(c).avgAutoGear;
                    alliance1.avgTeleGear = adList1.get(c).avgTeleGear;
                    alliance1.avgAutoFuel = adList1.get(c).avgAutoFuel;
                    alliance1.avgTeleFuel = adList1.get(c).avgTeleFuel;
                    alliance1.avgTeleClimb = adList1.get(c).avgTeleClimb;
                    alliance1.allianceNumber = 1;
                }

                c++;
                if (c >= adList1.size()) {
                    keepSearching = false;
                }
            }
        }
        predictedScore1.setText(String.format("%.1f",strength));
        avgAutoFuelText1.setText(String.format("%.1f",avgAutoFuel));
        avgTeleFuelText1.setText(String.format("%.1f", avgTeleFuel));
        avgAutoGearsText1.setText(String.format("%.1f", avgAutoGears));
        avgTeleGearsText1.setText(String.format("%.1f", avgTeleGears));
        avgClimbsText1.setText(String.format("%.1f", avgClimbs));

    }

    // Display Alliance 2 Stats
    public void getStrongestAlliance2() {
        // first sort alliances by strength
        Collections.sort(adList2, new Comparator<AllianceData>() {
            public int compare(AllianceData o1, AllianceData o2) {
                if (o1.allianceLowStrength == o2.allianceLowStrength)
                    return 0;
                return o1.allianceLowStrength > o2.allianceLowStrength ? -1 : 1;
            }
        });

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        double strength = 0.0;
        double avgAutoFuel = 0;
        double avgTeleFuel = 0;
        double avgAutoGears = 0;
        double avgTeleGears = 0;
        double avgClimbs = 0;
        // if there's three robots, show the score
        if (alliance2TextList.size() == 3) {
            // find highest matching alliance with all 3 robots in it
            // find highest matching alliance with robots 1 and 2 in it
            r1 = Integer.parseInt(alliance2TextList.get(0).getText().toString());
            r2 = Integer.parseInt(alliance2TextList.get(1).getText().toString());
            r3 = Integer.parseInt(alliance2TextList.get(2).getText().toString());

            // find highest matching alliance with robot 1 in it
            int c =0;
            boolean keepSearching = true;
            while (keepSearching == true) {
                if ((adList2.get(c).robot1 == r1 || adList2.get(c).robot2 == r1 || adList2.get(c).robot3 == r1) &&
                        (adList2.get(c).robot1 == r2 || adList2.get(c).robot2 == r2 || adList2.get(c).robot3 == r2) &&
                        (adList2.get(c).robot1 == r3 || adList2.get(c).robot2 == r3 || adList2.get(c).robot3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList2.get(c).robot1;
                    r2 = adList2.get(c).robot2;
                    r3 = adList2.get(c).robot3;
                    strength = adList2.get(c).allianceLowStrength;
                    avgAutoFuel = adList2.get(c).avgAutoFuel;
                    avgTeleFuel = adList2.get(c).avgTeleFuel;
                    avgAutoGears = adList2.get(c).avgAutoGear;
                    avgTeleGears = adList2.get(c).avgTeleGear;
                    avgClimbs = adList2.get(c).avgTeleClimb;
                    alliance2.allianceHighStrength = adList2.get(c).allianceHighStrength;
                    alliance2.allianceLowStrength = adList2.get(c).allianceLowStrength;
                    alliance2.allianceRawStrength = adList2.get(c).allianceRawStrength;
                    alliance2.avgAutoGear = adList2.get(c).avgAutoGear;
                    alliance2.avgTeleGear = adList2.get(c).avgTeleGear;
                    alliance2.avgAutoFuel = adList2.get(c).avgAutoFuel;
                    alliance2.avgTeleFuel = adList2.get(c).avgTeleFuel;
                    alliance2.avgTeleClimb = adList2.get(c).avgTeleClimb;
                    alliance2.allianceNumber = 2;

                }
                c++;
                if (c >= adList2.size()) {
                    keepSearching = false;
                }
            }
        }
        predictedScore2.setText(String.format("%.1f",strength));
        avgAutoFuelText2.setText(String.format("%.1f",avgAutoFuel));
        avgTeleFuelText2.setText(String.format("%.1f", avgTeleFuel));
        avgAutoGearsText2.setText(String.format("%.1f", avgAutoGears));
        avgTeleGearsText2.setText(String.format("%.1f", avgTeleGears));
        avgClimbsText2.setText(String.format("%.1f", avgClimbs));
    }
    // Display Alliance 3 Stats
    public void getStrongestAlliance3() {
        // first sort alliances by strength
        Collections.sort(adList3, new Comparator<AllianceData>() {
            public int compare(AllianceData o1, AllianceData o2) {
                if (o1.allianceLowStrength == o2.allianceLowStrength)
                    return 0;
                return o1.allianceLowStrength > o2.allianceLowStrength ? -1 : 1;
            }
        });

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        double strength = 0.0;
        double avgAutoFuel = 0;
        double avgTeleFuel = 0;
        double avgAutoGears = 0;
        double avgTeleGears = 0;
        double avgClimbs = 0;
        // if there's three robots, show the score
        if (alliance3TextList.size() == 3) {
            // find highest matching alliance with all 3 robots in it
            // find highest matching alliance with robots 1 and 2 in it
            r1 = Integer.parseInt(alliance3TextList.get(0).getText().toString());
            r2 = Integer.parseInt(alliance3TextList.get(1).getText().toString());
            r3 = Integer.parseInt(alliance3TextList.get(2).getText().toString());

            // find highest matching alliance with robot 1 in it
            int c =0;
            boolean keepSearching = true;
            while (keepSearching == true) {
                if ((adList3.get(c).robot1 == r1 || adList3.get(c).robot2 == r1 || adList3.get(c).robot3 == r1) &&
                        (adList3.get(c).robot1 == r2 || adList3.get(c).robot2 == r2 || adList3.get(c).robot3 == r2) &&
                        (adList3.get(c).robot1 == r3 || adList3.get(c).robot2 == r3 || adList3.get(c).robot3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList3.get(c).robot1;
                    r2 = adList3.get(c).robot2;
                    r3 = adList3.get(c).robot3;
                    strength = adList3.get(c).allianceLowStrength;
                    avgAutoFuel = adList3.get(c).avgAutoFuel;
                    avgTeleFuel = adList3.get(c).avgTeleFuel;
                    avgAutoGears = adList3.get(c).avgAutoGear;
                    avgTeleGears = adList3.get(c).avgTeleGear;
                    avgClimbs = adList3.get(c).avgTeleClimb;
                    alliance3.allianceHighStrength = adList3.get(c).allianceHighStrength;
                    alliance3.allianceLowStrength = adList3.get(c).allianceLowStrength;
                    alliance3.allianceRawStrength = adList3.get(c).allianceRawStrength;
                    alliance3.avgAutoGear = adList3.get(c).avgAutoGear;
                    alliance3.avgTeleGear = adList3.get(c).avgTeleGear;
                    alliance3.avgAutoFuel = adList3.get(c).avgAutoFuel;
                    alliance3.avgTeleFuel = adList3.get(c).avgTeleFuel;
                    alliance3.avgTeleClimb = adList3.get(c).avgTeleClimb;
                    alliance3.allianceNumber = 3;

                }
                c++;
                if (c >= adList3.size()) {
                    keepSearching = false;
                }
            }
        }
        predictedScore3.setText(String.format("%.1f",strength));
        avgAutoFuelText3.setText(String.format("%.1f",avgAutoFuel));
        avgTeleFuelText3.setText(String.format("%.1f", avgTeleFuel));
        avgAutoGearsText3.setText(String.format("%.1f", avgAutoGears));
        avgTeleGearsText3.setText(String.format("%.1f", avgTeleGears));
        avgClimbsText3.setText(String.format("%.1f", avgClimbs));
    }
    // Display Alliance 4 Stats
    public void getStrongestAlliance4() {
        // first sort alliances by strength
        Collections.sort(adList4, new Comparator<AllianceData>() {
            public int compare(AllianceData o1, AllianceData o2) {
                if (o1.allianceLowStrength == o2.allianceLowStrength)
                    return 0;
                return o1.allianceLowStrength > o2.allianceLowStrength ? -1 : 1;
            }
        });

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        double strength = 0.0;
        double avgAutoFuel = 0;
        double avgTeleFuel = 0;
        double avgAutoGears = 0;
        double avgTeleGears = 0;
        double avgClimbs = 0;
        // if there's three robots, show the score
        if (alliance4TextList.size() == 3) {
            // find highest matching alliance with all 3 robots in it
            // find highest matching alliance with robots 1 and 2 in it
            r1 = Integer.parseInt(alliance4TextList.get(0).getText().toString());
            r2 = Integer.parseInt(alliance4TextList.get(1).getText().toString());
            r3 = Integer.parseInt(alliance4TextList.get(2).getText().toString());

            // find highest matching alliance with robot 1 in it
            int c =0;
            boolean keepSearching = true;
            while (keepSearching == true) {
                if ((adList4.get(c).robot1 == r1 || adList4.get(c).robot2 == r1 || adList4.get(c).robot3 == r1) &&
                        (adList4.get(c).robot1 == r2 || adList4.get(c).robot2 == r2 || adList4.get(c).robot3 == r2) &&
                        (adList4.get(c).robot1 == r3 || adList4.get(c).robot2 == r3 || adList4.get(c).robot3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList4.get(c).robot1;
                    r2 = adList4.get(c).robot2;
                    r3 = adList4.get(c).robot3;
                    strength = adList4.get(c).allianceLowStrength;
                    avgAutoFuel = adList4.get(c).avgAutoFuel;
                    avgTeleFuel = adList4.get(c).avgTeleFuel;
                    avgAutoGears = adList4.get(c).avgAutoGear;
                    avgTeleGears = adList4.get(c).avgTeleGear;
                    avgClimbs = adList4.get(c).avgTeleClimb;
                    alliance4.allianceHighStrength = adList4.get(c).allianceHighStrength;
                    alliance4.allianceLowStrength = adList4.get(c).allianceLowStrength;
                    alliance4.allianceRawStrength = adList4.get(c).allianceRawStrength;
                    alliance4.avgAutoGear = adList4.get(c).avgAutoGear;
                    alliance4.avgTeleGear = adList4.get(c).avgTeleGear;
                    alliance4.avgAutoFuel = adList4.get(c).avgAutoFuel;
                    alliance4.avgTeleFuel = adList4.get(c).avgTeleFuel;
                    alliance4.avgTeleClimb = adList4.get(c).avgTeleClimb;
                    alliance4.allianceNumber = 4;

                }
                c++;
                if (c >= adList4.size()) {
                    keepSearching = false;
                }
            }
        }
        predictedScore4.setText(String.format("%.1f",strength));
        avgAutoFuelText4.setText(String.format("%.1f",avgAutoFuel));
        avgTeleFuelText4.setText(String.format("%.1f", avgTeleFuel));
        avgAutoGearsText4.setText(String.format("%.1f", avgAutoGears));
        avgTeleGearsText4.setText(String.format("%.1f", avgTeleGears));
        avgClimbsText4.setText(String.format("%.1f", avgClimbs));
    }
    // Display Alliance 5 Stats
    public void getStrongestAlliance5() {
        // first sort alliances by strength
        Collections.sort(adList5, new Comparator<AllianceData>() {
            public int compare(AllianceData o1, AllianceData o2) {
                if (o1.allianceLowStrength == o2.allianceLowStrength)
                    return 0;
                return o1.allianceLowStrength > o2.allianceLowStrength ? -1 : 1;
            }
        });

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        double strength = 0.0;
        double avgAutoFuel = 0;
        double avgTeleFuel = 0;
        double avgAutoGears = 0;
        double avgTeleGears = 0;
        double avgClimbs = 0;
        // if there's three robots, show the score
        if (alliance5TextList.size() == 3) {
            // find highest matching alliance with all 3 robots in it
            // find highest matching alliance with robots 1 and 2 in it
            r1 = Integer.parseInt(alliance5TextList.get(0).getText().toString());
            r2 = Integer.parseInt(alliance5TextList.get(1).getText().toString());
            r3 = Integer.parseInt(alliance5TextList.get(2).getText().toString());

            // find highest matching alliance with robot 1 in it
            int c =0;
            boolean keepSearching = true;
            while (keepSearching == true) {
                if ((adList5.get(c).robot1 == r1 || adList5.get(c).robot2 == r1 || adList5.get(c).robot3 == r1) &&
                        (adList5.get(c).robot1 == r2 || adList5.get(c).robot2 == r2 || adList5.get(c).robot3 == r2) &&
                        (adList5.get(c).robot1 == r3 || adList5.get(c).robot2 == r3 || adList5.get(c).robot3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList5.get(c).robot1;
                    r2 = adList5.get(c).robot2;
                    r3 = adList5.get(c).robot3;
                    strength = adList5.get(c).allianceLowStrength;
                    avgAutoFuel = adList5.get(c).avgAutoFuel;
                    avgTeleFuel = adList5.get(c).avgTeleFuel;
                    avgAutoGears = adList5.get(c).avgAutoGear;
                    avgTeleGears = adList5.get(c).avgTeleGear;
                    avgClimbs = adList5.get(c).avgTeleClimb;
                    alliance5.allianceHighStrength = adList5.get(c).allianceHighStrength;
                    alliance5.allianceLowStrength = adList5.get(c).allianceLowStrength;
                    alliance5.allianceRawStrength = adList5.get(c).allianceRawStrength;
                    alliance5.avgAutoGear = adList5.get(c).avgAutoGear;
                    alliance5.avgTeleGear = adList5.get(c).avgTeleGear;
                    alliance5.avgAutoFuel = adList5.get(c).avgAutoFuel;
                    alliance5.avgTeleFuel = adList5.get(c).avgTeleFuel;
                    alliance5.avgTeleClimb = adList5.get(c).avgTeleClimb;
                    alliance5.allianceNumber = 5;

                }
                c++;
                if (c >= adList5.size()) {
                    keepSearching = false;
                }
            }
        }
        predictedScore5.setText(String.format("%.1f",strength));
        avgAutoFuelText5.setText(String.format("%.1f",avgAutoFuel));
        avgTeleFuelText5.setText(String.format("%.1f", avgTeleFuel));
        avgAutoGearsText5.setText(String.format("%.1f", avgAutoGears));
        avgTeleGearsText5.setText(String.format("%.1f", avgTeleGears));
        avgClimbsText5.setText(String.format("%.1f", avgClimbs));
    }
    // Display Alliance 6 Stats
    public void getStrongestAlliance6() {
        // first sort alliances by strength
        Collections.sort(adList6, new Comparator<AllianceData>() {
            public int compare(AllianceData o1, AllianceData o2) {
                if (o1.allianceLowStrength == o2.allianceLowStrength)
                    return 0;
                return o1.allianceLowStrength > o2.allianceLowStrength ? -1 : 1;
            }
        });

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        double strength = 0.0;
        double avgAutoFuel = 0;
        double avgTeleFuel = 0;
        double avgAutoGears = 0;
        double avgTeleGears = 0;
        double avgClimbs = 0;
        // if there's three robots, show the score
        if (alliance6TextList.size() == 3) {
            // find highest matching alliance with all 3 robots in it
            // find highest matching alliance with robots 1 and 2 in it
            r1 = Integer.parseInt(alliance6TextList.get(0).getText().toString());
            r2 = Integer.parseInt(alliance6TextList.get(1).getText().toString());
            r3 = Integer.parseInt(alliance6TextList.get(2).getText().toString());

            // find highest matching alliance with robot 1 in it
            int c =0;
            boolean keepSearching = true;
            while (keepSearching == true) {
                if ((adList6.get(c).robot1 == r1 || adList6.get(c).robot2 == r1 || adList6.get(c).robot3 == r1) &&
                        (adList6.get(c).robot1 == r2 || adList6.get(c).robot2 == r2 || adList6.get(c).robot3 == r2) &&
                        (adList6.get(c).robot1 == r3 || adList6.get(c).robot2 == r3 || adList6.get(c).robot3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList6.get(c).robot1;
                    r2 = adList6.get(c).robot2;
                    r3 = adList6.get(c).robot3;
                    strength = adList6.get(c).allianceLowStrength;
                    avgAutoFuel = adList6.get(c).avgAutoFuel;
                    avgTeleFuel = adList6.get(c).avgTeleFuel;
                    avgAutoGears = adList6.get(c).avgAutoGear;
                    avgTeleGears = adList6.get(c).avgTeleGear;
                    avgClimbs = adList6.get(c).avgTeleClimb;
                    alliance6.allianceHighStrength = adList6.get(c).allianceHighStrength;
                    alliance6.allianceLowStrength = adList6.get(c).allianceLowStrength;
                    alliance6.allianceRawStrength = adList6.get(c).allianceRawStrength;
                    alliance6.avgAutoGear = adList6.get(c).avgAutoGear;
                    alliance6.avgTeleGear = adList6.get(c).avgTeleGear;
                    alliance6.avgAutoFuel = adList6.get(c).avgAutoFuel;
                    alliance6.avgTeleFuel = adList6.get(c).avgTeleFuel;
                    alliance6.avgTeleClimb = adList6.get(c).avgTeleClimb;
                    alliance6.allianceNumber = 6;

                }
                c++;
                if (c >= adList6.size()) {
                    keepSearching = false;
                }
            }
        }
        predictedScore6.setText(String.format("%.1f",strength));
        avgAutoFuelText6.setText(String.format("%.1f",avgAutoFuel));
        avgTeleFuelText6.setText(String.format("%.1f", avgTeleFuel));
        avgAutoGearsText6.setText(String.format("%.1f", avgAutoGears));
        avgTeleGearsText6.setText(String.format("%.1f", avgTeleGears));
        avgClimbsText6.setText(String.format("%.1f", avgClimbs));
    }
    // Display Alliance 7 Stats
    public void getStrongestAlliance7() {
        // first sort alliances by strength
        Collections.sort(adList7, new Comparator<AllianceData>() {
            public int compare(AllianceData o1, AllianceData o2) {
                if (o1.allianceLowStrength == o2.allianceLowStrength)
                    return 0;
                return o1.allianceLowStrength > o2.allianceLowStrength ? -1 : 1;
            }
        });

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        double strength = 0.0;
        double avgAutoFuel = 0;
        double avgTeleFuel = 0;
        double avgAutoGears = 0;
        double avgTeleGears = 0;
        double avgClimbs = 0;
        // if there's three robots, show the score
        if (alliance7TextList.size() == 3) {
            // find highest matching alliance with all 3 robots in it
            // find highest matching alliance with robots 1 and 2 in it
            r1 = Integer.parseInt(alliance7TextList.get(0).getText().toString());
            r2 = Integer.parseInt(alliance7TextList.get(1).getText().toString());
            r3 = Integer.parseInt(alliance7TextList.get(2).getText().toString());

            // find highest matching alliance with robot 1 in it
            int c =0;
            boolean keepSearching = true;
            while (keepSearching == true) {
                if ((adList7.get(c).robot1 == r1 || adList7.get(c).robot2 == r1 || adList7.get(c).robot3 == r1) &&
                        (adList7.get(c).robot1 == r2 || adList7.get(c).robot2 == r2 || adList7.get(c).robot3 == r2) &&
                        (adList7.get(c).robot1 == r3 || adList7.get(c).robot2 == r3 || adList7.get(c).robot3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList7.get(c).robot1;
                    r2 = adList7.get(c).robot2;
                    r3 = adList7.get(c).robot3;
                    strength = adList7.get(c).allianceLowStrength;
                    avgAutoFuel = adList7.get(c).avgAutoFuel;
                    avgTeleFuel = adList7.get(c).avgTeleFuel;
                    avgAutoGears = adList7.get(c).avgAutoGear;
                    avgTeleGears = adList7.get(c).avgTeleGear;
                    avgClimbs = adList7.get(c).avgTeleClimb;
                    alliance7.allianceHighStrength = adList7.get(c).allianceHighStrength;
                    alliance7.allianceLowStrength = adList7.get(c).allianceLowStrength;
                    alliance7.allianceRawStrength = adList7.get(c).allianceRawStrength;
                    alliance7.avgAutoGear = adList7.get(c).avgAutoGear;
                    alliance7.avgTeleGear = adList7.get(c).avgTeleGear;
                    alliance7.avgAutoFuel = adList7.get(c).avgAutoFuel;
                    alliance7.avgTeleFuel = adList7.get(c).avgTeleFuel;
                    alliance7.avgTeleClimb = adList7.get(c).avgTeleClimb;
                    alliance7.allianceNumber = 7;

                }
                c++;
                if (c >= adList7.size()) {
                    keepSearching = false;
                }
            }
        }
        predictedScore7.setText(String.format("%.1f",strength));
        avgAutoFuelText7.setText(String.format("%.1f",avgAutoFuel));
        avgTeleFuelText7.setText(String.format("%.1f", avgTeleFuel));
        avgAutoGearsText7.setText(String.format("%.1f", avgAutoGears));
        avgTeleGearsText7.setText(String.format("%.1f", avgTeleGears));
        avgClimbsText7.setText(String.format("%.1f", avgClimbs));
    }
    // Display Alliance 8 Stats
    public void getStrongestAlliance8() {
        // first sort alliances by strength
        Collections.sort(adList8, new Comparator<AllianceData>() {
            public int compare(AllianceData o1, AllianceData o2) {
                if (o1.allianceLowStrength == o2.allianceLowStrength)
                    return 0;
                return o1.allianceLowStrength > o2.allianceLowStrength ? -1 : 1;
            }
        });

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        double strength = 0.0;
        double avgAutoFuel = 0;
        double avgTeleFuel = 0;
        double avgAutoGears = 0;
        double avgTeleGears = 0;
        double avgClimbs = 0;
        // if there's three robots, show the score
        if (alliance8TextList.size() == 3) {
            // find highest matching alliance with all 3 robots in it
            // find highest matching alliance with robots 1 and 2 in it
            r1 = Integer.parseInt(alliance8TextList.get(0).getText().toString());
            r2 = Integer.parseInt(alliance8TextList.get(1).getText().toString());
            r3 = Integer.parseInt(alliance8TextList.get(2).getText().toString());

            // find highest matching alliance with robot 1 in it
            int c =0;
            boolean keepSearching = true;
            while (keepSearching == true) {
                if ((adList8.get(c).robot1 == r1 || adList8.get(c).robot2 == r1 || adList8.get(c).robot3 == r1) &&
                        (adList8.get(c).robot1 == r2 || adList8.get(c).robot2 == r2 || adList8.get(c).robot3 == r2) &&
                        (adList8.get(c).robot1 == r3 || adList8.get(c).robot2 == r3 || adList8.get(c).robot3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList8.get(c).robot1;
                    r2 = adList8.get(c).robot2;
                    r3 = adList8.get(c).robot3;
                    strength = adList8.get(c).allianceLowStrength;
                    avgAutoFuel = adList8.get(c).avgAutoFuel;
                    avgTeleFuel = adList8.get(c).avgTeleFuel;
                    avgAutoGears = adList8.get(c).avgAutoGear;
                    avgTeleGears = adList8.get(c).avgTeleGear;
                    avgClimbs = adList8.get(c).avgTeleClimb;
                    alliance8.allianceHighStrength = adList8.get(c).allianceHighStrength;
                    alliance8.allianceLowStrength = adList8.get(c).allianceLowStrength;
                    alliance8.allianceRawStrength = adList8.get(c).allianceRawStrength;
                    alliance8.avgAutoGear = adList8.get(c).avgAutoGear;
                    alliance8.avgTeleGear = adList8.get(c).avgTeleGear;
                    alliance8.avgAutoFuel = adList8.get(c).avgAutoFuel;
                    alliance8.avgTeleFuel = adList8.get(c).avgTeleFuel;
                    alliance8.avgTeleClimb = adList8.get(c).avgTeleClimb;
                    alliance8.allianceNumber = 8;

                }
                c++;
                if (c >= adList8.size()) {
                    keepSearching = false;
                }
            }
        }
        predictedScore8.setText(String.format("%.1f",strength));
        avgAutoFuelText8.setText(String.format("%.1f",avgAutoFuel));
        avgTeleFuelText8.setText(String.format("%.1f", avgTeleFuel));
        avgAutoGearsText8.setText(String.format("%.1f", avgAutoGears));
        avgTeleGearsText8.setText(String.format("%.1f", avgTeleGears));
        avgClimbsText8.setText(String.format("%.1f", avgClimbs));
    }

    // loop through available team list and place teams
    public void placeTeams() {
        int currNum = 0;
        currY = startY;
        //System.out.println("size of available team list = " + availableTeamTextList.size());
        Collections.sort(robotTextList, new Comparator<Text>() {
            public int compare(Text o1, Text o2) {
                if (Integer.parseInt(o1.getText()) == Integer.parseInt(o2.getText()))
                    return 0;
                return  Integer.parseInt(o1.getText())> Integer.parseInt(o2.getText()) ? 1 : -1;
            }
        });
        for (Text t : robotTextList) {
            currX = (currNum % columns)*incrX + startX;
            if (currNum % columns == 0) {
                currX = startX;
                currY += incrY;
            }
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void resetData(int allianceNumber) {
        if (allianceNumber == 1) {
            avgAutoGearsText1.setText("");
            avgTeleGearsText1.setText("");
            avgAutoFuelText1.setText("");
            avgTeleFuelText1.setText("");
            avgClimbsText1.setText("");
            predictedScore1.setText("");
        }
        if (allianceNumber == 2) {
            avgAutoGearsText2.setText("");
            avgTeleGearsText2.setText("");
            avgAutoFuelText2.setText("");
            avgTeleFuelText2.setText("");
            avgClimbsText2.setText("");
            predictedScore2.setText("");
        }
        if (allianceNumber == 3) {
            avgAutoGearsText3.setText("");
            avgTeleGearsText3.setText("");
            avgAutoFuelText3.setText("");
            avgTeleFuelText3.setText("");
            avgClimbsText3.setText("");
            predictedScore3.setText("");
        }
        if (allianceNumber == 4) {
            avgAutoGearsText4.setText("");
            avgTeleGearsText4.setText("");
            avgAutoFuelText4.setText("");
            avgTeleFuelText4.setText("");
            avgClimbsText4.setText("");
            predictedScore4.setText("");
        }
        if (allianceNumber == 5) {
            avgAutoGearsText5.setText("");
            avgTeleGearsText5.setText("");
            avgAutoFuelText5.setText("");
            avgTeleFuelText5.setText("");
            avgClimbsText5.setText("");
            predictedScore5.setText("");
        }
        if (allianceNumber == 6) {
            avgAutoGearsText6.setText("");
            avgTeleGearsText6.setText("");
            avgAutoFuelText6.setText("");
            avgTeleFuelText6.setText("");
            avgClimbsText6.setText("");
            predictedScore6.setText("");
        }
        if (allianceNumber == 7) {
            avgAutoGearsText7.setText("");
            avgTeleGearsText7.setText("");
            avgAutoFuelText7.setText("");
            avgTeleFuelText7.setText("");
            avgClimbsText7.setText("");
            predictedScore7.setText("");
        }
        if (allianceNumber == 8) {
            avgAutoGearsText8.setText("");
            avgTeleGearsText8.setText("");
            avgAutoFuelText8.setText("");
            avgTeleFuelText8.setText("");
            avgClimbsText8.setText("");
            predictedScore8.setText("");
        }
    }
    public void placeRobots() {
        int currNum = 0;
        currY = robotTextY + robotYOffset;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        Collections.sort(robotTextList, new Comparator<Text>() {
            public int compare(Text o1, Text o2) {
                if (Integer.parseInt(o1.getText()) == Integer.parseInt(o2.getText()))
                    return 0;
                return  Integer.parseInt(o1.getText())> Integer.parseInt(o2.getText()) ? 1 : -1;
            }
        });
        for (Text t : robotTextList) {
            currX = (currNum % robotColumns)*incrX + robotTextX;
            if (currNum % robotColumns == 0) {
                currX = robotTextX;
                currY += incrY;
            }
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance1() {
        int currNum = 0;
        currY = alliance1TextY + alliance1YOffset - 5;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        /* Collections.sort(alliance1TextList, new Comparator<Text>() {
            public int compare(Text o1, Text o2) {
                if (Integer.parseInt(o1.getText()) == Integer.parseInt(o2.getText()))
                    return 0;
                return  Integer.parseInt(o1.getText())> Integer.parseInt(o2.getText()) ? 1 : -1;
            }
        }); */
        for (Text t : alliance1TextList) {
            currX = currNum*incrX + alliance1TextX + 18;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance2() {
        int currNum = 0;
        currY = alliance2TextY + alliance2YOffset - 5;
        for (Text t : alliance2TextList) {
            currX = currNum*incrX + alliance2TextX + 18;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance3() {
        int currNum = 0;
        currY = alliance3TextY + alliance3YOffset - 5;
        for (Text t : alliance3TextList) {
            currX = currNum*incrX + alliance3TextX + 18;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance4() {
        int currNum = 0;
        currY = alliance4TextY + alliance4YOffset - 5;
        for (Text t : alliance4TextList) {
            currX = (currNum % alliance4Columns)*incrX + alliance4TextX + 18;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance5() {
        int currNum = 0;
        currY = alliance5TextY + alliance5YOffset - 5;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        for (Text t : alliance5TextList) {
            currX = (currNum % alliance5Columns)*incrX + alliance5TextX + 18;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance6() {
        int currNum = 0;
        currY = alliance6TextY + alliance6YOffset - 5;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        for (Text t : alliance6TextList) {
            currX = (currNum % alliance6Columns)*incrX + alliance6TextX + 18;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance7() {
        int currNum = 0;
        currY = alliance7TextY + alliance7YOffset - 5;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        for (Text t : alliance7TextList) {
            currX = (currNum % alliance7Columns)*incrX + alliance7TextX + 18;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance8() {
        int currNum = 0;
        currY = alliance8TextY + alliance8YOffset - 5;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        for (Text t : alliance8TextList) {
            currX = (currNum % alliance8Columns)*incrX + alliance8TextX + 18;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    // given a robot number string, return the text
    public Text getTextObject (String robotNumber) {
        // check all three lists
        for (Text t : alliance1TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        // check all three lists
        for (Text t : alliance2TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        for (Text t : alliance3TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        for (Text t : alliance4TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        for (Text t : alliance5TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        for (Text t : alliance6TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        for (Text t : alliance7TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        for (Text t : alliance8TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        for (Text t : robotTextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumber)) {
                return t;
            }
        }
        return null;
    }
    public boolean isInRobotTextList (String robotNumberString) {
        for (Text t : robotTextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }
    public boolean isInAlliance1 (String robotNumberString) {
        // check all three lists
        // check all three lists
        for (Text t : alliance1TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }

    public boolean isInAlliance2 (String robotNumberString) {
        // check all three lists
        // check all three lists
        for (Text t : alliance2TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }
    public boolean isInAlliance3 (String robotNumberString) {
        // check all three lists
        // check all three lists
        for (Text t : alliance3TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }
    public boolean isInAlliance4 (String robotNumberString) {
        // check all three lists
        // check all three lists
        for (Text t : alliance4TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }
    public boolean isInAlliance5 (String robotNumberString) {
        // check all three lists
        // check all three lists
        for (Text t : alliance5TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }
    public boolean isInAlliance6 (String robotNumberString) {
        // check all three lists
        // check all three lists
        for (Text t : alliance6TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }
    public boolean isInAlliance7 (String robotNumberString) {
        // check all three lists
        // check all three lists
        for (Text t : alliance7TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }
    public boolean isInAlliance8 (String robotNumberString) {
        // check all three lists
        // check all three lists
        for (Text t : alliance8TextList) {
            if (t.getText().toString().equalsIgnoreCase(robotNumberString)) {
                return true;
            }
        }

        return false;
    }


    // check the robot list to see if we have a robot already with the given number
    public boolean haveRobot(int robotNumber) {
        for (RobotData r : robotList) {
            if (r.robotNumber == robotNumber) {
                return true;
            }
        }
        return false;
    }

    // get the robot with the given robotNumber from the list
    // or return null
    public RobotData getRobot(int robotNumber) {

        for (RobotData r : robotList) {
            if (r.robotNumber == robotNumber) {
                return r;
            }
        }
        return null;
    }

    public void getRanks() {
        // rank the robots based on average alliance score
        ArrayList<RobotData> rankList = new ArrayList<RobotData>();
        for (RobotData r : robotList) {
            rankList.add(r);
        }

        Collections.sort(rankList, new Comparator<RobotData>() {
            public int compare(RobotData o1, RobotData o2) {
                if (o1.lowShots.avg == o2.lowShots.avg)
                    return 0;
                return o1.lowShots.avg > o2.lowShots.avg ? -1 : 1;
            }
        });
        // now loop through the lists and set the rank based on avg score
        for (int c = 0; c < rankList.size(); c++) {
            if (c > 0) {
                int prev_rank = getRobot(rankList.get(c-1).robotNumber).autoLowShots.rank;
                if (getRobot(rankList.get(c).robotNumber).autoLowShots.avg < getRobot(rankList.get(c-1).robotNumber).autoLowShots.avg) {
                    getRobot(rankList.get(c).robotNumber).autoLowShots.rank = prev_rank + 1;
                } else {
                    getRobot(rankList.get(c).robotNumber).autoLowShots.rank = prev_rank;
                }
            } else {
                getRobot(rankList.get(c).robotNumber).autoLowShots.rank = 1;
            }
        }

        for (int c = 0; c < rankList.size(); c++) {
            if (c > 0) {
                int prev_rank = getRobot(rankList.get(c-1).robotNumber).autoHighShots.rank;
                if (getRobot(rankList.get(c).robotNumber).autoHighShots.avg < getRobot(rankList.get(c-1).robotNumber).autoHighShots.avg) {
                    getRobot(rankList.get(c).robotNumber).autoHighShots.rank = prev_rank + 1;
                } else {
                    getRobot(rankList.get(c).robotNumber).autoHighShots.rank = prev_rank;
                }
            } else {
                getRobot(rankList.get(c).robotNumber).autoHighShots.rank = 1;
            }
        }

        for (int c = 0; c < rankList.size(); c++) {
            if (c > 0) {
                int prev_rank = getRobot(rankList.get(c-1).robotNumber).lowShots.rank;
                if (getRobot(rankList.get(c).robotNumber).lowShots.avg < getRobot(rankList.get(c-1).robotNumber).lowShots.avg) {
                    getRobot(rankList.get(c).robotNumber).lowShots.rank = prev_rank + 1;
                } else {
                    getRobot(rankList.get(c).robotNumber).lowShots.rank = prev_rank;
                }
            } else {
                getRobot(rankList.get(c).robotNumber).lowShots.rank = 1;
            }
        }

        Collections.sort(rankList, new Comparator<RobotData>() {
            public int compare(RobotData o1, RobotData o2) {
                if (o1.highShots.avg == o2.highShots.avg)
                    return 0;
                return o1.highShots.avg > o2.highShots.avg ? -1 : 1;
            }
        });
        // now loop through the lists and set the rank based on avg score
        for (int c = 0; c < rankList.size(); c++) {
            if (c > 0) {
                int prev_rank = getRobot(rankList.get(c-1).robotNumber).highShots.rank;
                if (getRobot(rankList.get(c).robotNumber).highShots.avg < getRobot(rankList.get(c-1).robotNumber).highShots.avg) {
                    getRobot(rankList.get(c).robotNumber).highShots.rank = prev_rank + 1;
                } else {
                    getRobot(rankList.get(c).robotNumber).highShots.rank = prev_rank;
                }
            } else {
                getRobot(rankList.get(c).robotNumber).highShots.rank = 1;
            }
        }
        Collections.sort(rankList, new Comparator<RobotData>() {
            public int compare(RobotData o1, RobotData o2) {
                if (o1.autoCross.avg == o2.autoCross.avg)
                    return 0;
                return o1.autoCross.avg > o2.autoCross.avg ? -1 : 1;
            }
        });
        // now loop through the lists and set the rank based on avg score
        for (int c = 0; c < rankList.size(); c++) {
            getRobot(rankList.get(c).robotNumber).autoCross.rank = c + 1;
        }
        for (int c = 0; c < rankList.size(); c++) {
            if (c > 0) {
                int prev_rank = getRobot(rankList.get(c-1).robotNumber).autoCross.rank;
                if (getRobot(rankList.get(c).robotNumber).autoCross.avg < getRobot(rankList.get(c-1).robotNumber).autoCross.avg) {
                    getRobot(rankList.get(c).robotNumber).autoCross.rank = prev_rank + 1;
                } else {
                    getRobot(rankList.get(c).robotNumber).autoCross.rank = prev_rank;
                }
            } else {
                getRobot(rankList.get(c).robotNumber).autoCross.rank = 1;
            }
        }

        Collections.sort(rankList, new Comparator<RobotData>() {
            public int compare(RobotData o1, RobotData o2) {
                if (o1.autoGears.avg == o2.autoGears.avg)
                    return 0;
                return o1.autoGears.avg > o2.autoGears.avg ? -1 : 1;
            }
        });
        // now loop through the lists and set the rank based on avg score
        for (int c = 0; c < rankList.size(); c++) {
            if (c > 0) {
                int prev_rank = getRobot(rankList.get(c-1).robotNumber).autoGears.rank;
                if (getRobot(rankList.get(c).robotNumber).autoGears.avg < getRobot(rankList.get(c-1).robotNumber).autoGears.avg) {
                    getRobot(rankList.get(c).robotNumber).autoGears.rank = prev_rank + 1;
                } else {
                    getRobot(rankList.get(c).robotNumber).autoGears.rank = prev_rank;
                }
            } else {
                getRobot(rankList.get(c).robotNumber).autoGears.rank = 1;
            }
        }
        Collections.sort(rankList, new Comparator<RobotData>() {
            public int compare(RobotData o1, RobotData o2) {
                if (o1.gears.avg == o2.gears.avg)
                    return 0;
                return o1.gears.avg > o2.gears.avg ? -1 : 1;
            }
        });
        // now loop through the lists and set the rank based on avg score
        for (int c = 0; c < rankList.size(); c++) {
            if (c > 0) {
                int prev_rank = getRobot(rankList.get(c-1).robotNumber).gears.rank;
                if (getRobot(rankList.get(c).robotNumber).gears.avg < getRobot(rankList.get(c-1).robotNumber).gears.avg) {
                    getRobot(rankList.get(c).robotNumber).gears.rank = prev_rank + 1;
                } else {
                    getRobot(rankList.get(c).robotNumber).gears.rank = prev_rank;
                }
            } else {
                getRobot(rankList.get(c).robotNumber).gears.rank = 1;
            }
        }

        Collections.sort(rankList, new Comparator<RobotData>() {
            public int compare(RobotData o1, RobotData o2) {
                if (o1.climb.avg == o2.climb.avg)
                    return 0;
                return o1.climb.avg > o2.climb.avg ? -1 : 1;
            }
        });
        // now loop through the lists and set the rank based on avg score
        for (int c = 0; c < rankList.size(); c++) {
            if (c > 0) {
                int prev_rank = getRobot(rankList.get(c-1).robotNumber).climb.rank;
                if (getRobot(rankList.get(c).robotNumber).climb.avg < getRobot(rankList.get(c-1).robotNumber).climb.avg) {
                    getRobot(rankList.get(c).robotNumber).climb.rank = prev_rank + 1;
                } else {
                    getRobot(rankList.get(c).robotNumber).climb.rank = prev_rank;
                }
            } else {
                getRobot(rankList.get(c).robotNumber).climb.rank = 1;
            }
        }
    }

    public void getDataFromDB() {

        // make directory if not found
       /* File dataSheetDirFile = new File(dataSheetDir);
        if (dataSheetDirFile.exists() == false) {
            dataSheetDirFile.mkdir();
        } */

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("My SQL JDBC Driver Not Registered?");
            e.printStackTrace();
            return;
        }
        System.out.println("Getting Data from SQL Database");

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/roborebels", "root", "roborebels1153");
            Statement stmt;
            ResultSet rs;

            //create hashmap of data
            stmt = conn.createStatement();

            //get match table, then create robots
            rs = stmt.executeQuery("SELECT * from matchdata");

            //process Data
            RobotData rd;
            while (rs.next()) {
                int rn = rs.getInt("RobotNumber");
                String matchName = rs.getString("matchNumber");
                Integer matchNumber = Integer.parseInt(matchName);

                if (haveRobot(rn)) {
                    // check to see if we have this match number already, if not, add it to the list and increase
                    // number of matches
                    if (getRobot(rn).matchList.contains(matchNumber) == false) {
                        getRobot(rn).matches++;
                        getRobot(rn).matchList.add(matchNumber);
                    }
                } else {
                    rd = new RobotData();
                    rd.robotNumber = rn;
                    rd.matches = 1;
                    rd.matchList.add(matchNumber);
                    robotList.add(rd);

                }
            }
            rs.close();
            rs = stmt.executeQuery("SELECT * from matchdata");
            while (rs.next()) {
                int rn = rs.getInt("RobotNumber");
                if (haveRobot(rn)) {
                    String gameEvent = rs.getString("gameEvent");
                    if (gameEvent.equals("crossBaselineAuto")){getRobot(rn).autoCross.total++;}
                    if (gameEvent.equals("climbed")){getRobot(rn).climb.total++;}
                    if (gameEvent.equals("gearPlacedAuto")){getRobot(rn).autoGears.total++;}
                    if (gameEvent.equals("gearPlacedTeleop")){getRobot(rn).teleGears.total++;}
                    if (gameEvent.equals("lowGoal")){getRobot(rn).lowShots.total++;}
                    if (gameEvent.equals("highGoal")){getRobot(rn).highShots.total++;}
                    if (gameEvent.equals("lowGoalAuto")){getRobot(rn).autoLowShots.total++;}
                    if (gameEvent.equals("highGoalAuto")){getRobot(rn).autoHighShots.total++;}
                    if (gameEvent.equals("gearPlacedTeleop") || gameEvent.equals("gearPlacedAuto")){getRobot(rn).gears.total++;}

                }
            }
            rs.close();
            stmt.close();

            //averages
            for (RobotData r : robotList) {
                r.autoLowShots.avg = (double) r.autoLowShots.total / r.matches;
                r.autoHighShots.avg = (double) r.autoHighShots.total / r.matches;
                r.autoCross.avg = (double) r.autoCross.total / r.matches;
                r.autoGears.avg = (double) r.autoGears.total / r.matches;
                r.teleGears.avg = (double) r.teleGears.total / r.matches;
                r.climb.avg = (double) r.climb.total / r.matches;
                r.gears.avg = (double) r.gears.total / r.matches;
                r.lowShots.avg = (double) r.lowShots.total / r.matches;
                r.highShots.avg = (double) r.highShots.total / r.matches;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        getRanks();



        for (RobotData r : robotList) {
            teamList.add(r.robotNumber);
        }

        //System.out.println("Got " + teamList.size() + " robots");

        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        AllianceData ad = new AllianceData();
                        ad.robot1 = t1;
                        ad.robot2 = t2;
                        ad.robot3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg);
                        ad.avgAutoGear = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength();
                        adList1.add(ad);
                    }
                }
            }
        }

        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        AllianceData ad = new AllianceData();
                        ad.robot1 = t1;
                        ad.robot2 = t2;
                        ad.robot3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength();
                        adList2.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        AllianceData ad = new AllianceData();
                        ad.robot1 = t1;
                        ad.robot2 = t2;
                        ad.robot3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength();
                        adList3.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        AllianceData ad = new AllianceData();
                        ad.robot1 = t1;
                        ad.robot2 = t2;
                        ad.robot3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength();
                        adList4.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        AllianceData ad = new AllianceData();
                        ad.robot1 = t1;
                        ad.robot2 = t2;
                        ad.robot3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength();
                        adList5.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        AllianceData ad = new AllianceData();
                        ad.robot1 = t1;
                        ad.robot2 = t2;
                        ad.robot3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength();
                        adList6.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        AllianceData ad = new AllianceData();
                        ad.robot1 = t1;
                        ad.robot2 = t2;
                        ad.robot3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength();
                        adList7.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        AllianceData ad = new AllianceData();
                        ad.robot1 = t1;
                        ad.robot2 = t2;
                        ad.robot3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength();
                        adList8.add(ad);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
