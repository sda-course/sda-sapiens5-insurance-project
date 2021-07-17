package pl.sda.sapiens5.insurance.repository;

import pl.sda.sapiens5.insurance.model.InsuranceLifeContractApplication;

import java.util.stream.Stream;

public interface ApplicationRepository {
    void save(InsuranceLifeContractApplication application);
    Stream<InsuranceLifeContractApplication> findAll();
}
