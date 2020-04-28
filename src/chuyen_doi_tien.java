import java.util.Scanner;

public class chuyen_doi_tien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tien USD");
        int tigia = 23000;
        int usd = input.nextInt();
        System.out.println("chuyen thanh VND:");
        int vnd = tigia*usd;
        System.out.println(vnd);
    }
}
