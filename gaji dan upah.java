import java.util.Scanner;

public class gaji
dan upah
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam, upah, denda, lembur, upah2;
        System.out.print("Jam kerja   : ");
        jam = input.nextInt();
        upah = jam * 8000;
        denda = (60 - jam) * 1000;
        lembur = (jam - 60) * 6000;
        upah2 = 60 * 8000;
        if (jam >= 50 && jam <= 60) {
            System.out.println("Upah   = Rp. " + upah);
            System.out.println("Lembur = Rp. \t  0");
            System.out.println("Denda  = Rp. \t  0");
            System.out.println("---------------------");
            System.out.println("Total  = Rp. " + upah);
        } else if (jam < 50) {
            System.out.println("Upah   = Rp. " + upah);
            System.out.println("Lembur = Rp. \t  0");
            System.out.println("Denda  = Rp.  " + denda);
            System.out.println("---------------------");
            System.out.println("Total  = Rp. " + (upah - denda));
        } else {
            System.out.println("Upah   = Rp. " + upah2);
            System.out.println("Lembur = Rp.  " + lembur);
            System.out.println("Denda  = Rp. \t  0");
            System.out.println("---------------------");
            System.out.println("Total  = Rp. " + (upah2 + lembur));
        }
    }
}
