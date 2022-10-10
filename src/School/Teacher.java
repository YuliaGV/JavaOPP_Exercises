package School;

import java.time.LocalDate;

public class Teacher extends Person{

    private int salary;
    private int salaryEarned = 0;

    public Teacher(String id, String name, String lastName, LocalDate dateOfBirth, int salary){
        super(id, name, lastName, dateOfBirth);
        this.salary=salary;

    }

    public int getSalary(){
        return  salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name :"+getName()+
                "\nLastname: "+getLastName()+
                "\nAge: "+getAge(getDateOfBirth())+
                "\nSalary: "+getSalary();

    }



}
