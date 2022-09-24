package ru.mirea.task3.shell;

import ru.mirea.task2.computershop.Shop;

public class Shell {
    public static void main(String[] args) {

        System.out.println("Creating Double object by valueOf() from string \"777.77\".");
        Double obj1 = Double.valueOf("777.7");
        System.out.println("Class of created object is " + obj1.getClass());

        System.out.println("\nConverting string \"111.1\" into double type.");
        double obj2 = Double.parseDouble("111.1");
        System.out.println("Convert complete. Adding 1.1 to our object to show that it work:" + (obj2 + 1.1));

        System.out.println("\nConverting Double to all primitive types.");
        Double d = 1234432156.928041; System.out.println("Double value: " + d);
        float f = d.floatValue(); System.out.println("Double to float: " + f);
        byte b = d.byteValue(); System.out.println("Double to byte: " + b);
        short s = d.shortValue(); System.out.println("Double to short: " + s);
        int i = d.intValue(); System.out.println("Double to int: " + i);
        long l = d.longValue(); System.out.println("Double to long: " + l);
        char c = (char)d.doubleValue(); System.out.println("Double to char: " + c);
        System.out.println("Double to boolean: double can`t be converted into boolean."); // boolean bool = (boolean)d; - compiler error.

        String dbl = Double.toString(3.14);
        System.out.println("\nString converted from double: " + dbl);

        System.out.println("""
                \n\t\t\t\t\t\tBoolean\t  Byte\tCharacter\tDouble\tFloat\tInteger\tLong\tShort
                byteValue\t\t\t\t                 \s
                doubleValue\t\t\t\t\t0\t\tx\t\t0\t\tx\t\tx\t\tx\t\tx\t\tx
                floatValue\t\t\t\t\t0\t\tx\t\t0\t\tx\t\tx\t\tx\t\tx\t\tx
                intValue\t\t\t\t\t0\t\tx\t\t0\t\tx\t\tx\t\tx\t\tx\t\tx
                longValue\t\t\t\t\t0\t\tx\t\t0\t\tx\t\tx\t\tx\t\tx\t\tx
                shortValue\t\t\t\t\t0\t\tx\t\t0\t\tx\t\tx\t\tx\t\tx\t\tx
                parseXxx\t\t\t\t\tX\t\tx\t\t0\t\tx\t\tx\t\tX\t\tX\t\tX
                parseXxx with radix\t\t\t0\t\tx\t\t0\t\t0\t\t0\t\tX\t\tX\t\tX
                valueOf with radix\t\t\t0\t\tx\t\t0\t\t0\t\t0\t\tX\t\tX\t\tX
                toString\t\t\t\t\t0\t\t0\t\t0\t\t0\t\t0\t\t0\t\t0\t\tX
                toString(primitive)\t\t\tX\t\tX\t\tX\t\tX\t\tX\t\tX\t\tX\t\t0
                toString(primitive,radix)\t0\t\t0\t\t0\t\t0\t\t0\t\tX\t\tX\t\t0""");


    }
}
