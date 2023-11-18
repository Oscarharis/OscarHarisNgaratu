public class loopingdalamlooping {
    public static void main(String[] args) {
        int n = 4;

        // Looping pertama (baris)
        for (int i = 0; i < n; i++) {
            // Looping kedua (kolom)
            for (int j = 0; j < n; j++) {
                // Cetak 'S' jika j kurang dari n - i, selain itu cetak 'O'
                if (j < n - i - 1) {
                    System.out.print("S");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println(); // Pindah ke baris berikutnya setelah satu baris selesai
        }
    }
}