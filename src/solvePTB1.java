import java.sql.SQLOutput;
import java.util.Scanner;

public class solvePTB1 {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.println("a: ");
        Double a= scanner.nextDouble();
        System.out.println("b: ");
        Double b= scanner.nextDouble();
        System.out.println("c: ");
        Double c= scanner.nextDouble();

        if (a !=0){
            Double answer= (c-b)/a;
            System.out.println("phuong trinh co nghiem: "+answer);
        }
        else
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
    }
}
