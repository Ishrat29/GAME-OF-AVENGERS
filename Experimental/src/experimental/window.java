
package Experimental;

import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class window{
    
   public Rectangle2D r,r1;
   public ImageView Thor,Time;
   private AnchorPane pane;
   private ArrayList<ImageView> imgList;
   private Text t1,t2;
   private int s=0; 
    
    private ArrayList<ImageView> block;
   // public ImageView Thor;
    boolean goUp,goDown,goRight,goLeft;

    window(){
        
        imgList=new ArrayList<>(); 
       //HBOX BELOW THE WINDOW 
       HBox h = new HBox();
       h.setMinHeight(50);
       h.setMinWidth(1300);
       h.setAlignment(Pos.CENTER);
       h.setStyle("-fx-background-color:black");
       
       
       
       
       //BACKGROUND IMAGE
       Image img = new Image("/pics/Background.jpg");
       ImageView BackGround = new ImageView(img);
       BackGround.setFitHeight(750);
       BackGround.setFitWidth(1300);
       
       
       
       
       
       //HERE COMES OUR HERO !!!!
        Image thor = new Image("/pics/Thor.png");
        Thor = new ImageView(thor);
        r1 = new Rectangle2D(Thor.getX(),Thor.getY(),Thor.getFitWidth(),Thor.getFitHeight());
        Thor.setFitHeight(100);
        Thor.setFitWidth(60);
        Thor.relocate(1100,300);
        
        t1=new Text();
        t1.setText("Score");
        t1.setFont(new Font("Italic",30));
        t1.setFill(Color.RED);
        t1.setX(1079);
        t1.setY(23);

        t2=new Text();
        t2.setText("0");
        t2.setFill(Color.RED);
        t2.setFont(new Font("Italic", 30));
        t2.setX(1160);
        t2.setY(24);
       
       
       //SETTING UP THE MAZE
       
       block=new ArrayList<>();
       
       Image b1 = new Image("/pics/red bricks.png");
       ImageView B1 = new ImageView(b1);
       block.add(B1);
       B1.setFitHeight(150);
       B1.setFitWidth(65);
       B1.setX(256);
       B1.setY(600);
       
       Image b2 = new Image("/pics/red bricks.png");
       ImageView B2 = new ImageView(b2);
       block.add(B2);
       B2.setFitHeight(150);
       B2.setFitWidth(65);
       B2.setX(256);
       B2.setY(450);
       
       Image b3 = new Image("/pics/red bricks.png");
       ImageView B3 = new ImageView(b3);
       block.add(B3);
       B3.setFitHeight(150);
       B3.setFitWidth(65);
       B3.setX(256);
       B3.setY(300);
       
       
       
       
       Image s1 = new Image("/pics/red stack.png");
       ImageView S1 = new ImageView(s1);
       block.add(S1);
       S1.setFitHeight(50);
       S1.setFitWidth(65);
       S1.setX(0);
       S1.setY(570);
       
       Image s2 = new Image("/pics/red stack.png");
       ImageView S2 = new ImageView(s2);
       block.add(S2);
       S2.setFitHeight(50);
       S2.setFitWidth(65);
       S2.setX(0);
       S2.setY(142);
       
       Image s3 = new Image("/pics/red stack.png");
       ImageView S3 = new ImageView(s3);
       block.add(S3);
       S3.setFitHeight(50);
       S3.setFitWidth(65);
       S3.setX(65);
       S3.setY(142);
       
       Image s4 = new Image("/pics/red stack.png");
       ImageView S4 = new ImageView(s4);
       block.add(S4);
       S4.setFitHeight(50);
       S4.setFitWidth(65);
       S4.setX(248);
       S4.setY(0);
       
       Image s5 = new Image("/pics/red stack.png");
       ImageView S5 = new ImageView(s5);
       block.add(S5);
       S5.setFitHeight(50);
       S5.setFitWidth(65);
       S5.setX(248);
       S5.setY(50);
       
       Image s6 = new Image("/pics/red stack.png");
       ImageView S6 = new ImageView(s6);
       block.add(S6);
       S6.setFitHeight(50);
       S6.setFitWidth(65);
       S6.setX(194);
       S6.setY(390);
       
       Image s7 = new Image("/pics/red stack.png");
       ImageView S7 = new ImageView(s7);
       block.add(S7);
       S7.setFitHeight(50);
       S7.setFitWidth(65);
       S7.setX(132);
       S7.setY(390);
       
       
       Image st1 = new Image("/pics/red stack.png");
       ImageView St1 = new ImageView(st1);
       block.add(St1);
       St1.setFitHeight(50);
       St1.setFitWidth(65);
       St1.setX(321);
       St1.setY(629);
       
       Image st2 = new Image("/pics/red stack.png");
       ImageView St2 = new ImageView(st2);
       block.add(St2);
       St2.setFitHeight(50);
       St2.setFitWidth(65);
       St2.setX(374);
       St2.setY(629);
       
       Image st3 = new Image("/pics/red stack.png");
       ImageView St3 = new ImageView(st3);
       block.add(St3);
       St3.setFitHeight(50);
       St3.setFitWidth(65);
       St3.setX(321);
       St3.setY(375);
       
       Image st4 = new Image("/pics/red stack.png");
       ImageView St4 = new ImageView(st4);
       block.add(St4);
       St4.setFitHeight(50);
       St4.setFitWidth(65);
       St4.setX(385);
       St4.setY(375);
       
       Image st5 = new Image("/pics/red stack.png");
       ImageView St5 = new ImageView(st5);
       block.add(St5);
       St5.setFitHeight(50);
       St5.setFitWidth(65);
       St5.setX(443);
       St5.setY(375);
       
       Image st6 = new Image("/pics/red stack.png");
       ImageView St6 = new ImageView(st6);
       block.add(St6);
       St6.setFitHeight(50);
       St6.setFitWidth(65);
       St6.setX(505);
       St6.setY(375);
       
       Image b4 = new Image("/pics/red bricks.png");
       ImageView B4 = new ImageView(b4);
       block.add(B4);
       B4.setFitHeight(150);
       B4.setFitWidth(65);
       B4.setX(567);
       B4.setY(278);
       
       Image b5 = new Image("/pics/red bricks.png");
       ImageView B5 = new ImageView(b5);
       block.add(B5);
       B5.setFitHeight(150);
       B5.setFitWidth(65);
       B5.setX(567);
       B5.setY(428);
       
       Image b6 = new Image("/pics/red bricks.png");
       ImageView B6 = new ImageView(b6);
       block.add(B6);
       B6.setFitHeight(150);
       B6.setFitWidth(65);
       B6.setX(567);
       B6.setY(140);
       
       Image st7 = new Image("/pics/red stack.png");
       ImageView St7 = new ImageView(st7);
       block.add(St7);
       St7.setFitHeight(50);
       St7.setFitWidth(65);
       St7.setX(632);
       St7.setY(279);
       
       Image st8 = new Image("/pics/red stack.png");
       ImageView St8 = new ImageView(st8);
       block.add(St8);
       St8.setFitHeight(50);
       St8.setFitWidth(65);
       St8.setX(503);
       St8.setY(140);
       
       Image st9 = new Image("/pics/red stack.png");
       ImageView St9 = new ImageView(st9);
       block.add(St9);
       St9.setFitHeight(50);
       St9.setFitWidth(65);
       St9.setX(443);
       St9.setY(140);
       
       
       
       
       Image br1 = new Image("/pics/red bricks.png");
       ImageView Br1 = new ImageView(br1);
       block.add(Br1);
       Br1.setFitHeight(150);
       Br1.setFitWidth(65);
       Br1.setX(765);
       Br1.setY(600);
       
       Image br2 = new Image("/pics/red bricks.png");
       ImageView Br2 = new ImageView(br2);
       block.add(Br2);
       Br2.setFitHeight(150);
       Br2.setFitWidth(65);
       Br2.setX(829);
       Br2.setY(300);
       
       Image br3 = new Image("/pics/red bricks.png");
       ImageView Br3 = new ImageView(br3);
       block.add(Br3);
       Br3.setFitHeight(150);
       Br3.setFitWidth(65);
       Br3.setX(829);
       Br3.setY(150);
       
       Image br4 = new Image("/pics/red bricks.png");
       ImageView Br4 = new ImageView(br4);
       block.add(Br4);
       Br4.setFitHeight(150);
       Br4.setFitWidth(65);
       Br4.setX(829);
       Br4.setY(0);
       
       Image stk1 = new Image("/pics/red stack.png");
       ImageView Stk1 = new ImageView(stk1);
       block.add(Stk1);
       Stk1.setFitHeight(50);
       Stk1.setFitWidth(65);
       Stk1.setX(765);
       Stk1.setY(120);
       
       Image stk2 = new Image("/pics/red stack.png");
       ImageView Stk2 = new ImageView(stk2);
       block.add(Stk2);
       Stk2.setFitHeight(50);
       Stk2.setFitWidth(65);
       Stk2.setX(894);
       Stk2.setY(177);

       Image stk3 = new Image("/pics/red stack.png");
       ImageView Stk3 = new ImageView(stk3);
       block.add(Stk3);
       Stk3.setFitHeight(50);
       Stk3.setFitWidth(65);
       Stk3.setX(958);
       Stk3.setY(177);
       
       Image stk4 = new Image("/pics/red stack.png");
       ImageView Stk4 = new ImageView(stk4);
       block.add(Stk4);
       Stk4.setFitHeight(50);
       Stk4.setFitWidth(65);
       Stk4.setX(1020);
       Stk4.setY(177);
       
       Image stk5 = new Image("/pics/red stack.png");
       ImageView Stk5 = new ImageView(stk5);
       block.add(Stk5);
       Stk5.setFitHeight(50);
       Stk5.setFitWidth(65);
       Stk5.setX(1235);
       Stk5.setY(424);
       
       Image stk6 = new Image("/pics/red stack.png");
       ImageView Stk6 = new ImageView(stk6);
       block.add(Stk6);
       Stk6.setFitHeight(50);
       Stk6.setFitWidth(65);
       Stk6.setX(1176);
       Stk6.setY(424);
       
       Image stk7 = new Image("/pics/red stack.png");
       ImageView Stk7 = new ImageView(stk7);
       block.add(Stk7);
       Stk7.setFitHeight(50);
       Stk7.setFitWidth(65);
       Stk7.setX(1115);
       Stk7.setY(424);
       
       Image br5 = new Image("/pics/red bricks.png");
       ImageView Br5 = new ImageView(br5);
       block.add(Br5);
       Br5.setFitHeight(150);
       Br5.setFitWidth(65);
       Br5.setX(1080);
       Br5.setY(142);
       
       Image br6 = new Image("/pics/red bricks.png");
       ImageView Br6 = new ImageView(br6);
       block.add(Br6);
       Br6.setFitHeight(150);
       Br6.setFitWidth(65);
       Br6.setX(1050);
       Br6.setY(470);
       
       
       
       
       
       
       //SETTING UP STONES
       Image soulStone = new Image("/pics/SoulStone.jpg");
       ImageView Soul = new ImageView(soulStone);
       imgList.add(Soul);
       Soul.setFitHeight(35);
       Soul.setFitWidth(30);
       Soul.setX(31);
       Soul.setY(80);
      
       Image powerStone = new Image("/pics/PowerStone.jpg");
       ImageView Power = new ImageView(powerStone);
       imgList.add(Power); 
       Power.setFitHeight(35);
       Power.setFitWidth(27);
       Power.setX(14);
       Power.setY(675);
       
       Image realityStone = new Image("/pics/RealityStone.jpg");
       ImageView Reality = new ImageView(realityStone);
       imgList.add(Reality);
       Reality.setFitHeight(35);
       Reality.setFitWidth(30);
       Reality.setX(342);
       Reality.setY(577);
       
       Image spaceStone = new Image("/pics/SpaceStone.jpg");
       ImageView Space = new ImageView(spaceStone);
       imgList.add(Space);
       Space.setFitHeight(35);
       Space.setFitWidth(30);
       Space.setX(915);
       Space.setY(112);
       
       Image mindStone = new Image("/pics/MindStone.jpg");
       ImageView Mind = new ImageView(mindStone);
       imgList.add(Mind);
       Mind.setFitHeight(35);
       Mind.setFitWidth(30);
       Mind.setX(1130);
       Mind.setY(490);
       
       Image timeStone = new Image("/pics/TimeStone.jpg");
       ImageView Time = new ImageView(timeStone);
       Time = new ImageView(timeStone);
       imgList.add(Time);
       Time.setFitHeight(35);
       Time.setFitWidth(30);
       Time.setX(491);
       Time.setY(320);
     
       
       
       
       
       
       //EXIT BUTTON AND ACTION
       Button btn = new Button("EXIT");
       btn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
             Platform.exit();     
           }
       });
       h.getChildren().addAll(btn);
       
       
       
       
       
       
       //ADDING ALL THE ELEMENTS TO OUR ANCHORPANE
       pane = new AnchorPane(h);
       pane.setMinHeight(800);
       pane.setMinWidth(1300);       
       pane.setBottomAnchor(h,0.0);
       pane.getChildren().addAll(BackGround,Thor,B1,B2,B3,S1,S2,S3,S4,S5,S6,S7,St1,
               St2,St3,St4,St5,St6,B4,B5,B6,St7,St8,St9,Br1,Br2,Br3,Br4,Stk1,Stk2,
               Stk3,Stk4,Stk5,Stk6,Stk7,Br5,Br6,Soul,Reality,Time,Mind,Space,Power);
       
       
       
       
       
       //SHOWING THE SCENE
       Scene scene = new Scene(pane);
       Stage stage = new Stage();
       stage.setScene(scene);
       stage.show();
       music();
       
       
       
       
       //MOVING OUR HERO THROUGH KEYBOARD
       scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
           @Override
           public void handle(KeyEvent event) {
               switch(event.getCode()){
                   case UP: goUp=true;break;
                   case DOWN: goDown=true;break;
                   case LEFT: goLeft=true;break;
                   case RIGHT: goRight=true;break;
               }   
           }
       });
       
       scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
           @Override
           public void handle(KeyEvent event) {
               switch(event.getCode()){
                   case UP: goUp=false;break;
                   case DOWN: goDown=false;break;
                   case LEFT: goLeft=false;break;
                   case RIGHT: goRight=false;break;
           }       
          }
       });
       
       AnimationTimer timer = new AnimationTimer(){
           double delta = 4;
           @Override
           public void handle(long now) {
               double currX=Thor.getLayoutX();
               double currY=Thor.getLayoutY();
               
               if(goUp){
                  currY-=delta;
                  checkCollision();
               }
               if(goDown){
                  currY+=delta;
                  checkCollision();
               }
               if(goLeft){
                  currX-=delta;
                  checkCollision();

               }
               if(goRight){
                  currX+=delta;
                  checkCollision();
               }
              // if(!checkBlock(currX,currY))
                   Thor.relocate(currX,currY);
           }
       };
       timer.start();
    }
    
    
    
     public boolean checkBlock(double x,double y) {
        for (ImageView b : block) {
            if(b.intersects(x,y,60,100))
                return true;

        }
        return false;
    }
     
      //For Background Music
  public void start(Stage s) throws Exception{
         //leave empty;
     }


    MediaPlayer mediaplayer;
    public void music(){
        String s="C:\\Users\\USER\\Documents\\NetBeansProjects\\sone\\src\\music\\sone.mp3";
        Media h= new Media(Paths.get(s).toUri().toString());
        mediaplayer = new MediaPlayer(h);
        mediaplayer.play();
     }
    
    
    //FOR Earning Scores.
  private void checkCollision(){
     for(ImageView e:imgList){
        if(e.getBoundsInParent().intersects(Thor.getBoundsInParent())){
           s+=100;
           t2.setText(""+s);
           imgList.remove(e);
           pane.getChildren().remove(e);
           break;
        }
     }
  }

}
