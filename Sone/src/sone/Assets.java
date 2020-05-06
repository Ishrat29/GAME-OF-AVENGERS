/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sone;
import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Assets {
    public static ArrayList<Image> hero;
    public static int i=-1;

    public Assets(){
        hero=new ArrayList<Image>();
        File file = new File("D:\\test\\src\\images\\Hulk.jpg");
        Image hulk = new Image(file.toURI().toString());
        hero.add(hulk);
       
        Image ironman = new Image("/images/Ironman.jpg");
        hero.add(ironman);
        Image black = new Image("/images/BlackWidow.jpg");
        ImageView Black = new ImageView(black);
        hero.add(black);
        Image hawk = new Image("/images/Hawk.png");
        hero.add(hawk);
        Image captain = new Image("/images/x.jpg");
        hero.add(captain);
    }

    public static Image getHero(){
        i++;
        return hero.get(i);
    }

    public static int  getLength(){
        return hero.size();
    }
}

    

