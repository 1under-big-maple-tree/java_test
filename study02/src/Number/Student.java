package Number;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "李家豪{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
