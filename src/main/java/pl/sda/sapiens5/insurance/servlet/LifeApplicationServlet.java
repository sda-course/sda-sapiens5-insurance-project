package pl.sda.sapiens5.insurance.servlet;
import pl.sda.sapiens5.insurance.mapper.LifeApplicationMapper;
import pl.sda.sapiens5.insurance.model.InsuranceLifeContractApplication;
import pl.sda.sapiens5.insurance.service.ApplicationService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(value = "/application")
public class LifeApplicationServlet extends HttpServlet {
    @EJB
    private LifeApplicationMapper mapper;

    @EJB
    private ApplicationService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/application/application-life-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Optional<InsuranceLifeContractApplication> applicationOp = mapper.toModel(req);
        if(applicationOp.isPresent()){
            service.registerApplication(applicationOp.get());
            getServletContext().getRequestDispatcher("/application/accepted-info.jsp").forward(req, resp);
        } else{
            getServletContext().getRequestDispatcher("/application/not-accepted-info.jsp").forward(req, resp);
        }
    }
}
