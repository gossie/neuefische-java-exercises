package de.neuefische.java.week3.linkedlist;

public class List<T> {

    private ListItem<T> head;

    public void add(T animal) {
        if (head == null) {
            head = new ListItem<>(animal);
        } else {
            var current = head;
            while (current.hasNext()) {
                current = current.getNext();
            }
            current.setNext(new ListItem<>(animal));
        }
    }

    public void remove(T animal) {
        var prev = (ListItem<T>) null;
        for (ListItem<T> current = head; current != null; current = current.getNext()) {
            if (animal.equals(current.getValue())) {
                if (prev == null) {
                    head = head.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                break;
            }
            prev = current;
        }
    }

    @Override
    public String toString() {
        return head.toString();
    }
}
