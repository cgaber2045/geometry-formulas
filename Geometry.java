
/**
 * Does various mathematical calculations.
 * 
 * @author Chris Gaber 
 * @version 8/30/17
 */

public class Geometry 
{
    
     /**
     * Calculates triangle area
     *
     * @param base The base of the triangle
     * @param height The height of the triangle
     */
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
     /**
     * Calculates rectangle area
     *
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     */
    
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
     /**
     * Calculates sphere volume
     *
     * @param radius The radius of the sphere
     */
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
     /**
     * Calculates parallelogram area
     *
     * @param base The base of the parallelogram
     * @param height The height of the parallelogram
     */
    
        public static double parallelogramArea(double base, double height) 
    {
        return base * height;
    }
    
     /**
     * Calculates trapezoid area
     *
     * @param base1 The base of the trapezoid
     * @param base2 The base of the trapezoid
     * @param height The height of the trapezoid
     */
    
        public static double trapezoidArea(double base1, double base2, double height) 
    {
        return (base1 + base2) / 2.0 * height;
    }
    
    /**
     * Calculates the volume of a rectangular prism
     *
     * @param length The length of the rectangular prism
     * @param width The width of the rectangular prism
     * @param height The height of the rectangular prism
     */
    
         public static double rectangularPrismVolume(double length, double width, double height) 
    {
        return length * width * height;
    }
    
    /**
     * Calculates volume of a cone
     *
     * @param radius The radius of the cone
     * @param height The height of the cone
     */
    
         public static double coneVolume(double radius, double height) 
    {
        return Math.PI * Math.pow(radius, 2) * (height / 3.0);
    }
    
    /**
     * Calculates surface area of a rectangular prism
     *
     * @param length The length of the rectangular prism
     * @param width The width of the rectangular prism
     * @param height The height of the rectangular prism
     */
    
         public static double rectangularPrismSurfaceArea(double length, double width, double height) 
    {
        return 2 * (length*width + height*length + height*width);
    }    
    
    /**
     * Calculates surface area of a sphere
     *
     * @param radius The radius of the sphere
     */
    
         public static double sphereSurfaceArea(double radius) 
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }       
    
    /**
     * Calculates hypotenuse of a right triangle
     *
     * @param a The leg of the triangle
     * @param b The other leg of the triangle
     */
    
         public static double hypotenuseRightTriangle(double a, double b) 
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }    
    
    /**
     * Calculates distance formula
     *
     * @param x1 The x value of first coordinate
     * @param x2 The x value of second coordinate
     * @param y1 The y value of first coordinate
     * @param y2 The x value of second coordinate
     */
    
         public static double distanceFormula(double x1, double x2, double y1, double y2) 
    {
        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2-y1, 2)));
    }        

    /**
     * Calculates slope formula in decimal
     * 
     * @param x1 The x value of first coordinate
     * @param x2 The x value of second coordinate
     * @param y1 The y value of first coordinate
     * @param y2 The x value of second coordinate
     */
    
         public static double slopeFormula(double x1, double x2, double y1, double y2) 
    {
        return (y2 - y1) / (x2 - x1);
    }     
    
    /**
     * Calculates slope formula in decimal
     * 
     * @param x1 The x value of first coordinate
     * @param x2 The x value of second coordinate
     * @param y1 The y value of first coordinate
     * @param y2 The x value of second coordinate
     */
    
         public static double heronsFormula(double a, double b, double c) 
    {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }     
    
    public static void main(String[] args) 
    {
        //Triangle Areas
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println("Triangle Area 1: " + ta1);
        System.out.println("Triangle Area 2: " + ta2);
        
        //Rectangle Area
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println("Rectangle Area: " + ra1);
        
        //Parallelogram Area
        double pa1 = parallelogramArea(3.2, 4.5);
        System.out.println("Parallelogram Area: " + pa1);
        
        //Trapezoid Area
        double tra1 = trapezoidArea(3.2, 4.5, 6.0);
        System.out.println("Trapezoid Area: " + tra1);
        
        //Rectangular Prism Volume
        double rpv1 = rectangularPrismVolume(3.2, 4.5, 6.0);
        System.out.println("Rectangular Prism Volume: " + rpv1);
        
        //Cone Volume
        double cv1 = coneVolume(2.2, 4.4);
        System.out.println("Cone Volume: " + cv1);
            
        //Rectangular Prism Surface Area
        double rpsa1 = rectangularPrismSurfaceArea(3.2, 4.5, 6.0);
        System.out.println("Rectangular Prism Surface Area: " + rpsa1); 
        
        //Sphere Surface Area
        double ssa1 = sphereSurfaceArea(3.2);
        System.out.println("Sphere Surface Area: " + ssa1);
        
        //Hypotenuse of Right Triangle
        double hrt1 = hypotenuseRightTriangle(3.2, 4.5);
        System.out.println("Hypotenuse of Right Triangle: " + hrt1);
        
        //Distance Formula
        double df1 = distanceFormula(3.2, 4.5, 6.0, 7.2);
        System.out.println("Distance Formula: " + df1);
        
        //Slope Formula
        double sf1 = slopeFormula(3.2, 4.5, 6.0, 7.2);
        System.out.println("Slope Formula: " + sf1);

        double hf1 = heronsFormula(3 , 4 , 5);
        System.out.println("Area of a triangle given 3 sides: " + hf1);
        
        
    }
}
