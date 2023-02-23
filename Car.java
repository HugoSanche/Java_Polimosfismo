public class Car {
    
    private int year;
    private String brand;
    private String model;
    private String color;
    

    public Car() {
    }

    public Car(int year, String brand, String model, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }


    public void startEngine(){
        System.out.println("Prendiendo motor "+this.getClass().getSimpleName());
    }
    public void drive(){
        System.out.printf("Manejando: %n \t\u2022 %s%n \t\u2022 %s%n \t\u2022 %d%n", brand,model, year);
    }

    protected void  runEngine(){
        System.out.println("Corriendo auto Generico");
    }
    public void turnOnLights(){
        System.out.println("Prendiendo luces auto Generico");
    }
}
