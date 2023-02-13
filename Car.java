public class Car {
    protected int gas;
    
    public Car(){
        this.gas = 10;
    }

    // Gas Getter
    public int getGas(){
        return gas;
    }


    public void displayGas(){
        System.out.println("Gas Remaining: " + getGas() + "/10");
    }

}
