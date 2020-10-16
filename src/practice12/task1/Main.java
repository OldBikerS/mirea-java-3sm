package practice12.task1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.Math;

public class Main extends Application {
    private static Planet mercury = new Planet ( "Mercury" , 3.285 * Math.pow ( 10 , 23 ) , 2440 );
    private static Planet venus = new Planet ( "Venus" , 4.867 * Math.pow ( 10 , 24 ) , 6052 );
    private static Planet earth = new Planet ( "Earth" , 5.972 * Math.pow ( 10 , 24 ) , 6371 );
    private static Planet mars = new Planet ( "Mars" , 6.39 * Math.pow ( 10 , 23 ) , 3390 );
    private static Planet jupiter = new Planet ( "Jupiter" , 1.898 * Math.pow ( 10 , 27 ) , 69911 );
    private static Planet saturn = new Planet ( "Saturn" , 5.683 * Math.pow ( 10 , 26 ) , 58232 );
    private static Planet uranus = new Planet ( "Uranus" , 8.681 * Math.pow ( 10 , 25 ) , 25362 );
    private static Planet neptune = new Planet ( "Neptune" , 1.024 * Math.pow ( 10 , 26 ) , 24622 );
    private static FlowPane root;

    public static void main ( String[] args ) {
        Application.launch ( args );
    }

    @Override
    public void start ( Stage stage ) {
        root = new FlowPane ( );

        Scene scene = new Scene ( root );
        stage.setTitle ( "Planets" );
        stage.setWidth ( 535 );
        stage.setHeight ( 100 );
        stage.setScene ( scene );
        setPlanets ( );
        stage.show ( );

    }

    private void setPlanets ( ) {
        root.getChildren ( ).add ( new Text ( "Planets:" ) );

        Region lineBreak = new Region ( );
        lineBreak.setPrefSize ( Double.MAX_VALUE , 0.0 );
        root.getChildren ( ).add ( lineBreak );

        root.getChildren ( ).add ( mercury );
        root.getChildren ( ).add ( venus );
        root.getChildren ( ).add ( earth );
        root.getChildren ( ).add ( mars );
        root.getChildren ( ).add ( jupiter );
        root.getChildren ( ).add ( saturn );
        root.getChildren ( ).add ( uranus );
        root.getChildren ( ).add ( neptune );

    }
}