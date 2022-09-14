public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(1337, 100, 2, "DeLorean - DMC 12", "grau", "DeLorean-Motor-Company");
        Car car2 = new Car(187, 400, 3, "Labmorghini Aventador", "grün", "Lamborghini");
        Car car3 = new Car(420, 1312, 4, "Fiat Quattrocentoventi", "grün", "Fiat");

        car1.printDescription();
        car1.drive(30);
        car1.printDescription();

        car2.printDescription();
        car2.printDescription();
        System.out.printf("Max. km: %d\n", car2.getMaxKilometers());
        System.out.println("Is Reachable: " + car2.isReachable(50));
        car2.drive(20);
        car2.printDescription();

        car3.printDescription();
        System.out.printf("Max. km: %d\n", car3.getMaxKilometers());
        System.out.println("Is Reachable: " + car3.isReachable(50));
        car3.drive(20);
        car3.printDescription();
    }
}