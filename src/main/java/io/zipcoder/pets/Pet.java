package io.zipcoder.pets;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{

    private String name;

    @Override
    public String toString(){
        return "This "+this.getClass().getSimpleName()+"'s name is "+this.getName()+" and it goes "+this.speak();
    }

    @Override
    public int compareTo(Pet other){
        return this.getName().equalsIgnoreCase(other.getName()) ?
                this.getClass().getSimpleName().compareToIgnoreCase(other.getClass().getSimpleName()):
                this.getName().compareToIgnoreCase(other.getName());
    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Pet> compareByType = (a, b)-> a.getClass().getSimpleName().equalsIgnoreCase(b.getClass().getSimpleName()) ?
                                            a.getName().compareToIgnoreCase(b.getName()):
                                            a.getClass().getSimpleName().compareToIgnoreCase(b.getClass().getSimpleName());
}
