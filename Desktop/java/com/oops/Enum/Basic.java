package com.oops.Enum;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday

        //these are enum constants
        //public,static and final
        //since its final you can create child enums
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Tuesday;
        for (Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
        System.out.println(week.ordinal());
    }
}
