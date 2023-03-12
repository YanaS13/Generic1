package org.example;

public class Pair<A,B> {
    private A key;
    private B value;

    public Pair(A key, B value) {
        this.key = key;
        this.value = value;
    }
    public <A> A getKey() {
        return (A) key;
    }
    public <B> B getValue() {
        return (B) value;
    }
}
