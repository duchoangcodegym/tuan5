import java.util.Scanner;

public class lophinhchunhatb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong:");
        double width = scanner.nextDouble();
        System.out.print("nhap chieu cao:");
        double height = scanner.nextDouble();
        lophinhchunhat rectangle = new lophinhchunhat(width, height);
        System.out.println("hinh cua ban \n" + rectangle.display());
            System.out.println("chu vi la: " + rectangle.getPrimeter());
        System.out.println("dien tich la : " + rectangle.Area());

    }
}
