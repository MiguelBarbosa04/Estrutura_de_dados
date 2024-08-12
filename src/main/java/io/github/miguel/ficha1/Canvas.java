package io.github.miguel.ficha1;

import java.util.List;

public class Canvas<T> {

    public void draw(Shape<T> shape) {
        System.out.println(shape.getName());
    }

    public void drawAll(List<Shape<T>> shape) {
        for (Shape<T> e : shape) {
            System.out.println(e.getName());
        }

    }
}
