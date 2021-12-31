import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        SchoolDAO schoolDAO = new SchoolDAOImpl("school.db", "student");

        // 학생 2명 추가
        schoolDAO.insert(new Student(1,"kim",10));
        schoolDAO.insert(new Student(2,"lee",13));

        // 학생 전체 출력
        List<Student> result = schoolDAO.findAll();
        for (Student student1: result){
            System.out.println(student1.getId()+" "+student1.getName()+" "+student1.getAge());
        }

        // id가 1인 학생 찾기
        Student student = schoolDAO.findById(1);
        System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());

        // id가 1인 학생의 이름 변경
        schoolDAO.update(1, new Student(1, "park",10));

        // id가 1인 학생이 바꼈는지 확인
        student = schoolDAO.findById(1);
        System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());


        // id가 2인 학생 삭제
        schoolDAO.delete(2);

        // 학생 전체 출력
        result = schoolDAO.findAll();
        for (Student student1: result){
            System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());
        }

    }
}