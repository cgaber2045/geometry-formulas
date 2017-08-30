
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
        public static double parallelogramArea(double base, double height) 
    {
        return base * height;
    }
    
        public static double trapezoidArea(double base1, double base2, double height) 
    {
        return (base1 + base2) / 2.0 * height;
    }
    
         public static double rectangularPrismVolume(double length, double width, double height) 
    {
        return length * width* height;
    }
    
         public static double coneVolume(double radius, double height) 
    {
        return Math.PI * Math.pow(radius, 2) * (height / 3.0);
    }
    
         public static double rectangularPrismSurfaceArea(double length, double width, double height) 
    {
        return 2 * (length*width + height*length + height*width);
    }    
    
         public static double sphereSurfaceArea(double radius) 
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }       
    
         public static double hypotenuseRightTriangle(double a, double b) 
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }    
    
         public static double distanceFormula(double x1, double x2, double y1, double y2) 
    {
        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2-y1, 2)));
    }        

         public static double slopeFormula(double x1, double x2, double y1, double y2) 
    {
        return (y2 - y1) / (x2 - x1);
    }     
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
