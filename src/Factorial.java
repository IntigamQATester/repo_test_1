import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {







                Scanner scan=new Scanner(System.in);

                System.out.println("Enter a number for find factorial");

                int num=scan.nextInt();
                int fact=1;
                for(int i=1; i<=num; i++){
                    fact=fact*i;


                    if (i==3){
                        System.out.print("hokey");

                    } else if (i==5){
                        System.out.print("pokey");
                    }else if (i%3==0&&i%5==0){
                        System.out.print("hokeypokey");

                    }else {
                        System.out.println(fact);
                    }


                }
                {

                }

            }
        }