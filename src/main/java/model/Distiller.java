package model;

public class Distiller extends AbstractInstrument {

    private double volumeOfLiquid;

    private int numberOfRefrigeration;

    private String nameOfDevise;


    public double getVolumeOfLiquid() {
        return volumeOfLiquid;
    }

    public void setVolumeOfLiquid(double volumeOfLiquid) {
        this.volumeOfLiquid = volumeOfLiquid;
    }

    public int getNumberOfRefrigeration() {
        return numberOfRefrigeration;
    }

    public void setNumberOfRefrigeration(int numberOfRefrigeration) {
        this.numberOfRefrigeration = numberOfRefrigeration;
    }

    public String getNameOfDevise() {
        return nameOfDevise;
    }

    public void setNameOfDevise(String nameOfDevise) {
        this.nameOfDevise = nameOfDevise;
    }


    public Distiller(double priceInUAH, int yearOfManifacture, String brandOfProduction, String materialMade,
                     double volumeOfLiquid, int numberOfRefrigeration, String nameOfDevise) {
        super(priceInUAH, yearOfManifacture, brandOfProduction, materialMade);

        this.volumeOfLiquid = volumeOfLiquid;
        this.numberOfRefrigeration = numberOfRefrigeration;
        this.nameOfDevise = nameOfDevise;

    }

    @Override
    public String toString() {
        return "Distiller{" +
                "volumeOfLiquid=" + volumeOfLiquid +
                ", numberOfRefrigeration=" + numberOfRefrigeration +
                ", nameOfDevise='" + nameOfDevise + '\'' +
                '}';
    }
}
