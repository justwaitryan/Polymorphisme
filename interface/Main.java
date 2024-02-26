package pkginterface;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Phone redmiNote8 = new Xiaomi();

        PhoneUser ryan = new PhoneUser(redmiNote8);

        ryan.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                ryan.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                ryan.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                ryan.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                ryan.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }
}
