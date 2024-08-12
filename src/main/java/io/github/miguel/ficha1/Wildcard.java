package io.github.miguel.ficha1;
import java.util.Collection;

public class Wildcard {
    public void printCollection(Collection<?> c) {
        for (Object e: c){
            System.out.println(e);
        }
    }
}
