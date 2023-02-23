import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        System.out.println(Arrays.toString(languages));
        int n = (int) (Math.random() * 1_000_000);
        System.out.println("n = " + n);
        n = n*3;
        System.out.println("n*3 = " + n);
        String binary = "10101";
        int toInt = Integer.parseInt(binary,2);
        n=n+0b10101;

        System.out.println("n+21 =  " + n);
        String hex = "FF";
        toInt = Integer.parseInt(hex,16);
        // n=n+0xFF;
        n=n+toInt;
        System.out.println("n+255 = " + n);
        n*=6;
        System.out.println("n*6 = " + n);
        int sum=0,copy=n;
        while(n/10!=0) {
            copy=n; sum=0;
            while(copy>0){
                sum=sum+(copy%10);
                copy=copy/10;
            }
            System.out.println("n = " + n);
            n=sum;
        }
        System.out.println(n);
        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
    }


}