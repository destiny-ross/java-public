package encapsulation;

public class Printer {
    private int toner = 100; // new printer has new toner cart
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public int getToner() {
        System.out.println("Toner at " + toner + "%");
        if (toner == 0) {
            System.out.println("Please refill before trying to print");
        }
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public int getPagesPrinted() {
        System.out.println("Printed " + pagesPrinted + " pages");
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int addToner(int toner) {
        if (toner < 1) {
            return -1;
        } else if (this.toner + toner <= 100) {
            this.toner += toner;
        } else this.toner = 100;
        System.out.println("Refilled. Toner levels now at " + this.toner + "%");
        return toner;
    }

    public void addToner() {
        addToner(100);
    }

    public int printPage(int numPages) {
        if (this.isDuplex){
            numPages = (numPages / 2) + (numPages % 2);
            System.out.println("Printing in duplex mode");
        }
        int currentPage = 1;
        while (numPages > 0) {
            if (toner == 0) {
                System.out.println("Cannot print " + numPages + " pages. Toner is empty.");
                break;
            } else {
                System.out.println("Printing page " + currentPage);
                currentPage++; // current page number printed during this job
                toner--;
                numPages--; // pages left to print
            }

        }
        pagesPrinted += currentPage - 1; // started current page at one for correct printing display
        return currentPage - 1;
    }

}