package pl.sda.sapiens5.insurance.repository;

import pl.sda.sapiens5.insurance.model.CandidateClient;
import pl.sda.sapiens5.insurance.model.InsuranceLifeContractApplication;
import pl.sda.sapiens5.insurance.model.LifeInsurance;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

@Singleton(name = "life-applications")
public class InsuranceLifeContractApplicationRepository implements ApplicationRepository{
    private final Map<UUID, InsuranceLifeContractApplication> applicationMap = new HashMap<>();

    @PostConstruct
    void initData(){
        CandidateClient client = new CandidateClient("Adam", "Nowak", LocalDate.of(2000,10,10), "123456789", "adamn@op.pl");
        LifeInsurance insurance = new LifeInsurance("Life plus", new BigDecimal("12000"));
        InsuranceLifeContractApplication application = new InsuranceLifeContractApplication(client, insurance);
        applicationMap.put(application.getId(), application);
    }

    @Override
    public void save(InsuranceLifeContractApplication application) {
        applicationMap.put(application.getId(), application);
    }

    @Override
    public Stream<InsuranceLifeContractApplication> findAll() {
        return applicationMap.values().stream();
    }
}
