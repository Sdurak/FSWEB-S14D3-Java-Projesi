package company;

import skeleton.CarSkeleton;

public class HybridCar extends CarSkeleton {
    //avgKmPerLitre: double, batterySize: int, cylinders: int

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
