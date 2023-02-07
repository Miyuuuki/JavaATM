/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm_machine_marasigan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author maegan s. marasigan
 */
public class ATM_Machine_Marasigan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String userID = "";
        String userPass = "";
        double balance = 0;
        int userChoice = 0;
        String vID = " ";
        String vPass = " ";

        Scanner atmScanner = new Scanner(System.in);
        Scanner userScanner = new Scanner(System.in);
        Scanner passScanner = new Scanner(System.in);
        Scanner userIDScanner = new Scanner (System.in);
        Scanner passIDScanner = new Scanner (System.in);
        
        System.out.println("Welcome to Amazing ATM");
        System.out.println("[1] Register");
        System.out.println("[2] Login");
        System.out.println("[3] Exit");
        userChoice = atmScanner.nextInt();
            
            switch (userChoice) {
                case 1:
                System.out.println("Register a new account");
                System.out.println("Enter Username: ");
                userID = userIDScanner.nextLine();
                
                System.out.print("Enter password: "); 
                userPass = passIDScanner.nextLine(); 
                
                System.out.println("Login");
                System.out.println("Enter Username: ");
                vID = userScanner.nextLine();
                
                System.out.print("Enter password: "); 
                vPass = passScanner.nextLine(); 
                    if (userPass.equals(vPass)) {     
                        System.out.println("Logging In...");          
                    } else {
                        System.out.print("Error. Try again");
                        System.exit(0);
                    }                             
                case 2:
                System.out.println("Login");
                System.out.println("Enter Username: ");
                userID = userScanner.nextLine();
                
                if (userID.equals(vID)) {
                    System.out.print("Enter password: "); 
                    userPass = passScanner.nextLine(); 
                        if (userPass.equals(vPass)) {     
                            System.out.println("Logging In...");     
                        } else {
                            System.out.print("Error. Try again");
                            System.exit(0);
                        }
                }
                    System.out.println("Logged in as: " + userID);

                    do {
                        System.out.println("[1] Withdraw Money");
                        System.out.println("[2] Deposit Money");
                        System.out.println("[3] Request Balance");
                        System.out.println("[4] Exit");
                        userChoice = atmScanner.nextInt();

                        switch (userChoice) {
                            case 1: 
                                System.out.println("Enter the Amount to Witdraw: ");
                                double withdrawMoney = atmScanner.nextDouble();

                                if (withdrawMoney > balance) {
                                    System.out.println("Not enough money. Try Again");
                                } else {
                                    balance -= withdrawMoney;
                                    System.out.println("Successfully withdrawn! New Balance is " + balance);
                                }
                                    break;
                                case 2: 
                                    System.out.println("Enter The Amount To Deposit: ");
                                    double depositMoney = atmScanner.nextDouble();
                                    balance += depositMoney;
                                    System.out.println("Successfully deposited! New balance is " + balance);   
                                    break;
                                case 3: System.out.println("Your Current Balance is " + balance);
                                    break;
                                case 4: 
                                    System.out.println("See you next time...");
                                    System.exit(0);
                                default: 
                                    break;
                        }
                    } while (userChoice != 4);                            
                break;
                case 3: 
                System.out.println("THANK YOU FOR USING AMAAAAAAAAZING ATM");
                System.exit(0);
            
            }     
    }
    
}
