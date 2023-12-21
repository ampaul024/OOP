public class Student {

    private String name;
    private int age;

    public Student() {
        name = "no name yet";
        age = 9;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this(name, 9);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name + ", " + s1.name);

        s1.name = "Zoey";
        s1.age = 18;
        System.out.println(s1.name + ", " + s1.age);

        Student s2 = new Student("Paul", 20);
        System.out.println(s2.name + ", " + s2.age);

        Student s3 = new Student("Lucky", 3);
        System.out.println(s3.name + ", " + s3.age);

    }
}
