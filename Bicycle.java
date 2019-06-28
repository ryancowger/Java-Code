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
public abstract class Bicycle {
    
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;
    private static int bicycleCount = 0;
    
    //constructor
    public Bicycle(){
        bicycleCount++;
    }
 
    public void changeCadence(int newValue) {
         cadence = newValue;
    }
 
    public void changeGear(int newValue) {
         gear = newValue;
    }
 
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
 
    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
 
    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
    
    public void setCadence(int cadence){
        this.cadence = cadence;
    }
    
    public int getCadence(){
        return this.cadence;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public int getSpeed(int speed){
        return this.speed;
    }
    public void setGear(int gear){
     this.gear = gear;
    }
    
    public int getGear(int gear){
        return this.gear;}
    
    public int getBicycleCount (){
        return bicycleCount;
    }
    
}


