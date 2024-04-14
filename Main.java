
import java.util.Scanner;


/**
 *
 * @author TIKA
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Laptop lenovo = new Lenovo();
        Laptop toshiba = new Toshiba();
        Laptop macbook = new MacBook();
        
        System.out.println("Selamat datang di sistem kontrol Laptop! ");
        System.out.println("Perintah yang tersedia: ON, OF, UP, DOWN ");
        System.out.println("Silahkah tentukan laptop yang ingin di kendalikan: Lenovo, Toshiba, MacBook");
        String laptopChoice = scanner.nextLine().toLowerCase();
        
        Laptop selectedLaptop;
        
        switch (laptopChoice) {
            case "lenovo":
                selectedLaptop = lenovo;
                break;
            case "toshiba":
                selectedLaptop = toshiba;
                break;
            case "macbook":
                selectedLaptop = macbook;
                break;
            default:
                System.out.println("Pilihan laptop yang dipilih tidak valid! ");
                return;
                
        }
        
        LaptopUser user = new LaptopUser(selectedLaptop);
        
        while (true) {
            System.out.println("Masukkan perintah (ON, OFF, UP, DOWN) atau 'EXIT' untuk keluar: ");
            String command = scanner.nextLine().toUpperCase();
            
            switch (command) {
                case "ON" :
                    user.turnOnLaptop();
                    break;
                case "OFF" :
                    user.turnOffLaptop();
                    break;
                case "UP" :
                    user.makeLaptopLouder();
                    break;
                case "DOWN" :
                    user.makeLaptopSilence();
                    break;
                case "EXIT" :
                    System.out.println("Keluar!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Perintah tidak valid! silahkan coba lagi. ");
                    
            }
        }
    }
    
}
