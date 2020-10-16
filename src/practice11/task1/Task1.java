package practice11.task1;

import javafx.scene.control.*;
import javafx.scene.*;

import javafx.event.*;
import javafx.application.Application;

import javafx.stage.*;


public class Task1 extends Application {

    Group master = new Group ( );

    private static int i_counter = 0;
    private static int i_guess = ( int ) ( Math.random ( ) * 20 );
    private static int i_input = 0;

    Button button = new Button ( "Press!" );
    TextField textField = new TextField ( );
    Label label = new Label ( );
    Scene scene = new Scene ( master , 225 , 75 );

    EventHandler < ActionEvent > eventHandler = new EventHandler < ActionEvent > ( ) {
        @Override
        public void handle ( ActionEvent actionEvent ) {
            i_input = Integer.parseInt ( textField.getText ( ) );
            i_counter++;
            if ( i_counter < 3 ) {
                if ( i_input != i_guess ) {
                    if ( i_input < i_guess ) {
                        label.setText ( "Input<Num" + " (" + ( i_counter + 1 ) + "/3)" );
                    } else {
                        label.setText ( "Input>Num" + " (" + ( i_counter + 1 ) + "/3)" );
                    }
                } else {
                    label.setText ( "You won! Press for exit" );
                    i_counter = 4;
                }
            } else {
                if ( i_counter == 3 ) {
                    if ( i_input != i_guess ) {
                        label.setText ( "You lost! Press for exit" );
                    } else {
                        label.setText ( "You won! Press for exit" );
                    }
                } else {
                    System.exit ( 0 );
                }
            }
        }
    };

    public static void main ( String[] args ) {
        launch ( args );
    }

    @Override
    public void start ( Stage stage ) throws Exception {

        stage.setTitle ( "Guess!" );
        stage.setScene ( scene );


        textField.setLayoutX ( 5 );
        textField.setLayoutY ( 5 );
        button.setLayoutX ( 5 );
        button.setLayoutY ( 40 );

        label.setLayoutX ( 70 );
        label.setLayoutY ( 45 );
        label.setText ( "Write and press!" + " (1/3)" );

        button.setOnAction ( eventHandler );

        System.out.println ( i_guess );

        master.getChildren ( ).addAll ( textField , button , label );

        stage.show ( );
    }
}