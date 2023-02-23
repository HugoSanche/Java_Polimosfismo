public class HibridCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;
    private double fuel;

    public HibridCar(int year, String brand, String model, String color){
        super(year,brand,model,color);
    }


    public HibridCar(double avgKmPerLitre, int cylinders, int batterySize, double fuel) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
        this.fuel = fuel;
    }
    public void startEngine(){
        super.startEngine();
        System.out.printf(" %d cilindros, bateria restante %d",cylinders);

    }
    public void drive(){
        super.drive();
        System.out.printf("Kilometros por litro %f, gasolina restante %f%n",avgKmPerLitre,fuel);
    }
}
