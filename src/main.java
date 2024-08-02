import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();

        while(true){

            System.out.println("Enter your choice!!");
            System.out.println("1:Addition");
            System.out.println("2:Subtraction");
            System.out.println("3:Multiplication");
            System.out.println("4:Division");
            System.out.println("5:Exit");
            int ch = sc.nextInt();
            switch (ch){
                case 1:{
                    int sum = a + b;
                    System.out.println("The Addition of the number is " + sum);
                    break;
                }
                case 2:{
                    if (b < a) {
                        int diff = b - a;
                        System.out.println("The Subtracted form is " + diff);
                    } else {
                        System.out.println("Not Possible!!");
                    }
                    break;
                }
                case 3:{
                    int mul = a * b;
                    System.out.println("The value is " + mul);
                    break;
                }
                case 4:{
                    if (b < a) {
                        double div = (double) b /a;
                        System.out.println("The value is " + div);
                    } else {
                        System.out.println("Not Possible!!");
                    }
                    break;
                }
                case 5:{
                    System.exit(1);
                    break;
                }
                default:{
                    System.out.println("Invalid Choice!!");
                    break;
                }
            }
        }
    }
}