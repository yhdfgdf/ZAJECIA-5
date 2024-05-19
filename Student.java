import java.util.Date;
import java.util.ArrayList;

public class Student {
private String imie;
private String nazwisko;
private String mail;
private String adres;
private String telefon;
private Date urodziny;
private String index;
private String status;
    StudyProgramme studyProgramme;
    static int indx = 0;
    ArrayList<Grade> oceny = new ArrayList();
    int ObecnySemestr = 1;

 public Student(String imie,String nazwisko,String mail,String adres,String telefon,Date urodziny){

     this.imie=imie;
     this.nazwisko=nazwisko;
     this.mail=mail;
     this.adres=adres;
     this.telefon=telefon;
     this.urodziny=urodziny;
     this.index = GenerujIndex();
     this.status = StatusSemestralny();
 }
    private String GenerujIndex() {
        return "s" + indx++;
    }
    private String getStatusBySemester() {
        if (ObecnySemestr == 1) {
            return "Kandydat";
        } else if (ObecnySemestr > 1) {
            return "Student";
        } else if (ObecnySemestr >= 7) {
            return "Absolwent";
        } else {
            return "";
        }
    }
    public void enrollStudent(StudyProgramme programme) {
        studyProgramme = programme;
    }

    public void addGrade(int Grade, String subject) {
        Grade newGrade = new Grade(Grade, subject);
        Grade.add(newGrade);
    }

    public int IloscITN() {
        int count = 0;

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).grade == 2) {

                count++;
            }
        }

        return count;
    }
}



