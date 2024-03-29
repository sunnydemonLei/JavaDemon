package top.trylei.jc;

public class ParentClass {
    private String name;
    private int age;
    private String sex;

    static {
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类代码块");
    }
    public ParentClass() {
        System.out.println("父类的无参构造函数");
    }

    public ParentClass(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void printInfo(){
        StringBuilder tmp = new StringBuilder();
        tmp.append("姓名：");
        tmp.append(getName());
        tmp.append("年龄：");
        tmp.append(getAge());
        System.out.println(tmp.toString());
    }
}
