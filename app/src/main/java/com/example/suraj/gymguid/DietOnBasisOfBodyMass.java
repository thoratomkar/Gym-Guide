package com.example.suraj.gymguid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DietOnBasisOfBodyMass extends AppCompatActivity {

    Button weightloss,weightgain,fruits,protien,vegetables,dairy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_on_basis_of_body_mass);


        weightloss=(Button)findViewById(R.id.buttonWeightLoss);
        weightgain=(Button)findViewById(R.id.buttonMuscleGain);
       /* fruits=(Button)findViewById(R.id.fruitstable);
        protien=(Button)findViewById(R.id.protientble);
        vegetables=(Button)findViewById(R.id.vegetabletable);
        dairy=(Button)findViewById(R.id.dairytable);*/





    }
    /*public void displayFruits(View v){

        startActivity(new Intent(DietOnBasisOfBodyMass.this,FruitDisplay.class));

            }


    public void displayVegetables(View v){

        startActivity(new Intent(DietOnBasisOfBodyMass.this,VegetableDisplay.class));

    }

    public void displayDairy(View v){

        startActivity(new Intent(DietOnBasisOfBodyMass.this,DairyDisplay.class));

    }

    public void displayProtien(View v){

        startActivity(new Intent(DietOnBasisOfBodyMass.this,ProtienDisplay.class));

    }
*/
   public void getMuscleMassDisplayMuscleGain(View v){

       TextView mass=(TextView)findViewById(R.id.mass);

       int masslbs=Integer.parseInt(mass.getText().toString());

       TextView protien=(TextView)findViewById(R.id.protienIntake);

       TextView fats=(TextView)findViewById(R.id.fatsIntake);
       TextView carbs=(TextView)findViewById(R.id.carbsIntake);


       double protienIntake=0.8*masslbs;
       double fatsIntake=1.5*masslbs;
       double carbsIntake=3*masslbs;

       protien.setText(""+protienIntake);
       fats.setText(""+fatsIntake);
       carbs.setText(""+carbsIntake);


   }
    public void getMuscleMassDisplayWeightloss(View v){
        TextView mass=(TextView)findViewById(R.id.mass);

        int masslbs=Integer.parseInt(mass.getText().toString());

        TextView protien=(TextView)findViewById(R.id.protienIntake);

        TextView fats=(TextView)findViewById(R.id.fatsIntake);
        TextView carbs=(TextView)findViewById(R.id.carbsIntake);


        DietMeals d=new DietMeals();
        d=d.assignMeal(masslbs+"","WeightLoss");



        double protienIntake=0.8*masslbs;
        double fatsIntake=0.5*masslbs;
        double carbsIntake=1.5*masslbs;

        protien.setText(""+protienIntake);
        fats.setText(""+fatsIntake);
        carbs.setText(""+carbsIntake);

    }
}
