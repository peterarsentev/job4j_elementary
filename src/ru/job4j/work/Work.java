package ru.job4j.work;

public class Work {
    String color;
    String engine;

    Work(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    public Work abc(String cvet){
        Work work2 = new Work(cvet, "V4");
        return work2;
    }
    public static void main(String[] args) {
        Work work1 = new Work("green", "V8");
        Work work2 =  work1.abc("black");
        System.out.println(work1.color);
        }
        }


