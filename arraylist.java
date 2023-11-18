import java.util.ArrayList;

class MataKuliah {
    String nama;
    int sks;
    String nilai;

    public MataKuliah(String nama, int sks, String nilai) {
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
    }
}

public class nilaimatakuliah {
    public static void main(String[] args) {
        String mahasiswa = "Oscar Haris Ngaratu";
        int semester = 1;

        ArrayList<MataKuliah> mataKuliahList = new ArrayList<>();
        tambahMataKuliah(mataKuliahList, "Logika Informastika", 3, "A");
        tambahMataKuliah(mataKuliahList, "kalkulus", 4, "B+");
        tambahMataKuliah(mataKuliahList, "Algoritma dan Struktur Data", 2, "A-");

        tampilkanKHS(semester, mahasiswa, mataKuliahList);
    }

    public static void tambahMataKuliah(ArrayList<MataKuliah> list, String nama, int sks, String nilai) {
        list.add(new MataKuliah(nama, sks, nilai));
    }

    public static void tampilkanKHS(int semester, String mahasiswa, ArrayList<MataKuliah> mataKuliahList) {
        System.out.println("Kartu Hasil Studi (KHS) - Semester " + semester + " - " + mahasiswa);
        System.out.println("===================================");
        System.out.println("Mata Kuliah\t\tSKS\tNilai");
        System.out.println("===================================");

        for (MataKuliah matkul : mataKuliahList) {
            System.out.println(matkul.nama + "\t\t\t" + matkul.sks + "\t" + matkul.nilai);
        }

        System.out.println("===================================");
    }
}