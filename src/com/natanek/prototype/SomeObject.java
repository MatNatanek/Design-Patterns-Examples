package com.natanek.prototype;

public class SomeObject implements Prototype {

    private final String field1;
    private final String field2;

    public SomeObject(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    @Override
    public SomeObject getClone() {
        return new SomeObject(field1, field2);
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}';
    }
}
