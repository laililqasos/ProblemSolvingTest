import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan dalam urutan: ");
        int n = scanner.nextInt();
        
        printA000124Sequence(n);
    }
    
    public static void printA000124Sequence(int n) {
        int currentNumber = 1;
        int difference = 2;
        
        for (int i = 0; i < n; i++) {
            System.out.print(currentNumber);
            if (i < n - 1) {
                System.out.print("-");
            }
            currentNumber += difference;
            difference++;
        }
        System.out.println();
    }
}
