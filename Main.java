import java.util.Date;

public class Main {
    Student s=new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));
    StudyProgramme it=new StudyProgramme("IT", "AAA", 7, 5);

    s.enrollStudent(it);

    s.addGrade(5, "PGO");
s.addGrade(2, "APBD");

Student.promoteAllStudents();
Student.displayInfoAboutAllStudents();

}



