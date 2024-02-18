package ru.game;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession currentSession = req.getSession();
        Phrases phrases = new Phrases();
        currentSession.setAttribute("phrases", phrases);
        if (currentSession.getAttribute("count") == null) {
            currentSession.setAttribute("count", 1);
        } else {
            currentSession.setAttribute("count", (int) currentSession.getAttribute("count") + 1);
        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
