package exercise1;

import javax.swing.JOptionPane;

public class PatientTest {
    public static void main(String[] args) {

        Patient newPatient = new Patient("300967079", "Artem", "Pryadko","63 Lansbury Dr", "Toronto", "Ontario", "31MJ3J");

        //Display the default account info
        System.out.printf("Initial Id is: %s%n%n", newPatient.getPatient_id());
        System.out.printf("Initial First_name is: %s%n%n", newPatient.getFirst_name());
        System.out.printf("Initial Last_name is: %s%n%n", newPatient.getLast_name());
        System.out.printf("Initial Address is: %s%n%n", newPatient.getAddress());
        System.out.printf("Initial City is: %s%n%n", newPatient.getCity());
        System.out.printf("Initial Province is: %s%n%n", newPatient.getProvince());
        System.out.printf("Initial Postal_code is: %s%n%n", newPatient.getPostal_code());


        //Prompt the patient for an information
        String patient_id  = JOptionPane.showInputDialog("What is patient Id?");
        String first_name  = JOptionPane.showInputDialog("What is patient First_name?");
        String last_name  = JOptionPane.showInputDialog("What is patient Last_name?");
        String Address  = JOptionPane.showInputDialog("What is patient Address?");
        String City  = JOptionPane.showInputDialog("What is patient City?");
        String Province  = JOptionPane.showInputDialog("What is patient Province?");
        String Postal_code  = JOptionPane.showInputDialog("What is patient Postal_code?");

        //Display the patient information
        String message = String.format("Infomration about patient, patient ID: %s%n First Name:%s | Last Name:%s | Address:%s | City:%s | Province:%s | Postal code:%s " , patient_id, first_name, last_name, Address, City, Province, Postal_code);

        JOptionPane.showMessageDialog(null, message);

        //Display the patient information
        System.out.printf("The exercise1.Patient ID number is: %s%n", newPatient.getPatient_id());
        System.out.printf("The exercise1.Patient first name is: %s%n", newPatient.getFirst_name());
        System.out.printf("The exercise1.Patient last name is: %s%n", newPatient.getLast_name());
        System.out.printf("The exercise1.Patient address is: %s%n", newPatient.getAddress());
        System.out.printf("The exercise1.Patient city is: %s%n", newPatient.getCity());
        System.out.printf("The exercise1.Patient province is: %s%n", newPatient.getProvince());
        System.out.printf("The exercise1.Patient postal code is: %s%n", newPatient.getPostal_code());





    }
}
