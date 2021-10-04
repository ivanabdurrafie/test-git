import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nilai, nilai2;

        System.out.print("Masukkan nilai pertama(1-9)= ");
        nilai=sc.nextInt();
        System.out.print("Masukkan nilai kedua(1-9)= ");
        nilai2=sc.nextInt();

        if (nilai <=9) {
        //karena jika nilainya lebih dari 9, tidak membentuk kotak.
            for (int i=1;i<=nilai;i++) {
                for (int j=1;j<=nilai;j++) {
                    if(i==1||i==nilai||j==1||j==nilai){
                        System.out.print(nilai);
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
        else System.out.print("nilai harus kurang dari 9");
        if (nilai2 <=9) {
            System.out.println();
            for (int i=1;i<=nilai2;i++) {
                for (int j=1;j<=nilai2;j++) {
                    if(i==1||i==nilai2||j==1||j==nilai2){
                        System.out.print(nilai2);
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }   
        }
        else System.out.print("nilai harus kurang dari 9");
    }
}