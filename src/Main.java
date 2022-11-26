import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        //Problem 2
        System.out.println("Problem 2");
        int yearOld = 15;
        if (yearOld>=18){
            System.out.println("поздравление пользователя с совершеннолетием !");
        }else{
        if(yearOld<=18) {
            System.out.println(" возраст совершеннолетия ещё не наступил, и нужно немного подождать !");}




            //Problem 3
            System.out.println("Problem 3");

            if(yearOld>=7 && yearOld<18) {
                System.out.println("ребенок ходит в школу");
            }else if (yearOld>=7 && yearOld<18){

                System.out.println("может отправляться в университет");

            }
            else if(yearOld >= 24){
                System.out.println("ему пора искать первую работу");
            }
            //Problem
        System.out.println("problem 3");
            int wagonSize=102;
            int seatsCount=60;//seating places
            int standPlace=wagonSize-seatsCount;//standing places


            int seatUsed=66;
            int seatFree=22;
            if(seatUsed<seatsCount){
                System.out.println("There is  more "+ (seatsCount-seatUsed)+ "places to seat");

            }else {
            if (seatFree<standPlace){
                System.out.println("If the standing seats are "+(standPlace-seatFree)+"stand"
                );
            }
            if(wagonSize>102);{
                System.out.println("Wagon is full ");
        }

            if(seatsCount<=seatUsed){
                System.out.println("Wagon Is Full!");

            }
            if (wagonSize>(seatFree+seatUsed)){
                System.out.println("No More spaces !");
            }









}}}}