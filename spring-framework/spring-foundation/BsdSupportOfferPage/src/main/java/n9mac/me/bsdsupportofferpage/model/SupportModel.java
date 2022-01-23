package n9mac.me.bsdsupportofferpage.model;

import java.math.BigDecimal;

public enum SupportModel {

    REGULAR_PRICE(new BigDecimal(1000), UnitType.MONTH),
    ON_DEPENDS(new BigDecimal(150), UnitType.HOUR);

    private final BigDecimal pricePeUnit;
    private final UnitType unitType;

    SupportModel(BigDecimal pricePerUnit, UnitType unit) {
        this.pricePeUnit = pricePerUnit;
        this.unitType = unit;
    }

    public BigDecimal getPricePerUnit() {
        return pricePeUnit;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public String asText() {
        return String.format("Support name: %s, unit: %s, price: %s",this.name(),unitType, pricePeUnit);
    }
}
