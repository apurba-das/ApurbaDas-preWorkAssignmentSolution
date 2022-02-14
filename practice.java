import java.util.Scanner;

 

public class Main {

 

Scanner sc = new Scanner(System.in);
int n;
 

           //function to checkPalindrome

       public void checkPalindrome()  {
           n = sc.nextInt();
           int r,sum=0,temp;    
            temp=n;    
         while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
            }    
         if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
             System.out.println("not palindrome");  

      }

 

            //function to printPattern

       public void printPattern() {
            n = sc.nextInt();
            //inner loop  
            for (int i= n-1; i>=0 ; i--)  
            {  
            //outer loop  
            for (int j=0; j<=i; j++)  
            {  
                //prints star and space  
                System.out.print("*" + " ");  
            }  
            //throws the cursor in the next line after printing each line  
            System.out.println();  
            }
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
            n = sc.nextInt();
            // Check if number is 2
            if (n == 2)
                System.out.println("Prime"); 
 
            // Check if n is a multiple of 2
            else if (n % 2 == 0)
                System.out.println("Not Prime");
 
            // If not, then just check the odds
            for (int i = 3; i <= Math.sqrt(n); i += 2)
            {
                if (n % i == 0)
                    System.out.println("Not Prime");
            }
            System.out.println("Prime");
      }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {
              n = sc.nextInt();

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1, i, third;
           System.out.print(first+" "+second);//printing 0 and 1    
    
             for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
            {    
                third=first+second;    
                System.out.print(" "+third);    
                first=second;    
                second=third;    
            }    

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
