package pl.pjatk.mickro;


import org.springframework.stereotype.Component;

@Component
public class Second {

    public Second(First first){
        System.out.println("Drugie to jest");
        first.Message();
    }


    public void AlienMyMethod(){
        System.out.println("Second, AlienMyMethod");
    }

}
