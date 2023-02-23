public class TestCar {

    public static void main(String[] Args){
    GasCar gasCar=new GasCar(2018, "Volkwagen", "vento", "Rojo",15, 4, 20);
    gasCar.startEngine();
    gasCar.drive();
    
    ElectricCaar electricCar=new ElectricCaar(2018, "Honda", "Hibrid", "Blanco",15, 20);
    electricCar.startEngine();
    electricCar.drive();
    }


}
