package practice9.task1;

import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle ( double x , double y , double width , double height , Color color ) {
        super ( x , y , color );
        this.width = width;
        this.height = height;
        addOnPane ( );
    }

    public void addOnPane ( ) {
        javafx.scene.shape.Rectangle rect = new javafx.scene.shape.Rectangle ( x , y , width , height );
        rect.setFill ( color );
        Main.root.getChildren ( ).add ( rect );
    }

    public double getWidth ( ) {
        return width;
    }

    public double getHeight ( ) {
        return height;
    }
}