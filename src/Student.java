public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String idNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String idNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.idNo = idNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }


    void addBulkExamGrade(int oralExamGrade1,int writtenExamGrade1,int oralExamGrade2,int writtenExamGrade2,int oralExamGrade3,int writtenExamGrade3){
        this.c1.finalGrade = (oralExamGrade1 * 0.2) + (writtenExamGrade1 * 0.8);
        this.c2.finalGrade = (oralExamGrade2 * 0.2) + (writtenExamGrade2 * 0.8);
        this.c3.finalGrade = (oralExamGrade3 * 0.2) + (writtenExamGrade3 * 0.8);
    }

    void isPass(){
        this.average = (this.c1.finalGrade + this.c2.finalGrade + this.c3.finalGrade) / 3.0;
        if (this.average > 55) {
            System.out.println("You have passed.");
            this.isPass = true;
        } else {
            System.out.println("You have failed.");
            this.isPass = false;
        }

        printGrade();
    }

    void printGrade(){
        System.out.println(c1.name + " Grade is: " + c1.finalGrade);
        System.out.println(c2.name + " Grade is: " + c2.finalGrade);
        System.out.println(c3.name + " Grade is: " + c3.finalGrade);
        System.out.println("Your grade average is: " + this.average);
    }
}
