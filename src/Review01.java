
public class Review01 {

    public static void main(String[] args) {

        int syo=1500;
        int syo_tax=tax(1500);
        System.out.println(syo +"円の商品の税込み価格は" +(syo+syo_tax)+"円(消費税は"+ syo_tax+"円)です。");
    }

    public static int tax(int syo) {
        int tax_par=8;
        int syo_tax = (syo * tax_par)/100;
        return syo_tax;
    }
}
