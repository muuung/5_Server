package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.model.vo.Person;

@WebServlet("/forEach")
public class ForEachServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Person> pList = new ArrayList<>();
		
		pList.add(new Person("고영희", 25, "캣타워"));
		pList.add(new Person("허숙희", 25, "개집"));
		pList.add(new Person("고끼리", 25, "초원"));
		pList.add(new Person("도람쥐", 25, "나무"));
		pList.add(new Person("도야지", 25, "우리"));
		
		req.setAttribute("pList", pList); // request에 값 세팅
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/forEach.jsp");
		dispatcher.forward(req, resp);
	}
}