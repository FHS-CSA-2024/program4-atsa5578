import java.util.*;

//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
public class Program4 {
    public static void main(String[] args){
        //four three digit numbers
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        //scanner
        Scanner averageScan = new Scanner (System.in);
        //userinput
        System.out.println("Enter a three digit number: ");
        number1 = averageScan.nextInt();
        System.out.println("Enter a three digit number: ");
        number2 = averageScan.nextInt();
        System.out.println("Enter a three digit number: ");
        number3 = averageScan.nextInt();
        System.out.println("Enter a three digit number: ");
        number4 = averageScan.nextInt();
        //average
        double average = (number1 + number2 + number3 + number4)/4.0;
        int sum = (number1 + number2 + number3 + number4);
        //print
        System.out.println("The average of your numbers is " + average);
        System.out.println("The sum of your numbers is " + sum);
    }
}


//Paste console output below:
/*
Enter a three digit number: 
475
Enter a three digit number: 
821
Enter a three digit number: 
369
Enter a three digit number: 
562
The average of your numbers is 556.75
The sum of your numbers is 2227

*/
