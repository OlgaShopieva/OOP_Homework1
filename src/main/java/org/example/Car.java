/*
1)Напишите класс Car.
В классе должна храниться следующая информация:
название автомобиля - model;
год выпуска - year;
стоимость - price;
цвет - color;
объем двигателя - power.
<br>
2) Доработайте класс Car.
Добавьте в класс Car метод getInfo без параметров, который будет печать на экране значения полей объекта класса
model , power и year.
<br>
3) Доработайте класс Car.
В классе должна храниться следующая информация:
Свойство - которое говорит заведен авто или нет
Метод - запуска автомобиля
Метод - остановки автомобиля
Метод дороги - при вызове, в качестве аргумента передаем место назначения
И если авто заведён - выводим, что мы на такой-то авто едем место назначения
Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
 */
package org.example;

import java.util.Scanner;

public class Car {
    String model;
    int year;
    int price;
    String color;
    double power;
    boolean status;

    Car(String model, int year, int price, String color, double power){
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
    }

    public void getInfo() {
        System.out.println(model + ", " + year + ", " + price + ", " + color + ", " + power);
    }
    public void carOn(){
        status = true;
        System.out.println(model + " включена.");
    }
    public void carOff(){
        status = false;
        System.out.println(model + "выключена.");
    }

    public void route(String adress){
        if(status){
            System.out.println(model + " едет по адресу: " + adress + "." + "Заедем за фруктами(да/нет)?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            answer = answer.toLowerCase();
            if (answer.equals("да")) {
                System.out.println("Отлично! Поехали за фруктами!");
            }
            else{
                System.out.println("Печалька :( . Ну ладно, быстрее доедем");
            }
        }
        else{
            System.out.println(model + " не включена. Мы не можем ехать.");
        }
    }


}
