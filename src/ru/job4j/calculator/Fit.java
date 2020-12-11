package ru.job4j.calculator;

public class Fit {
    public static void main(String[] args) {
        Human man1 = new Human((short) 178, 98.00);
        Human woman1 = new Human((short)165, 67);

        if (man1.weight > manWeigth(man1.height)){
            System.out.println("Брат пора похудеть");
        }else{
            System.out.println("красавчик");
        }
        if (woman1.weight > womanWeigth(man1.height)){
            System.out.println("убавь аппетиты");
        }else{
            System.out.println("молодец");
        }



    }
    public static double manWeigth(short height){
        double result = (height - 100) * 1.15;
        return result;
    }
    public static double womanWeigth(short height){
        double result = (height - 110) * 1.15;
        return result;
    }

}

class Human{
    short height;
    double weight;

    public Human(short height, double weight){
        this.height = height;
        this.weight = weight;

    }

}



