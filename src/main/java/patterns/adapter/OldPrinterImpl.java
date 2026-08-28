package adapter;

public class OldPrinterImpl implements OldPrinter {
    @Override
    public void printOld(String text) {
        System.out.println("Старый принтер: " + text);
    }
}
