import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/departments";
        String user = "brad traversy";
        String password = "brad@$123";

        // Create Department object
        Department department = new Department(1, "Engineering");

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO department (id, name) VALUES (?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, department.getId());
                statement.setString(2, department.getName());
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new department was inserted successfully!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
