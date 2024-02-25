public class Teacher {

    String name;
    String tel;
    String branch;

    Teacher(String name, String branch, String tel){
        this.name = name;
        this.tel = tel;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Telephone: " + this.tel);
        System.out.println("Branch: " + this.branch);
    }
}
