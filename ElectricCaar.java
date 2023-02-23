public class ElectricCaar extends Car{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCaar(int year, String brand, String model, String color){
        super(year,brand,model,color);

    }

    public ElectricCaar(double avgKmPerLitre, int batterySize) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }
    public ElectricCaar(int year, String brand, String model, String color,double avgKmPerLitre, int batterySize){
        super(year,brand,model,color);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;

    }

    public void startEngine(){
        super.startEngine();
        System.out.printf(" %d tamaño de Bateria %n",batterySize);
    }
    public void drive(){
        super.drive();
        System.out.printf("Kilometros por litro %f",avgKmPerLitre);
    }
}
