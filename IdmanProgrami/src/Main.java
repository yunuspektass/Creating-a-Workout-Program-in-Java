import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoş geldiniz...");

        String idmanlar = "Geçerli Hareketler...\n"
                         +"Burpee\n"
                         +"Pushup(Şınav)\n"
                         +"Situp(Mekik)\n"
                         +"Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturunuz");

        System.out.print("Burpee sayısı:");
        int burpee = scanner.nextInt();

        System.out.print("Pushup sayısı:");
        int pushup = scanner.nextInt();

        System.out.print("Situp sayısı:");
        int situp = scanner.nextInt();

        System.out.print("Squat sayısı:");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee,pushup,situp,squat);

        System.out.println("İdmanınız Başlıyor...");

      while (idman.idmanBittiMi() == false){

          System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat):");
          String tur = scanner.nextLine();

          System.out.print("Bu hareketten kaç tane yapıcaksınız?:");
          int sayi = scanner.nextInt();
          scanner.nextLine();
          idman.hareketYap(tur,sayi);
      }
        System.out.println("İdmanını başarıyla bitirdin. Tebrikler");
    }
}