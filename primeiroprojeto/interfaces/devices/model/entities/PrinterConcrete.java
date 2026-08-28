package primeiroprojeto.interfaces.devices.model.entities;

public class PrinterConcrete extends Device implements Printer{

    public PrinterConcrete(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
