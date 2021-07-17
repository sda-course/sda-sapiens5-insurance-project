package pl.sda.sapiens5.insurance.mapper;

import pl.sda.sapiens5.insurance.model.CandidateClient;
import pl.sda.sapiens5.insurance.model.InsuranceLifeContractApplication;
import pl.sda.sapiens5.insurance.model.LifeInsurance;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;


@Stateless(name = "mapper")
public class LifeApplicationMapper {
    public Optional<InsuranceLifeContractApplication> toModel(HttpServletRequest request){
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String birthDateString = request.getParameter("birthDate");
        String pesel = request.getParameter("pesel");
        String name = request.getParameter("name");
        String amountString = request.getParameter("insuranceAmount");
        try {
            LocalDate birthDate = LocalDate.parse(birthDateString);
            BigDecimal insuranceAmount = new BigDecimal(amountString);
            CandidateClient client = new CandidateClient(firstName, lastName, birthDate, pesel, email);
            LifeInsurance insurance = new LifeInsurance(name, insuranceAmount);
            InsuranceLifeContractApplication application = new InsuranceLifeContractApplication(client, insurance);
            return Optional.of(application);
        } catch (RuntimeException e){
            return Optional.empty();
        }
    }
}
