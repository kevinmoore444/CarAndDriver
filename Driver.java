public class Driver extends Car{
    
    // super() Brings in the attribute gas from Car and the driver inherits it.
    // super.displayGas() invokes a method defined in the Car Class to display the amount of reminaing gas.
    public Driver(){
        super();
    }



    public void drive(){
        System.out.println("You drive the car");
        gas = gas - 1;
        super.displayGas();
        if (gas < 1){
            System.out.println("You ran out of Gas, GAME OVER!");
            }
    }


    public void useBoosters(){
        System.out.println("You use the Boosters");
        if(gas >= 3){
        gas = gas - 3;
        super.displayGas();
            if (gas < 1){
                System.out.println("You ran out of Gas, GAME OVER!");
                }
        }
        else {
            System.out.println("You don't have enough gas to use the Boosters!");
        }
    }

    public void refuel(){
        System.out.println("You refuel");
        if(gas<7){
        gas = gas + 3;
        super.displayGas();
        }
        else {
            System.out.println("You have enough gas for now!");
        }
        
    }


}
