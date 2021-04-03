package com.Car;

public class Car{
    int MaximumSpeed = 100;
    int MinimumSpeed = 0;
    double Weight = 4000.50;
    boolean CarIsOn = false;
    char Condition = 'A';

    double MaxFuel = 16;
    double CurrentFuel = 8;
    double Mileage = 26.4;

    int NoOfPeopleInCAr = 1;
    int MaxNoOfPeople = 6;


    /* public Car(int CustomMaxSpeed,double CustomWeight,boolean IsCarOn){
         MaximumSpeed=CustomMaxSpeed;
         Weight=CustomWeight;
         CarIsOn =IsCarOn;
     }

     */
    public void GetIn() {
        if (NoOfPeopleInCAr < MaxNoOfPeople) {
            NoOfPeopleInCAr++;
        } else {
            System.out.println("Car is Full!" + NoOfPeopleInCAr + " = " + MaxNoOfPeople);
        }
    }

    public void GetOut() {
        if (NoOfPeopleInCAr > 0) {
            NoOfPeopleInCAr--;
        } else {
            System.out.println("NO is in the car");
        }
    }

    public void TurnCarOn(){
        if (!CarIsOn) {
            CarIsOn = true;
        }
        else{
            System.out.println("car is Already on");
        }

    }
    public double NoOfMilesTraveledSoFar () {
        return Mileage * CurrentFuel;

    }
    public double MaxNoOfMilesCaTravel () {
        return MaxFuel * Mileage;
    }
    public void PrintVariable () {
        System.out.println("Maximum speed of the car: " + MaximumSpeed);
        System.out.println("Minimum speed of the car: " + MinimumSpeed);
        System.out.println("Weight of the car: " + Weight);
        System.out.println("Car is on OR off: " + CarIsOn);
        System.out.println("Condition of the car: " + Condition);
        System.out.println("No of People in a Car" + NoOfPeopleInCAr);

    }


    public void UpgradeMinSpeed () {
        MinimumSpeed = MaximumSpeed;
        MaximumSpeed = MaximumSpeed + 1;
    }

    public static void main(String[] args) {
        com.Car.Car KaifCar =new com.Car.Car();//It is instance
        KaifCar.TurnCarOn();
        KaifCar.GetIn();
        KaifCar.GetIn();
        KaifCar.GetIn();
        KaifCar.GetIn();
        KaifCar.GetOut();
        System.out.println("No of miles travelled so far"+KaifCar.NoOfMilesTraveledSoFar());
        System.out.println("total miles travelled "+KaifCar.MaxNoOfMilesCaTravel());
        KaifCar.PrintVariable();
    }
}

