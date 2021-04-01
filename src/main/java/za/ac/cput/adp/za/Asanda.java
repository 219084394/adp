package za.ac.cput.adp.za;
/*
* Lukhona Tetyana
* 218119321
* This class consist of an Age and Gender.
* */

public class Asanda {

    private int age;
    private  char gender;

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Asanda{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
