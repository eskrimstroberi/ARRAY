package tugas_8_array_meivayusnita;
import java.util.Scanner;
public class TUGAS_9_ARRAY_MEIVAYUSNITA {
    static Scanner masukkan = new Scanner (System.in);
    public static void main(String[] args) {
        String[] namaSiswa = {"Yogie","Dimas","Dea","Faiz","Radit"};
        int pilihan;
        System.out.print("masukkan pilihan anda: ");
        pilihan = masukkan.nextInt();
        if(pilihan<=4){
            System.out.println(namaSiswa[2]);
        }
        else{System.out.println("data tidak ditemukan");}
       
        

    }
}
