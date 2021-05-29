package com.company;

public class Scope {
    public int varOne = 1;
    private int varTwo = 2;

    public Scope() {
        System.out.println("varOne is "+varOne+" varTwo is "+varTwo);
    }

    public int getVarOne() {
        return varOne;
    }

    public int getVarTwo() {
        return varTwo;
    }

    public void twoTimes(){
        int varThree = 3;
        for(int i=0;i<5;i++){
            System.out.println(varThree*i);
        }
        System.out.println("***********");
        for(int i=0;i<5;i++){
            System.out.println(this.varTwo * i);
        }
        System.out.println("***********");
    }

    public class Innerclass{
        public int varFour = 4;

        public Innerclass() {
            System.out.println("varOne is "+varOne+" varTwo is "+varTwo+" varFour is "+varFour);
        }

        public void twoTimes(){
            Scope.this.twoTimes();
            System.out.println("***********");
            for(int i=0;i<5;i++){
                System.out.println(varFour*i);
            }
        }
    }
}
