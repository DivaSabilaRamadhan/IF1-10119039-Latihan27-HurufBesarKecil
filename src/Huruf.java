import java.util.Scanner;

/**
 *
 * @author Diva Sabila Ramadhan 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan 
 */
public class Huruf {

    static Scanner scan = new Scanner(System.in);
    
    public static String masukkanKalimat(){
        System.out.print("Masukkan Kalimat :");
        return scan.nextLine();
    }
    
    public static void tampilKalimat(String kalimat){
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf kecil : ".concat(kalimat.toLowerCase()));
    }
    
    public static void main(String[] args) {
        tampilKalimat(masukkanKalimat());
        System.out.println("Develpoed by : Diva Sabila Ramadhan");
    }
    
}
