public class IntrduceDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    自我介绍
     */
    public void intrduce() {
        System.out.println("您好,我叫" + this.name + "今年" + this.age + "岁");
    }

    public void init() {
        System.out.println("Bean初始化....");
    }

    public void destroy() {
        System.out.println("Bean销毁....");
    }
}
