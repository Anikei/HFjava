/*import java.io.IOException;
import java.io.PrintWriter;

public class PhraseServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponce responce) throws ServletException, IOException {
        String title = "PhraseoMatic has generated";

        responce.setContentType("text/html");
        PrintWriter out = responce.getWriter();

        out.println("<HTML><HEAD><TITLE>");
        out.println("PhraseOmatic");
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<P>" + PhraseOmatic.makePhrase());
        out.println("<P><a href=\"KathyServlet\">Создать другую фразу</A></P>");
        out.println("</BODY></HTML>");
        out.close();
    }
}*/