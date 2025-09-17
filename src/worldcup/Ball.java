package worldcup;

public class Ball {
    private String material;

    public Ball() {
        this("synthetic leather");
    }

    public Ball(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void move() {
        String description = (material == null || material.isEmpty()) ? "ball" : material + " ball";
        System.out.println("The " + description + " moves across the field.");
    }
}
