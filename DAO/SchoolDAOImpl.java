import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SchoolDAOImpl implements SchoolDAO{

    private Connection connection;
    private Statement statement;
    private String DBName;
    private String tableName;
    private ResultSet rs;

    public SchoolDAOImpl(String DBName, String tableName) throws SQLException {
        this.DBName = DBName;
        this.tableName = tableName;
        connection= DriverManager.getConnection("jdbc:sqlite:"+DBName);
        statement=connection.createStatement();
        statement.executeUpdate("DROP TABLE IF EXISTS "+ tableName);
        statement.executeUpdate("CREATE TABLE "+ tableName+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, name text, age INTEGER)");
        System.out.println(tableName+" 생성완료");
    }


    @Override
    public void insert(Student student) throws SQLException {
        String fmt = "INSERT INTO %s VALUES(%d ,'%s', %d)";
        String query = String.format(fmt, tableName, student.getId(),student.getName(), student.getAge());
        statement.execute(query);
    }

    @Override
    public List<Student> findAll() {
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            rs = statement.executeQuery("SELECT * FROM " +
                    tableName);
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"),
                        rs.getString("name"), rs.getInt("age")));
            }
        }
        catch (SQLException e) { e.printStackTrace(); }
        return students;

    }

    @Override
    public Student findById(int id) {
        Student student = null;
        try {
            String fmt = "SELECT * FROM %s WHERE id = %d";
            String q = String.format(fmt, tableName, id);
            rs = statement.executeQuery(q);
            if (rs.next()) {
                student = new Student(rs.getInt("id"),
                        rs.getString("name"), rs.getInt("age"));
            }
        }
        catch (SQLException e) { e.printStackTrace(); }
        return student;

    }

    @Override
    public void update(int id, Student student) {
        Student result = findById(id);
        if (result != null) {
            try {
                String fmt = "UPDATE %s SET name = '%s' WHERE id = %d";
                String q = String.format(fmt, tableName,
                        student.getName(),student.getId());
                statement.execute(q);

            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    @Override
    public void delete(int id) {
        try {
            String fmt = "DELETE FROM %s WHERE id = %d";
            String q = String.format(fmt, tableName, id);
            statement.execute(q);
        }
        catch (SQLException e) { e.printStackTrace(); }

    }

    @Override
    public void delete(Student p) {
        delete(p.getId());
    }
}
