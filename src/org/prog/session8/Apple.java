package org.prog.session8;

import org.prog.session9.Car;

public class Apple implements Iphone {
    String color;
    String model;

    public Apple(String color, String model) {
        this.model = model;
        this.color = color;
    }
    public boolean equals(Object obj){
        if (obj instanceof Apple){
            Apple apel=(Apple) obj;
            boolean isequals=this.color.equals(apel.color)
                    && this.model.equals(apel.model);

        }
        return false;
    }

    @Override
    public void unklockPhone() {
        System.out.println("apple unklock face id ");
            }
    public int hashCode(){return (this.color+this.model).hashCode();}
        }






