package practice12.task1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public enum Planet {
    Mercury("Mercury" , 3.285 * Math.pow ( 10 , 23 ) , 2440),
    Venus("Venus" , 4.867 * Math.pow ( 10 , 24 ) , 6052 ),
    Earth("Earth" , 5.972 * Math.pow ( 10 , 24 ) , 6371 ),
    Mars( "Mars" , 6.39 * Math.pow ( 10 , 23 ) , 3390 ),
    Jupiter ( "Jupiter" , 1.898 * Math.pow ( 10 , 27 ) , 69911 ),
    Saturn ("Saturn" , 5.683 * Math.pow ( 10 , 26 ) , 58232 ),
    Uranus ("Uranus" , 8.681 * Math.pow ( 10 , 25 ) , 25362 ),
    Neptune("Neptune" , 1.024 * Math.pow ( 10 , 26 ) , 24622 );

    private final double G = 0.0000000000667;
    public String name;
    public double mass;
    public double radius;
    public double gravitation;

    Planet(final String name , double mass , double radius ) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        setGravitation();
    }

    private void setGravitation ( ) {
        gravitation = ( G * mass ) / ( radius * radius ); // gravitation formula
    }
}