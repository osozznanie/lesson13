package ex1;

import java.util.Scanner;

public class Deputy extends Human{
    private String firstName;
    private String secondName;
    private int age;
    private boolean briber;
    private int sizeOfBribe;

    public Deputy(String weight, String height, String firstName, String lastName, int age, boolean briber) {
        super(weight, height);
        this.firstName = firstName;
        this.secondName = lastName;
        this.age = age;
        this.briber = briber;

    }

    public Deputy (String weight, String height, String firstName, String lastName, int age, boolean briber,int sizeOfBribe){
        super(weight, height);
        this.firstName = firstName;
        this.secondName = lastName;
        this.age = age;
        this.briber = briber;
        this.sizeOfBribe = sizeOfBribe;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getSizeOfBribe() {
        return sizeOfBribe;
    }

    public void setSizeOfBribe(int sizeOfBribe) {
        this.sizeOfBribe = sizeOfBribe;
    }

    public void giveBribe() {
        if (!this.briber) {
            System.out.println("This deputy doesn't take bribe.");
        }
        int bribeAmount = 0;
        if (this.briber) {
            System.out.println("Write size of bribe: ");
            Scanner scanner = new Scanner(System.in);
            bribeAmount = scanner.nextInt();
        }
        if (bribeAmount > 5000) {
            System.out.println("The police will arrest briber.");
        }else {
            this.sizeOfBribe = bribeAmount;
        }
    }

    public Deputy() {

    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", briber=" + briber +
                ", sizeOfBribe=" + sizeOfBribe +
                "} " + super.toString();
    }
}
