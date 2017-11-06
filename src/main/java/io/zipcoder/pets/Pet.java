package io.zipcoder.pets;

public abstract class Pet {

    private String name;

    @Override
    public String toString(){
        return "This "+this.getClass().getSimpleName()+"'s name is "+this.getName()+" and it goes "+this.speak();
    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
