package model;

public class Centrifuge extends AbstractInstrument {

    private double speedOfRotation;

    private int radius;

    private String nameOfDevise;

    public double getSpeedOfRotation() {
        return speedOfRotation;
    }

    public void setSpeedOfRotation(double speedOfRotation) {
        this.speedOfRotation = speedOfRotation;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getNameOfDevise() {
        return nameOfDevise;
    }

    public void setNameOfDevise(String nameOfDevise) {
        this.nameOfDevise = nameOfDevise;
    }

    public Centrifuge(double priceInUAH, int yearOfManifacture, String brandOfProduction, String materialMade,
                      double speedOfRotation, int radius, String nameOfDevise) {
        super(priceInUAH, yearOfManifacture, brandOfProduction, materialMade);

        this.speedOfRotation = speedOfRotation;
        this.radius = radius;
        this.nameOfDevise = nameOfDevise;

    }

    @Override
    public String toString() {
        return "Centrifuge{" +
                "speedOfRotation=" + speedOfRotation +
                ", radius=" + radius +
                ", nameOfDevise='" + nameOfDevise + '\'' +
                '}';
    }
}
