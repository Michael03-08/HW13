import computer.Computer;
import computer.dissc.DiscType;
import computer.dissc.HardDisc;
import computer.keyboard.Backlight;
import computer.keyboard.Kayboard;
import computer.keyboard.KayboardType;
import computer.monitor.Monitor;
import computer.monitor.MonitorType;
import computer.processor.Frequency;
import computer.processor.Manufacturer;
import computer.processor.NumbersOfCors;
import computer.processor.Processor;
import computer.ram.Ram;
import computer.ram.Type;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Frequency.THREE_THOUSAND_TWO_HUNDRED,
                NumbersOfCors.THREE, Manufacturer.IBM, 600);
        Kayboard kayboard = new Kayboard(200, KayboardType.CONDUCTIVE_RUBBER, Backlight.BACKLIGHT_NO);
        HardDisc hardDisc = new HardDisc(DiscType.HDD,500, 370 );
        Monitor monitor = new Monitor(17, MonitorType.IPS, 450);
        Ram ram = new Ram(Type.SDRAM, 16, 900);

        Computer computer = new Computer(processor, ram, hardDisc, monitor , kayboard,
                "IBM" , "Class");
        System.out.println(computer.getWeight());
    }
}