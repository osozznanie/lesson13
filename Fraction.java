package ex1;



public class Fraction {
    String name;
    Deputy deputy;

    public Fraction(String name){
        this.name = name;
    }

    public Fraction(){}

    public Fraction(String name, Deputy deputy) {
        this.name = name;
        this.deputy = deputy;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                ", deputy=" + deputy +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
