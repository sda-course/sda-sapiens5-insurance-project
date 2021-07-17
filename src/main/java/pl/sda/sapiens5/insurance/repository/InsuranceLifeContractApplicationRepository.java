package pl.sda.sapiens5.insurance.repository;

import pl.sda.sapiens5.insurance.model.InsuranceLifeContractApplication;

import javax.ejb.Singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

@Singleton(name = "life-applications")
public class InsuranceLifeContractApplicationRepository implements ApplicationRepository{
    private final Map<UUID, InsuranceLifeContractApplication> applicationMap = new HashMap<>();
    @Override
    public void save(InsuranceLifeContractApplication application) {
        applicationMap.put(application.getId(), application);
    }

    @Override
    public Stream<InsuranceLifeContractApplication> findAll() {
        return applicationMap.values().stream();
    }
}
