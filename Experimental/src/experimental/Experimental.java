package Experimental;

import java.io.FileInputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Experimental extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception{
        BorderPane pane = new BorderPane();
        pane.setMinHeight(600);
        pane.setMinWidth(749);
        
        
        Text txt = new Text("Welcome To The World Of Avengers!!!");
        txt.setFill(Color.BEIGE);
        txt.setFont(Font.font("OCR A Extended",FontWeight.BOLD,FontPosture.REGULAR,30));
        txt.setStrokeWidth(2);
        txt.setStroke(Color.CADETBLUE);
        
        
        VBox v = new VBox();
        v.setMinHeight(75);
        v.setMinWidth(500);
        v.setAlignment(Pos.CENTER);
        v.setStyle("-fx-background-color:black");
        v.getChildren().add(txt);
        
        
        //image for button
        FileInputStream input = new FileInputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\Experimental\\src\\pics\\start_button.png");
        Image img = new Image(input); 
        ImageView iw = new ImageView(img);
        
        // here goes the button
        Button btn = new Button("",iw);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               window box = new window();
               stage.close();
            }
        });
        
        
        HBox h = new HBox();
        h.setMinHeight(75);
        h.setMinWidth(500);
        h.setAlignment(Pos.CENTER);
        h.setStyle("-fx-background-color:black");   
        
        h.getChildren().add(btn);
        
        Image ig = new Image("/pics/white_bg.jpg");
        ImageView i = new ImageView(ig);
        i.setX(0);
        i.setY(0);
        i.setFitHeight(450); 
        i.setFitWidth(749);
        i.setPreserveRatio(true);  
        
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(i);
        stackPane.getChildren().add(btn);
        
        
        pane.setTop(v);
        pane.setBottom(h);
        pane.setCenter(stackPane);
       
        
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}