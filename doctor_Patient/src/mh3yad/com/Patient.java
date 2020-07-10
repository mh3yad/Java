package mh3yad.com;

public class Patient {
    public String Name ;
    public String Medical_condition;

    public Patient(String name, String medical_condition) {
        Name = name;
        Medical_condition = medical_condition;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMedical_condition() {
        return Medical_condition;
    }

    public void setMedical_condition(String medical_condition) {
        Medical_condition = medical_condition;
    }
}
