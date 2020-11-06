package practice12.task1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
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
        root.getChildren ( ).add ( new Text( "Planets:" ) );

        Region lineBreak = new Region();
        lineBreak.setPrefSize(Double.MAX_VALUE, 0.0);
        root.getChildren().add (lineBreak);

        for(Planet planet : Planet.values()) {
            Button planetButton = new Button();
            planetButton.setText(planet.name);
            planetButton.setOnAction ( new EventHandler<ActionEvent>( ) {
                public void handle ( ActionEvent event ) {
                    Alert alert = new Alert ( Alert.AlertType.INFORMATION );
                    alert.setHeaderText ( "Gravitation " + planet.name );
                    alert.setContentText ( String.valueOf ( planet.gravitation ) );
                    alert.show ( );
                }
            } );
            root.getChildren().add(planetButton);
        }
    }
}