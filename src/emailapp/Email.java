package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String email;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = ".gmail.com";

    // Constructor to receive first name + last name

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for method and return method
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        // Call a method for a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.print("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase(Locale.ROOT) + "." + lastName.toLowerCase(Locale.ROOT) + "@" + department + companySuffix;
        //System.out.print("\nYour email: " + email);

    }


    // Ask for department
    private String setDepartment(){
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n");
        System.out.print("Enter department code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();

        if(depChoice ==1){
            return "Sales";
        }
        else if(depChoice ==2){
            return "Development";
        }
        else if(depChoice ==3){
            return "Accounting";
        }
        else {
            return "";
        }
    }

    // Generate random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    //method
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return  alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "\nDISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMAPNY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

}
