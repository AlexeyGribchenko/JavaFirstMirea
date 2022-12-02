package ru.mirea.task23.arrayqueue;


public class ArrayQueue {
    private int currentSize = 0;
    private int realSize = 8;
    private Object array[];


    //Инвариант: currentSize >=0 и currentSize < realSize

    public ArrayQueue(){
        array = new Object[realSize];
        currentSize = 0;
    }

    /*
     * Предусловие: newSize > 0
     * Постусловие: array.length' > array.length
     * */

    private void increaseRealSize( int newSize){
        if ( newSize < array.length) return;
        realSize = newSize;
        Object[] tmp = new Object[realSize];

        System.arraycopy(array, 0, tmp, 0, currentSize);

        array = tmp;

    }

    /*
     * Предусловие: newElement != null
     * Постусловие: array[currentSize - 1] = element
     * Постусловие: currentSize' = currentSize++
     * */

    public void enqueue(Object newElement){
        if ( newElement == null) return;
        if (array.length + 1 >= realSize*0.75) increaseRealSize(realSize*2);

        array[currentSize++] = newElement;
    }

    /*
       Предусловие: currentSize > 0
       Постусловие: result = array[0]
     */

    public Object element() {
        if(isEmpty()) return null;
        return array[0];
    }

    /*
        Предусловие: currentSize > 0
        Постусловие: currentSize' = currentSize - 1
        Постусловие: array'[0] != array[0]
        Постусловие: result = array[0]
     */

    public Object dequeue() {
        if (isEmpty()) return null;
        Object[] tmp = new Object[realSize];
        Object firstElement = array[0];
        System.arraycopy(array, 1, tmp, 0, currentSize - 1);
        currentSize--;
        array = tmp;
        return firstElement;
    }


    //Постусловие: result = currentSize
    public int size() {
        return currentSize;
    }

    //Постусловие: result = size == 0
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    //Постуловие: array' != array

    public void clear() {
        currentSize = 0;
        realSize = 8;
        array = new Object[realSize];
    }

    //Постусловие: result - array elements
    public String show() {
        String result = "Queue: ";
        for (int i = 0; i < currentSize; i++) result += array[i] + " ";
        return result;
    }
}