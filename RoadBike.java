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
public class RoadBike extends Bicycle {
    private int maximumMPH;
    
    public void setMaximumMPH(int maximumMPH){
        this.maximumMPH = maximumMPH;
    }
    
    public int getMaximumMPH (){
        return this.maximumMPH;
    }
}