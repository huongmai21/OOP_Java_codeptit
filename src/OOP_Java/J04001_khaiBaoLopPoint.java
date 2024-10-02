
package OOP_Java;

import java.util.Scanner;

class Point{
    private double x,y,dist;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //Point(p:Point): tao doi tuong la ban sao cuadoi tuong trong tham so
    public Point(Point p){
        
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }
    
    
    public double distance(Point A){
        return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }
    
    public double distance(Point s1, Point s2){
        return Math.sqrt((s1.x - s2.x) * (s1.x - s2.x) + (s1.y - s2.y) * (s1.y - s2.y));
        
    }

    @Override
    public String toString() {
        return String.format("%.4f", this.dist);
    }
    
    
}
public class J04001_khaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Point A = new Point(sc.nextDouble(), sc.nextDouble()), B = new Point(sc.nextDouble(), sc.nextDouble());
            A.setDist(A.distance(B));
            System.out.println(A);
        }
    }
}
