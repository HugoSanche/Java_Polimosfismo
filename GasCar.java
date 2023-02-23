public class GasCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private double fuel;


public GasCar(int year, String brand, String model, String color){
    super(year,brand,model,color);
}
    public GasCar(double avgKmPerLitre, int cylinders, double fuel) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.fuel = fuel;
    }
    public GasCar(int year, String brand, String model, String color,double avgKmPerLitre, int cylinders, double fuel){
        super(year,brand,model,color);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
        this.fuel=fuel;
    }

    public void startEngine(){
        super.startEngine();
        System.out.printf(" %d cilindros %n",cylinders);
    }
    public void drive(){
        super.drive();
        System.out.printf("Kilometros por litro %f, gasolina restante %f%n",avgKmPerLitre,fuel);
    }

    protected void  runEngine(){
        System.out.println("Corriendo auto Generico");
    }
    public void turnOnLights(){
        System.out.println("Prendiendo luces auto Generico");
    }
}
