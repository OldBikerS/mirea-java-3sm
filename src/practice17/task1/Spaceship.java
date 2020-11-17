package practice17.task1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.Math.abs;
import static java.lang.Math.random;

public class Spaceship extends Application{




    boolean bool_easy = false;

    String codeStringEasy = "DIGIT6";

    Timer timer;

    ActionListener actionListener;

    int timer_time;

    int count_frameLaser = 0;

    float condition_ship_Right=0;

    int int_lose_condition= 0;//0..5

    int int_play_Red = 0;
    int int_play_Yellow = 0;
    int int_play_Blue = 0;
    int int_play_Green = 0;
    int int_play_White = 0;

    boolean bool_meteor_Red = true;
    boolean bool_meteor_Yellow = true;
    boolean bool_meteor_Blue = true;
    boolean bool_meteor_Green = true;
    boolean bool_meteor_White = true;

    TranslateTransition translateTransition_boom=new TranslateTransition();

    TranslateTransition translateTransition_ship=new TranslateTransition();

    TranslateTransition translateTransition_laserRed=new TranslateTransition();
    TranslateTransition translateTransition_laserYellow=new TranslateTransition();
    TranslateTransition translateTransition_laserBlue=new TranslateTransition();
    TranslateTransition translateTransition_laserGreen=new TranslateTransition();
    TranslateTransition translateTransition_laserWhite=new TranslateTransition();

    TranslateTransition translateTransition_meteorRed=new TranslateTransition();
    TranslateTransition translateTransition_meteorYellow=new TranslateTransition();
    TranslateTransition translateTransition_meteorBlue=new TranslateTransition();
    TranslateTransition translateTransition_meteorGreen=new TranslateTransition();
    TranslateTransition translateTransition_meteorWhite=new TranslateTransition();

    TranslateTransition translateTransition_frameLaser=new TranslateTransition();


    private HashMap<String,Boolean> currentlyActiveKeys=new HashMap<>();
    CurrentWorkingDirectory currentWorkingDirectory=new CurrentWorkingDirectory();



    TranslateTransition translateTransition_rules=new TranslateTransition();
    TranslateTransition translateTransition_buttonPlay=new TranslateTransition();
    TranslateTransition translateTransition_buttonEasy=new TranslateTransition();
    TranslateTransition translateTransition_buttonNoEasy=new TranslateTransition();
    TranslateTransition translateTransition_gameOver=new TranslateTransition();



    //play_condition
    boolean play_condition=true;


    @Override
    public void start(Stage stage) throws FileNotFoundException{
        //Creating an image
        Image image_table=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("table.png")));

        Image image_boom=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("boom.png")));

        Image image_ship=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("ship.png")));




        Image image_laserRed=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("laserRed.png")));
        Image image_laserYellow=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("laserYellow.png")));
        Image image_laserBlue=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("laserBlue.png")));
        Image image_laserGreen=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("laserGreen.png")));
        Image image_laserWhite=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("laserWhite.png")));

        Image image_meteorRed=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("meteorRed.png")));
        Image image_meteorYellow=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("meteorYellow.png")));
        Image image_meteorBlue=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("meteorBlue.png")));
        Image image_meteorGreen=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("meteorGreen.png")));
        Image image_meteorWhite=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("meteorWhite.png")));

        Image image_frameLaser=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("frameLaser.png")));




        Image image_cursor=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("cursor.png")));







        Image image_rules=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("rules.png")));
        Image image_buttonPlay=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("buttonPlay.png")));
        Image image_buttonEasy=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("buttonEasy.png")));
        Image image_buttonNoEasy=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("buttonNoEasy.png")));
        Image image_gameOver=new Image(new FileInputStream(currentWorkingDirectory.getPathFile("gameOver.png")));



        //float flX= (float)(random()*100000000 % ((690-(232/2))));// -(690-(232/2)/2);
        //System.out.println(flX);

        //Setting the image view 3
        ImageView imageView_boom=new ImageView(image_boom);

        //Setting the position of the image
        imageView_boom.setX(690/2-800/2);
        imageView_boom.setY(1220);

        //Setting the image view 3
        ImageView imageView_gameOver=new ImageView(image_gameOver);

        //Setting the position of the image
        imageView_gameOver.setX(690/2-600/2);
        imageView_gameOver.setY(1220/2-700/2);


        //Setting the image view 3
        ImageView imageView_buttonEasy=new ImageView(image_buttonEasy);

        //Setting the position of the image
        imageView_buttonEasy.setX(690-85);
        imageView_buttonEasy.setY(1220-80);

        //Setting the image view 3
        ImageView imageView_buttonNoEasy=new ImageView(image_buttonNoEasy);

        //Setting the position of the image
        imageView_buttonNoEasy.setX(690-85);
        imageView_buttonNoEasy.setY(1220-80);







        //Setting the image view 3
        ImageView imageView_meteorRed=new ImageView(image_meteorRed);
        //Setting the position of the image
        imageView_meteorRed.setX((690/2)-(176/2)-5);//flX);//((690/2)-(176/2));//252
        imageView_meteorRed.setY(1220-200);

        //Setting the image view 3
        ImageView imageView_meteorYellow=new ImageView(image_meteorYellow);
        //Setting the position of the image
        imageView_meteorYellow.setX((690/2)-(176/2)-5);//flX);//((690/2)-(176/2));
        imageView_meteorYellow.setY(1220-200);

        //Setting the image view 3
        ImageView imageView_meteorBlue=new ImageView(image_meteorBlue);
        //Setting the position of the image
        imageView_meteorBlue.setX((690/2)-(176/2)-5);//flX);//((690/2)-(176/2));
        imageView_meteorBlue.setY(1220-200);

        //Setting the image view 3
        ImageView imageView_meteorGreen=new ImageView(image_meteorGreen);
        //Setting the position of the image
        imageView_meteorGreen.setX((690/2)-(176/2)-5);//flX);//((690/2)-(176/2));
        imageView_meteorGreen.setY(1220-200);

        //Setting the image view 3
        ImageView imageView_meteorWhite=new ImageView(image_meteorWhite);
        //Setting the position of the image
        imageView_meteorWhite.setX((690/2)-(176/2)-5);//flX);//((690/2)-(176/2));
        imageView_meteorWhite.setY(1220-200);




        //Setting the image view 3
        ImageView imageView_frameLaser=new ImageView(image_frameLaser);
        //Setting the position of the image
        imageView_frameLaser.setX(0);//flX);//((690/2)-(176/2));
        imageView_frameLaser.setY(1220-77);








        //Setting the image view 3
        ImageView imageView_laserRed=new ImageView(image_laserRed);

        //Setting the position of the image
        imageView_laserRed.setX((690/2)-(176/2)-5);
        imageView_laserRed.setY(1220-200);

        //Setting the image view 3
        ImageView imageView_laserYellow=new ImageView(image_laserYellow);

        //Setting the position of the image
        imageView_laserYellow.setX((690/2)-(176/2)-5);
        imageView_laserYellow.setY(1220-200);

        //Setting the image view 3
        ImageView imageView_laserBlue=new ImageView(image_laserBlue);

        //Setting the position of the image
        imageView_laserBlue.setX((690/2)-(176/2)-5);
        imageView_laserBlue.setY(1220-200);

        //Setting the image view 3
        ImageView imageView_laserGreen=new ImageView(image_laserGreen);

        //Setting the position of the image
        imageView_laserGreen.setX((690/2)-(176/2)-5);
        imageView_laserGreen.setY(1220-200);

        //Setting the image view 3
        ImageView imageView_laserWhite=new ImageView(image_laserWhite);

        //Setting the position of the image
        imageView_laserWhite.setX((690/2)-(176/2)-5);
        imageView_laserWhite.setY(1220-200);









        //Setting the image view 3
        ImageView imageView_ship=new ImageView(image_ship);

        //Setting the position of the image
        imageView_ship.setX((690/2)-(176/2));
        imageView_ship.setY(1220-200);








        //Setting the image view 1
        ImageView imageView_table=new ImageView(image_table);

        //Setting the position of the image
        imageView_table.setX(0);
        imageView_table.setY(0);

        //setting the fit height and width of the image view
        //imageView1.setFitHeight(300);
        //imageView1.setFitWidth(250);

        //Setting the preserve ratio of the image view
        imageView_table.setPreserveRatio(true);











        //Setting the image view 3
        ImageView imageView_rules=new ImageView(image_rules);
        imageView_rules.setX(690/2-626/2);
        imageView_rules.setY(1220/2-416/2);
        ImageView imageView_buttonPlay=new ImageView(image_buttonPlay);

        //Setting the position of the image
        imageView_buttonPlay.setX(690/2-626/2);
        imageView_buttonPlay.setY(1220/2-416/2);


        //Setting the node for the transition

        translateTransition_boom.setNode(imageView_boom);

        translateTransition_ship.setNode(imageView_ship);




        translateTransition_laserRed.setNode(imageView_laserRed);
        translateTransition_laserYellow.setNode(imageView_laserYellow);
        translateTransition_laserBlue.setNode(imageView_laserBlue);
        translateTransition_laserGreen.setNode(imageView_laserGreen);
        translateTransition_laserWhite.setNode(imageView_laserWhite);

        translateTransition_meteorRed.setNode(imageView_meteorRed);
        translateTransition_meteorYellow.setNode(imageView_meteorYellow);
        translateTransition_meteorBlue.setNode(imageView_meteorBlue);
        translateTransition_meteorGreen.setNode(imageView_meteorGreen);
        translateTransition_meteorWhite.setNode(imageView_meteorWhite);

        translateTransition_frameLaser.setNode(imageView_frameLaser);







        translateTransition_rules.setNode(imageView_rules);
        translateTransition_buttonPlay.setNode(imageView_buttonPlay);

        translateTransition_buttonEasy.setNode(imageView_buttonEasy);



        translateTransition_buttonNoEasy.setNode(imageView_buttonNoEasy);


        translateTransition_gameOver.setNode(imageView_gameOver);


        /////


        //Creating a Group object
        Group root=new Group(imageView_table,
                imageView_boom,
                imageView_ship,
                imageView_laserRed,imageView_laserYellow, imageView_laserBlue, imageView_laserGreen, imageView_laserWhite,
                imageView_meteorRed,imageView_meteorYellow, imageView_meteorBlue, imageView_meteorGreen, imageView_meteorWhite,
                imageView_frameLaser,


                imageView_rules,
                imageView_buttonPlay,
                imageView_buttonEasy, imageView_buttonNoEasy,
                imageView_gameOver
                );

        //Creating a scene object
        Scene scene=new Scene(root,690,1220);//1000,(700+210));

        //Cursor
        scene.setCursor(new ImageCursor(image_cursor,
                                        image_cursor.getWidth()/2,
                                        image_cursor.getHeight()/2));
        //Setting title to the Stage
        stage.setTitle("Spaceship by A. Prikupets");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

        translateTransition_buttonNoEasy.setFromX(0);
        translateTransition_buttonNoEasy.setToX(0);
        translateTransition_buttonNoEasy.setFromY(80);
        translateTransition_buttonNoEasy.setToY(80);
        translateTransition_buttonNoEasy.play();

        translateTransition_gameOver.setFromX(0);
        translateTransition_gameOver.setToX(0);
        translateTransition_gameOver.setFromY(-1220/2-700/2);
        translateTransition_gameOver.setToY(-1220/2-700/2);
        translateTransition_gameOver.play();




        translateTransition_ship.setRate(0.6);






        //translateTransition_butt.stop ( );

        translateTransition_laserRed.setFromX ( 0 );
        translateTransition_laserRed.setFromY ( 1250 );
        translateTransition_laserRed.setToX ( 0 );
        translateTransition_laserRed.setToY ( 1250 );
        translateTransition_laserRed.play ( );

        translateTransition_laserBlue.setFromX ( 0 );
        translateTransition_laserBlue.setFromY ( 1250 );
        translateTransition_laserBlue.setToX ( 0 );
        translateTransition_laserBlue.setToY ( 1250 );
        translateTransition_laserBlue.play ( );

        translateTransition_laserGreen.setFromX ( 0 );
        translateTransition_laserGreen.setFromY ( 1250 );
        translateTransition_laserGreen.setToX ( 0 );
        translateTransition_laserGreen.setToY ( 1250 );
        translateTransition_laserGreen.play ( );

        translateTransition_laserYellow.setFromX ( 0 );
        translateTransition_laserYellow.setFromY ( 1250 );
        translateTransition_laserYellow.setToX ( 0 );
        translateTransition_laserYellow.setToY ( 1250 );
        translateTransition_laserYellow.play ( );

        translateTransition_laserWhite.setFromX ( 0 );
        translateTransition_laserWhite.setFromY ( 1250 );
        translateTransition_laserWhite.setToX ( 0 );
        translateTransition_laserWhite.setToY ( 1250 );
        translateTransition_laserWhite.play ( );


        translateTransition_rules.setFromX ( 1200 );
        translateTransition_rules.setFromY ( 1200+416/2 );
        translateTransition_buttonPlay.setFromX ( -1200 );
        translateTransition_buttonPlay.setFromY ( -1200-416/2 );
        translateTransition_buttonPlay.setToX ( 0 );
        translateTransition_buttonPlay.setToY ( -416/2-20 );
        translateTransition_rules.setToX ( 0 );
        translateTransition_rules.setToY ( 416/2-20 );
        translateTransition_rules.play ( );
        translateTransition_buttonPlay.play ( );








        translateTransition_meteorRed.stop();
        translateTransition_meteorRed.setFromX (0);
        translateTransition_meteorRed.setFromY (-1500);
        translateTransition_meteorRed.setToX (0);
        translateTransition_meteorRed.setToY (-1500);
        translateTransition_meteorRed.play();

        translateTransition_meteorYellow.stop();
        translateTransition_meteorYellow.setFromX (0);
        translateTransition_meteorYellow.setFromY (-1500);
        translateTransition_meteorYellow.setToX (0);
        translateTransition_meteorYellow.setToY (-1500);
        translateTransition_meteorYellow.play();

        translateTransition_meteorBlue.stop();
        translateTransition_meteorBlue.setFromX (0);
        translateTransition_meteorBlue.setFromY (-1500);
        translateTransition_meteorBlue.setToX (0);
        translateTransition_meteorBlue.setToY (-1500);
        translateTransition_meteorBlue.play();

        translateTransition_meteorGreen.stop();
        translateTransition_meteorGreen.setFromX (0);
        translateTransition_meteorGreen.setFromY (-1500);
        translateTransition_meteorGreen.setToX (0);
        translateTransition_meteorGreen.setToY (-1500);
        translateTransition_meteorGreen.play();

        translateTransition_meteorWhite.stop();
        translateTransition_meteorWhite.setFromX (0);
        translateTransition_meteorWhite.setFromY (-1500);
        translateTransition_meteorWhite.setToX (0);
        translateTransition_meteorWhite.setToY (-1500);
        translateTransition_meteorWhite.play();


        play_condition = false;





        /*
        translateTransition_meteorGreen.stop ( );
        translateTransition_meteorGreen.setFromX ( 0 );
        translateTransition_meteorGreen.setFromY ( -1000 );
        translateTransition_meteorGreen.setToX ( 0 );
        translateTransition_meteorGreen.setToY ( -1000 );
        translateTransition_meteorGreen.play ( );

         */
        actionListener = new ActionListener () {
            @Override
            public void actionPerformed( ActionEvent arg0) {
                if ( play_condition == true ) {
                    if ( int_lose_condition < 5 ) {
                        System.out.println ( "Timer!" );
                        int count_play_meteor = 4;//int_lose_condition;
                        if ( bool_meteor_Red == false || ( int_play_Red == 3 ) ) {
                            count_play_meteor -= 1;
                        }
                        if ( bool_meteor_Yellow == false || ( int_play_Yellow == 3 ) ) {
                            count_play_meteor -= 1;
                        }
                        if ( bool_meteor_Blue == false || ( int_play_Blue == 3 ) ) {
                            count_play_meteor -= 1;
                        }
                        if ( bool_meteor_Green == false || ( int_play_Green == 3 ) ) {
                            count_play_meteor -= 1;
                        }
                        if ( bool_meteor_White == false || ( int_play_White == 3 ) ) {
                            count_play_meteor -= 1;
                        }
                        //if(count_play_meteor > ){
                        //    count_play_meteor -=1;
                        //}
                        //int count_play_meteor = 0;
                        int meteor_rand = ( ( int ) ( random ( ) * 10000 % ( count_play_meteor + 2 -1 ) ) );
                        System.out.println ( ( meteor_rand ) );

                        if ( meteor_rand <= count_play_meteor && (count_play_meteor>=0)) {
                            for ( int i = 0 ; i < 50 ; i += 1 ) {

                                if ( i % (5) == 0 && ( meteor_rand % (5) == 0 ) ) {
                                    if ( int_play_Red != 3 && ( bool_meteor_Red == true ) ) {
                                        bool_meteor_Red = false;
                                        System.out.println ( "bool_meteor_Red " + bool_meteor_Red);

                                        if(bool_easy == true){
                                            codeStringEasy = "DIGIT1";
                                            //currentlyActiveKeys.put(codeString,true);
                                            System.out.println ( codeStringEasy );
                                            //currentlyActiveKeys.remove(codeString+"-Released");

                                            //currentlyActiveKeys.put(codeString,true);

                                            //currentlyActiveKeys.put(codeString+"-Released",true);
                                            //System.out.println ( codeString+"-Released" );
                                        }
                                        //translateTransition_meteor_Red ==
                                        translateTransition_meteorRed.stop();
                                        translateTransition_meteorRed.setFromX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                        translateTransition_meteorRed.setFromY (-1500);
                                        translateTransition_meteorRed.setToX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                        translateTransition_meteorRed.setToY (200);
                                        translateTransition_meteorRed.setRate(0.1 + (int_lose_condition*3/10));
                                        translateTransition_meteorRed.play();

                                        start_Timer();

                                        break;
                                    } else {
                                        meteor_rand += 1;
                                    }

                                } else
                                    if ( i % (5) == 1  && ( meteor_rand % (5) == 1  ) ) {
                                        if ( int_play_Yellow != 3 && ( bool_meteor_Yellow == true ) ) {
                                            bool_meteor_Yellow = false;
                                            System.out.println ( "bool_meteor_Yellow " + bool_meteor_Yellow);

                                            if(bool_easy == true){
                                                codeStringEasy = "DIGIT2";
                                                //currentlyActiveKeys.put(codeString,true);
                                                System.out.println ( codeStringEasy );
                                                //currentlyActiveKeys.remove(codeString+"-Released");

                                                //currentlyActiveKeys.put(codeString,true);

                                                //currentlyActiveKeys.put(codeString+"-Released",true);
                                                //System.out.println ( codeString+"-Released" );
                                            }

                                            translateTransition_meteorYellow.stop();
                                            translateTransition_meteorYellow.setFromX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                            translateTransition_meteorYellow.setFromY (-1500);
                                            translateTransition_meteorYellow.setToX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                            translateTransition_meteorYellow.setToY (200);
                                            translateTransition_meteorYellow.setRate(0.1 + (int_lose_condition*3/10));
                                            translateTransition_meteorYellow.play();

                                            start_Timer();

                                            break;
                                        } else {
                                            meteor_rand += 1;
                                        }

                                    } else
                                        if ( i % (5) == 2  && ( meteor_rand % (5) == 2  ) ) {
                                            if ( int_play_Blue != 3 && ( bool_meteor_Blue == true ) ) {
                                                bool_meteor_Blue = false;
                                                System.out.println ( "bool_meteor_Blue " + bool_meteor_Blue);

                                                if(bool_easy == true){
                                                    codeStringEasy = "DIGIT3";
                                                    //currentlyActiveKeys.put(codeString,true);
                                                    System.out.println ( codeStringEasy );
                                                    //currentlyActiveKeys.remove(codeString+"-Released");

                                                    //currentlyActiveKeys.put(codeString,true);

                                                    //currentlyActiveKeys.put(codeString+"-Released",true);
                                                    //System.out.println ( codeString+"-Released" );
                                                }

                                                translateTransition_meteorBlue.stop();
                                                translateTransition_meteorBlue.setFromX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                                translateTransition_meteorBlue.setFromY (-1500);
                                                translateTransition_meteorBlue.setToX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                                translateTransition_meteorBlue.setToY (200);
                                                translateTransition_meteorBlue.setRate(0.1 + (int_lose_condition*3/10));
                                                translateTransition_meteorBlue.play();

                                                start_Timer();

                                                break;
                                            } else {
                                                meteor_rand += 1;
                                            }

                                        } else
                                            if ( i % (5) == 3  && ( meteor_rand % (5) == 3  ) ) {
                                                if ( int_play_Green != 3 && ( bool_meteor_Green == true ) ) {
                                                    bool_meteor_Green = false;
                                                    System.out.println ( "bool_meteor_Green " + bool_meteor_Green);


                                                    if(bool_easy == true){
                                                        codeStringEasy = "DIGIT4";
                                                        //currentlyActiveKeys.put(codeString,true);
                                                        System.out.println ( codeStringEasy );
                                                        //currentlyActiveKeys.remove(codeString+"-Released");

                                                        //currentlyActiveKeys.put(codeString,true);

                                                        //currentlyActiveKeys.put(codeString+"-Released",true);
                                                        //System.out.println ( codeString+"-Released" );
                                                    }

                                                    translateTransition_meteorGreen.stop();
                                                    translateTransition_meteorGreen.setFromX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                                    translateTransition_meteorGreen.setFromY (-1500);
                                                    translateTransition_meteorGreen.setToX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                                    translateTransition_meteorGreen.setToY (200);
                                                    translateTransition_meteorGreen.setRate(0.1 + (int_lose_condition*3/10));
                                                    translateTransition_meteorGreen.play();

                                                    start_Timer();

                                                    break;
                                                } else {
                                                    meteor_rand += 1;
                                                }

                                            } else
                                                if ( i % (5) == 4  && ( meteor_rand % (5) == 4  ) ) {
                                                    if ( int_play_White != 3 && ( bool_meteor_White == true ) ) {
                                                        bool_meteor_White = false;
                                                        System.out.println ( "bool_meteor_White " + bool_meteor_White);

                                                        if(bool_easy == true){
                                                            codeStringEasy = "DIGIT5";
                                                            //currentlyActiveKeys.put(codeString,true);
                                                            System.out.println ( codeStringEasy );
                                                            //currentlyActiveKeys.remove(codeString+"-Released");

                                                            //currentlyActiveKeys.put(codeString,true);

                                                            //currentlyActiveKeys.put(codeString+"-Released",true);
                                                            //System.out.println ( codeString+"-Released" );
                                                        }

                                                        translateTransition_meteorWhite.stop();
                                                        translateTransition_meteorWhite.setFromX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                                        translateTransition_meteorWhite.setFromY (-1500);
                                                        translateTransition_meteorWhite.setToX (  (( int ) ( random ( ) * 10000))%(690)-232-70);
                                                        translateTransition_meteorWhite.setToY (200);
                                                        translateTransition_meteorWhite.setRate(0.1 + (int_lose_condition*3/10));
                                                        translateTransition_meteorWhite.play();

                                                        start_Timer();

                                                        break;
                                                    } else {
                                                        meteor_rand += 1;
                                                    }

                                                }
                            }
                        }

                    } else {
                        timer.stop ( );
                        play_condition = false;
                    }
                }
            }
        };

        scene.setOnKeyPressed(event->{
            String codeString=event.getCode().toString();
            if(!currentlyActiveKeys.containsKey(codeString)){
                currentlyActiveKeys.put(codeString,true);
                System.out.println ( codeString );
                currentlyActiveKeys.remove(codeString+"-Released");
            }
        });
        scene.setOnKeyReleased(event->{
            String getcodeToString=event.getCode().toString();
            currentlyActiveKeys.remove(getcodeToString);
            currentlyActiveKeys.put((getcodeToString+"-Released"),true);
        });
        ////
        root.setOnMouseMoved((EventHandler<? super MouseEvent>) event -> {
            ////////////////////////////////////////////////////////////////////////////////////System.out.println("getX(), getY(): " + (event.getX()-690/2) + ", " + (event.getY()-(1220-200)));
            if (imageView_ship.getTranslateX() > event.getX()-690/2+176/2){// && (condition_ship_Right>event.getX()-690/2)) {
                //condition_ship_Right=true;
                condition_ship_Right=(float)event.getX()-690/2;
                translateTransition_ship.stop();
                translateTransition_ship.setToX(event.getX()-690/2);//-690/2);
                //Setting auto reverse value to false
                translateTransition_ship.setAutoReverse(false);
                //Playing the animation
                translateTransition_ship.play();
            } else if(imageView_ship.getTranslateX() < event.getX()-690/2+176/2){//&& (condition_ship_Right<event.getX()-690/2)){
                condition_ship_Right=(float)event.getX()-690/2;
                //condition_ship_Right=false;
                translateTransition_ship.stop();
                translateTransition_ship.setToX(event.getX()-690/2);//690/2);
                //Setting auto reverse value to false
                translateTransition_ship.setAutoReverse(false);
                //Playing the animation
                translateTransition_ship.play();
            } else {

                translateTransition_ship.stop();
            }



        });
        imageView_buttonPlay.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                //translateTransition_buttonPlay
                translateTransition_buttonPlay.stop ( );
                translateTransition_buttonPlay.setFromX ( 0 );
                translateTransition_buttonPlay.setFromY ( -416/2 );
                translateTransition_buttonPlay.setToX ( 1200 );
                translateTransition_buttonPlay.setToY ( 1200-416/2 );
                translateTransition_buttonPlay.play ( );
                translateTransition_rules.stop ( );
                translateTransition_rules.setFromX ( 0 );
                translateTransition_rules.setFromY ( 416/2-20 );
                translateTransition_rules.setToX ( -1200 );
                translateTransition_rules.setToY ( -1200+416/2-20 );
                translateTransition_rules.play ( );


                //if(play_condition==true){
                    //if ((bool_play_Red == true) ) {
                        ///////System.out.println("Red " + imageView_laserRed.getTranslateY ( ));
                        float x_from = -((690/2)-(176/2)-5)+       10+0*30;
                        float y_from = 200;
                        translateTransition_laserRed.stop ( );
                        translateTransition_laserRed.setFromX ( x_from );
                        translateTransition_laserRed.setFromY ( y_from );
                        translateTransition_laserRed.setToX ( x_from );
                        translateTransition_laserRed.setToY ( 200-30 );
                        translateTransition_laserRed.play ( );
                    //} else if ((bool_play_Yellow == true)) {
                        x_from = -((690/2)-(176/2)-5)+       10+1*30;
                        y_from = 200;
                        translateTransition_laserYellow.stop ( );
                        translateTransition_laserYellow.setFromX ( x_from );
                        translateTransition_laserYellow.setFromY ( y_from );
                        translateTransition_laserYellow.setToX ( x_from );
                        translateTransition_laserYellow.setToY ( 200-30 );
                        translateTransition_laserYellow.play ( );
                    //} else if ((bool_play_Blue == true)) {
                        x_from = -((690/2)-(176/2)-5)+       10+2*30;
                        y_from = 200;
                        translateTransition_laserBlue.stop ( );
                        translateTransition_laserBlue.setFromX ( x_from );
                        translateTransition_laserBlue.setFromY ( y_from );
                        translateTransition_laserBlue.setToX ( x_from );
                        translateTransition_laserBlue.setToY ( 200-30 );
                        translateTransition_laserBlue.play ( );
                    //} else if ((bool_play_Green == true)) {
                        x_from = -((690/2)-(176/2)-5)+       10+3*30;
                        y_from = 200;
                        translateTransition_laserGreen.stop ( );
                        translateTransition_laserGreen.setFromX ( x_from );
                        translateTransition_laserGreen.setFromY ( y_from );
                        translateTransition_laserGreen.setToX ( x_from );
                        translateTransition_laserGreen.setToY ( 200-30 );
                        translateTransition_laserGreen.play ( );
                    //} else if ((bool_play_White == true)) {
                        x_from = - ( ( 690 / 2 ) - ( 176 / 2 ) - 5 ) + 10 + 4 * 30;
                        y_from = 200;
                        translateTransition_laserWhite.stop ( );
                        translateTransition_laserWhite.setFromX ( x_from );
                        translateTransition_laserWhite.setFromY ( y_from );
                        translateTransition_laserWhite.setToX ( x_from );
                        translateTransition_laserWhite.setToY ( 200 - 30 );
                        translateTransition_laserWhite.play ( );
                    //}
                    //}
                play_condition = true;

                timer = new Timer(((5-int_lose_condition)*900), actionListener);
                timer.start();

                int_play_Red = 1;
                int_play_Yellow = 1;
                int_play_Blue = 1;
                int_play_Green = 1;
                int_play_White = 1;


            }
        });
        imageView_buttonEasy.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                translateTransition_buttonEasy.stop (  );
                translateTransition_buttonNoEasy.stop (  );

                translateTransition_buttonEasy.setFromX ( 0 );
                translateTransition_buttonEasy.setFromY ( 0 );
                translateTransition_buttonEasy.setToX ( 0 );
                translateTransition_buttonEasy.setToY ( 80 );


                translateTransition_buttonNoEasy.setFromX ( 85*2 );
                translateTransition_buttonNoEasy.setFromY ( 0 );
                translateTransition_buttonNoEasy.setToX ( 0 );
                translateTransition_buttonNoEasy.setToY ( 0 );
                translateTransition_buttonEasy.play (  );
                translateTransition_buttonNoEasy.play (  );

                bool_easy = true;
                codeStringEasy = "DIGIT6";

            }
        });
        imageView_buttonNoEasy.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                translateTransition_buttonNoEasy.stop (  );
                translateTransition_buttonEasy.stop (  );

                translateTransition_buttonNoEasy.setFromX ( 0 );
                translateTransition_buttonNoEasy.setFromY ( 0 );
                translateTransition_buttonNoEasy.setToX ( 0 );
                translateTransition_buttonNoEasy.setToY ( 80 );


                translateTransition_buttonEasy.setFromX ( 85*2 );
                translateTransition_buttonEasy.setFromY ( 0 );
                translateTransition_buttonEasy.setToX ( 0 );
                translateTransition_buttonEasy.setToY ( 0 );
                translateTransition_buttonEasy.play (  );
                translateTransition_buttonNoEasy.play (  );
                codeStringEasy = "DIGIT6";
                bool_easy = false;

            }
        });
        root.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                if(play_condition==true){

                    //imageView_laserRed,imageView_laserYellow, imageView_laserBlue, imageView_laserGreen, imageView_laserWhite
                    if (count_frameLaser==0 && (int_play_Red == 1)) {

                        int_play_Red = 0;
                        float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                        translateTransition_laserRed.stop ( );
                        translateTransition_laserRed.setFromX ( x_from );
                        translateTransition_laserRed.setFromY ( 0 );
                        translateTransition_laserRed.setToX ( x_from );
                        translateTransition_laserRed.setToY ( - 1200 );
                        translateTransition_laserRed.play ( );
                    } else if (count_frameLaser==1 && (int_play_Yellow == 1)) {


                        int_play_Yellow = 0;
                        float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                        translateTransition_laserYellow.stop ( );
                        translateTransition_laserYellow.setFromX ( x_from );
                        translateTransition_laserYellow.setFromY ( 0 );
                        translateTransition_laserYellow.setToX ( x_from );
                        translateTransition_laserYellow.setToY ( - 1200 );
                        translateTransition_laserYellow.play ( );
                    } else if (count_frameLaser==2 && (int_play_Blue == 1)) {

                        int_play_Blue = 0;
                        float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                        translateTransition_laserBlue.stop ( );
                        translateTransition_laserBlue.setFromX ( x_from );
                        translateTransition_laserBlue.setFromY ( 0 );
                        translateTransition_laserBlue.setToX ( x_from );
                        translateTransition_laserBlue.setToY ( - 1200 );
                        translateTransition_laserBlue.play ( );
                    } else if (count_frameLaser==3 && (int_play_Green == 1)) {

                        int_play_Green = 0;
                        float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                        translateTransition_laserGreen.stop ( );
                        translateTransition_laserGreen.setFromX ( x_from );
                        translateTransition_laserGreen.setFromY ( 0 );
                        translateTransition_laserGreen.setToX ( x_from );
                        translateTransition_laserGreen.setToY ( - 1200 );
                        translateTransition_laserGreen.play ( );
                    } else if (count_frameLaser==4 && (int_play_White == 1)) {

                        int_play_White = 0;
                        float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                        translateTransition_laserWhite.stop ( );
                        translateTransition_laserWhite.setFromX ( x_from );
                        translateTransition_laserWhite.setFromY ( 0 );
                        translateTransition_laserWhite.setToX ( x_from );
                        translateTransition_laserWhite.setToY ( - 1200 );
                        translateTransition_laserWhite.play ( );
                    }








                }
            }
        });
        new AnimationTimer(){
            @Override
            public void handle(long now){
                //MouseEvent mouseEvent = new MouseEvent();
                //System.out.println(Mouse);
                //////////System.out.println("Red " + imageView_laserRed.getTranslateY ( ) + " "+imageView_laserRed.getTranslateX ( ));
                if(play_condition==true){
                    //System.out.println ( "Int_Lose: "+ int_lose_condition );

                    if (
                            (imageView_laserRed.getTranslateY ( )>=imageView_meteorRed.getTranslateY ( )+30 )
                            && (imageView_laserRed.getTranslateY ( )<=imageView_meteorRed.getTranslateY ( )+350-30 )
                            && (imageView_laserRed.getTranslateX ( )>=imageView_meteorRed.getTranslateX ( )+10 )
                            && (imageView_laserRed.getTranslateX ( )<=imageView_meteorRed.getTranslateX ( )+ 232-10)
                                    && (int_play_Red != 3)
                    ) {
                        System.out.println("Red Laser" + imageView_laserRed.getTranslateY ( ) + "Meteor " + imageView_meteorRed.getTranslateY());
                        float x_from = -((690/2)-(176/2)-5)+       10+0*30;
                        float y_from = 200;
                        translateTransition_meteorRed.stop ( );
                        translateTransition_meteorRed.setFromY ( -1501 );
                        translateTransition_meteorRed.setToY ( -1500 );
                        translateTransition_meteorRed.play ( );

                        translateTransition_laserRed.stop ( );
                        translateTransition_laserRed.setFromX ( x_from );
                        translateTransition_laserRed.setFromY ( y_from );
                        translateTransition_laserRed.setToX ( x_from );
                        translateTransition_laserRed.setToY ( 200-30 );
                        translateTransition_laserRed.play ( );
                        int_play_Red = 1;
                        bool_meteor_Red = true;
                    } else if (
                                (imageView_laserYellow.getTranslateY ( )>=imageView_meteorYellow.getTranslateY ( )+30 )
                                        && (imageView_laserYellow.getTranslateY ( )<=imageView_meteorYellow.getTranslateY ( )+350-30 )
                                        && (imageView_laserYellow.getTranslateX ( )>=imageView_meteorYellow.getTranslateX ( )+10 )
                                        && (imageView_laserYellow.getTranslateX ( )<=imageView_meteorYellow.getTranslateX ( )+ 232-10)
                                        && (int_play_Yellow != 3)
                        ) {
                            System.out.println("Yellow Laser" + imageView_laserYellow.getTranslateY ( ) + "Meteor " + imageView_meteorYellow.getTranslateY());
                            float x_from = -((690/2)-(176/2)-5)+       10+1*30;
                            float y_from = 200;
                            translateTransition_meteorYellow.stop ( );
                        translateTransition_meteorYellow.setFromY ( -1501 );
                        translateTransition_meteorYellow.setToY ( -1500 );
                        translateTransition_meteorYellow.play ( );


                            translateTransition_laserYellow.stop ( );
                            translateTransition_laserYellow.setFromX ( x_from );
                            translateTransition_laserYellow.setFromY ( y_from );
                            translateTransition_laserYellow.setToX ( x_from );
                            translateTransition_laserYellow.setToY ( 200-30 );
                            translateTransition_laserYellow.play ( );
                            int_play_Yellow = 1;
                            bool_meteor_Yellow = true;
                        } else if (
                                (imageView_laserBlue.getTranslateY ( )>=imageView_meteorBlue.getTranslateY ( )+30 )
                                        && (imageView_laserBlue.getTranslateY ( )<=imageView_meteorBlue.getTranslateY ( )+350-30 )
                                        && (imageView_laserBlue.getTranslateX ( )>=imageView_meteorBlue.getTranslateX ( )+10 )
                                        && (imageView_laserBlue.getTranslateX ( )<=imageView_meteorBlue.getTranslateX ( )+ 232-10)
                                        && (int_play_Blue != 3)
                        ) {
                            System.out.println("Blue Laser" + imageView_laserBlue.getTranslateY ( ) + "Meteor " + imageView_meteorBlue.getTranslateY());
                            float x_from = -((690/2)-(176/2)-5)+       10+2*30;
                            float y_from = 200;
                            translateTransition_meteorBlue.stop ( );
                            translateTransition_meteorBlue.setFromY ( -1501 );
                            translateTransition_meteorBlue.setToY ( -1500 );
                            translateTransition_meteorBlue.play ( );


                            translateTransition_laserBlue.stop ( );
                            translateTransition_laserBlue.setFromX ( x_from );
                            translateTransition_laserBlue.setFromY ( y_from );
                            translateTransition_laserBlue.setToX ( x_from );
                            translateTransition_laserBlue.setToY ( 200-30 );
                            translateTransition_laserBlue.play ( );
                            int_play_Blue = 1;
                            bool_meteor_Blue = true;
                        } else if (
                                    (imageView_laserGreen.getTranslateY ( )>=imageView_meteorGreen.getTranslateY ( )+30 )
                                            && (imageView_laserGreen.getTranslateY ( )<=imageView_meteorGreen.getTranslateY ( )+350-30 )
                                            && (imageView_laserGreen.getTranslateX ( )>=imageView_meteorGreen.getTranslateX ( )+10 )
                                            && (imageView_laserGreen.getTranslateX ( )<=imageView_meteorGreen.getTranslateX ( )+ 232-10)
                                            && (int_play_Green != 3)
                            ) {
                                System.out.println("Green Laser" + imageView_laserGreen.getTranslateY ( ) + "Meteor " + imageView_meteorGreen.getTranslateY());
                                float x_from = -((690/2)-(176/2)-5)+       10+3*30;
                                float y_from = 200;
                                translateTransition_meteorGreen.stop ( );
                                translateTransition_meteorGreen.setFromY ( -1501 );
                                translateTransition_meteorGreen.setToY ( -1500 );
                                translateTransition_meteorGreen.play ( );


                                translateTransition_laserGreen.stop ( );
                                translateTransition_laserGreen.setFromX ( x_from );
                                translateTransition_laserGreen.setFromY ( y_from );
                                translateTransition_laserGreen.setToX ( x_from );
                                translateTransition_laserGreen.setToY ( 200-30 );
                                translateTransition_laserGreen.play ( );
                                int_play_Green = 1;
                                bool_meteor_Green = true;
                            } else if (
                                        (imageView_laserWhite.getTranslateY ( )>=imageView_meteorWhite.getTranslateY ( )+30 )
                                                && (imageView_laserWhite.getTranslateY ( )<=imageView_meteorWhite.getTranslateY ( )+350-30 )
                                                && (imageView_laserWhite.getTranslateX ( )>=imageView_meteorWhite.getTranslateX ( )+10 )
                                                && (imageView_laserWhite.getTranslateX ( )<=imageView_meteorWhite.getTranslateX ( )+ 232-10)
                                                && (int_play_White != 3)
                                ) {
                                    System.out.println("White Laser" + imageView_laserWhite.getTranslateY ( ) + "Meteor " + imageView_meteorWhite.getTranslateY());
                                    float x_from = -((690/2)-(176/2)-5)+       10+4*30;
                                    float y_from = 200;
                                    translateTransition_meteorWhite.stop ( );
                                    translateTransition_meteorWhite.setFromY ( -1501 );
                                    translateTransition_meteorWhite.setToY ( -1500 );
                                    translateTransition_meteorWhite.play ( );


                                    translateTransition_laserWhite.stop ( );
                                    translateTransition_laserWhite.setFromX ( x_from );
                                    translateTransition_laserWhite.setFromY ( y_from );
                                    translateTransition_laserWhite.setToX ( x_from );
                                    translateTransition_laserWhite.setToY ( 200-30 );
                                    translateTransition_laserWhite.play ( );
                                    int_play_White = 1;
                                    bool_meteor_White = true;
                                }


                    if (imageView_boom.getTranslateY ( )<=-850 && ( int_lose_condition > 0)) {
                        translateTransition_boom.stop ( );
                        translateTransition_boom.setFromX ( 0 );
                        translateTransition_boom.setFromY ( -850 );
                        translateTransition_boom.setToX ( 0 );
                        translateTransition_boom.setToY ( 0 );
                        translateTransition_boom.play ( );
                    }

                    if (imageView_meteorRed.getTranslateY ( )>=-200 && (int_play_Red != 3)) {
                        int_lose_condition+=1;

                        int_play_Red = 3;
                        bool_meteor_Red = false;

                        if(int_lose_condition==5){
                            play_condition = false;
                            game_Over();
                        }



                        float x_from = -((690/2)-(176/2)-5)+       10+0*30;
                        float y_from = 200;

                        translateTransition_laserRed.stop ( );
                        translateTransition_laserRed.setFromX ( x_from );
                        translateTransition_laserRed.setFromY ( 200-30 );
                        translateTransition_laserRed.setToX ( x_from );
                        translateTransition_laserRed.setToY ( y_from );
                        translateTransition_laserRed.play ( );

                        translateTransition_boom.setRate(0.6);

                        translateTransition_boom.stop ( );
                        translateTransition_boom.setFromX ( 0 );
                        translateTransition_boom.setFromY ( 0 );
                        translateTransition_boom.setToX ( 0 );
                        translateTransition_boom.setToY ( -850 );
                        translateTransition_boom.play ( );

                    }








                    if (imageView_meteorYellow.getTranslateY ( )>=-200 && (int_play_Yellow != 3)) {
                        int_lose_condition+=1;

                        int_play_Yellow = 3;
                        bool_meteor_Yellow = false;

                        if(int_lose_condition==5){
                            play_condition = false;
                            game_Over();
                        }



                        float x_from = -((690/2)-(176/2)-5)+       10+1*30;
                        float y_from = 200;

                        translateTransition_laserYellow.stop ( );
                        translateTransition_laserYellow.setFromX ( x_from );
                        translateTransition_laserYellow.setFromY ( 200-30 );
                        translateTransition_laserYellow.setToX ( x_from );
                        translateTransition_laserYellow.setToY ( y_from );
                        translateTransition_laserYellow.play ( );

                        translateTransition_boom.setRate(0.6);

                        translateTransition_boom.stop ( );
                        translateTransition_boom.setFromX ( 0 );
                        translateTransition_boom.setFromY ( 0 );
                        translateTransition_boom.setToX ( 0 );
                        translateTransition_boom.setToY ( -850 );
                        translateTransition_boom.play ( );

                    }






                    if (imageView_meteorBlue.getTranslateY ( )>=-200 && (int_play_Blue != 3)) {
                        int_lose_condition+=1;

                        int_play_Blue = 3;
                        bool_meteor_Blue = false;

                        if(int_lose_condition==5){
                            play_condition = false;
                            game_Over();
                        }



                        float x_from = -((690/2)-(176/2)-5)+       10+2*30;
                        float y_from = 200;

                        translateTransition_laserBlue.stop ( );
                        translateTransition_laserBlue.setFromX ( x_from );
                        translateTransition_laserBlue.setFromY ( 200-30 );
                        translateTransition_laserBlue.setToX ( x_from );
                        translateTransition_laserBlue.setToY ( y_from );
                        translateTransition_laserBlue.play ( );

                        translateTransition_boom.setRate(0.6);

                        translateTransition_boom.stop ( );
                        translateTransition_boom.setFromX ( 0 );
                        translateTransition_boom.setFromY ( 0 );
                        translateTransition_boom.setToX ( 0 );
                        translateTransition_boom.setToY ( -850 );
                        translateTransition_boom.play ( );

                    }






                    if (imageView_meteorGreen.getTranslateY ( )>=-200 && (int_play_Green != 3)) {
                        int_lose_condition+=1;

                        int_play_Green = 3;
                        bool_meteor_Green = false;

                        if(int_lose_condition==5){
                            play_condition = false;
                            game_Over();
                        }



                        float x_from = -((690/2)-(176/2)-5)+       10+3*30;
                        float y_from = 200;

                        translateTransition_laserGreen.stop ( );
                        translateTransition_laserGreen.setFromX ( x_from );
                        translateTransition_laserGreen.setFromY ( 200-30 );
                        translateTransition_laserGreen.setToX ( x_from );
                        translateTransition_laserGreen.setToY ( y_from );
                        translateTransition_laserGreen.play ( );

                        translateTransition_boom.setRate(0.6);

                        translateTransition_boom.stop ( );
                        translateTransition_boom.setFromX ( 0 );
                        translateTransition_boom.setFromY ( 0 );
                        translateTransition_boom.setToX ( 0 );
                        translateTransition_boom.setToY ( -850 );
                        translateTransition_boom.play ( );

                    }





                    if (imageView_meteorWhite.getTranslateY ( )>=-200 && (int_play_White != 3)) {
                        int_lose_condition+=1;

                        int_play_White = 3;
                        bool_meteor_White = false;

                        if(int_lose_condition==5){
                            play_condition = false;
                            game_Over();
                        }



                        float x_from = -((690/2)-(176/2)-5)+       10+4*30;
                        float y_from = 200;

                        translateTransition_laserWhite.stop ( );
                        translateTransition_laserWhite.setFromX ( x_from );
                        translateTransition_laserWhite.setFromY ( 200-30 );
                        translateTransition_laserWhite.setToX ( x_from );
                        translateTransition_laserWhite.setToY ( y_from );
                        translateTransition_laserWhite.play ( );

                        translateTransition_boom.setRate(0.6);

                        translateTransition_boom.stop ( );
                        translateTransition_boom.setFromX ( 0 );
                        translateTransition_boom.setFromY ( 0 );
                        translateTransition_boom.setToX ( 0 );
                        translateTransition_boom.setToY ( -850 );
                        translateTransition_boom.play ( );

                    }





                                    if (imageView_laserRed.getTranslateY ( )<=-1000 && ( int_play_Red != 3) ) {
                        //////////System.out.println("Red " + imageView_laserRed.getTranslateY ( ));
                        float x_from = -((690/2)-(176/2)-5)+       10+0*30;
                        float y_from = 200;
                        translateTransition_laserRed.stop ( );
                        translateTransition_laserRed.setFromX ( x_from );
                        translateTransition_laserRed.setFromY ( y_from );
                        translateTransition_laserRed.setToX ( x_from );
                        translateTransition_laserRed.setToY ( 200-30 );
                        translateTransition_laserRed.play ( );
                        int_play_Red = 1;
                    } else if (imageView_laserYellow.getTranslateY ( )<=-1000 && ( int_play_Yellow != 3)) {
                        float x_from = -((690/2)-(176/2)-5)+       10+1*30;
                        float y_from = 200;
                        translateTransition_laserYellow.stop ( );
                        translateTransition_laserYellow.setFromX ( x_from );
                        translateTransition_laserYellow.setFromY ( y_from );
                        translateTransition_laserYellow.setToX ( x_from );
                        translateTransition_laserYellow.setToY ( 200-30 );
                        translateTransition_laserYellow.play ( );
                        int_play_Yellow = 1;
                    } else if (imageView_laserBlue.getTranslateY ( )<=-1000 && ( int_play_Blue != 3)) {
                        float x_from = -((690/2)-(176/2)-5)+       10+2*30;
                        float y_from = 200;
                        translateTransition_laserBlue.stop ( );
                        translateTransition_laserBlue.setFromX ( x_from );
                        translateTransition_laserBlue.setFromY ( y_from );
                        translateTransition_laserBlue.setToX ( x_from );
                        translateTransition_laserBlue.setToY ( 200-30 );
                        translateTransition_laserBlue.play ( );
                        int_play_Blue = 1;
                    } else if (imageView_laserGreen.getTranslateY ( )<=-1000 && ( int_play_Green != 3)) {
                        float x_from = -((690/2)-(176/2)-5)+       10+3*30;
                        float y_from = 200;
                        translateTransition_laserGreen.stop ( );
                        translateTransition_laserGreen.setFromX ( x_from );
                        translateTransition_laserGreen.setFromY ( y_from );
                        translateTransition_laserGreen.setToX ( x_from );
                        translateTransition_laserGreen.setToY ( 200-30 );
                        translateTransition_laserGreen.play ( );
                        int_play_Green = 1;
                    } else if (imageView_laserWhite.getTranslateY ( )<=-1000 && ( int_play_White != 3)) {
                        float x_from = -((690/2)-(176/2)-5)+       10+4*30;
                        float y_from = 200;
                        translateTransition_laserWhite.stop ( );
                        translateTransition_laserWhite.setFromX ( x_from );
                        translateTransition_laserWhite.setFromY ( y_from );
                        translateTransition_laserWhite.setToX ( x_from );
                        translateTransition_laserWhite.setToY ( 200-30 );
                        translateTransition_laserWhite.play ( );
                        int_play_White = 1;
                    }










                    if(removeActiveKey("D")){
                        if(count_frameLaser == 4){
                            count_frameLaser = 0;
                        } else {
                            count_frameLaser += 1;
                        }
                        //Stoping the animation
                        translateTransition_frameLaser.stop();
                        //Creating Translate Transition
                        translateTransition_frameLaser.setToX(count_frameLaser*30);
                        //Setting auto reverse value to false
                        translateTransition_frameLaser.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_frameLaser.play();
                        System.out.println("d");
                    }

                    if(removeActiveKey("A")){
                        if(count_frameLaser == 0){
                            count_frameLaser = 4;
                        } else {
                            count_frameLaser -= 1;
                        }
                        //Stoping the animation
                        translateTransition_frameLaser.stop();
                        //Creating Translate Transition
                        translateTransition_frameLaser.setToX(count_frameLaser*30);
                        //Setting auto reverse value to false
                        translateTransition_frameLaser.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_frameLaser.play();
                        System.out.println("A");
                    }

                    if((removeActiveKey("DIGIT1")) || (codeStringEasy == "DIGIT1")){

                        codeStringEasy = "DIGIT6";

                        count_frameLaser = 1-1;
                        //Stoping the animation
                        translateTransition_frameLaser.stop();
                        //Creating Translate Transition
                        translateTransition_frameLaser.setToX(count_frameLaser*30);
                        //Setting auto reverse value to false
                        translateTransition_frameLaser.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_frameLaser.play();
                        System.out.println("1");
                    }

                    if((removeActiveKey("DIGIT2")) || (codeStringEasy == "DIGIT2")){

                        codeStringEasy = "DIGIT6";

                        count_frameLaser = 2-1;
                        //Stoping the animation
                        translateTransition_frameLaser.stop();
                        //Creating Translate Transition
                        translateTransition_frameLaser.setToX(count_frameLaser*30);
                        //Setting auto reverse value to false
                        translateTransition_frameLaser.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_frameLaser.play();
                        System.out.println("DIGIT2");
                    }

                    if((removeActiveKey("DIGIT3")) || (codeStringEasy == "DIGIT3")){

                        codeStringEasy = "DIGIT6";

                        count_frameLaser = 3-1;
                        //Stoping the animation
                        translateTransition_frameLaser.stop();
                        //Creating Translate Transition
                        translateTransition_frameLaser.setToX(count_frameLaser*30);
                        //Setting auto reverse value to false
                        translateTransition_frameLaser.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_frameLaser.play();
                        System.out.println("3");
                    }

                    if((removeActiveKey("DIGIT4")) || (codeStringEasy == "DIGIT4")){

                        codeStringEasy = "DIGIT6";

                        count_frameLaser = 4-1;
                        //Stoping the animation
                        translateTransition_frameLaser.stop();
                        //Creating Translate Transition
                        translateTransition_frameLaser.setToX(count_frameLaser*30);
                        //Setting auto reverse value to false
                        translateTransition_frameLaser.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_frameLaser.play();
                        System.out.println("4");
                    }

                    if((removeActiveKey("DIGIT5")) || (codeStringEasy == "DIGIT5")){

                        codeStringEasy = "DIGIT6";

                        count_frameLaser = 5-1;
                        //Stoping the animation
                        translateTransition_frameLaser.stop();
                        //Creating Translate Transition
                        translateTransition_frameLaser.setToX(count_frameLaser*30);
                        //Setting auto reverse value to false
                        translateTransition_frameLaser.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_frameLaser.play();
                        System.out.println("5");
                    }




                    if(removeActiveKey("Z")){

                        //Stoping the animation
                        translateTransition_ship.stop();

                        //Creating Translate Transition
                        translateTransition_ship.setToX(-690/2);
                        //Setting auto reverse value to false
                        translateTransition_ship.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_ship.play();
                        //}
                        System.out.println("x");

                        System.out.println();

                    }

                    if(removeActiveKey("C")){
                        //Stoping the animation
                        translateTransition_ship.stop();

                        //Creating Translate Transition
                        translateTransition_ship.setToX(690/2);
                        //Setting auto reverse value to false
                        translateTransition_ship.setAutoReverse(false);
                        //Playing the animation
                        translateTransition_ship.play();
                        //}
                        System.out.println("c");



                    }

                    if(removeActiveKey("Z-Released")){
                        //Stoping the animation
                        translateTransition_ship.stop();
                        System.out.println("z-Released");



                    }

                    if(removeActiveKey("C-Released")){
                        //Stoping the animation
                        translateTransition_ship.stop();
                        System.out.println("c-Released");

                    }

                    if(removeActiveKey ( "ENTER-Released" )) {
                        if ( play_condition == true ) {

                            //imageView_laserRed,imageView_laserYellow, imageView_laserBlue, imageView_laserGreen, imageView_laserWhite
                            if (count_frameLaser==0 && (int_play_Red == 1)) {

                                int_play_Red = 0;
                                float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                                translateTransition_laserRed.stop ( );
                                translateTransition_laserRed.setFromX ( x_from );
                                translateTransition_laserRed.setFromY ( 0 );
                                translateTransition_laserRed.setToX ( x_from );
                                translateTransition_laserRed.setToY ( - 1200 );
                                translateTransition_laserRed.play ( );
                            } else if (count_frameLaser==1 && (int_play_Yellow == 1)) {


                                int_play_Yellow = 0;
                                float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                                translateTransition_laserYellow.stop ( );
                                translateTransition_laserYellow.setFromX ( x_from );
                                translateTransition_laserYellow.setFromY ( 0 );
                                translateTransition_laserYellow.setToX ( x_from );
                                translateTransition_laserYellow.setToY ( - 1200 );
                                translateTransition_laserYellow.play ( );
                            } else if (count_frameLaser==2 && (int_play_Blue == 1)) {

                                int_play_Blue = 0;
                                float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                                translateTransition_laserBlue.stop ( );
                                translateTransition_laserBlue.setFromX ( x_from );
                                translateTransition_laserBlue.setFromY ( 0 );
                                translateTransition_laserBlue.setToX ( x_from );
                                translateTransition_laserBlue.setToY ( - 1200 );
                                translateTransition_laserBlue.play ( );
                            } else if (count_frameLaser==3 && (int_play_Green == 1)) {

                                int_play_Green = 0;
                                float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                                translateTransition_laserGreen.stop ( );
                                translateTransition_laserGreen.setFromX ( x_from );
                                translateTransition_laserGreen.setFromY ( 0 );
                                translateTransition_laserGreen.setToX ( x_from );
                                translateTransition_laserGreen.setToY ( - 1200 );
                                translateTransition_laserGreen.play ( );
                            } else if (count_frameLaser==4 && (int_play_White == 1)) {

                                int_play_White = 0;
                                float x_from = ( float ) imageView_ship.getTranslateX ( ) + 176 / 2;
                                translateTransition_laserWhite.stop ( );
                                translateTransition_laserWhite.setFromX ( x_from );
                                translateTransition_laserWhite.setFromY ( 0 );
                                translateTransition_laserWhite.setToX ( x_from );
                                translateTransition_laserWhite.setToY ( - 1200 );
                                translateTransition_laserWhite.play ( );
                            }
                        }
                    }


                }

            }
        }.start();



        stage.show();
    }

    public void start_Timer(){
        timer.stop ();
        timer = new Timer(((5-int_lose_condition)*900), actionListener);
        timer.start();
    }

    private boolean removeActiveKey(String codeString){
        Boolean isActive=currentlyActiveKeys.get(codeString);

        if(isActive!=null&&isActive){
            currentlyActiveKeys.put(codeString,false);
            return true;
        }else{
            return false;
        }
    }
    //////////

    public void game_Over(){
        translateTransition_gameOver.stop();
        translateTransition_gameOver.setFromX ( 0 );
        translateTransition_gameOver.setFromX ( -1220/2-700/2-100 );
        translateTransition_gameOver.setToX(0);
        translateTransition_gameOver.setToY(0);
        translateTransition_gameOver.play ();
    }


    public static void main(String args[]){
        launch(args);
    }
}