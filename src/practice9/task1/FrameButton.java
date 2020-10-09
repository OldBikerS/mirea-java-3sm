package practice9.task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameButton extends JFrame {

    public FrameButton ( String[] args ) {
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        setSize ( 600 , 600 );
        setResizable ( false );
        JPanel panel = new JPanel ( );
        JButton button = new JButton ( "Get Random Shapes?" );
        button.setSize ( 100 , 500 );
        panel.add ( button );
        ActionListener actionListener = new ActionListener ( ) {
            @Override
            public void actionPerformed ( ActionEvent e ) {
                Main.main ( args );
            }
        };
        button.addActionListener ( actionListener );
        add ( panel );
        setVisible ( true );
    }

    public static void main ( String[] args ) {
        new FrameButton ( args );
    }

}
