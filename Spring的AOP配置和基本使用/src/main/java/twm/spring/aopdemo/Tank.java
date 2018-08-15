package twm.spring.aopdemo;

public class Tank implements Fireable {
    @java.lang.Override
    public int attack(Object obj) {
        System.out.println("坦克开火! 造成100点伤害! ");
        return 100;
    }
}
