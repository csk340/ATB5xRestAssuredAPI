package org.example.Pattern;
//Design Pattern:- Same group of people build the building floor by floor.
// i.e. After making 1st floor completely then only all peoples will go for second and then third floor
public class BuilderDesignPattern {
    public BuilderDesignPattern Stage1()
    {
        System.out.println("Stage 1 Design");
        return this;
    }

    public BuilderDesignPattern Stage2()
    {
        System.out.println("Stage 2 Design");
        return this;
    }

    public BuilderDesignPattern Stage3()
    {
        System.out.println("Stage 3 Design");
        return this;
    }

    public static void main(String[] args) {
        BuilderDesignPattern obj = new BuilderDesignPattern();
        //obj.Stage1().Stage2().Stage3();//   Also called as Method Chaining

    }

    //For Design pattern give return type for method as class name in method declaration and
    //this as return inside method
}
