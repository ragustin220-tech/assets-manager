import java.math.BigDecimal;

public class House extends Asset{
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House(String description, String dataAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal pricePerSqft;

        switch (condition) {
            case 1:
                pricePerSqft = new BigDecimal("180");
                break;
            case 2:
                pricePerSqft = new BigDecimal("130");
                break;
            case 3:
                pricePerSqft = new BigDecimal("90");
                break;
            case 4:
            default:
                pricePerSqft = new BigDecimal("80");
                break;
        }
        BigDecimal houseValue = pricePerSqft.multiply(BigDecimal.valueOf(squareFoot));
        BigDecimal lotValue = new BigDecimal("0.25").multiply(BigDecimal.valueOf(lotSize));
        return houseValue.add(lotValue);
    }

}
