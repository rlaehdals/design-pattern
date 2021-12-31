import java.sql.SQLException;
import java.util.List;

public interface SchoolDAO {
    public void insert(Student student) throws SQLException;
    public List<Student> findAll();
    public Student findById(int id);
    public void update(int id, Student student);
    public void delete(int id);
    public void delete(Student p);

}
