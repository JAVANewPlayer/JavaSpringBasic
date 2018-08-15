package twm.spring.aopdemo2;

import org.springframework.stereotype.Component;

@Component
public class FighterPlane implements Fireable {
    @java.lang.Override
    public int attack(Object obj) {
        System.out.println("战斗机开火! 造成200点伤害");
        return 200;
    }
}
