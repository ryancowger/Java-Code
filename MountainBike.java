/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycledemo;

/**
 *
 * @author Ryan
 */
public class MountainBike extends Bicycle {
    private String tireTread;
    private int mountainRating;

public void setTireTread(String tireTread){
    this.tireTread = tireTread;
}

public String getTireTread(){
    return this.tireTread;
}

public void setMountainRating(int mountainRating){
        this.mountainRating = mountainRating;
}

public int getMountainRating(){
    return this.mountainRating;
}


}
