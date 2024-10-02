
package ThucHanh;

import java.util.Scanner;

class Vihicle{
    private String vin, man, color;
    private int year;
    private double cost;

    public Vihicle() {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return vin + " " + man + " " + cost + " " + year + " "+ color  ;
    }
    
    public void input(Scanner sc){
        vin = sc.nextLine();
        man = sc.nextLine().toUpperCase();
        color = sc.nextLine();
        year = sc.nextInt();
        cost = sc.nextDouble();
    }
    
}

class MS{
    private int n;
    Vihicle[] a;
           
    public MS() {
    }
    
    public void input(Scanner sc){
        n = sc.nextInt();
        a = new Vihicle[n];
        sc.nextLine();
        for(int i=0;i<n;++i){
            a[i] = new Vihicle();
            a[i].input(sc);
            sc.nextLine();
        }
    }
    
    public void out(){
        for(int i=0;i<n;++i){
            System.out.println(a[i]);
        }
        System.out.println(n);
    }
}

public class MangDoiTuong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        MS ms=new MS();
        ms.input(in);
        ms.out();
    }
}
