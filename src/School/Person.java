package School;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {

    private String id;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;


    public Person(String id, String name, String lastName, LocalDate dateOfBirth){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {return dateOfBirth;}

    public int getAge(LocalDate dateOfBirth){

        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();

    }


}
