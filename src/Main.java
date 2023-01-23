public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        // write your code here
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var freind = 19;
        System.out.println(freind);
        freind = freind + 2;
        System.out.println(freind);
        freind = freind / 7;
        System.out.println(freind);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var oneboxer = 78.2;
        var twoboxer = 82.7;
        var total_weight = oneboxer + twoboxer;
        System.out.println("Общий вес двух бойцов " + total_weight + " кг.");
        var difference = twoboxer - oneboxer;
        System.out.println("Разница между весами бойцов составили " + difference + " кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var oneboxer = 78.2;
        var twoboxer = 82.7;
        var difference = twoboxer - oneboxer;
        System.out.println("Разница между весами бойцов составили " + difference + " кг. 1 способ");
        var totalWeight = twoboxer % oneboxer;
        System.out.println("Разница между весами бойцов составили " + totalWeight + " кг. 2 способ");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hours = 640;
        var workingDayOfOneEmployee = 8;
        var totalEmployees = hours / workingDayOfOneEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");

        var newNumberOfEmployees = totalEmployees + 94;
        var numberOfHours = newNumberOfEmployees * 8;
        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + numberOfHours + " часов работы может быть поделено между сотрудниками");
    }
}