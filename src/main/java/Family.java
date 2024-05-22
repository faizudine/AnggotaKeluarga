public class Family {
    public static void main(String[] args) {
        AnggotaKeluarga bapakSulis = new OrangTua("Sulistiyono", "Magelang", "09 September 1972", "Guru", "Kabupaten Magelang");
        AnggotaKeluarga ibuMaryam = new OrangTua("Siti Maryam", "Magelang", "10 Oktober 1974", "Guru Sekolah Dasar", "Kabupaten Magelang");
        AnggotaKeluarga Faiz = new Anak("Muhammad Faiz Syafiq Izzudin", "Magelang", "30 Oktober 2003", "Pelajar/Mahasiswa", "Magelang");
        AnggotaKeluarga Haidar = new Anak("Ahmad Haidar", "Magelang", "12 Agustus 2007", "Pelajar", "Magelang");

        System.out.println("Keluarga ku:");
        System.out.println("------ Bapak ------");
        System.out.println(bapakSulis.getDetails());

        System.out.println("------ Ibu ------");
        System.out.println(ibuMaryam.getDetails());

        System.out.println("------ Anak ------");
        System.out.println(Faiz.getDetails());
        System.out.println(Haidar.getDetails());
    }
}
