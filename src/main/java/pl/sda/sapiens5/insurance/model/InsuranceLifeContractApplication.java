package pl.sda.sapiens5.insurance.model;

import java.util.Objects;
import java.util.UUID;

public class InsuranceLifeContractApplication {
    private final UUID id = UUID.randomUUID();
    private final CandidateClient client;
    private final LifeInsurance insurance;

    public InsuranceLifeContractApplication(CandidateClient client, LifeInsurance insurance) {
        this.client = client;
        this.insurance = insurance;
    }

    public UUID getId() {
        return id;
    }

    public CandidateClient getClient() {
        return client;
    }

    public LifeInsurance getInsurance() {
        return insurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsuranceLifeContractApplication that = (InsuranceLifeContractApplication) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
