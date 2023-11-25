package computer.keyboard;

public class Kayboard {
    private double weight;
    private KayboardType type;
    private Backlight backlight;

    public Kayboard(double weight, KayboardType type, Backlight backlight) {
        this.weight = weight;
        this.type = type;
        this.backlight = backlight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public KayboardType getType() {
        return type;
    }

    public void setType(KayboardType type) {
        this.type = type;
    }

    public Backlight getBacklight() {
        return backlight;
    }

    public void setBacklight(Backlight backlight) {
        this.backlight = backlight;
    }

    @Override
    public String toString() {
        return "Kayboard{" +
                "weight=" + weight +
                ", type=" + type +
                ", backlight=" + backlight +
                '}';
    }
}

