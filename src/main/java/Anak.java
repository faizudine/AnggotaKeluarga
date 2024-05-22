import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Anak implements AnggotaKeluarga {
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String pekerjaan;
    private String tempatTinggal;
    private int umur;

    public Anak(String nama, String tempatLahir, String tanggalLahir, String pekerjaan, String tempatTinggal) {
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.tempatTinggal = tempatTinggal;
        this.umur = hitungUmur(tanggalLahir);
    }

    private int hitungUmur(String tanggalLahir) {
        try {
            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("dd MMMM yyyy")
                .toFormatter(new Locale("id", "ID"));
            LocalDate tanggalLahirLocalDate = LocalDate.parse(tanggalLahir, formatter);
            LocalDate sekarang = LocalDate.now();
            return Period.between(tanggalLahirLocalDate, sekarang).getYears();
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getTempatLahir() {
        return tempatLahir;
    }

    @Override
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    @Override
    public String getPekerjaan() {
        return pekerjaan;
    }

    @Override
    public String getTempatTinggal() {
        return tempatTinggal;
    }

    @Override
    public int getUmur() {
        return umur;
    }

    @Override
    public String getDetails() {
        return String.format(
            "Nama: %s\n" +
            "Tempat Lahir: %s\n" +
            "Tanggal Lahir: %s\n" +
            "Umur: %d tahun\n" +
            "Pekerjaan: %s\n" +
            "Tempat Tinggal: %s\n",
            getNama(), getTempatLahir(), getTanggalLahir(), getUmur(), getPekerjaan(), getTempatTinggal()
        );
    }
}
