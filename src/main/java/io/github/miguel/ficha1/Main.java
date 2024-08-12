package io.github.miguel.ficha1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TwoTypePair<String,Integer> twoTypePair1 = new TwoTypePair<>("boas", 1);
        TwoTypePair<String,Integer> twoTypePair2 = new TwoTypePair<>("adeus", 2);

        System.out.println("--Primeiro par--");
        System.out.println("Método getFirst : " + twoTypePair1.getFirst());
        System.out.println("Método getSecond : " + twoTypePair1.getSecond());

        System.out.println("\n--Segundo par--");
        System.out.println("Método getFirst : " + twoTypePair2.getFirst());
        System.out.println("Método getSecond : " + twoTypePair2.getSecond());


        System.out.println("\n--Verficar se é igual--");
        System.out.println(twoTypePair1.equals(twoTypePair2));

        System.out.println("\n--To string--");
        System.out.println("\ntwotypePair1:");
        System.out.println(twoTypePair1.toString());
        System.out.println("\ntwotypePair2:");
        System.out.println(twoTypePair2.toString());


        Pair<Integer> pair1 = new Pair<>(3,1);

        System.out.println("\n--Comparar par--");
        System.out.println(pair1.max());


        UnorderedPair<Integer> unorderedPair1 = new UnorderedPair<>(1,2);
        UnorderedPair<Integer> unorderedPair2 = new UnorderedPair<>(3,2);
        System.out.println("\n--Comparar unorderedPair's--");
        System.out.println(unorderedPair1.equals(unorderedPair2));

        //Canvas

        Canvas canvas = new Canvas();

        Shape rectangle = new Shape();
        Shape triangle = new Shape();
        Shape cube = new Shape();
        Shape circle = new Shape();

        List<Shape> allShapes = new ArrayList<Shape>();

        allShapes.add(new Shape<>("rectangle", rectangle));
        allShapes.add(new Shape<>("triangle", triangle));
        allShapes.add(new Shape<>("circle", circle));
        allShapes.add(new Shape<>("cube", cube));

        canvas.draw(new Shape<>("circle", circle));

        canvas.drawAll(allShapes);
    }
}