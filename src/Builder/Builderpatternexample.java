/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;


public class Builderpatternexample {


    public static void main(String[] args) {
        
        
Vehicle car=new Vehicle.VehicleBuilder("1400cc", 4).setAirbags(4).bulid();
Vehicle bike=new Vehicle.VehicleBuilder("1600 cc", 3).bulid();

        System.out.println(car.getEngin());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());
        
        
        System.out.println(bike.getEngin());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
    }
    
}
