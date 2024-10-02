
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
}

class TamGiac{
    private Point A , B, C;
    private double AB, BC, AC;

    public TamGiac(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.AB = A.distance(B);
        this.BC = B.distance(C);
        this.AC = A.distance(C);
    }

    @Override
    public String toString() {
        if(AB + BC <= AC || AB + AC <= BC || AC + BC <= AB)
            return String.format("INVALID");
        return String.format("%.3f", AB+BC+AC);
    }
    
}

public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());
            TamGiac P = new TamGiac(A,B,C);
            System.out.println(P);
        }
    }
}
