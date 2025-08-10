package task3_encapsulation;

public class EncapsulationDemo {
    private String owner;
    private int balance;



    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


    public static void main(String[] args) {
        
        EncapsulationDemo ed = new EncapsulationDemo();
        ed.setOwner("Mehroz");
        ed.setBalance(50000);

        String ownerName = ed.getOwner();
        int balance = ed.getBalance();

        System.out.println("Remaining balance for Mr/Ms "+ ownerName + " : " + balance);

    }



    
    
}
