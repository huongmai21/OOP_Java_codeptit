package ThucHanh.IOFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class J07001_DocFileVanBan {
    public static void main(String[] args)
    {
        try {
            Scanner sc=new Scanner(new File("DATA.in"));
            while(sc.hasNext())
            {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(J07001_DocFileVanBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
