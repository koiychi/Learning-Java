import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class SQLite {
    private Connection conn;

    //Constructor for the DB
    public SQLite() throws SQLException {
        String url = "jdbc:sqlite:contacts.db";
        this.conn = DriverManager.getConnection(url);
        createTable();
    }

    //Method for creating a table (Data Definition)
    private void createTable() throws SQLException {
        //Create the Table and Fields (Data Definition)
        String sql = "CREATE TABLE IF NOT EXISTS CONTACTS (\n" + 
            " id integer PRIMARY KEY, \n" +
            " name text NOT NULL,\n" + 
            " email text NOT NULL,\n" +
            " phone text\n" +
            ")";

        //Execute the statement (create the table if it doesn't exist)
        try (Statement statement = conn.createStatement()) {
            statement.execute(sql);
        }
    }

    public void insertContacts(Contacts newContact) throws SQLException {
        String sql = "INSERT INTO CONTACTS (name, email, phone) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, newContact.getName());
            preparedStatement.setString(2, newContact.getEmail());
            preparedStatement.setString(3, newContact.getPhone());
            preparedStatement.executeUpdate();
        }
    }

    // Return all contacts from the database
    public List<Contacts> getAllContacts() throws SQLException {
        String sql = "SELECT name, email, phone FROM CONTACTS";
        List<Contacts> results = new ArrayList<>();

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                results.add(new Contacts(name, email, phone));
            }
        }

        return results;
    }

    // Close the DB connection
    public void close() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}

