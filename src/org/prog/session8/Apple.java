package org.prog.session8;

import org.prog.session9.Car;

public class Apple implements Iphone {
    String color;
    String model;
    String contacts;
    String owner;

    public Apple(String color, String model, String contacts, String owner) {
        this.model = model;
        this.color = color;
        this.contacts = contacts;
        this.owner = owner;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Apple) {
            Apple apel = (Apple) obj;
            boolean isequals = this.color.equals(apel.color)
                    && this.model.equals(apel.model);

        }
        return false;
    }

    @Override
    public void unklockPhone() {
        System.out.println("apple unklock face id ");
    }

    public int hashCode() {
        return (this.color + this.model + this.contacts + this.owner).hashCode();
    }

    public String toString() {
        return "Apple[color=" + color + ", model=" + model + ", contacts=" + contacts + ", owner=" + owner + "]";
    }
}







