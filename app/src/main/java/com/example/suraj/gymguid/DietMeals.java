package com.example.suraj.gymguid;

import android.widget.Switch;

/**
 * Created by suraj on 3/24/2018.
 */

public class DietMeals {

    public String Meal1,Meal2,Meal3,Meal4,Meal5,Meal6;
    public String NMeal1,NMeal2,NMeal3,NMeal4,NMeal5,NMeal6;

    public static DietMeals WeightLossMeal=new DietMeals();
    public static DietMeals MuscleGainMeal=new DietMeals();

    static DietMeals returnObj=new DietMeals();




    public static DietMeals assignMeal(String weight,String type){

        switch(weight){
            case "41":
            case "42":
            case "43":
            case "44":
            case "45":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="100gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal2="30gm Almonds,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal3="50gm Soya Chunks";
                    WeightLossMeal.Meal4="50gm Brown Rice";
                    WeightLossMeal.Meal5="20gm Almonds,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal2="100gm Sweet Potato,2 Eggs";
                    WeightLossMeal.NMeal3="35gm Chicken,25gm Brown Rice";
                    WeightLossMeal.NMeal4="100gm Sweet Potato";
                    WeightLossMeal.NMeal5="35gm Chicken,2 EGGS";
                    WeightLossMeal.NMeal6="25gm Brown Rice,1/2 Scoop Whey";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="100gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="30gm Almonds,1 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks";
                    MuscleGainMeal.Meal4="50gm Brown Rice";
                    MuscleGainMeal.Meal5="20gm Almonds,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal6="50gm Brown Rice,20gm Soya Chunks";
                    MuscleGainMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal2="100gm Sweet Potato,2 Eggs";
                    MuscleGainMeal.NMeal3="35gm Chicken,25gm Brown Rice";
                    MuscleGainMeal.NMeal4="100gm Sweet Potato,1 Banana";
                    MuscleGainMeal.NMeal5="5gm Chicken,2 EGGS";
                    MuscleGainMeal.NMeal6="25gm Brown Rice,1/2 Scoop Whey";

                    returnObj=MuscleGainMeal;
                }
                break;

            case "46":
            case "47":
            case "48":
            case "49":
            case "50":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="100gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal2="20gm Almonds,20gm Paneer";
                    WeightLossMeal.Meal3="50gm Soya Chunks";
                    WeightLossMeal.Meal4="50gm Brown Rice,20gm Almonds";
                    WeightLossMeal.Meal5="20gm Almonds,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal2="100gm Sweet Potato";
                    WeightLossMeal.NMeal3="3Eggs,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal4="50gm Chicken";
                    WeightLossMeal.NMeal5="100gm Sweet Potato,2 EGGS";
                    WeightLossMeal.NMeal6="50gm Brown Rice,50gm Chicken";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="100gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="20gm Almonds,1 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,20gm Paneer";
                    MuscleGainMeal.Meal4="50gm Brown Rice,20gm Almonds";
                    MuscleGainMeal.Meal5="20gm Almonds,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    MuscleGainMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal2="100gm Sweet Potato,1 Banana";
                    MuscleGainMeal.NMeal3="3Eggs,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal4="50gm Chicken";
                    MuscleGainMeal.NMeal5="100gm Sweet Potato,2 EGGS";
                    MuscleGainMeal.NMeal6="50gm Brown Rice,50gm Chicken";

                    returnObj=MuscleGainMeal;
                }
                break;
            case "51":
            case "52":
            case "53":
            case "54":
            case "55":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="100gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal2="25gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks";
                    WeightLossMeal.Meal4="50gm Brown Rice,20gm Paneer";
                    WeightLossMeal.Meal5="25gm Almonds,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal2="100gm Sweet Potato";
                    WeightLossMeal.NMeal3="3Eggs,50gm Chicken";
                    WeightLossMeal.NMeal4="50gm Brown Rice";
                    WeightLossMeal.NMeal5="100gm Sweet Potato,3 EGGS";
                    WeightLossMeal.NMeal6="50gm Chicken,1/2 Scoop Whey Protein";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="100gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="25gm Almonds,1 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,1 Banana";
                    MuscleGainMeal.Meal4="50gm Brown Rice,20gm Paneer";
                    MuscleGainMeal.Meal5="25gm Almonds,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    MuscleGainMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal2="100gm Sweet Potato,1 Banana";
                    MuscleGainMeal.NMeal3="3Eggs,50gm Chicken";
                    MuscleGainMeal.NMeal4="50gm Brown Rice";
                    MuscleGainMeal.NMeal5="100gm Sweet Potato,3 EGGS";
                    MuscleGainMeal.NMeal6="50gm Chicken,1/2 Scoop Whey Protein";

                    returnObj=MuscleGainMeal;
                }
                break;


            case "56":
            case "57":
            case "58":
            case "59":
            case "60":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="40gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal2="25gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    WeightLossMeal.Meal4="25gm Paneer,1 Cup Spinach";
                    WeightLossMeal.Meal5="25gm Almonds,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal6="25gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal2="100gm Sweet Potato,1 Cup Spinach";
                    WeightLossMeal.NMeal3="3Eggs,50gm Chicken";
                    WeightLossMeal.NMeal4="1 Banana,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal5="100gm Sweet Potato,3 EGGS";
                    WeightLossMeal.NMeal6="50gm Chicken";

                    returnObj=WeightLossMeal;

                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="40gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="25gm Almonds,2 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    MuscleGainMeal.Meal4="25gm Paneer,1 Cup Spinach";
                    MuscleGainMeal.Meal5="25gm Almonds,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal6="25gm Brown Rice,50gm Soya Chunks";
                    MuscleGainMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal2="100gm Sweet Potato,1 Cup Spinach";
                    MuscleGainMeal.NMeal3="3Eggs,50gm Chicken";
                    MuscleGainMeal.NMeal4="2 Banana,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal5="100gm Sweet Potato,3 EGGS";
                    MuscleGainMeal.NMeal6="50gm Chicken";

                    returnObj=MuscleGainMeal;
                }
                break;
            case "61":
            case "62":
            case "63":
            case "64":
            case "65":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="40gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal2="25gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    WeightLossMeal.Meal4="25gm Paneer,1 Cup Spinach";
                    WeightLossMeal.Meal5="25gm Almonds,1 Scoop Whey Protein";
                    WeightLossMeal.Meal6="25gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal2="100gm Sweet Potato,1 Cup Spinach";
                    WeightLossMeal.NMeal3="3Eggs,50gm Chicken";
                    WeightLossMeal.NMeal4="1 Banana,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal5="100gm Sweet Potato,3 EGGS";
                    WeightLossMeal.NMeal6="60gm Chicken,1/2 Cup Spinach";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="40gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="25gm Almonds,2 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    MuscleGainMeal.Meal4="25gm Paneer,1 Cup Spinach";
                    MuscleGainMeal.Meal5="25gm Almonds,1 Scoop Whey Protein";
                    MuscleGainMeal.Meal6="25gm Brown Rice,50gm Soya Chunks";
                    MuscleGainMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal2="100gm Sweet Potato,1 Cup Spinach";
                    MuscleGainMeal.NMeal3="3Eggs,50gm Chicken";
                    MuscleGainMeal.NMeal4="2 Banana,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal5="100gm Sweet Potato,3 EGGS";
                    MuscleGainMeal.NMeal6="60gm Chicken,1/2 Cup Spinach";

                    returnObj=MuscleGainMeal;
                }
                break;

            case "66":
            case "67":
            case "68":
            case "69":
            case "70":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="50gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal2="50gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,35gm Paneer";
                    WeightLossMeal.Meal4="35gm Paneer,1 Cup Spinach";
                    WeightLossMeal.Meal5="50gm Almonds,1 Scoop Whey Protein";
                    WeightLossMeal.Meal6="25gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    WeightLossMeal.NMeal3="3Eggs,60gm Chicken";
                    WeightLossMeal.NMeal4="1 Banana,1 Scoop Whey Protein";
                    WeightLossMeal.NMeal5="150gm Sweet Potato,3 EGGS";
                    WeightLossMeal.NMeal6="65gm Chicken,1 Cup Spinach";

                    returnObj=WeightLossMeal;

                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="50gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="50gm Almonds,2 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,35gm Paneer";
                    MuscleGainMeal.Meal4="35gm Paneer,1 Cup Spinach";
                    MuscleGainMeal.Meal5="50gm Almonds,1 Scoop Whey Protein";
                    MuscleGainMeal.Meal6="25gm Brown Rice,50gm Soya Chunks";
                    MuscleGainMeal.NMeal1="50gm Oats,1/2 Scoop Whey Protein";
                    MuscleGainMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    MuscleGainMeal.NMeal3="3Eggs,60gm Chicken";
                    MuscleGainMeal.NMeal4="2 Banana,1 Scoop Whey Protein";
                    MuscleGainMeal.NMeal5="150gm Sweet Potato,3 EGGS";
                    MuscleGainMeal.NMeal6="65gm Chicken,1 Cup Spinach";

                    returnObj=MuscleGainMeal;
                }
                break;
            case "71":
            case "72":
            case "73":
            case "74":
            case "75":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="50gm Oats,1 Scoop Whey Protein";
                    WeightLossMeal.Meal2="50gm Almonds,2 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    WeightLossMeal.Meal4="25gm Paneer,1 Cup Spinach";
                    WeightLossMeal.Meal5="50gm Almonds,1 Scoop Whey Protein";
                    WeightLossMeal.Meal6="25gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="60gm Oats,1/2 Scoop Whey Protein";
                    WeightLossMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    WeightLossMeal.NMeal3="3Eggs,60gm Chicken";
                    WeightLossMeal.NMeal4="1 Banana,1 Scoop Whey Protein";
                    WeightLossMeal.NMeal5="150gm Sweet Potato,2 EGGS";
                    WeightLossMeal.NMeal6="65gm Chicken,1 Cup Spinach,2 Eggs";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="50gm Oats,1 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="50gm Almonds,2 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    MuscleGainMeal.Meal4="25gm Paneer,1 Cup Spinach";
                    MuscleGainMeal.Meal5="50gm Almonds,1 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    MuscleGainMeal.NMeal1="60gm Oats,1/2 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    MuscleGainMeal.NMeal3="3Eggs,60gm Chicken";
                    MuscleGainMeal.NMeal4="2 Banana,1 Scoop Whey Protein";
                    MuscleGainMeal.NMeal5="150gm Sweet Potato,2 EGGS";
                    MuscleGainMeal.NMeal6="65gm Chicken,1 Cup Spinach,2 Eggs";
                    returnObj=MuscleGainMeal;

                }
                break;

            case "76":
            case "77":
            case "78":
            case "79":
            case "80":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="50gm Oats,1 Scoop Whey Protein";
                    WeightLossMeal.Meal2="50gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,30gm Paneer";
                    WeightLossMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal5="50gm Almonds,1 Scoop Whey Protein";
                    WeightLossMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="60gm Oats,1/2 Scoop Whey Protein,1 Banana";
                    WeightLossMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    WeightLossMeal.NMeal3="White Rice 30gm,60gm Chicken,3 Eggs";
                    WeightLossMeal.NMeal4="1 Banana,1 Scoop Whey Protein";
                    WeightLossMeal.NMeal5="150gm Sweet Potato,2 EGGS";
                    WeightLossMeal.NMeal6="75gm Chicken,1 Cup Spinach,2 Eggs";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="50gm Oats,1 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="50gm Almonds,1 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,30gm Paneer";
                    MuscleGainMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal5="50gm Almonds,1 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    MuscleGainMeal.NMeal1="60gm Oats,1/2 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    MuscleGainMeal.NMeal3="White Rice 30gm,60gm Chicken,3 Eggs";
                    MuscleGainMeal.NMeal4="2 Banana,1 Scoop Whey Protein";
                    MuscleGainMeal.NMeal5="150gm Sweet Potato,2 EGGS";
                    MuscleGainMeal.NMeal6="75gm Chicken,1 Cup Spinach,2 Eggs";

                    returnObj=MuscleGainMeal;
                }
                break;


            case "81":
            case "82":
            case "83":
            case "84":
            case "85":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="50gm Oats,1 Scoop Whey Protein";
                    WeightLossMeal.Meal2="50gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,30gm Paneer";
                    WeightLossMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal5="50gm Almonds,1 Scoop Whey Protein";
                    WeightLossMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    WeightLossMeal.NMeal1="60gm Oats,1/2 Scoop Whey Protein,1 Banana";
                    WeightLossMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    WeightLossMeal.NMeal3="White Rice 30gm,60gm Chicken,3 Eggs";
                    WeightLossMeal.NMeal4="1 Banana,1 Scoop Whey Protein";
                    WeightLossMeal.NMeal5="150gm Sweet Potato,2 EGGS";
                    WeightLossMeal.NMeal6="75gm Chicken,1 Cup Spinach,2 Eggs";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="50gm Oats,1 Scoop Whey Protein";
                    MuscleGainMeal.Meal2="50gm Almonds,1 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,30gm Paneer";
                    MuscleGainMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal5="50gm Almonds,1 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.Meal6="50gm Brown Rice,50gm Soya Chunks";
                    MuscleGainMeal.NMeal1="60gm Oats,1/2 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    MuscleGainMeal.NMeal3="White Rice 30gm,60gm Chicken,3 Eggs";
                    MuscleGainMeal.NMeal4="2 Banana,1 Scoop Whey Protein";
                    MuscleGainMeal.NMeal5="150gm Sweet Potato,2 EGGS";
                    MuscleGainMeal.NMeal6="75gm Chicken,1 Cup Spinach,2 Eggs";

                    returnObj=MuscleGainMeal;
                }
                break;


            case "86":
            case "87":
            case "88":
            case "89":
            case "90":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="50gm Oats,1 Scoop Whey Protein,30gm Cheese";
                    WeightLossMeal.Meal2="50gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,35gm Paneer";
                    WeightLossMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal5="50gm Almonds,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal6="50gm Brown Rice,50gm Soya Chunks,35gm Paneer";
                    WeightLossMeal.NMeal1="60gm Oats,1 Scoop Whey Protein,1 Banana";
                    WeightLossMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    WeightLossMeal.NMeal3="White Rice 40gm,70gm Chicken,4 Eggs";
                    WeightLossMeal.NMeal4="1 Banana,1 Scoop Whey Protein";
                    WeightLossMeal.NMeal5="150gm Sweet Potato,4 EGGS,15gm Cheese";
                    WeightLossMeal.NMeal6="70gm Chicken,1 Cup Spinach";

                    returnObj=WeightLossMeal;

                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="50gm Oats,1 Scoop Whey Protein,30gm Cheese";
                    MuscleGainMeal.Meal2="50gm Almonds,1 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,35gm Paneer";
                    MuscleGainMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal5="50gm Almonds,1/2 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.Meal6="50gm Brown Rice,50gm Soya Chunks,35gm Paneer";
                    MuscleGainMeal.NMeal1="60gm Oats,1 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    MuscleGainMeal.NMeal3="White Rice 40gm,70gm Chicken,4 Eggs";
                    MuscleGainMeal.NMeal4="2 Banana,1 Scoop Whey Protein";
                    MuscleGainMeal.NMeal5="150gm Sweet Potato,4 EGGS,15gm Cheese";
                    MuscleGainMeal.NMeal6="70gm Chicken,1 Cup Spinach";

                    returnObj=MuscleGainMeal;
                }
                break;



            case "91":
            case "92":
            case "93":
            case "94":
            case "95":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="50gm Oats,1 Scoop Whey Protein,30gm Cheese";
                    WeightLossMeal.Meal2="50gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    WeightLossMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal5="20gm Almonds,1 Scoop Whey Protein";
                    WeightLossMeal.Meal6="50gm Brown Rice,50gm Soya Chunks,25gm Paneer";
                    WeightLossMeal.NMeal1="60gm Oats,1 Scoop Whey Protein,1 Banana";
                    WeightLossMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    WeightLossMeal.NMeal3="White Rice 40gm,75gm Chicken,2 Eggs";
                    WeightLossMeal.NMeal4="1 Banana,1 Scoop Whey Protein,2 Eggs";
                    WeightLossMeal.NMeal5="150gm Sweet Potato,4 EGGS,15gm Cheese";
                    WeightLossMeal.NMeal6="70gm Chicken,1 Cup Spinach";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="50gm Oats,1 Scoop Whey Protein,30gm Cheese";
                    MuscleGainMeal.Meal2="50gm Almonds,1 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    MuscleGainMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal5="20gm Almonds,1 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.Meal6="50gm Brown Rice,50gm Soya Chunks,25gm Paneer";
                    MuscleGainMeal.NMeal1="60gm Oats,1 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach";
                    MuscleGainMeal.NMeal3="White Rice 40gm,75gm Chicken,2 Eggs";
                    MuscleGainMeal.NMeal4="2 Banana,1 Scoop Whey Protein,2 Eggs";
                    MuscleGainMeal.NMeal5="150gm Sweet Potato,4 EGGS,15gm Cheese";
                    MuscleGainMeal.NMeal6="70gm Chicken,1 Cup Spinach";

                    returnObj=MuscleGainMeal;
                }
                break;





            case "96":
            case "97":
            case "98":
            case "99":
            case "100":
                if(type.equalsIgnoreCase("WeightLoss")){
                    WeightLossMeal.Meal1="50gm Oats,1 Scoop Whey Protein,30gm Cheese";
                    WeightLossMeal.Meal2="30gm Almonds,1 Banana";
                    WeightLossMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    WeightLossMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    WeightLossMeal.Meal5="30gm Almonds,1 Scoop Whey Protein";
                    WeightLossMeal.Meal6="50gm Brown Rice,50gm Soya Chunks,25gm Paneer";
                    WeightLossMeal.NMeal1="60gm Oats,1 Scoop Whey Protein,1 Banana";
                    WeightLossMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach,1 Eggs";
                    WeightLossMeal.NMeal3="White Rice 40gm,75gm Chicken,2 Eggs";
                    WeightLossMeal.NMeal4="1 Banana,1 Scoop Whey Protein,2 Eggs";
                    WeightLossMeal.NMeal5="150gm Sweet Potato,4 EGGS,15gm Cheese";
                    WeightLossMeal.NMeal6="75gm Chicken,1 Cup Spinach";

                    returnObj=WeightLossMeal;


                }else if (type.equalsIgnoreCase("MuscleGain")){
                    MuscleGainMeal.Meal1="50gm Oats,1 Scoop Whey Protein,30gm Cheese";
                    MuscleGainMeal.Meal2="30gm Almonds,1 Banana";
                    MuscleGainMeal.Meal3="50gm Soya Chunks,25gm Paneer";
                    MuscleGainMeal.Meal4="1 Banana,1/2 Scoop Whey Protein";
                    MuscleGainMeal.Meal5="30gm Almonds,1 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.Meal6="50gm Brown Rice,50gm Soya Chunks,25gm Paneer";
                    MuscleGainMeal.NMeal1="60gm Oats,1 Scoop Whey Protein,1 Banana";
                    MuscleGainMeal.NMeal2="150gm Sweet Potato,1 Cup Spinach,1 Eggs";
                    MuscleGainMeal.NMeal3="White Rice 40gm,75gm Chicken,2 Eggs";
                    MuscleGainMeal.NMeal4="2 Banana,1 Scoop Whey Protein,2 Eggs";
                    MuscleGainMeal.NMeal5="150gm Sweet Potato,4 EGGS,15gm Cheese";
                    MuscleGainMeal.NMeal6="75gm Chicken,1 Cup Spinach";

                    returnObj=MuscleGainMeal;
                }
                break;

        }
        return returnObj;

    }

}
