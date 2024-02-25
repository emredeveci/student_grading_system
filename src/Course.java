public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int oralExamGrade;
    int writtenExamGrade;
    double finalGrade;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int oralExamGrade = 0;
        int writtenExamGrade = 0;
        int finalGrade = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else {
            System.out.println("Teacher and Branch do not match.");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}

