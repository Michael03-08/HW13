package computer;

import computer.dissc.HardDisc;
import computer.keyboard.Kayboard;
import computer.monitor.Monitor;
import computer.processor.Processor;
import computer.ram.Ram;

public class Computer {
    private Processor processor;
    private Ram ram;
    private HardDisc hardDisc;
    private Monitor monitor;
    private Kayboard kayboard;

   private final String vendor;
   private final String name;

    public Computer(Processor processor, Ram ram, HardDisc hardDisc,
                    Monitor monitor, Kayboard kayboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisc = hardDisc;
        this.monitor = monitor;
        this.kayboard = kayboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kayboard getKayboard() {
        return kayboard;
    }

    public void setKayboard(Kayboard kayboard) {
        this.kayboard = kayboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }
    public double getWeight(){
        return processor.getWeight() + hardDisc.getWeight() + ram.getWeight() + monitor.getWeight() +
                kayboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardDisc=" + hardDisc +
                ", monitor=" + monitor +
                ", kayboard=" + kayboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
