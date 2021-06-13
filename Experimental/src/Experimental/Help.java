package Experimental;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Help {

    private AnchorPane pane;

    Help(){

        Image img = new Image("E:/Github/Java_Game_project/java_project/Experimental/src/pics/ins.jpg");
        ImageView instruction = new ImageView(img);
        instruction.setFitHeight(689);
        instruction.setFitWidth(1243);
        instruction.setPreserveRatio(true);


        pane = new AnchorPane();
        pane.setStyle("-fx-background-color: Black");
        pane.setMinHeight(689);
        pane.setMinWidth(1243);
        pane.setMaxHeight(689);
        pane.setMaxWidth(1243);
        pane.getChildren().add(instruction);


        Scene scene = new Scene(pane);
        scene.getRoot().requestFocus();
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

}
