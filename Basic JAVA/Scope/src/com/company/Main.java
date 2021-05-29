package com.company;

public class Main {

    public static void main(String[] args) {
        int varFive = 5;
        System.out.println(varFive);
        Scope scope = new Scope();
        System.out.println("***********");
        System.out.println(scope.getVarOne());
        System.out.println("***********");
        System.out.println(scope.getVarTwo());
        System.out.println("***********");
        scope.twoTimes();
        System.out.println("***********");
        Scope.Innerclass innerclass = scope.new Innerclass();
        System.out.println("***********");
        innerclass.twoTimes();
    }
}
