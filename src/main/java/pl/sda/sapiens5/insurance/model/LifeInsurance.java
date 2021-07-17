package pl.sda.sapiens5.insurance.model;

import java.math.BigDecimal;

public class LifeInsurance {
    private final String name;
    private final BigDecimal insuranceAmount;

    public LifeInsurance(String name, BigDecimal insuranceAmount) {
        this.name = name;
        this.insuranceAmount = insuranceAmount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }
}
