/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 758243
 */
public class ShoppingListServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doEverything(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doEverything(request, response);
    }

    public void doEverything(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String action = request.getParameter("action");
        HttpSession session = request.getSession();
        
        if(session.getAttribute("userName") == null && action == null)
        {
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("username", session.getAttribute("userName"));
            request.getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        
        if(action != null)
        {
            switch(action)
            {
                case "register":
                    String username = request.getParameter("userName");
                    session.setAttribute("userName", username);
                    response.sendRedirect("ShoppingList");
                    break;
            }
        }
    }
}
