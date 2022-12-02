package ru.mirea.task20.threegenerics;

public class ThreeGenerics<T, V, K> {
    private T t;
    private V v;
    private K k;

    public ThreeGenerics(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void show(){
        System.out.println("Тип объекта T: " + t.getClass().getName() + " Значение: " + t);
        System.out.println("Тип объекта V: " + v.getClass().getName() + " Значение: " + v);
        System.out.println("Тип объекта K: " + k.getClass().getName() + " Значение: " + k);
    }

    public static void main(String[] args){
        ThreeGenerics<Double, Integer, Boolean> generics = new ThreeGenerics<>(123.456, 2,true);
        generics.show();
    }
}
