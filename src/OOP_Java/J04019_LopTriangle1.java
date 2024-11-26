
package OOP_Java;

import java.util.Scanner;

class Point{
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        p = this;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point A){
         return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }
    
    public double distance(Point s1, Point s2){
        return Math.sqrt((s1.x - s2.x) * (s1.x - s2.x) + (s1.y - s2.y) * (s1.y - s2.y));
        
    }
    
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
}

class Triangle{
    private Point A , B, C;
    private double canh1, canh2, canh3;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.canh1 = A.distance(B);
        this.canh2 = B.distance(C);
        this.canh3 = A.distance(C);
    }

   
    public boolean valid() {
        if(canh1 + canh2 <= canh3 || canh1 + canh3 <= canh2 || canh3 + canh2 <= canh1)
            return false;
        return true;
    }
    
    double getPerimeter(){
        return (double) Math.round((this.canh1 + this.canh2 + this.canh3)*1000)/1000;
    }
    
}

public class J04019_LopTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
