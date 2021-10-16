import java.util.Scanner;

public class AsalSayiyar {
    static int Asal(int number,int number2){
        int num1=number,num2=number2;
        if(num2==1)
        {
            return 1;
        }
        else
        {
            if(num1%num2==0){
                return 0;
            }
            else{
                return Asal(num1,num2-1);
            }
        }

    }

    public static void main(String[] args) {

        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        num1=input.nextInt();

        num2=Asal(num1,num1/2);
        if (num2==1){
            System.out.println(num1+" sayısı ASALDIR.");
        }else {
            System.out.println(num1+" sayısı asal değildir.");
        }

    }
}
