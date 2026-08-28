package adapter;

public class AdapterDemo {
    public void run() {
        OldPrinter oldPrinter = new OldPrinterImpl();
        NewPrinter newPrinter = new PrinterAdapter(oldPrinter);
        newPrinter.printNew("Привет через адаптер!");
    }
}
