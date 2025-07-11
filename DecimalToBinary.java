//write a program in java which converts decimal number into binary and taking input form the user
import java.util.*;  // we use this package to use scanner class which allow us to take input from user 
public class DecimalToBinary { //this class function and main function is our boilerplate code 
    public static void main(String args[]) { //every time we make a program in Java we have to write boilerplate code 
        Scanner sc = new Scanner (System.in); //this scanner class allow us to take input through keyboard sc is name of this variable
        System.out.println("enter decimal number which you want to convert into binary");
        int decimal = sc.nextInt(); //nextInt help us to take input (integer) values only 
        String binary = Integer.toBinaryString(decimal); //this converts decimal number to binary 
        System.out.print("binary to decimal equivalent is\n" +  binary); // and \n give us space for new line 
    }
}