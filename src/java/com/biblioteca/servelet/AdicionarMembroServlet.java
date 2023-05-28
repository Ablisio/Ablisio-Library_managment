package  com.biblioteca.servelet;
import com.biblioteca.model.MembroBean;
import com.biblioteca.modeloDao.MembroDao;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="/AdicionarMembroServlet",urlPatterns = ("/AdicionarMembroServlet"))
public class AdicionarMembroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
MembroBean membro=new MembroBean();
        // Recuperar os parâmetros do formulário
        membro.nome = request.getParameter("nome");
        membro.endereco = request.getParameter("endereco");
        membro.email = request.getParameter("email");
        membro.telefone = request.getParameter("telefone");
        membro.dataInscricao= request.getParameter("dataInscricao");

        // Converter a data de inscrição de String para Date
        String dataInscricao = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            membro.dataInscricao = String.valueOf(sdf.parse(dataInscricao));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        MembroDao membrodao= new MembroDao();
        membrodao.salvar(membro);
   

        // Redirecionar para a página de sucesso
        response.sendRedirect("sucesso.jsp");
    }
}
