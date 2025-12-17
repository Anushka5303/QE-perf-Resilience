import java.util.Random;
public class Girl extends Human{
     int population=0;
    
    Girl ()
    {   
        this.population +=super.population;
        System.out.println(this.population);
    }
    
    public void identity() {
        System.out.println("I am Girl");
    }
}
