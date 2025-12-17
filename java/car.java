public class car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    car()
    {
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristic()
    {
        System.out.println("Color: "+color+"\n"+"Transmission: "+transmission+"\n"+"make: "+make+"\n"+"tyres: "+tyres+"Doors: "+doors);
    }

    public void accelarate()
    {
        System.out.println("Car is moving");
    }

    public void brake()
    {
        System.out.println("Car has stopped");
    }
}
