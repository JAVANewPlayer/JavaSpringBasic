package twm.spring.aopdemo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FireAssist {

    /*记录开火时间*/
    public void ActionLog() throws Throwable {
        System.out.println("开火时间："
                + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"))
                .format(new Date()));
    }

    /*报告已完成开火*/
    public void ReportComplete() throws Throwable {
        System.out.println("报告长官：打完收工！");
    }
}
