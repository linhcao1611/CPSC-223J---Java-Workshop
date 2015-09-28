// Programmer's name:   Linh Cao
// Email address:       linhcao@csu.fullerton.edu
// Course:              CPSC 223j
// Assignment number:   1
// Due date:            Sept 14, 2015
// Title:               Sphere Computations
// Purpose:             Find the area and the volume of any sphere
// This file name:      operations.java




public class operations {
    
    public static double sphereArea(double radius){
        double area;
        area = 4.0 * Math.PI*Math.pow(radius, 2);
        return area;
    }
    
    public static double sphereVol(double radius){
        double vol;
        vol = (4.0/3) * Math.PI * Math.pow(radius, 3);
        return vol;
    }
    
}
