import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pemain: ");
        int n = scanner.nextInt();
        
        int[] scores = new int[n];
        System.out.println("Masukkan daftar skor (urutan dari nilai terbesar ke terkecil): ");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        System.out.print("Masukkan jumlah permainan yang diikuti oleh GITS: ");
        int m = scanner.nextInt();
        
        int[] gitsScores = new int[m];
        System.out.println("Masukkan skor yang didapatkan oleh GITS: ");
        for (int i = 0; i < m; i++) {
            gitsScores[i] = scanner.nextInt();
        }
        
        int[] rankings = calculateDenseRanking(scores, gitsScores);
        
        System.out.println("Hasil peringkat GITS:");
        for (int rank : rankings) {
            System.out.print(rank + " ");
        }
    }
    
    public static int[] calculateDenseRanking(int[] scores, int[] gitsScores) {
        Arrays.sort(scores); // Urutkan skor dari terkecil ke terbesar
        int[] rankings = new int[gitsScores.length];
        
        for (int i = 0; i < gitsScores.length; i++) {
            int gitsScore = gitsScores[i];
            int rank = 1; // Default peringkat 1
            
            for (int j = scores.length - 1; j >= 0; j--) {
                if (gitsScore < scores[j]) {
                    rank++;
                } else if (gitsScore == scores[j]) {
                    break; // Pemain yang memiliki skor yang sama memiliki peringkat yang sama
                }
            }
            
            rankings[i] = rank;
        }
        
        return rankings;
    }
}
