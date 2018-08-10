package EventHandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    @java.lang.Override
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("收到CStopEventHandler事件");
    }
}
