package com.maroti.classes;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName()
    {
        return this.firstName;
    }
    public void setFirstName(String firstName)
    {
        if(firstName.equals("") || firstName.equals(null))
        {
            this.firstName="";
        }else{

            this.firstName=firstName;


        }
    }
    public String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(String lastName)
    {
        if(lastName.equals("") || lastName.equals(null))
        {
            this.lastName="";

        }else{

            this.lastName=lastName;
        }
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        if(age<0 || age>100)
        {
            this.age=0;


        }else{

            this.age=age;
        }
    }

    public boolean isTeen()
    {
        if(this.getAge()>12 && this.getAge()<20)
        {
            return true;
        }else{
            return false;
        }

    }

    public String getFullName()
    {
        if(this.getFirstName().equals("") && this.getLastName().equals(""))
        {
            return "";
        }else{
            return "fullName = "+getFirstName()+" "+getLastName();
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("");
        p.setLastName("pawar");
        p.setAge(0);

        System.out.println(p.getFullName());
        System.out.println(p.getAge());
    }
}
