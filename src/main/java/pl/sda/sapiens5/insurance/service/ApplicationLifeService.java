package pl.sda.sapiens5.insurance.service;

import pl.sda.sapiens5.insurance.model.InsuranceLifeContractApplication;
import pl.sda.sapiens5.insurance.repository.ApplicationRepository;

import javax.ejb.Singleton;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Singleton
public class ApplicationLifeService implements ApplicationService{

    private final ApplicationRepository applicationRepository;

    @Inject
    public ApplicationLifeService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }


    @Override
    public void registerApplication(InsuranceLifeContractApplication application) {
        applicationRepository.save(application);
    }

    @Override
    public List<InsuranceLifeContractApplication> findAll() {
        return applicationRepository.findAll().collect(Collectors.toList());
    }

    @Override
    public void sendToClient(UUID id) {
        Optional<InsuranceLifeContractApplication> appOp = applicationRepository
                .findAll()
                .filter(app -> app.getId().equals(id))
                .findAny();
        if(appOp.isPresent()){

        } else{

        }
    }
}
