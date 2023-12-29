/*
Instructions: Your application should do the following:
1) Generate an email with the following syntax: firstname.lastname@department.company.com
2) Determine the department(sales, development, accounting) none if it is left blank
3) Generate a random String for a password
4) have set methods to change the password, set the mailbox capacity, and define an alternate email address
5) Have get methods to display the name, email, and mailbox capacity
 */

package emailapp;


public class EmailApp {
    public static void main(String[] args) {

        Email email1 = new Email("Aria", "Jahin");


        System.out.println(email1.showInfo());


    }
}
