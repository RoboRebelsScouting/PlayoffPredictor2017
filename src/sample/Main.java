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
    public List<Alliance1Data> adList1 = new ArrayList<Alliance1Data>();
    public List<Alliance2Data> adList2 = new ArrayList<Alliance2Data>();
    public List<Alliance3Data> adList3 = new ArrayList<Alliance3Data>();
    public List<Alliance4Data> adList4 = new ArrayList<Alliance4Data>();
    public List<Alliance5Data> adList5 = new ArrayList<Alliance5Data>();
    public List<Alliance6Data> adList6 = new ArrayList<Alliance6Data>();
    public List<Alliance7Data> adList7 = new ArrayList<Alliance7Data>();
    public List<Alliance8Data> adList8 = new ArrayList<Alliance8Data>();
    public List<AllianceTextData> actualList = new ArrayList<AllianceTextData>();
    public List<Integer> teamList = new ArrayList<Integer>();

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
    public int avgAutoFuel1Y = 83;
    public int avgTeleFuel1X = 556;
    public int avgTeleFuel1Y = 83;
    public int avgAutoGears1X = 650;
    public int avgAutoGears1Y = 83;
    public int avgTeleGears1X = 753;
    public int avgTeleGears1Y = 83;
    public int avgClimbs1X = 838;
    public int avgClimbs1Y = 83;

    public int avgAutoFuel2X = 462;
    public int avgAutoFuel2Y = 160;
    public int avgTeleFuel2X = 556;
    public int avgTeleFuel2Y = 160;
    public int avgAutoGears2X = 650;
    public int avgAutoGears2Y = 160;
    public int avgTeleGears2X = 753;
    public int avgTeleGears2Y = 160;
    public int avgClimbs2X = 838;
    public int avgClimbs2Y = 160;

    public int avgAutoFuel3X = 462;
    public int avgAutoFuel3Y = 231;
    public int avgTeleFuel3X = 556;
    public int avgTeleFuel3Y = 231;
    public int avgAutoGears3X = 650;
    public int avgAutoGears3Y = 231;
    public int avgTeleGears3X = 753;
    public int avgTeleGears3Y = 231;
    public int avgClimbs3X = 838;
    public int avgClimbs3Y = 231;

    public int avgAutoFuel4X = 462;
    public int avgAutoFuel4Y = 309;
    public int avgTeleFuel4X = 556;
    public int avgTeleFuel4Y = 309;
    public int avgAutoGears4X = 650;
    public int avgAutoGears4Y = 309;
    public int avgTeleGears4X = 753;
    public int avgTeleGears4Y = 309;
    public int avgClimbs4X = 838;
    public int avgClimbs4Y = 309;

    public int avgAutoFuel5X = 462;
    public int avgAutoFuel5Y = 383;
    public int avgTeleFuel5X = 556;
    public int avgTeleFuel5Y = 383;
    public int avgAutoGears5X = 650;
    public int avgAutoGears5Y = 383;
    public int avgTeleGears5X = 753;
    public int avgTeleGears5Y = 383;
    public int avgClimbs5X = 838;
    public int avgClimbs5Y = 383;

    public int avgAutoFuel6X = 462;
    public int avgAutoFuel6Y = 458;
    public int avgTeleFuel6X = 556;
    public int avgTeleFuel6Y = 458;
    public int avgAutoGears6X = 650;
    public int avgAutoGears6Y = 458;
    public int avgTeleGears6X = 753;
    public int avgTeleGears6Y = 458;
    public int avgClimbs6X = 838;
    public int avgClimbs6Y = 458;

    public int avgAutoFuel7X = 462;
    public int avgAutoFuel7Y = 535;
    public int avgTeleFuel7X = 556;
    public int avgTeleFuel7Y = 535;
    public int avgAutoGears7X = 650;
    public int avgAutoGears7Y = 535;
    public int avgTeleGears7X = 753;
    public int avgTeleGears7Y = 535;
    public int avgClimbs7X = 838;
    public int avgClimbs7Y = 535;

    public int avgAutoFuel8X = 462;
    public int avgAutoFuel8Y = 608;
    public int avgTeleFuel8X = 556;
    public int avgTeleFuel8Y = 608;
    public int avgAutoGears8X = 650;
    public int avgAutoGears8Y = 608;
    public int avgTeleGears8X = 753;
    public int avgTeleGears8Y = 608;
    public int avgClimbs8X = 838;
    public int avgClimbs8Y = 608;

    public int predictedScore1X = 353;
    public int predictedScore1Y = 83;

    public int predictedScore2X = 353;
    public int predictedScore2Y = 160;

    public int predictedScore3X = 353;
    public int predictedScore3Y = 231;

    public int predictedScore4X = 353;
    public int predictedScore4Y = 309;

    public int predictedScore5X = 353;
    public int predictedScore5Y = 383;

    public int predictedScore6X = 353;
    public int predictedScore6Y = 458;

    public int predictedScore7X = 353;
    public int predictedScore7Y = 535;

    public int predictedScore8X = 353;
    public int predictedScore8Y = 608;

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
    public int alliance2TextY = 125;
    public int alliance2TextX = 150;
    public int alliance3TextY = 200;
    public int alliance3TextX = 150;
    public int alliance4TextY = 275;
    public int alliance4TextX = 150;
    public int alliance5TextY = 350;
    public int alliance5TextX = 150;
    public int alliance6TextY = 425;
    public int alliance6TextX = 150;
    public int alliance7TextY = 500;
    public int alliance7TextX = 150;
    public int alliance8TextY = 575;
    public int alliance8TextX = 150;
    public int robotTextY = 50;
    public int robotTextX = 5;

    public int startX = 18;
    public int startY = 45;
    public int incrX = 60;
    public int incrY = 27;
    public int currX = startX;
    public int currY = startY;
    public int columns = 2;
    public int robotColumns = 2;
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
        bracket.setLayoutX(785);
        bracket.setLayoutY(620);
        bracket.setPrefSize(125, 10);
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
                        alliance1Label.setStyle("-fx-font: 20 cambria");
                        alliance1Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance1Label, 0, 0);

                        Text alliance1Score = new Text("");
                        alliance1Score.setStyle("-fx-font: 15 cambria");
                        alliance1Score.setFill(Color.RED);
                        bracket.add(alliance1Score, 0, 1);
                        alliance1Score.setText(predictedScore1.getText().toString());

                        Text A1VA8 = new Text ("Vs.");
                        A1VA8.setStyle("-fx-font: 15 cambria");
                        bracket.add(A1VA8, 0, 2);

                        Text alliance8Label = new Text("Alliance 8");
                        alliance8Label.setStyle("-fx-font: 20 cambria");
                        alliance8Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance8Label, 0, 3);

                        Text alliance8Score = new Text("");
                        alliance8Score.setStyle("-fx-font: 15 cambria");
                        alliance8Score.setFill(Color.RED);
                        bracket.add(alliance8Score, 0, 4);
                        alliance8Score.setText(predictedScore8.getText().toString());

                        Text alliance3Label = new Text("Alliance 3");
                        alliance3Label.setStyle("-fx-font: 20 cambria");
                        alliance3Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance3Label, 0, 6);

                        Text alliance3Score = new Text("");
                        alliance3Score.setStyle("-fx-font: 15 cambria");
                        alliance3Score.setFill(Color.RED);
                        bracket.add(alliance3Score, 0, 7);
                        alliance3Score.setText(predictedScore3.getText().toString());

                        Text A3VA6 = new Text ("Vs.");
                        A3VA6.setStyle("-fx-font: 15 cambria");
                        bracket.add(A3VA6, 0, 8);

                        Text alliance6Label = new Text("Alliance 6");
                        alliance6Label.setStyle("-fx-font: 20 cambria");
                        alliance6Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance6Label, 0, 9);

                        Text alliance6Score = new Text("");
                        alliance6Score.setStyle("-fx-font: 15 cambria");
                        alliance6Score.setFill(Color.RED);
                        bracket.add(alliance6Score, 0, 10);
                        alliance6Score.setText(predictedScore6.getText().toString());

                        Text alliance2Label = new Text("Alliance 2");
                        alliance2Label.setStyle("-fx-font: 20 cambria");
                        alliance2Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance2Label, 0, 12);

                        Text alliance2Score = new Text("");
                        alliance2Score.setStyle("-fx-font: 15 cambria");
                        alliance2Score.setFill(Color.RED);
                        bracket.add(alliance2Score, 0, 13);
                        alliance2Score.setText(predictedScore2.getText().toString());

                        Text A2VA7 = new Text ("Vs.");
                        A2VA7.setStyle("-fx-font: 15 cambria");
                        bracket.add(A2VA7, 0, 14);

                        Text alliance7Label = new Text("Alliance 7");
                        alliance7Label.setStyle("-fx-font: 20 cambria");
                        alliance7Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance7Label, 0, 15);

                        Text alliance7Score = new Text("");
                        alliance7Score.setStyle("-fx-font: 15 cambria");
                        alliance7Score.setFill(Color.RED);
                        bracket.add(alliance7Score, 0, 16);
                        alliance7Score.setText(predictedScore7.getText().toString());

                        Text alliance4Label = new Text("Alliance 4");
                        alliance4Label.setStyle("-fx-font: 20 cambria");
                        alliance4Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance4Label, 0, 18);

                        Text alliance4Score = new Text("");
                        alliance4Score.setStyle("-fx-font: 15 cambria");
                        alliance4Score.setFill(Color.RED);
                        bracket.add(alliance4Score, 0, 19);
                        alliance4Score.setText(predictedScore4.getText().toString());

                        Text A4VA5 = new Text ("Vs.");
                        A4VA5.setStyle("-fx-font: 15 cambria");
                        bracket.add(A4VA5, 0, 20);

                        Text alliance5Label = new Text("Alliance 5");
                        alliance5Label.setStyle("-fx-font: 20 cambria");
                        alliance5Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(alliance5Label, 0, 21);

                        Text alliance5Score = new Text("");
                        alliance5Score.setStyle("-fx-font: 15 cambria");
                        alliance5Score.setFill(Color.RED);
                        bracket.add(alliance5Score, 0, 22);
                        alliance5Score.setText(predictedScore5.getText().toString());

                        Text A1vA8Label = new Text ("");
                        A1vA8Label.setStyle("-fx-font: 20 cambria");
                        A1vA8Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(A1vA8Label, 3, 2);
                        Text A1vA8Score = new Text ("");
                        A1vA8Score.setStyle("-fx-font: 15 cambria");
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
                        A3vA6Label.setStyle("-fx-font: 20 cambria");
                        A3vA6Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(A3vA6Label, 3, 8);
                        Text A3vA6Score = new Text ("");
                        A3vA6Score.setStyle("-fx-font: 15 cambria");
                        A3vA6Score.setFill(Color.RED);
                        bracket.add(A3vA6Score, 3, 9);
                        if (Double.parseDouble(alliance3Score.getText().toString()) >= (Double.parseDouble(alliance6Score.getText().toString()))){
                            A3vA6Label.setText(alliance3Label.getText().toString());
                            A3vA6Score.setText(predictedScore3.getText().toString());
                        } else if (Double.parseDouble(alliance3Score.getText().toString()) <= (Double.parseDouble(alliance6Score.getText().toString()))){
                            A3vA6Label.setText(alliance6Label.getText().toString());
                            A3vA6Score.setText(predictedScore6.getText().toString());
                        }

                        Text A7vA2Label = new Text ("");
                        A7vA2Label.setStyle("-fx-font: 20 cambria");
                        bracket.add(A7vA2Label, 3, 14);
                        A7vA2Label.setFill(Color.MEDIUMBLUE);
                        Text A7vA2Score = new Text ("");
                        A7vA2Score.setStyle("-fx-font: 15 cambria");
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
                        A4vA5Label.setStyle("-fx-font: 20 cambria");
                        bracket.add(A4vA5Label, 3, 20);
                        A4vA5Label.setFill(Color.MEDIUMBLUE);
                        Text A4vA5Score = new Text ("");
                        A4vA5Score.setStyle("-fx-font: 15 cambria");
                        A4vA5Score.setFill(Color.RED);
                        bracket.add(A4vA5Score, 3, 21);
                        if (Double.parseDouble(alliance4Score.getText().toString()) >= (Double.parseDouble(alliance5Score.getText().toString()))){
                            A4vA5Label.setText(alliance4Label.getText().toString());
                            A4vA5Score.setText(predictedScore4.getText().toString());
                        } else if (Double.parseDouble(alliance4Score.getText().toString()) <= (Double.parseDouble(alliance5Score.getText().toString()))){
                            A4vA5Label.setText(alliance5Label.getText().toString());
                            A4vA5Score.setText(predictedScore5.getText().toString());
                        }

                        Text vs21 = new Text ("Vs.");
                        vs21.setStyle("-fx-font: 15 cambria");
                        bracket.add(vs21, 3, 6);

                        Text vs22 = new Text ("Vs.");
                        vs22.setStyle("-fx-font: 15 cambria");
                        bracket.add(vs22, 3, 18);

                        Text f1Label = new Text ("");
                        f1Label.setStyle("-fx-font: 20 cambria");
                        f1Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(f1Label, 5, 6);
                        Text f1Score = new Text ("");
                        f1Score.setStyle("-fx-font: 15 cambria");
                        f1Score.setFill(Color.RED);
                        bracket.add(f1Score, 5,7);
                        if (Double.parseDouble(A1vA8Score.getText().toString()) >= (Double.parseDouble(A3vA6Score.getText().toString()))){
                            f1Label.setText(A1vA8Label.getText().toString());
                            f1Score.setText(A1vA8Score.getText().toString());
                        } else if (Double.parseDouble(A1vA8Score.getText().toString()) <= (Double.parseDouble(A3vA6Score.getText().toString()))){
                            f1Label.setText(A3vA6Label.getText().toString());
                            f1Score.setText(A3vA6Score.getText().toString());
                        }

                        Text f2Label = new Text ("");
                        f2Label.setStyle("-fx-font: 20 cambria");
                        f2Label.setFill(Color.MEDIUMBLUE);
                        bracket.add(f2Label, 5, 18);
                        Text f2Score = new Text ("");
                        f2Score.setStyle("-fx-font: 15 cambria");
                        f2Score.setFill(Color.RED);
                        bracket.add(f2Score, 5, 19);
                        if (Double.parseDouble(A7vA2Score.getText().toString()) >= (Double.parseDouble(A4vA5Score.getText().toString()))){
                            f2Label.setText(A7vA2Label.getText().toString());
                            f2Score.setText(A7vA2Score.getText().toString());
                        } else if (Double.parseDouble(A7vA2Score.getText().toString()) <= (Double.parseDouble(A4vA5Score.getText().toString()))){
                            f1Label.setText(A4vA5Label.getText().toString());
                            f1Score.setText(A4vA5Score.getText().toString());
                        }

                         Text wLabel = new Text ("");
                        wLabel.setStyle("-fx-font: 20 cambria");
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
        if (adList2.size() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Database is empty");
            alert.setHeaderText("Check the SQL database");
            alert.showAndWait();
            exit();
        }
        if (adList3.size() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Database is empty");
            alert.setHeaderText("Check the SQL database");
            alert.showAndWait();
            exit();
        }
        if (adList4.size() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Database is empty");
            alert.setHeaderText("Check the SQL database");
            alert.showAndWait();
            exit();
        }
        if (adList5.size() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Database is empty");
            alert.setHeaderText("Check the SQL database");
            alert.showAndWait();
            exit();
        }
        if (adList6.size() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Database is empty");
            alert.setHeaderText("Check the SQL database");
            alert.showAndWait();
            exit();
        }
        if (adList7.size() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Database is empty");
            alert.setHeaderText("Check the SQL database");
            alert.showAndWait();
            exit();
        }
        if (adList8.size() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Database is empty");
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

        final Rectangle alliance1Rect = new Rectangle(alliance1TextX, alliance1TextY, 160, 50);
        alliance1Rect.setFill(null);
        alliance1Rect.setStroke(Color.MEDIUMBLUE);
        alliance1Rect.toBack();
        root.getChildren().add(alliance1Rect);

        final TextFlow alliance1Target = new TextFlow(
        );
        alliance1Target.setLayoutX(alliance1TextX);
        alliance1Target.setLayoutY(alliance1TextY);
        alliance1Target.setPrefSize(160,50);
        alliance1Target.toBack();

        final Rectangle alliance2Rect = new Rectangle(alliance2TextX, alliance2TextY, 160, 50);
        alliance2Rect.setFill(null);
        alliance2Rect.setStroke(Color.MEDIUMBLUE);
        alliance2Rect.toBack();
        root.getChildren().add(alliance2Rect);

        final TextFlow alliance2Target = new TextFlow(
        );
        alliance2Target.setLayoutX(alliance2TextX);
        alliance2Target.setLayoutY(alliance2TextY);
        alliance2Target.setPrefSize(160,50);
        alliance2Target.toBack();

        final Rectangle alliance3Rect = new Rectangle(alliance3TextX, alliance3TextY, 160, 50);
        alliance3Rect.setFill(null);
        alliance3Rect.setStroke(Color.MEDIUMBLUE);
        alliance3Rect.toBack();
        root.getChildren().add(alliance3Rect);

        final TextFlow alliance3Target = new TextFlow(
        );
        alliance3Target.setLayoutX(alliance3TextX);
        alliance3Target.setLayoutY(alliance3TextY);
        alliance3Target.setPrefSize(160,50);
        alliance3Target.toBack();

        final Rectangle alliance4Rect = new Rectangle(alliance4TextX, alliance4TextY, 160, 50);
        alliance4Rect.setFill(null);
        alliance4Rect.setStroke(Color.MEDIUMBLUE);
        alliance4Rect.toBack();
        root.getChildren().add(alliance4Rect);

        final TextFlow alliance4Target = new TextFlow(
        );
        alliance4Target.setLayoutX(alliance4TextX);
        alliance4Target.setLayoutY(alliance4TextY);
        alliance4Target.setPrefSize(160,50);
        alliance4Target.toBack();

        final Rectangle alliance5Rect = new Rectangle(alliance5TextX, alliance5TextY, 160, 50);
        alliance5Rect.setFill(null);
        alliance5Rect.setStroke(Color.MEDIUMBLUE);
        alliance5Rect.toBack();
        root.getChildren().add(alliance5Rect);

        final TextFlow alliance5Target = new TextFlow(
        );
        alliance5Target.setLayoutX(alliance5TextX);
        alliance5Target.setLayoutY(alliance5TextY);
        alliance5Target.setPrefSize(160,50);
        alliance5Target.toBack();

        final Rectangle alliance6Rect = new Rectangle(alliance6TextX, alliance6TextY, 160, 50);
        alliance6Rect.setFill(null);
        alliance6Rect.setStroke(Color.MEDIUMBLUE);
        alliance6Rect.toBack();
        root.getChildren().add(alliance6Rect);

        final TextFlow alliance6Target = new TextFlow(
        );
        alliance6Target.setLayoutX(alliance6TextX);
        alliance6Target.setLayoutY(alliance6TextY);
        alliance6Target.setPrefSize(160,50);
        alliance6Target.toBack();

        final Rectangle alliance7Rect = new Rectangle(alliance7TextX, alliance7TextY, 160, 50);
        alliance7Rect.setFill(null);
        alliance7Rect.setStroke(Color.MEDIUMBLUE);
        alliance7Rect.toBack();
        root.getChildren().add(alliance7Rect);

        final TextFlow alliance7Target = new TextFlow(
        );
        alliance7Target.setLayoutX(alliance7TextX);
        alliance7Target.setLayoutY(alliance7TextY);
        alliance7Target.setPrefSize(160,50);
        alliance7Target.toBack();

        final Rectangle alliance8Rect = new Rectangle(alliance8TextX, alliance8TextY, 160, 50);
        alliance8Rect.setFill(null);
        alliance8Rect.setStroke(Color.MEDIUMBLUE);
        alliance8Rect.toBack();
        root.getChildren().add(alliance8Rect);

        final TextFlow alliance8Target = new TextFlow(
        );
        alliance8Target.setLayoutX(alliance8TextX);
        alliance8Target.setLayoutY(alliance8TextY);
        alliance8Target.setPrefSize(160,50);
        alliance8Target.toBack();

        //final Text allianceTargetText = new Text(allianceTextX, allianceTextY+15,"Add to Alliance");

        Collections.sort(teamList);

        // create text for each team
        for (int teamNum : teamList) {
            //System.out.println(teamNum);
            Text teamText = new Text(0,0,Integer.toString(teamNum));
            teamText.setStyle("-fx-font: 18 cambria");
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
                        placeAlliance2();

                    } else if (isInAlliance1(t.getText())) {
                        alliance1TextList.remove(t);
                        placeAlliance1();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
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
                //System.out.println("dragedDropped");
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
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
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
                        placeAlliance1();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
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
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        placeAlliance2();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
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
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        placeAlliance3();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
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
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        placeAlliance3();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
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
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
                        placeAlliance7();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
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
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        placeAlliance6();

                    } else if (isInRobotTextList(t.getText())) {
                        robotTextList.remove(t);
                        placeRobots();

                    }  else if (isInAlliance8(t.getText())) {
                        alliance8TextList.remove(t);
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
                        placeAlliance1();

                    } else if (isInAlliance2(t.getText())) {
                        alliance2TextList.remove(t);
                        placeAlliance2();

                    } else if (isInAlliance3(t.getText())) {
                        alliance3TextList.remove(t);
                        placeAlliance3();

                    } else if (isInAlliance4(t.getText())) {
                        alliance4TextList.remove(t);
                        placeAlliance4();

                    } else if (isInAlliance5(t.getText())) {
                        alliance5TextList.remove(t);
                        placeAlliance5();

                    } else if (isInAlliance6(t.getText())) {
                        alliance6TextList.remove(t);
                        placeAlliance6();

                    } else if (isInAlliance7(t.getText())) {
                        alliance7TextList.remove(t);
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
        Collections.sort(adList1, new Comparator<Alliance1Data>() {
            public int compare(Alliance1Data o1, Alliance1Data o2) {
                if (o1.alliance1Strength == o2.alliance1Strength)
                    return 0;
                return o1.alliance1Strength > o2.alliance1Strength ? -1 : 1;
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
                if ((adList1.get(c).robot1A1 == r1 || adList1.get(c).robot2A1 == r1 || adList1.get(c).robot3A1 == r1) &&
                        (adList1.get(c).robot1A1 == r2 || adList1.get(c).robot2A1 == r2 || adList1.get(c).robot3A1 == r2) &&
                        (adList1.get(c).robot1A1 == r3 || adList1.get(c).robot2A1 == r3 || adList1.get(c).robot3A1 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList1.get(c).robot1A1;
                    r2 = adList1.get(c).robot2A1;
                    r3 = adList1.get(c).robot3A1;
                    strength = adList1.get(c).alliance1Strength;
                    avgAutoFuel = adList1.get(c).avgAutoFuel1;
                    avgTeleFuel = adList1.get(c).avgTeleFuel1;
                    avgAutoGears = adList1.get(c).avgAutoGear1;
                    avgTeleGears = adList1.get(c).avgTeleGear1;
                    avgClimbs = adList1.get(c).avgTeleClimb1;
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
        Collections.sort(adList2, new Comparator<Alliance2Data>() {
            public int compare(Alliance2Data o1, Alliance2Data o2) {
                if (o1.alliance2Strength == o2.alliance2Strength)
                    return 0;
                return o1.alliance2Strength > o2.alliance2Strength ? -1 : 1;
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
                if ((adList2.get(c).robot1A2 == r1 || adList2.get(c).robot2A2 == r1 || adList2.get(c).robot3A2 == r1) &&
                        (adList2.get(c).robot1A2 == r2 || adList2.get(c).robot2A2 == r2 || adList2.get(c).robot3A2 == r2) &&
                        (adList2.get(c).robot1A2 == r3 || adList2.get(c).robot2A2 == r3 || adList2.get(c).robot3A2 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList2.get(c).robot1A2;
                    r2 = adList2.get(c).robot2A2;
                    r3 = adList2.get(c).robot3A2;
                    strength = adList2.get(c).alliance2Strength;
                    avgAutoFuel = adList2.get(c).avgAutoFuel2;
                    avgTeleFuel = adList2.get(c).avgTeleFuel2;
                    avgAutoGears = adList2.get(c).avgAutoGear2;
                    avgTeleGears = adList2.get(c).avgTeleGear2;
                    avgClimbs = adList2.get(c).avgTeleClimb2;

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
        Collections.sort(adList3, new Comparator<Alliance3Data>() {
            public int compare(Alliance3Data o1, Alliance3Data o2) {
                if (o1.alliance3Strength == o2.alliance3Strength)
                    return 0;
                return o1.alliance3Strength > o2.alliance3Strength ? -1 : 1;
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
                if ((adList3.get(c).robot1A3 == r1 || adList3.get(c).robot2A3 == r1 || adList3.get(c).robot3A3 == r1) &&
                        (adList3.get(c).robot1A3 == r2 || adList3.get(c).robot2A3 == r2 || adList3.get(c).robot3A3 == r2) &&
                        (adList3.get(c).robot1A3 == r3 || adList3.get(c).robot2A3 == r3 || adList3.get(c).robot3A3 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList3.get(c).robot1A3;
                    r2 = adList3.get(c).robot2A3;
                    r3 = adList3.get(c).robot3A3;
                    strength = adList3.get(c).alliance3Strength;
                    avgAutoFuel = adList3.get(c).avgAutoFuel3;
                    avgTeleFuel = adList3.get(c).avgTeleFuel3;
                    avgAutoGears = adList3.get(c).avgAutoGear3;
                    avgTeleGears = adList3.get(c).avgTeleGear3;
                    avgClimbs = adList3.get(c).avgTeleClimb3;

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
        Collections.sort(adList4, new Comparator<Alliance4Data>() {
            public int compare(Alliance4Data o1, Alliance4Data o2) {
                if (o1.alliance4Strength == o2.alliance4Strength)
                    return 0;
                return o1.alliance4Strength > o2.alliance4Strength ? -1 : 1;
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
                if ((adList4.get(c).robot1A4 == r1 || adList4.get(c).robot2A4 == r1 || adList4.get(c).robot3A4 == r1) &&
                        (adList4.get(c).robot1A4 == r2 || adList4.get(c).robot2A4 == r2 || adList4.get(c).robot3A4 == r2) &&
                        (adList4.get(c).robot1A4 == r3 || adList4.get(c).robot2A4 == r3 || adList4.get(c).robot3A4 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList4.get(c).robot1A4;
                    r2 = adList4.get(c).robot2A4;
                    r3 = adList4.get(c).robot3A4;
                    strength = adList4.get(c).alliance4Strength;
                    avgAutoFuel = adList4.get(c).avgAutoFuel4;
                    avgTeleFuel = adList4.get(c).avgTeleFuel4;
                    avgAutoGears = adList4.get(c).avgAutoGear4;
                    avgTeleGears = adList4.get(c).avgTeleGear4;
                    avgClimbs = adList4.get(c).avgTeleClimb4;

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
        Collections.sort(adList5, new Comparator<Alliance5Data>() {
            public int compare(Alliance5Data o1, Alliance5Data o2) {
                if (o1.alliance5Strength == o2.alliance5Strength)
                    return 0;
                return o1.alliance5Strength > o2.alliance5Strength ? -1 : 1;
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
                if ((adList5.get(c).robot1A5 == r1 || adList5.get(c).robot2A5 == r1 || adList5.get(c).robot3A5 == r1) &&
                        (adList5.get(c).robot1A5 == r2 || adList5.get(c).robot2A5 == r2 || adList5.get(c).robot3A5 == r2) &&
                        (adList5.get(c).robot1A5 == r3 || adList5.get(c).robot2A5 == r3 || adList5.get(c).robot3A5 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList5.get(c).robot1A5;
                    r2 = adList5.get(c).robot2A5;
                    r3 = adList5.get(c).robot3A5;
                    strength = adList5.get(c).alliance5Strength;
                    avgAutoFuel = adList5.get(c).avgAutoFuel5;
                    avgTeleFuel = adList5.get(c).avgTeleFuel5;
                    avgAutoGears = adList5.get(c).avgAutoGear5;
                    avgTeleGears = adList5.get(c).avgTeleGear5;
                    avgClimbs = adList5.get(c).avgTeleClimb5;

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
        Collections.sort(adList6, new Comparator<Alliance6Data>() {
            public int compare(Alliance6Data o1, Alliance6Data o2) {
                if (o1.alliance6Strength == o2.alliance6Strength)
                    return 0;
                return o1.alliance6Strength > o2.alliance6Strength ? -1 : 1;
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
                if ((adList6.get(c).robot1A6 == r1 || adList6.get(c).robot2A6 == r1 || adList6.get(c).robot3A6 == r1) &&
                        (adList6.get(c).robot1A6 == r2 || adList6.get(c).robot2A6 == r2 || adList6.get(c).robot3A6 == r2) &&
                        (adList6.get(c).robot1A6 == r3 || adList6.get(c).robot2A6 == r3 || adList6.get(c).robot3A6 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList6.get(c).robot1A6;
                    r2 = adList6.get(c).robot2A6;
                    r3 = adList6.get(c).robot3A6;
                    strength = adList6.get(c).alliance6Strength;
                    avgAutoFuel = adList6.get(c).avgAutoFuel6;
                    avgTeleFuel = adList6.get(c).avgTeleFuel6;
                    avgAutoGears = adList6.get(c).avgAutoGear6;
                    avgTeleGears = adList6.get(c).avgTeleGear6;
                    avgClimbs = adList6.get(c).avgTeleClimb6;

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
        Collections.sort(adList7, new Comparator<Alliance7Data>() {
            public int compare(Alliance7Data o1, Alliance7Data o2) {
                if (o1.alliance7Strength == o2.alliance7Strength)
                    return 0;
                return o1.alliance7Strength > o2.alliance7Strength ? -1 : 1;
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
                if ((adList7.get(c).robot1A7 == r1 || adList7.get(c).robot2A7 == r1 || adList7.get(c).robot3A7 == r1) &&
                        (adList7.get(c).robot1A7 == r2 || adList7.get(c).robot2A7 == r2 || adList7.get(c).robot3A7 == r2) &&
                        (adList7.get(c).robot1A7 == r3 || adList7.get(c).robot2A7 == r3 || adList7.get(c).robot3A7 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList7.get(c).robot1A7;
                    r2 = adList7.get(c).robot2A7;
                    r3 = adList7.get(c).robot3A7;
                    strength = adList7.get(c).alliance7Strength;
                    avgAutoFuel = adList7.get(c).avgAutoFuel7;
                    avgTeleFuel = adList7.get(c).avgTeleFuel7;
                    avgAutoGears = adList7.get(c).avgAutoGear7;
                    avgTeleGears = adList7.get(c).avgTeleGear7;
                    avgClimbs = adList7.get(c).avgTeleClimb7;

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
        Collections.sort(adList8, new Comparator<Alliance8Data>() {
            public int compare(Alliance8Data o1, Alliance8Data o2) {
                if (o1.alliance8Strength == o2.alliance8Strength)
                    return 0;
                return o1.alliance8Strength > o2.alliance8Strength ? -1 : 1;
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
                if ((adList8.get(c).robot1A8 == r1 || adList8.get(c).robot2A8 == r1 || adList8.get(c).robot3A8 == r1) &&
                        (adList8.get(c).robot1A8 == r2 || adList8.get(c).robot2A8 == r2 || adList8.get(c).robot3A8 == r2) &&
                        (adList8.get(c).robot1A8 == r3 || adList8.get(c).robot2A8 == r3 || adList8.get(c).robot3A8 == r3)) {
                    keepSearching = false;
                    // set all of the robot numbers
                    r1 = adList8.get(c).robot1A8;
                    r2 = adList8.get(c).robot2A8;
                    r3 = adList8.get(c).robot3A8;
                    strength = adList8.get(c).alliance8Strength;
                    avgAutoFuel = adList8.get(c).avgAutoFuel8;
                    avgTeleFuel = adList8.get(c).avgTeleFuel8;
                    avgAutoGears = adList8.get(c).avgAutoGear8;
                    avgTeleGears = adList8.get(c).avgTeleGear8;
                    avgClimbs = adList8.get(c).avgTeleClimb8;

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
        currY = alliance1TextY + alliance1YOffset;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        /* Collections.sort(alliance1TextList, new Comparator<Text>() {
            public int compare(Text o1, Text o2) {
                if (Integer.parseInt(o1.getText()) == Integer.parseInt(o2.getText()))
                    return 0;
                return  Integer.parseInt(o1.getText())> Integer.parseInt(o2.getText()) ? 1 : -1;
            }
        }); */
        for (Text t : alliance1TextList) {
            currX = currNum*incrX + alliance1TextX;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance2() {
        int currNum = 0;
        currY = alliance2TextY + alliance2YOffset;
        for (Text t : alliance2TextList) {
            currX = currNum*incrX + alliance2TextX;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance3() {
        int currNum = 0;
        currY = alliance3TextY + alliance3YOffset;
        for (Text t : alliance3TextList) {
            currX = currNum*incrX + alliance3TextX;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance4() {
        int currNum = 0;
        currY = alliance4TextY + alliance4YOffset;
        for (Text t : alliance4TextList) {
            currX = (currNum % alliance4Columns)*incrX + alliance4TextX;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance5() {
        int currNum = 0;
        currY = alliance5TextY + alliance5YOffset;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        for (Text t : alliance5TextList) {
            currX = (currNum % alliance5Columns)*incrX + alliance5TextX;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance6() {
        int currNum = 0;
        currY = alliance6TextY + alliance6YOffset;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        for (Text t : alliance6TextList) {
            currX = (currNum % alliance6Columns)*incrX + alliance6TextX;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance7() {
        int currNum = 0;
        currY = alliance7TextY + alliance7YOffset;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        for (Text t : alliance7TextList) {
            currX = (currNum % alliance7Columns)*incrX + alliance7TextX;
            t.setX(currX);
            t.setY(currY);
            currNum++;
        }
    }
    public void placeAlliance8() {
        int currNum = 0;
        currY = alliance8TextY + alliance8YOffset;
        //System.out.println("size of picked team list = " + pickedTeamTextList.size());
        for (Text t : alliance8TextList) {
            currX = (currNum % alliance8Columns)*incrX + alliance8TextX;
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
                        Alliance1Data ad = new Alliance1Data();
                        ad.robot1A1 = t1;
                        ad.robot2A1 = t2;
                        ad.robot3A1 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel1 = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel1 = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear1 = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear1 = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb1 = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength1();
                        adList1.add(ad);
                    }
                }
            }
        }

        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        Alliance2Data ad = new Alliance2Data();
                        ad.robot1A2 = t1;
                        ad.robot2A2 = t2;
                        ad.robot3A2 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel2 = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel2 = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear2 = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear2 = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb2 = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength2();
                        adList2.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        Alliance3Data ad = new Alliance3Data();
                        ad.robot1A3 = t1;
                        ad.robot2A3 = t2;
                        ad.robot3A3 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel3 = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel3 = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear3 = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear3 = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb3 = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength3();
                        adList3.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        Alliance4Data ad = new Alliance4Data();
                        ad.robot1A4 = t1;
                        ad.robot2A4 = t2;
                        ad.robot3A4 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel4 = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel4 = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear4 = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear4 = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb4 = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength4();
                        adList4.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        Alliance5Data ad = new Alliance5Data();
                        ad.robot1A5 = t1;
                        ad.robot2A5 = t2;
                        ad.robot3A5 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel5 = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel5 = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear5 = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear5 = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb5 = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength5();
                        adList5.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        Alliance6Data ad = new Alliance6Data();
                        ad.robot1A6 = t1;
                        ad.robot2A6 = t2;
                        ad.robot3A6 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel6 = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel6 = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear6 = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear6 = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb6 = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength6();
                        adList6.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        Alliance7Data ad = new Alliance7Data();
                        ad.robot1A7 = t1;
                        ad.robot2A7 = t2;
                        ad.robot3A7 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel7 = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel7 = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear7 = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear7 = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb7 = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength7();
                        adList7.add(ad);
                    }
                }
            }
        }
        for (Integer t1 : teamList) {
            for (Integer t2 : teamList) {
                for (Integer t3 : teamList) {
                    if (t1 != t3 && t3 != t2 && t1 != t2) {
                        Alliance8Data ad = new Alliance8Data();
                        ad.robot1A8 = t1;
                        ad.robot2A8 = t2;
                        ad.robot3A8 = t3;

                        // create the combined averages
                        // in auto low shots are worth 1/3 point, high shots = 1pt
                        ad.avgAutoFuel8 = (getRobot(t1).autoLowShots.avg + getRobot(t2).autoLowShots.avg + getRobot(t3).autoLowShots.avg) / 3 +
                                (getRobot(t1).autoHighShots.avg + getRobot(t2).autoHighShots.avg + getRobot(t3).autoHighShots.avg);
                        ad.avgTeleFuel8 = (getRobot(t1).lowShots.avg + getRobot(t2).lowShots.avg + getRobot(t3).lowShots.avg) / 9 +
                                (getRobot(t1).highShots.avg + getRobot(t2).highShots.avg + getRobot(t3).highShots.avg) / 3;
                        ad.avgAutoGear8 = getRobot(t1).autoGears.avg + getRobot(t2).autoGears.avg + getRobot(t3).autoGears.avg;
                        ad.avgTeleGear8 = getRobot(t1).teleGears.avg + getRobot(t2).teleGears.avg + getRobot(t3).teleGears.avg;
                        ad.avgTeleClimb8 = getRobot(t1).climb.avg + getRobot(t2).climb.avg + getRobot(t3).climb.avg;

                        ad.calcStrength8();
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
