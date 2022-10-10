package School;

import java.time.LocalDate;

public class Student extends Person {

    private int grade;
    private int feesTotal = 200000;
    private int feesPaid = 0;


    //Constructor method
    public Student(String id, String name, String lastName, LocalDate dateOfBirth, int grade){
        super(id, name, lastName, dateOfBirth);
        this.grade=grade;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    };
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+getName()+
                "\nLastname: "+getLastName()+
                "\nAge: "+getAge(getDateOfBirth())+
                "\nGrade: "+getGrade()+
                "\nFees Paid: "+getFeesPaid()+
                "\nFeed Remaining: "+getRemainingFees();

    }


}
