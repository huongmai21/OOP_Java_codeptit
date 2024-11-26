package OOP_Java;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Student
{
    public static int NUM=1;
    private String ma,name,dob;
    private float lt,th,diem;
    private int dtb,tuoi;
    
    public Student(String name, String dob, float lt, float th) throws ParseException
    {
        this.ma="PH"+String.format("%02d",NUM++);
        this.name=formatName(name);
        this.dob=dob;
        this.lt=lt;
        this.th=th;
    }
    
    private String formatName(String s) {
        String[] str = s.trim().split("\\s+");
        String res = "";
        for (String i : str) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length() - 1);
    }
    
    private int tinh(String dob) {
        String[] str = dob.split("/");
        tuoi= 2021-Integer.parseInt(str[2]);
        return tuoi;
    }

    public Float getLt() {
        return lt;
    }
    public Float getTh() {
        return th;
    }
    
    public int tinhdtb(float lt, float th)
    {
        if(lt>=8f && th>=8f)
        {
           diem =((lt+th)/2)+1; 
        }
        else if(lt>=7.5f && th>=7.5f)
        {
            diem =((lt+th)/2)+0.5f; 
        }
        else
        {
            diem =(lt+th)/2;
        }
        if((diem-(int)diem)*100>=50)
        {
            dtb=(int)diem+1;
        }
        else dtb=(int)diem;
        if(dtb>10) return 10;
        else return dtb;
    }
    
    public String PhanLoai()
    {
        tinhdtb(lt,th);
        if(dtb>=9) return "Xuat sac";
        else if(dtb>=8) return "Gioi";
        else if(dtb>=7) return "Kha";
        else if(dtb>=5) return "Trung binh";
        else return "Truot";
    }
    @Override
    public String toString()
    {
        return ma+" "+name+" "+tinh(dob)+" "+tinhdtb(lt,th)+" "+PhanLoai();
    }
}
public class XetTuyen {
    public static void main(String[] args) throws FileNotFoundException, ParseException
    {
        Scanner sc=new Scanner(new File("XETTUYEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            String dob=sc.nextLine();
            float lt=Float.parseFloat(sc.nextLine());
            float th=Float.parseFloat(sc.nextLine());
            Student stu=new Student(name,dob,lt,th);
            System.out.println(stu);
        }
    }
}