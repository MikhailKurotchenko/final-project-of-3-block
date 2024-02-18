package ru.game;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession currentSession = req.getSession();


        Phrases phrases = (Phrases) currentSession.getAttribute("phrases");
        int currentStep = phrases.getStep();
        String answer = req.getParameter("answer");

        if (answer.equals("Yes")) {
            if (currentStep == phrases.getQuestions().size() - 1) {
                currentSession.setAttribute("stateOfAnswer", true);
                resp.sendRedirect("/lastPage.jsp");
                return;
            }
            phrases.setStep(currentStep + 1);
            currentSession.setAttribute("phrases", phrases);
            currentSession.setAttribute("stateOfAnswer", true);
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        } else if (answer.equals("No")) {
            currentSession.setAttribute("stateOfAnswer", false);
            resp.sendRedirect("/lastPage.jsp");
        }
    }
}

