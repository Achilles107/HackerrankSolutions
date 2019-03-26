import java.util.Scanner;
public class Encryption {
    static void encrypt(String str) {
        String newStr = str.replaceAll(" ", "");
        int len = newStr.length();
        double sqrt = Math.sqrt(len);
        int lb = (int) sqrt;
        char arr[][];
        int ub = (int) Math.ceil(sqrt);
        if ((lb * ub) >= len) {
            // System.out.println(lb+" "+ub+" "+sqrt+" "+len);
            arr = new char[lb][ub];
        } else {
            lb = ub;
            arr = new char[lb][ub];
        }
        int k = 0;

        for (int i = 0; i < lb; i++) {
            for (int j = 0; j < ub; j++) {
                if (k < len) {
                    arr[i][j] = newStr.charAt(k);
                    k++;
                }
            }
        }
        String cipher = "";
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < lb; j++) {
                cipher = cipher + arr[j][i];
                //System.out.print(arr[j][i]);
            }
            cipher = cipher.trim();
            cipher = cipher + " ";
            //System.out.print(arr[i][j]);
            //System.out.println();
        }
        cipher = cipher.trim();
        System.out.println(cipher);
        //System.out.println(cipher.length());
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        encrypt(msg);
    }
}