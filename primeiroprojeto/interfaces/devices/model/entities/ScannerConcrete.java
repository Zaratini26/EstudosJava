package primeiroprojeto.interfaces.devices.model.entities;

public class ScannerConcrete extends Device implements Scanner {

    public ScannerConcrete(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan() {
        return "Scanned content";
    }
}
