package encapsulation;

public class PrinterRunner {
    public static void run() {
        Printer printer = new Printer(false);
        printer.printPage(102);
        printer.getPagesPrinted();
        printer.getToner();
        printer.addToner(20);
        printer.addToner();
        printer.addToner(5);
        printer.printPage(18);
        printer.getPagesPrinted();

        Printer duplexPrinter = new Printer(true);
        duplexPrinter.printPage(8);
        duplexPrinter.printPage(9);
        duplexPrinter.getPagesPrinted();
    }
}

