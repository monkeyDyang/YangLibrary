package yy.person;

public class Person {

    private String Name;
    private String gender;
    private String maritalStatus;

    public Person(String Name,String gender,String maritalStatus){
        this.Name = Name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
