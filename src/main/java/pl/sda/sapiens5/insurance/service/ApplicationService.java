package pl.sda.sapiens5.insurance.service;

import pl.sda.sapiens5.insurance.model.InsuranceLifeContractApplication;

import java.util.List;
import java.util.UUID;

public interface ApplicationService {
    void registerApplication(InsuranceLifeContractApplication application);
    List<InsuranceLifeContractApplication> findAll();
    void sendToClient(UUID id);
}
