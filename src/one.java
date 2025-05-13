import java.util.*;

public class one {
    public static void main(String[] args) {


        // data of 5 student:{roll no , names, marks }
        // class is a named group of function and properties
        // class is template of object
        // object is an instance of class
        //An instance is a specific object created from that blueprint
        // class -> logical construct
        // object -> physical realiyt
        // object have three essential properties -state of the object(i.e its value from data type),identity of the object(i.e how one object is different from other) and behaviour of the object(i.e effect of datatype  )

        // object are stored in heap memory and refference variables are stored in stack memory
        // variables inside the object is know as instaneous variables


//        Student[] students =new Student[5];

         // just declaring
        Student kunal = new Student();
        // new => dynamically allocates memory and returns reference to it
//        kunal = new Student();
//        kunal.rollno = 23;
        kunal.name= "kunal kushwaha";
//        kunal.marks = 85.5f;

       
        kunal.greeting();

        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }

}
class Student{
    int rollno;
    String name;
    float marks =90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to acces every object


    Student(){
          this.rollno = 13;
          this.marks = 32;
          this.name = "shubham raj" ;
    }

    Student (int roll, String name , float marks){
        this.name = name;
        this.marks = marks;
        this.rollno = roll;
    }

    // constructor overloading is occuring above

    void greeting(){
        System.out.println("hello everyone how all are you"+name);
    }
}
 // java is static typed language whereas python is dynamic typed

// constructor basically defines what happen when object is created  and it is special type of func. in the class that runs when you create an object   and it allocates some variable

// primitive data types are stored in stack memory 