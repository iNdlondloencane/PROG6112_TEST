// abstract class that implements the interface
public abstract class Consoles implements IConsoles {

    // variables
    private String consoleType;
    private String store;
    private int totalSales;

    // constructor
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // get methods
    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return store;
    }

    public int getTotalSales() {
        return totalSales;
    }

    // abstract method, the subclass must write the code
    public abstract void printReport();
}
