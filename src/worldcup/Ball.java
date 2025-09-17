package worldcup;

public class Ball {
    private String brand;
    private String model;
    private double circumference; 
    private double weight;        

    public Ball(String brand, String model, double circumference, double weight) {
        this.brand = brand;
        this.model = model;
        this.circumference = circumference;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", circumference=" + circumference +
                ", weight=" + weight +
                '}';
    }
}