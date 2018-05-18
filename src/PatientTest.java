import java.util.Scanner;

public class PatientTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Patient newPatient = new Patient("00000001");

        //Display the default account info
        System.out.printf("Initial Id is: %s%n%n", newPatient.getPatient_id());

        //Prompt the patient for an information
        System.out.printf("Please enter patient id: ");
        String patient_id = input.nextLine();
        newPatient.setPatient_id(patient_id);
        System.out.println();

        System.out.printf("Please enter the patient first name: ");
        String first_name = input.nextLine();
        newPatient.setFirst_name(first_name);
        System.out.println();

        System.out.printf("Please enter patient last name: ");
        String last_name = input.nextLine();
        newPatient.setLast_name(last_name);
        System.out.println();

        System.out.printf("Please enter the patient address: ");
        String address = input.nextLine();
        newPatient.setAddress(address);
        System.out.println();

        System.out.printf("Please enter the patient city: ");
        String city = input.nextLine();
        newPatient.setCity(city);
        System.out.println();

        System.out.printf("Please enter the patient province: ");
        String province = input.nextLine();
        newPatient.setProvince(province);
        System.out.println();

        System.out.printf("Please enter the patient postal code: ");
        String postal_code = input.nextLine();
        newPatient.setPostal_code(postal_code);
        System.out.println();

        //Display the patient information
        System.out.printf("The Patient ID number is: %s%n", newPatient.getPatient_id());
        System.out.printf("The Patient first name is: %s%n", newPatient.getFirst_name());
        System.out.printf("The Patient last name is: %s%n", newPatient.getLast_name());
        System.out.printf("The Patient address is: %s%n", newPatient.getAddress());
        System.out.printf("The Patient city is: %s%n", newPatient.getCity());
        System.out.printf("The Patient province is: %s%n", newPatient.getProvince());
        System.out.printf("The Patient postal code is: %s%n", newPatient.getPostal_code());



    }
}
