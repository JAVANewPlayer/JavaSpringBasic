package com.wacai;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {

    @java.lang.Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("收到ContextStartedEvent事件");
    }
}
