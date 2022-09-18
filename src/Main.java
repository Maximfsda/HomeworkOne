public class Main {
    public static void main(String[] args) {
        //Task1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
        //Task2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
        //Task3
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        System.out.println();
        //Task4
        var friend = 16;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();
        //Task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
        //Task6
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var total = boxerTwo + boxerOne;
        System.out.println("Общий вес двух боксеров: " + total);
        var difference = boxerTwo - boxerOne;
        System.out.println("Разницу между весами боксеров: " + difference);
        System.out.println();
        //Task7
        difference = boxerTwo - boxerOne;
        System.out.println("Разницу между весами боксеров (1 способ): " + difference);
        difference = boxerTwo % boxerOne;
        System.out.println("Разницу между весами боксеров (2 способ): " + difference);
        System.out.println();
        //Task8
        var totalHours = 640;
        var employeeHours = 8;
        var staffNumbers = totalHours / employeeHours;
        System.out.println("Всего работников в компании – "+ staffNumbers + " человек. ");
        staffNumbers = staffNumbers + 94;
        employeeHours = staffNumbers * employeeHours;
        System.out.printf("Если в компании работает " + staffNumbers + " человек, то всего " + employeeHours + " часов работы может быть поделено между сотрудниками.");
    }
}