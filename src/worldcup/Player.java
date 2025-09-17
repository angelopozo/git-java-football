package worldcup;

public class Player extends Person {
    private String position;

    public Player(String position, int age) {
        super(age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void passBall() {
        
    }
}
