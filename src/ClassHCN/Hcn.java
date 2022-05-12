package ClassHCN;

public class Hcn {
    public int chieuDai;
    public int chieuRong;

    public Hcn() {
    }

    public Hcn(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChuvi() {
        return (chieuDai + chieuRong)*2;
    }

    public int getDienTich() {
        return chieuDai*chieuRong;
    }

    public String hienThi(){

                    return "Hình Chữ nhật có: "+ " Chiều dài " + chieuDai+"\n Chiều rộng "+ chieuRong;

                }
            }


