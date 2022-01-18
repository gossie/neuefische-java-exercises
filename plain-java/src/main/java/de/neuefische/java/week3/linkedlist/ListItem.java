package de.neuefische.java.week3.linkedlist;

class ListItem<T> {

    private final T value;
    private ListItem<T> next;

    ListItem(T value) {
        this.value = value;
    }

    ListItem<T> getNext() {
        return next;
    }

    void setNext(ListItem<T> next) {
        this.next = next;
    }

    public String toString() {
        var result = value.toString();
        if (next != null) {
            result += " -> " + next;
        }
        return result;
    }

    public boolean hasNext() {
        return next != null;
    }

    public T getValue() {
        return value;
    }
}
