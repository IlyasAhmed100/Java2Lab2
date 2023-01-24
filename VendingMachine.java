public class VendingMachine {
    private String item;
    private int itemQuantity;
    private String checkPowerState = "ON";
    private double itemPrice;
    private int newStock;
    private static int initialSerialNumber = 1000;
    private int serialNumber;
    private int quantityMax;


    public VendingMachine(String item, int itemQuantity, double itemPrice, String checkPowerState) {
        setItem(item);
        setItemQuantity(itemQuantity);
        setItemPrice(itemPrice);
        setPowerState(checkPowerState);
        quantityMax = 10;
        serialNumber += initialSerialNumber ++;
        
    }

    public VendingMachine(String item, int itemQuantity, double itemPrice, String checkPowerState, int quantityMax) {
        setItem(item);
        setItemQuantity(itemQuantity);
        setItemPrice(itemPrice);
        setPowerState(checkPowerState);
        serialNumber += initialSerialNumber ++;
        if (quantityMax > 50) {
            throw new IllegalArgumentException("Error, you can't have more than 50 items ");
            
        } else if (quantityMax <= 0) {
            throw new IllegalArgumentException("Error, you can't have 0 or less items");
        }
        this.quantityMax = quantityMax;
    }

    public void setPowerState(String checkPowerState) {
        this.checkPowerState = checkPowerState;
    }
    
    public void setItem(String item) {
        this.item = item;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItem() {
        return item;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void buy() {
        this.itemQuantity --;
    }

    public void addItem(int newStock) {
        if ((itemQuantity + newStock) < 10) {
            itemQuantity += newStock;
        }
        
        
    }

    public String toString() {
        if (checkPowerState.equals("ON")) {
            return String.format("%s\t%s\t\t%s\t\t%s", serialNumber, getItem(), getItemQuantity(), getItemPrice());
        }
        else {
            return "Error";
        }
    }

    
        
        
        
}




