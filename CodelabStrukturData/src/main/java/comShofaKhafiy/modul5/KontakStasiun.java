package comShofaKhafiy.modul5;

import java.util.HashMap;
import java.util.Map;

public class KontakStasiun {

    public static void main(String[] args) {

        // TODO1: Inisialisasi HashMap
        // HashMap<String, String> kontakStasiun =


        HashMap<String, String> kontakStasiun =
                new HashMap<>();


        kontakStasiun.put(
                "FATIH - Kepala Stasiun",
                "081234567890"
        );

        kontakStasiun.put(
                "WIRA - Customer Service",
                "081298765432"
        );

        kontakStasiun.put(
                "EGA - Keamanan",
                "081255555555"
        );


        // TODO2: Tampilkan seluruh isi kontak menggunakan entrySet()

        System.out.println("=== Daftar Kontak Stasiun ===");

        for (Map.Entry<String, String> entry
                : kontakStasiun.entrySet()) {

            System.out.println(
                    "Nama: "
                            + entry.getKey()
                            + " | Telepon: "
                            + entry.getValue()
            );
        }



        // TODO3: Cari nomor telepon berdasarkan nama menggunakan get()

        String namaDicari =
                "WIRA - Customer Service";

        String nomorTelepon =
                kontakStasiun.get(namaDicari);

        if (nomorTelepon != null) {

            System.out.println(
                    "\nNomor telepon "
                            + namaDicari
                            + ": "
                            + nomorTelepon
            );

        } else {

            System.out.println(
                    "\nKontak "
                            + namaDicari
                            + " tidak ditemukan."
            );
        }



        // TODO4: Cek apakah kontak ada menggunakan containsKey()

        String namaPengecekan =
                "Keamanan";

        if (kontakStasiun.containsKey(namaPengecekan)) {

            System.out.println(
                    "Kontak "
                            + namaPengecekan
                            + " tersedia di sistem."
            );

        } else {

            System.out.println(
                    "Kontak "
                            + namaPengecekan
                            + " tidak tersedia."
            );
        }



        // TODO5: Hapus data kontak menggunakan remove()

        String namaHapus =
                "FATIH - Kepala Stasiun";

        kontakStasiun.remove(namaHapus);

        System.out.println(
                "\nIsi kontak setelah menghapus "
                        + namaHapus
                        + ":"
        );

        System.out.println(kontakStasiun);
    }
}