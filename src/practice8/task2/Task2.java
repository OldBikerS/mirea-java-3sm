package practice8.task2;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {
    public static void main ( String[] args ) {
        Task2 task2 = new Task2 ( );
        task2.getImage ( );
    }

    public void getImage ( ) {
        setTitle ( "Task2-Foto" );
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        setSize ( 800 , 1450 );
        setVisible ( true );
        Graphics g;
        Image img;
        img = new ImageIcon ( "D:\\2020\\mirea-java-3sm\\src\\practice8\\task2\\foto.jpg" ).getImage ( );
        g = getGraphics ( );
        g.drawImage ( img , 0 , 0 , null );
    }
}
