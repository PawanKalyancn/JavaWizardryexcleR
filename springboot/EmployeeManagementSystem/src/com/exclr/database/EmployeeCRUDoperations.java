package com.exclr.database;
import com.exclr.model.Employee;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	public class EmployeeCRUDoperations

	{
		
		//STATIC METHOD
		
		public String addProduct(Employee emp) throws Exception
		{
		    Connection con =	DBconction.connect();
		PreparedStatement ps=  con.prepareStatement("insert into employees values(?,?,?,?)");
		ps.setInt(1, emp.getId());
		ps.setString(2, emp.getName());
		ps.setString(3, emp.getDepartment());
		ps.setDouble(4, emp.getSalary());
	     
		ps.execute();
			    
			return "employee added";
		}
		
		
		
		
	//DYNAMICMETHOD	
		
		
		public ArrayList<Employee> reteriveAllProduct() throws Exception
		{
			ArrayList<Employee> products = new ArrayList<>();
			
			 Connection con =	DBconction.connect();
			PreparedStatement ps = con.prepareStatement("select * from employees ");
		    ResultSet rs= ps.executeQuery();
		    
		    while(rs.next())
		    {
		        products.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
		    }
			
			
			return products;
	}
	
	
	// Method to delete an employee from the database by ID
    public static String deleteEmployee(int employeeId) throws Exception {
        Connection con = DBconction.connect();
        PreparedStatement ps = con.prepareStatement("DELETE FROM employees WHERE id = ?");
        ps.setInt(1, employeeId);

        int deletedRows = ps.executeUpdate();

        if (deletedRows > 0) {
            return "Employee deleted";
        } else {
            return "No employee found with the given ID for deletion";
        }
    
    }
	
    // Method to update employee details in the database
    public static String updateEmployee(Employee employee) throws Exception {
        Connection con = DBconction.connect();
        PreparedStatement ps = con.prepareStatement("UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?");
        ps.setString(1, employee.getName());
        ps.setString(2, employee.getDepartment());
        ps.setDouble(3, employee.getSalary());
        ps.setInt(4, employee.getId());

        int updatedRows = ps.executeUpdate();

        if (updatedRows > 0) {
            return "Employee details updated";
        } else {
            return "No employee found with the given ID for update";
        }
    }
    
    
    
	}
	
	
	
	

