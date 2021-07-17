package pl.sda.sapiens5.insurance.mapper;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import pl.sda.sapiens5.insurance.model.InsuranceLifeContractApplication;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

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
            return Optional.empty();
        } catch (RuntimeException e){
            return Optional.empty();
        }
    }
}
