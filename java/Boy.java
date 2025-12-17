class Boy extends Human {
    int population=0;
   
    Boy ()
    {   
        this.population=super.population+1;
        System.out.println(this.population);
    }
   
    public void identity() {
        System.out.println("I am Robot");
    }
  
}