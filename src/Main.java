public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Severus Snape", "PTS", "491234567");
        Teacher teacher2 = new Teacher("Minerva McGonagall", "TRN", "491234568");
        Teacher teacher3 = new Teacher("Remus Lupin", "DADA", "491234569");

        Course potions = new Course("Potions", "101", "PTS");
        potions.addTeacher(teacher1);

        Course transformation = new Course("Transformation", "102", "TRN");
        transformation.addTeacher(teacher2);

        Course defense = new Course("Defense Against the Dark Arts", "103", "DADA");
        defense.addTeacher(teacher3);


        Student student1 = new Student("Emre Deveci", "20800", "4", potions, transformation, defense);

        student1.addBulkExamGrade(100, 70, 40, 60, 50, 70);
        student1.isPass();

        Student student2 = new Student("Colt Dillon", "20900", "4", potions, transformation, defense);
        student2.addBulkExamGrade(90, 100, 100, 50, 40, 50);
        student2.isPass();
    }

}