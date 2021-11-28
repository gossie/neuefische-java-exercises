package de.neuefische.java.week3;

import de.neuefische.java.week2.linkedlist.Animal;
import de.neuefische.java.week3.linkedlist.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListTest {

    @Test
    void testThatAnimalIsAddedToEmptylist() {
        var list = new List<Animal>();
        list.add(new Animal("Dog"));
        assertEquals("Dog", list.toString());
    }

    @Test
    void testThatMultipleAnimalsAreAdded() {
        var list = new List<Animal>();
        list.add(new Animal("Dog"));
        list.add(new Animal("Cat"));
        list.add(new Animal("Bird"));
        assertEquals("Dog -> Cat -> Bird", list.toString());
    }

    @Test
    void testThatAnimalIsRemoved() {
        var list = new List<Animal>();
        list.add(new Animal("Dog"));
        list.add(new Animal("Cat"));
        list.add(new Animal("Bird"));
        list.remove(new Animal("Cat"));
        assertEquals("Dog -> Bird", list.toString());
    }

    @Test
    void testThatLastAnimalIsRemoved() {
        var list = new List<Animal>();
        list.add(new Animal("Dog"));
        list.add(new Animal("Cat"));
        list.add(new Animal("Bird"));
        list.remove(new Animal("Bird"));
        assertEquals("Dog -> Cat", list.toString());
    }

    @Test
    void testThatFirstAnimalIsRemoved() {
        var list = new List<Animal>();
        list.add(new Animal("Dog"));
        list.add(new Animal("Cat"));
        list.add(new Animal("Bird"));
        list.remove(new Animal("Dog"));
        assertEquals("Cat -> Bird", list.toString());
    }
    
}
