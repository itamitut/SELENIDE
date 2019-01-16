import java.sql.*;

public class DBtest {

    public static void main(String[] args) {

        dbConnection();
    }

    public static void dbConnection() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook?serverTimezone=UTC&" +
                            "user=root&password=");
            Statement st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("select firstname, lastname  from addressbook");
            while (resultSet.next()){
                System.out.println(resultSet.getString("firstname") + " " + resultSet.getString("lastname"));
            }
            resultSet.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
