package company;

import skeleton.CarSkeleton;

public class GasPoweredCar extends CarSkeleton {
    //avgKmPerLitre: double ve cylinders: int

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}
