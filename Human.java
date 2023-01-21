package ex1;

public class Human {
    private String weight;
    private String height;

    public Human(String weight, String height) {
        this.weight = weight;
        this.height = height;
    }

    public Human() {

    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
