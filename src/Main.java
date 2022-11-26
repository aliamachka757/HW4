import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        //Problem 2
        System.out.println("Problem 2");

        int Age = 3;
        if (Age >= 2 && Age <= 6) {
            System.out.println("Если возраст человека равен " + Age + "то ему нужно ходить в сад");
        } else if (Age >= 7 && Age <= 18) {
            System.out.println("Если возраст человека равен" + Age + "то ему нужно ходить в школу");
        } else if (Age <= 18 && Age >= 24) {
            System.out.println("Если возраст человека равен " + Age + "то ему нужно ходить в унтверитет ");
        } else if (Age > 24) {
            System.out.println("Есливозраст человека равен " + Age + "то ему нужно ходить на работу ");

        }

        //Problem 3
        System.out.println("Problem 3 ");
        if (Age <= 5) {
            System.out.println(" он не может кататься на аттракционе");
        } else if (Age <=14) {
            System.out.println(" он может кататься только в сопровождении взрослого");


        } else if (Age>=14) {
            System.out.println(" он может кататься без сопровождения взрослого");


            //Problem 4
            System.out.println("Problem 4");
            int one=100;
            int two=15;
            int free=200;
            if (one>two){
                if(one<two) {
                    System.out.println("Bigger number is" +free+"");
                } else if (free>one) {
                    System.out.println("Bigger number is "+free+"");



                }
            }
            }



        }

    }








            












