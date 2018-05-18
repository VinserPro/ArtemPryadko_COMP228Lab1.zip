package exercise1;

public class Patient {
    private String patient_id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String province;
    private String postal_code;

   //Declare a Constructor
    public Patient(String patient_id)
    {
        this.patient_id = patient_id;/*
        this.first_name = first_name;

        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postal_code = postal_code;*/
    }

    //Allow patient to set his/her information
    public void setPatient_id(String patient_id)
    {
        this.patient_id = patient_id;
    }

    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setProvince(String province)
    {
        this.province = province;
    }
    public void setPostal_code(String postal_code)
    {
        this.postal_code = postal_code;
    }

    //Allow patient to get an information
    public String getPatient_id() { return patient_id; }
    public String getFirst_name() { return first_name; }
    public String getLast_name()
    {
        return last_name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getCity()
    {
        return city;
    }
    public String getProvince()
    {
        return province;
    }
    public String getPostal_code()
    {
        return postal_code;
    }

    public String GetPatientInfo()
    {
        return ("exercise1.Patient ID : " + this.patient_id + " exercise1.Patient First name: " + this.first_name + " exercise1.Patient Last name: " + this.last_name + " exercise1.Patient Address: " + this.address + " exercise1.Patient City: " + this.city + " exercise1.Patient Province: " + this.province + " exercise1.Patient Postal code: " + this.postal_code);
    }

}
