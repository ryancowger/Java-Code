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
public class BicycleDemo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         MountainBike mountainbike1 = new MountainBike();
         MountainBike mountainBike2 = new MountainBike();
         RoadBike roadBike1 = new RoadBike();
         RoadBike roadBike2 = new RoadBike();
         
         System.out.println("The number of bicycles created is "  + roadBike2.getBicycleCount());
         System.out.println();
    }
}