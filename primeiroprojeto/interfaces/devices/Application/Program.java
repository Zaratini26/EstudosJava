package primeiroprojeto.interfaces.devices.Application;

import primeiroprojeto.interfaces.devices.model.entities.ComboDevice;
import primeiroprojeto.interfaces.devices.model.entities.PrinterConcrete;
import primeiroprojeto.interfaces.devices.model.entities.ScannerConcrete;


public class Program {
    public static void main(String[] args) {

        PrinterConcrete pc = new PrinterConcrete("1080");
        pc.processDoc("My letter");
        pc.print("My letter");

        System.out.println();
        ScannerConcrete sc = new ScannerConcrete("2003");
        sc.processDoc("My Email");
        System.out.println("Scan Result: " + sc.scan());

        System.out.println();
        ComboDevice cd = new ComboDevice("2081");
        cd.processDoc("My dissertation");
        cd.print("My dissertation");
        System.out.println("Scan Result: " + cd.scan());
    }
}
