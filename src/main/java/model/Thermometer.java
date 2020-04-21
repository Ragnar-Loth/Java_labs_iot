package model;

public class Thermometer extends AbstractInstrument {

    private double maxMeasurementRange;

    private int temperature;

    private String nameOfDevise;

    public double getMaxMeasurementRange() {
        return maxMeasurementRange;
    }

    public void setMaxMeasurementRange(double maxMeasurementRange) {
        this.maxMeasurementRange = maxMeasurementRange;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getNameOfDevise() {
        return nameOfDevise;
    }

    public void setNameOfDevise(String nameOfDevise) {
        this.nameOfDevise = nameOfDevise;
    }

    public Thermometer(double priceInUAH, int yearOfManifacture, String brandOfProduction, String materialMade,
                       double maxMeasurementRange, int temperature, String nameOfDevise) {
        super(priceInUAH, yearOfManifacture, brandOfProduction, materialMade);
        this.maxMeasurementRange = maxMeasurementRange;
        this.temperature = temperature;
        this.nameOfDevise = nameOfDevise;
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "maxMeasurementRange=" + maxMeasurementRange +
                ", temperature=" + temperature +
                ", nameOfDevise='" + nameOfDevise + '\'' +
                '}';
    }
}
