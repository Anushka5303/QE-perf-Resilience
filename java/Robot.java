public class Robot extends Human{
    int population=0;
    
    Robot ()
    {   
        this.population+=super.population;
         System.out.println(this.population);
    }
    
    public void identity() {
        System.out.println("I am Robot");
    }
}
