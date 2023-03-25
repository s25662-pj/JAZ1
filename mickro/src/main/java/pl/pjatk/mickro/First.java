package pl.pjatk.mickro;

import org.springframework.stereotype.Component;


@Component
public class First {

    public First(){
        System.out.println("Pierwsze");
    }

    public void Message(){
        System.out.println("Siemka from first to drugie");
    }

    public void MyMethod(){
        System.out.println("First, MyMethod");
    }
}
