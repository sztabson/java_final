package webapp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import webapp.Database;
import webapp.User;

public class UserService {

	public static List<User> getUsers()
	{
		List<User> users = new ArrayList<User>();
        Connection connection = Database.getConnection();

        String sql = "SELECT * FROM users";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
            	String id = resultSet.getString("id");
            	String username = resultSet.getString("username");
            	String password = resultSet.getString("password");
            	String firstname = resultSet.getString("firstname");
            	String lastname = resultSet.getString("lastname");
            	String address = resultSet.getString("address");
            	String phone = resultSet.getString("phone");
            	users.add(new User(id, username, password, firstname, lastname, address, phone));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

		return users;
	}
	
	public User getUserByUserName(String username)
	{
		User user = null;
        Connection connection = Database.getConnection();
        //SELECT * FROM comit.users WHERE firstname like "%?%";
        String sql = "SELECT * FROM users WHERE username = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, username);
            
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()) {
            	String id = resultSet.getString("id");
            	String username1 = resultSet.getString("username");
            	String password = resultSet.getString("password");
            	String firstname = resultSet.getString("firstname");
            	String lastname = resultSet.getString("lastname");
            	String address = resultSet.getString("address");
            	String phone = resultSet.getString("phone");
            	user = new User(id, username1, password, firstname, lastname, address, phone);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

		return user;
	}
	
	public static void insertUser(User user)
	{
        Connection connection = Database.getConnection();

        String sql = "INSERT INTO users (id, username, password, firstname, lastname, address, phone) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, user.getid());
            statement.setString(2, user.getusername());
            statement.setString(3, user.getpassword());
            statement.setString(4, user.getfirstname());
            statement.setString(5, user.getlastname());
            statement.setString(6, user.getaddress());
            statement.setString(7, user.getphone());
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void updateUser(User user)
	{
        Connection connection = Database.getConnection();
        // tu zamiast username -> id
        String sql = "UPDATE users SET (id = ?, username = ?, password = ?, firstname = ?, lastname = ?, address = ?, phone = ?) WHERE username = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, user.getid());
            statement.setString(2, user.getusername());
            statement.setString(3, user.getpassword());
            statement.setString(4, user.getfirstname());
            statement.setString(5, user.getlastname());
            statement.setString(6, user.getaddress());
            statement.setString(7, user.getphone());
            statement.setString(8, user.getusername());
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void deleteUser(String username)
	{
        Connection connection = Database.getConnection();

        String sql = "DELETE FROM users WHERE username = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, username);
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
