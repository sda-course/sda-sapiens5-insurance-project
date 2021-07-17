package pl.sda.sapiens5.insurance.model;

import java.time.LocalDate;

public class CandidateClient {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final String pesel;
    private final String email;

    public CandidateClient(String firstName, String lastName, LocalDate birthDate, String pesel, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = pesel;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public String getEmail() {
        return email;
    }
}
