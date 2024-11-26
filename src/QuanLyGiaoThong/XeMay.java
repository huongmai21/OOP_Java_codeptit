
package QuanLyGiaoThong;

import java.util.Calendar;


public class XeMay extends PTGT implements TinhGia{
    private double congsuat;

    public XeMay() {
    }

    public XeMay(String ma, String hang, int nam, double gia, String mau, double congsuat) {
        super(ma, hang, nam, gia, mau);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }
    
    public double getGia(){
        Calendar c = Calendar.getInstance(); // thời gian hiện thời
        int y = c.get(Calendar.YEAR);
        //if(2024 - super.getNam() >= 2)
        if(y - super.getNam() >= 2)
            return (super.getGia()*0.95);
        else 
            return super.getGia();
    }
    public String toString(){
        return super.getMa()+"\t"+super.getHang()+"\t"+super.getNam()
                +"\t"+getGia()+"\t"+super.getMau()+"\t"+congsuat;
    }
}
