public class Test {
    public static void main(String[] args) {

        VendingMachine vendingMachineOne = new VendingMachine("Chips", 9 , 5 , "ON");
        VendingMachine vendingMachineTwo = new VendingMachine("Drinks", 7 , 3 , "ON");
        VendingMachine vendingMachineThree = new VendingMachine("Cookies", 2 , 1 , "ON");
        VendingMachine vendingMachineFour = new VendingMachine("Drinks", 5 , 2 , "OFF");
        VendingMachine vendingMachineFive = new VendingMachine("Food", 9, 5, "ON", 49);

        VendingMachine[] allItems = new VendingMachine[5];

        allItems[0] = vendingMachineOne;
        allItems[1] = vendingMachineTwo;
        allItems[2] = vendingMachineThree;
        allItems[3] = vendingMachineFour;
        allItems[4] = vendingMachineFive;


        System.out.print("VM-No\tItem-Name\tQuantity\tCost" + "\n");
        for (int i = 0; i < allItems.length; i++) {
            System.out.println(allItems[i]);
        }

        vendingMachineOne.buy();
        vendingMachineThree.addItem(7);

        System.out.println(allItems[0]);
        System.out.println(allItems[2]);
    }
}
