package io.github.miguel.ficha1;

public class Shape<T> {
    private String name;
    private T object;

    public Shape() {
    }

    public Shape(String name, T object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getObject() {
        return object;
    }
}