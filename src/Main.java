import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        # Exercise 2
//
//## 1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
//### Test Data:
//        Input first number: 125
//        Input second number: 24
//### Expected Output:
//        125 + 24 = 149
//
//        125 - 24 = 101
//
//        125 x 24 = 3000
//
//        125 / 24 = 5
//
//        125 mod 24 = 5
//
//
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter two numbers for calculations");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(num1+num2+ " Sum");
        System.out.println(num1-num2 + " Subtract");
        System.out.println(num1/num2+" Devision");
        System.out.println(num1*num2+" Multiplacation");
        System.out.println(num1%num2+" Reminder");
//## 2.Write a Java program to convert a given string into lowercase.
//### Test Data:
//        Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
//### Expected Output:
//        the quick brown fox jumps over the lazy dog.
//
//
        System.out.println("");
        System.out.println("Please enter a message to convert it to lower case");
        String message = input.next();
        System.out.println(message.toLowerCase());
//## 4.Write a Java program to reverse a string.
//### Test Data:
//        Input a string: The quick brown fox
//### Expected Output:
//        Reverse string: xof nworb kciuq ehT
//
//
//        String toReverse = input.nextLine();
//        System.out.println(toReverse);
//## 5.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)
//### Test Data:
//        Input a number: 20
//### Expected Output:
//        1
//
//
        System.out.println("Enter a number to be tested (even or odd)");
        int number = input.nextInt();
        if(number % 2 == 0) {
            System.out.println("1");
        }else
            System.out.println("0");
//## 6.Write a program that checks the role of the user
//        If the role is admin print "welcome admin"
//
//        If the role is superuser print "welcome superuser"
//
//        If the role is user print "welcome user"
//
//        (tip: use if else)
//
//
        System.out.println("");
        System.out.println("Please enter your role");
        String role = input.next();
        if(role.equals("admin")){
            System.out.println("Welcome admin");
        } else if (role.equals("user")) {
            System.out.println("Welcome user");
        }else if (role.equals("superuser")){
            System.out.println("Welcome superuser");
        }else {
            System.out.println("Welcome stranger");
        }
//
//## 7.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
//### Test Data:
//        Input the first number: 5
//
//        Input the second number: 10
//
//        Input the third number: 15
//### Expected Output:
//        The result is: true
//
//
        System.out.println("Please enter three numbers to see the sum if equals third number");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        if(first + second == third){
            System.out.println("true");
        }
//## 8.Take three numbers from the user and print the greatest number.
//### Test Data
//        Input the 1st number: 25
//
//        Input the 2nd number: 78
//
//        Input the 3rd number: 87
//### Expected Output :
//        The greatest: 87
//
//
//
        System.out.println("Please enter three numbers to display the greatest one");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(number1 >= number2 && number1 >= number3){
            System.out.println("The greatest: "+number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The greatest: "+number2);
        }else System.out.println("The greatest: "+number3);
//## 9.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
//### Test Data
//        Input number: 3
//### Expected Output:
//        Wednesday
        System.out.println("Please Enter a number between 1-7 to display the weekday");
    int choise = input.nextInt();
    switch (choise){
        case 1: System.out.println("Sunday");
        break;
        case 2: System.out.println("Monday");
        break;
        case 3: System.out.println("Tuesday");
        break;
        case 4: System.out.println("Wednesday");
        break;
        case 5: System.out.println("Thursday");
        break;
        case 6: System.out.println("Friday");
        break;
        case 7: System.out.println("Saterday");
    }

    }
}