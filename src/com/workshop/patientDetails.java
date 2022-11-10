package com.workshop;

public class patientDetails {
    private String name;
    private String city;
    private String state;
    private String department;
    private String phoneNo;
    private String age;

    public  patientDetails(String name,String city,String state,String department,String phoneNo,String age)
    {
        this.name=name;
        this.city=city;
        this.state=state;
        this.department=department;
        this.phoneNo=phoneNo;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", department='" + department + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
