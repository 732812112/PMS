package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.TbStorageDao;
import com.neu.dao.TbStorageDaoImpl;
import com.neu.entity.TbStorage;

/**
 * Servlet implementation class SelectCountServlet
 */
@WebServlet("/SelectCountServlet")
public class SelectCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SelectCountServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String goodsName = request.getParameter("goodsName");
		int goodsCount = Integer.parseInt(request.getParameter("goodsCount"));
		
		TbStorageDao dao = new TbStorageDaoImpl();
				
		try {
			TbStorage tbStorage = dao.getById(goodsName);
			
			if(goodsCount > tbStorage.getGoodsCount()) {
				request.setAttribute("tbStorage", tbStorage);
				request.getRequestDispatcher("/error.jsp").forward(request, response);	
			}else {
				tbStorage.setGoodsCount(tbStorage.getGoodsCount()-goodsCount);
				dao.update(tbStorage);
				request.setAttribute("tbStorage", tbStorage);
				request.getRequestDispatcher("/update.jsp").forward(request, response);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
