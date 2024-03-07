package org.example.Pattern;

public class NonBuilderDesignPattern {

    //Non design pattern:- Making buildings part in different sections which is useless so we not use non design pattern
    //Refere below example

    public void Stage1()
    {
        System.out.println("Stage 1");
    }

    public void Stage2()
    {
        System.out.println("Stage 2");
    }

    public void Stage3()
    {
        System.out.println("Stage 3");
    }

    public static void main(String[] args)
    {
        NonBuilderDesignPattern obj = new NonBuilderDesignPattern();
        obj.Stage1();
        obj.Stage2();
        obj.Stage3();

    }

    //So here consider that 1 group of 6 peoples making ground floor of building
    //Another 2nd group of 5 members making first floor of building at a same time but as different section
    //3rd group of 8 peoples making second floor of building at a same time but as different section
    //This all useless because making of 3 different floor as 3 different section is not correct way to build the building
    //Hence, we does not prefer to use Non Design Pattern
}
