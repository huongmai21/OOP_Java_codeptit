
package ThucHanh;

interface IPTGT{
    double getGiaBan();
}

class PTGT implements IPTGT{
    protected String ma,hang,ngayLanBanh;
    protected double giaGoc;

    public PTGT() {
    }

    public PTGT(String hang, String ngayLanBanh, double giaGoc) {
        this.hang = hang;
        this.ngayLanBanh = ngayLanBanh;
        this.giaGoc = giaGoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNgayLanBanh() {
        return ngayLanBanh;
    }

    public void setNgayLanBanh(String ngayLanBanh) {
        this.ngayLanBanh = ngayLanBanh;
    }

    public double getGiaToc() {
        return giaGoc;
    }

    public void setGiaToc(double giaGoc) {
        this.giaGoc = giaGoc;
    }

    @Override
    public String toString() {
        return ma + " " + hang + " " + ngayLanBanh + " " + giaGoc ;
    }
    
    @Override
    public double getGiaBan() {
        return this.giaGoc;  // Will be overridden by subclasses
    }
    
}

class Oto extends PTGT{
    private int soCho;
    private double dongCo;

    public Oto() {
    }

    public Oto(String hang, String ngayLanBanh, double giaGoc, int soCho, double dongCo) {
        super(hang, ngayLanBanh, giaGoc);
        this.soCho = soCho;
        this.dongCo = dongCo;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public double getDongCo() {
        return dongCo;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }
    
    public void setMa(){
        this.ma = this.hang.substring(0, 2).toUpperCase() + "-001";
    }
        
    
    public double getGiaBan() {
        int currentYear = 2023; // Assuming current year for calculation
        int yearOfRegistration = Integer.parseInt(ngayLanBanh.split("/")[1]);

        double giaBan = this.giaGoc;
        if (yearOfRegistration == currentYear) {
            giaBan += this.giaGoc * 0.1; // Add 10% tax
        } else if (yearOfRegistration >= currentYear - 2) {
            giaBan -= this.giaGoc * 0.1; // 10% discount if used for 1-2 years
        } else if (yearOfRegistration >= currentYear - 5) {
            giaBan -= this.giaGoc * 0.2; // 20% discount for 3-5 years
        } else {
            giaBan -= this.giaGoc * 0.3; // 30% discount for more than 5 years
        }

        return giaBan;
    }
    
    @Override
    public String toString() {
        return super.toString()+ " " + soCho + " " + dongCo;
    }
    
}

class XeTai extends PTGT{
    private double trongTai;
    private boolean thung;

    public XeTai(String hang, String ngayLanBanh, double giaGoc, double trongTai, boolean thung) {
        super(hang, ngayLanBanh, giaGoc);
        this.trongTai = trongTai;
        this.thung = thung;
    }

    public double getTrongTai() {
        return this.trongTai;
    }

    public boolean isThung() {
        return this.thung;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public void setThung(boolean thung) {
        this.thung = thung;
    }

    public void setMa() {
        this.ma = "T-" + "002"; // Similar logic as Oto
    }

    @Override
    public double getGiaBan() {
        int currentYear = 2023;
        int yearOfRegistration = Integer.parseInt(ngayLanBanh.split("/")[1]);

        double giaBan = this.giaGoc;
        if (yearOfRegistration == currentYear) {
            giaBan += this.giaGoc * 0.1; // Add 10% tax
        } else if (yearOfRegistration >= currentYear - 3) {
            giaBan -= this.giaGoc * 0.1; // 10% discount if used for less than 3 years
        } else {
            giaBan -= this.giaGoc * 0.2; // 20% discount if more than 3 years
        }

        if (this.thung) {
            giaBan += this.giaGoc * 0.1; // Add 10% for having a thung (cargo)
        }

        return giaBan;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.hang + " " + this.ngayLanBanh + " " + this.trongTai + " " + this.getGiaBan();
    }
}

public class BaiToanQuanLyPhuongTienGiaoThong {
    public static void main(String[] args) {
        Oto o=new Oto("Yaris", "02/2023", 32000, 4, 1.5);
        o.setMa();
        System.out.println(o);
        XeTai t=new XeTai("Ranger", "10/2018", 16000, 3.5, true);
        t.setMa();
        System.out.println(t);
    }
}
