package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DBConnection;

@WebServlet("/confirmServlet")
public class ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBConnection db = new DBConnection();
		Connection conn = db.getConnection();
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM flight_details ORDER BY flight_no DESC LIMIT 1");
			ResultSet rs = ps.executeQuery();
			
			List<booking> seats = new ArrayList<>();
			while (rs.next()) {
				booking seat = new booking();
				//System.out.println(rs.getString(1));
				seat.setAirline_name(rs.getString(1));
				seat.setPrice(rs.getString(2));
				seat.setFlight_no(rs.getInt(3));
				seat.setSource_city(rs.getString(4));
				seat.setDestination(rs.getString(5));
				seats.add(seat);
				
				
		}
			request.getSession().setAttribute("seatList", seats);
			response.sendRedirect("confirm.jsp");
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeConnection();
		}
	}
}

