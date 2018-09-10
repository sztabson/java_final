package webapp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import webapp.Database;
import webapp.Client;

public class ClientService {

	public static List<Client> getClients()
	{
		List<Client> clients = new ArrayList<Client>();
        Connection connection = Database.getConnection();
        

        String sql = "SELECT * FROM clients";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
            	String username = resultSet.getString("username");
            	String wo = resultSet.getString("wo");
            	String address = resultSet.getString("address");
            	String phone = resultSet.getString("phone");
            	String mileage = resultSet.getString("mileage");
            	clients.add(new Client(username, wo, address, phone, mileage));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

		return clients;
	}
	
	public static List<Client> getClientsByUsername(String username)
	{
		List<Client> clients = new ArrayList<Client>();
        Connection connection = Database.getConnection();
        

        String sql = "SELECT * FROM clients WHERE username = ? ORDER BY date";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
            	String username1 = resultSet.getString("username");
            	String wo = resultSet.getString("wo");
            	String address = resultSet.getString("address");
            	String phone = resultSet.getString("phone");
            	String mileage = resultSet.getString("mileage");
            	clients.add(new Client(username1, wo, address, phone, mileage));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

		return clients;
	}
	

	
	public Client getClientByWO(String wo)
	{
		Client client = null;
        Connection connection = Database.getConnection();

        String sql = "SELECT * FROM clients WHERE wo = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, wo);
            
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()) {
            	String username = resultSet.getString("username");
            	String wo1 = resultSet.getString("wo");
            	String address = resultSet.getString("address");
            	String phone = resultSet.getString("phone");
            	String mileage = resultSet.getString("mileage");
            	client = new Client(username, wo1, address, phone, mileage);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

		return client;
	}
	
	
	public static void insertClient(Client client)
	{
        Connection connection = Database.getConnection();

        String sql = "INSERT INTO clients (username, wo, address, phone, mileage) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, client.getUsername());
            statement.setString(2, client.getWO());
            statement.setString(3, client.getAddress());
            statement.setString(4, client.getPhone());
            statement.setString(5, client.getMileage());
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void updateClient(Client client)
	{
        Connection connection = Database.getConnection();

        String sql = "UPDATE clients SET (username = ?, wo = ?, address = ?, phone = ?, mileage = ?) WHERE wo = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, client.getUsername());
            statement.setString(2, client.getWO());
            statement.setString(3, client.getAddress());
            statement.setString(4, client.getPhone());
            statement.setString(5, client.getMileage());
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void deleteClient(String wo)
	{
        Connection connection = Database.getConnection();

        String sql = "DELETE FROM clients WHERE wo = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, wo);
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}


}
