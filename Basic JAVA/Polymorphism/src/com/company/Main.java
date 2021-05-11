package com.company;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot";
    }

    public String getName() {
        return name;
    }
}

class Master extends Movie{
    public Master(){
        super("Master");
    }

    public String plot(){
        return "Drunk teacher helping kids";
    }
}

class KGF extends Movie{
    public KGF(){
        super("KGF");
    }

    public String plot(){
        return "Rowdy becomes DON";
    }
}

class Boys extends Movie{
    public Boys(){
        super("Boys");
    }

    public String plot(){
        return "A group of friends story";
    }
}

class VJS96 extends Movie{
    public VJS96(){
        super("96");
    }

    public String plot(){
        return "Love Failure";
    }
}

class Enthiran extends Movie{
    public Enthiran(){
        super("Enthiran");
    }
}
public class Main {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Movie movie = randomMovie();
            System.out.println("Movie# "+i+" : "+movie.getName()+"\n"+"Plot : "+movie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5)+1;
        System.out.println("Random number : "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Master();
            case 2:
                return new KGF();
            case 3:
                return new Boys();
            case 4:
                return new VJS96();
            case 5:
                return new Enthiran();
        }
        return null;
    }
}
