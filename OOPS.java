// import bank;

// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Written....");
//     }

//     public void print(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }

// class Student{
//     String name;
//     int age;

    // public void stInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // Student(){
    //     System.out.println("Constructor called...");
    // }
    // Student(Student st2){
    //     this.name=st2.name;
    //     this.age=st2.age;
    // }

//     public void stInfo(String name){
//         System.out.println(name);
//     }
//     public void stInfo(int age){
//         System.out.println(age);
//     }
//     public void stInfo(String name,int age){
//         System.out.println(name+" "+age);
//     }
// }

// class Shape{
//     String color;
// }

// class Triangle extends Shape{
//     public void print(){
//         System.out.println(color);
//     }
// }

// class EqiTriangle extends Triangle{
//     public void ptint(){
//         System.out.println(color);
//     }
// }

// abstract class Animal{
//     abstract void walk();
//     public void eat(){
//         System.out.println("animals eat.");
//     }
//     Animal(){
//         System.out.println("animal constructor called.");
//     }
// }

// class Horse extends Animal{
//     public void walk(){
//         System.out.println("walks on 4 legs.");
//     }
//     Horse(){
//         System.out.println("Horse constructor called.");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walk on 2 legs.");
//     }
// }

// interface Animal{
//     void walk();
// }
// interface Herbivore{
//     void eatPlants();   
// }
// class Horse implements Animal, Herbivore{
//     public void walk(){
//         System.out.println("walks on 4 legs.");
//     }
//     public void eatPlants(){
//         System.out.println("eat plants");
//     }
// }

class Student{
    static String school;
    String name;
}

public class OOPS{
    public static void main(String[] args) {
        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";
        // pen1.write();
        // pen1.print();

        // Student st1=new Student();
        // st1.name="om";
        // st1.age=21;
        // st1.stInfo();
        // Student st2=new Student(st1);
        // st2.stInfo();

        // st1.stInfo(st1.name,st1.age);

        // Triangle tr=new Triangle();
        // EqiTriangle etr=new EqiTriangle();
        // tr.color="red";
        // etr.color="red";
        // tr.print();
        // etr.print();

        // bank.Account ac1=new bank.Account();

        // Horse h1=new Horse();
        // h1.walk();
        // h1.eatPlants();

        Student.school="dav";
        Student s1=new Student();
        s1.name="om";
        System.out.println(s1.school);
    }
}
