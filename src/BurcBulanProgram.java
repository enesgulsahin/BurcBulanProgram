import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int day, month;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay :");
        month = inp.nextInt();

        System.out.print("Doğduğunuz Gün :");
        day = inp.nextInt();

            if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.print("Geçerli bir sayı giriniz");
             }else {
            if (month == 3 && day > 20 || month == 4 && day < 21) {
                System.out.print("Koç");
            } else if (month == 4 && day > 20 || month == 5 && day < 22) {
                System.out.print("Boğa");
            }else if(month == 5 && day > 21 || month == 6 && day < 23) {
                System.out.print("İkizler");
            }else if(month == 6 && day > 22 || month == 7 && day < 23) {
                System.out.print("Yengeç");
            }else if(month == 7 && day > 22 || month == 8 && day < 23){
                System.out.print("Aslan");
            }else if(month == 8 && day > 22 || month == 9 && day < 23){
                System.out.print("Başak");
            }else if (month == 9 && day > 22 || month == 10 && day < 23){
                System.out.print("Terazi");
            }else if(month == 10 && day > 22 || month == 11 && day < 22){
                System.out.print("Akrep");
            }else if(month == 11 && day > 21 || month == 12 && day < 22){
                System.out.print("Yay");
            }else if(month == 12 && day > 21 || month == 1 && day < 22){
                System.out.print("Oğlak");
            }else if(month == 1 && day > 21 || month == 2 && day < 20){
                System.out.print("Kova");
            }else if(month == 2 && day > 19 || month == 3 && day < 21){
                System.out.print("Balık");
            }
        }
    }
}