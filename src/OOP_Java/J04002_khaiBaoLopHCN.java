
package OOP_Java;

import java.util.Scanner;

class Rectange{
    private double width, height, P, S;
    private String color;

    public Rectange() {
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){// Tra ve dien tich hcn
        this.S = this.width * this.height;
        return this.S;
    }
    
    public double findPerimeter(){ // Tra ve chu vi hcn
        this.P = (this.width + this.height) * 2;
        return this.P;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(color.charAt(0)));
        for(int i=1;i<color.length();++i){
            sb.append(Character.toLowerCase(color.charAt(i)));
        }
        color = sb.toString();
        return String.format("%.0f",this.findPerimeter()) + " " + String.format("%.0f", this.findArea()) + " " + color ;
    }
    
    
}

public class J04002_khaiBaoLopHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Rectange A = new Rectange(Double.parseDouble(sc.next()),Double.parseDouble(sc.next()),sc.next());        
        Rectange A = new Rectange();
        double x = sc.nextDouble();
        A.setWidth(x);
        x = sc.nextDouble();
        A.setHeight(x);
        String c = sc.next();
        A.setColor(c);
        if(A.getHeight() == 0 || A.getWidth() == 0) 
            System.out.println("INVALID");
        else{
            System.out.println(A);
        }
    }
}
