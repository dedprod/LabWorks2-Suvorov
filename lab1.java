import java.util.InputMismatchException;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        int a = -1;
        int s =0;
        int flag=0;
        int fac=1;
        int fac1=1;
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите значение от 1 до 15: ");
            a = console.nextInt();
            console.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Error");
            flag=1;
        }
        if ((flag==0) & (a>=0) & (a<=15)) {
            s=a;
            for(s=1; s<=a; s++) {
                fac= (fac*s);
            }
            System.out.println("Значение посчитанное циклом For");
            System.out.println(fac);
            s=a;
            while (s>=1){
                fac1=(fac1*s);
                s=s-1;
            }
            System.out.println("Значение посчитанное циклом While");
            System.out.print(fac1);
        }
        else{
            System.out.println("Введите другое значение");
        }
    }
}
