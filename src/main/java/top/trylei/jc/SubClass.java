package top.trylei.jc;

/*
    继承（inheritance），就是基于已经存在的类构造一个新类，新类继承了已存在类的方法和域，并在此基础上还可以添加新的方法和域。
    在Java中使用extends关键字来表明一个类继承自另一个类，已存在的类称为超类（superclass）、基类（base class）或父类（parent class）；
        新创建的类称为子类（subclass）、派生类（derived       class）或孩子类（child class）。
    继承的语法结构：
    class Subclass extends ParentClass{
        子类新定义的方法和域；
    }
* */
public class SubClass extends ParentClass {
    private String myself;

    public SubClass(String myself) {
        this.myself = myself;
    }

    public SubClass(String name, int age, String sex, String myself) {
        super(name, age, sex);
        this.myself = myself;
    }

    public String getMyself() {
        return myself;
    }

    public void setMyself(String myself) {
        this.myself = myself;
    }
    //子类可以覆盖父类的方法，我们称为复写或者覆盖，可以使用@Override注解
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(getMyself());
    }

}
