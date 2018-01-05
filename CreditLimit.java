/*
 Develop a Java application that determines whether any of several

department-store customers has exceeded the credit limit on a charge account. 

For each customer, the following facts are available:

a) account number

b) balance at the beginning of the month

c) total of all items charged by the customer this month

d) total of all credits applied to the custoner's account this month

e) allowed credit limit

The program should input all these facts as integers, calculate the new balance

( = beginning balance + charges - credits), display the new balance and determines

whether the new balance exceeds the customer's credit limit.  For those customers

whose credit limit is exceeded, the program should display the nessage "Credit

limit exceeded".

Name: Ahmad Alkurdy
Date:9/12/2017
 */
package creditlimit;

import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class CreditLimit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int accountNum = 0;
        int beginingBalance = 0;
        int totalItems = 0;
        int totalCredits = 0;
        int creditLimit = 0;
        
        double finalBalance = 0;
        
                //prompt the user to enter the account number
                System.out.print("Enter account number (-1 to quit): ");
		accountNum = input.nextInt();
		
		//exit if the input is -1; otherwise, proceed with the program
		while ( accountNum != -1) {
			
			//Prompt user for beggining balance and obtain the input from user
			System.out.print("Enter begining balance of the costumer: ");
			beginingBalance = input.nextInt();
                        
                        //Prompt user for total item charged and obtain the input from user
                        System.out.print("Enter total items charged to the account: ");
			totalItems = input.nextInt();
                        
                        //Prompt user for credit applied and obtain the input from user
                        System.out.print("Enter all credits applied to the customer's account this month:");
			totalCredits = input.nextInt();
                        //Prompt user for credit limit and obtain the input from user
                        System.out.print("Enter costumer credit limit: ");
			creditLimit = input.nextInt();

 
                        
                        
                       
			// add begining balance and total items and subtract totalcredit fot 
                        //the final balance
			finalBalance = beginingBalance + totalItems - totalCredits ;
			
			//display the final balance
			System.out.printf("The new balance of the costumer is: %.2f\n", finalBalance);
                       
                        //if statment to check if the costumer exceeded the credit limit
                        if(finalBalance > creditLimit)
                           {
                                 System.out.println("Credit Limit Exceeded");
                             }
			
			
			
			 System.out.print("Enter account number (-1 to quit): ");
		         accountNum = input.nextInt();
		
		}
        
        
        
    }
    
}
