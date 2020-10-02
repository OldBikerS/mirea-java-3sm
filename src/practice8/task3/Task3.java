package practice8.task3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Task3 extends JFrame {
    JPanel pnl = new JPanel ( );

    public Task3 ( ) {
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        setSize ( 800 , 400 );
        setVisible ( true );
        Graphics g;
        Image img;
        ArrayList < Image > images = new ArrayList <> ( );
        String namepackage = "D:\\2020\\mirea-java-3sm\\src\\practice8\\task3";
        for ( int i = 0 ; i <= 3 ; i++ ) {

            String filename = namepackage + i + ".png";
            images.add ( new ImageIcon ( filename ).getImage ( ) );
        }
        while ( true ) {
            for ( int i = 0 ; i <= 3 ; i++ ) {
                img = images.get ( i );
                g = getGraphics ( );
                g.drawImage ( img , 0 , 0 , 800 , 400 , null );
                try {
                    Thread.sleep ( 1000 );
                } catch ( InterruptedException e ) {
                }
            }
        }
    }
}
