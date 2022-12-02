package ru.mirea.task20.genericlimitations;

public class GenericClass <T extends String, V extends Animal, K>{
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k) {
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
        System.out.println("Тип объекта V: " + v.getClass().getName() + " Значение: " + v.getName());
        System.out.println("Тип объекта K: " + k.getClass().getName() + " Значение: " + k);
    }

    public static void main(String[] args){
        GenericClass<String, Horse, Integer> genericClass = new GenericClass<>("Java",new Horse("Mustang"), 345);
        genericClass.show();
        System.out.println();
        System.out.println(genericClass.t.compareTo("Java"));
        System.out.println(genericClass.t.compareTo("Frog"));
    }
}
