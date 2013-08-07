

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fuzzme
 */
@WebServlet("/Fuzzme")
public class Fuzzme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fuzzme() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = null;
		Map params = null;
		params = request.getParameterMap();
		Iterator i = params.keySet().iterator();
		int count = 0;
		while ( i.hasNext() )
		{
			count ++;
		String key = (String) i.next();
		value = ((String[]) params.get( key ))[ 0 ];
		
		}
		if (count < 1)
		request.getRequestDispatcher("test.jsp").forward(request, response);
		
	else{
	
		
		TCPClient.main(value);
		request.getRequestDispatcher("testran.jsp").forward(request, response);
	
	}}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

	}

}
