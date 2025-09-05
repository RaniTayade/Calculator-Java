import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner r = new Scanner (System.in);
        System.out.println("Enter First Number: " );
        double num1=r.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = r.nextDouble();
        System.out.println("Choose Operation(+, -, *, /): ");
        char op=r.next().charAt(0);
        double result;
        switch(op) {
            case'+':
                result =  num1+num2;
                break;
            case'-':
                result = num1-num2;
                break;
            case'*':
                result = num1*num2;
                break;
            case'/':
                if(num2 != 0){
                    result = num1/num2;
                }else{
                    System.out.println("Error : Division By Zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operation!");
                return;}
        System.out.println("Result: "+result);
        r.close();
    }
}