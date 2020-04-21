package model;

public class AbstractInstrument {

    protected double priceInUAH;

    protected int yearOfManifacture;
                                                         // оголошення полів.
    protected String brandOfProduction;

    protected String materialMade;


    public double getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(double priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public int getYearOfManifacture() {
        return yearOfManifacture;
    }

    public void setYearOfManifacture(int yearOfManifacture) {
        this.yearOfManifacture = yearOfManifacture;
    }

    public String getBrandOfProduction() {
        return brandOfProduction;
    }

    public void setBrandOfProduction(String brandOfProduction) {
        this.brandOfProduction = brandOfProduction;
    }

    public String getMaterialMade() {
        return materialMade;
    }

    public void setMaterialMade(String materialMade) {
        this.materialMade = materialMade;
    }

    public AbstractInstrument(double priceInUAH, int yearOfManifacture, String brandOfProduction, String materialMade) {
        this.priceInUAH = priceInUAH;
        this.yearOfManifacture = yearOfManifacture;
        this.brandOfProduction = brandOfProduction;
        this.materialMade = materialMade;
    }

}
