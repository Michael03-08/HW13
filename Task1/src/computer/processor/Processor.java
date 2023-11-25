package computer.processor;

public class Processor {
    private Frequency frequency;
    private NumbersOfCors numbersOfCors;
    private Manufacturer manufacturer;
    private double weight;

    public Processor(Frequency frequency, NumbersOfCors numbersOfCors, Manufacturer manufacturer, double weight) {
        this.frequency = frequency;
        this.numbersOfCors = numbersOfCors;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public NumbersOfCors getNumbersOfCors() {
        return numbersOfCors;
    }

    public void setNumbersOfCors(NumbersOfCors numbersOfCors) {
        this.numbersOfCors = numbersOfCors;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", numbersOfCors=" + numbersOfCors +
                ", manufacturer=" + manufacturer +
                ", weight=" + weight +
                '}';
    }
}
