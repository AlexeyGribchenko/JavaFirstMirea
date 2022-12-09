package ru.mirea.task29.restaurant;

public class ListElement {
    Item item;
    ListElement prevItem;
    ListElement nextItem;

    ListElement(Item item, ListElement prevItem, ListElement nextItem) {
        this.item = item;
        this.prevItem = prevItem;
        this.nextItem = nextItem;
    }
}