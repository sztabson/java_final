package webapp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientValidationService
{	
	public static boolean isClientValid(String wo)
	{
        Client client = getClient(wo);
        
        if (client != null)
		{
        	return true;
		}
        return false;
	}
	
	public static Client getClient(String wo)
	{
		Client client = null;
        Connection connection = Database.getConnection();

        String sql = "SELECT * FROM clients WHERE wo = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, wo);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
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
	
	public void insertClient(String wo)
	{
        Connection connection = Database.getConnection();

        String sql = "INSERT INTO clients (wo) VALUES (?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, wo);
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
