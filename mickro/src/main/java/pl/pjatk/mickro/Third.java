package pl.pjatk.mickro;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Third {


    public Third(ApplicationContext applicationContext){

        First first = applicationContext.getBean("first", First.class);
        Second second = applicationContext.getBean("second", Second.class);

        first.MyMethod();
        second.AlienMyMethod();
    }
}
