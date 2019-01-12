package com.example.suraj.gymguid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TabHost host = (TabHost) findViewById(R.id.tabHost);
        // host.setBackgroundResource(R.drawable.tab_baground);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Workout");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Workout");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Diet");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Diet");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Chat");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Chat");
        host.addTab(spec);

    }
   /* public void next(View v){
        startActivity(new Intent(MainActivity.this,Login.class));

    }*/

    public void goToMuscleGain(View v){
        startActivity(new Intent(MainActivity.this,MuscleGain.class));

    }

    public void goToFatLoss(View v){
        startActivity(new Intent(MainActivity.this,WeightLoss.class));

    }


   /* public void displayFruits(View v){

        startActivity(new Intent(MainActivity.this,FruitDisplay.class));

    }


    public void displayVegetables(View v){

        startActivity(new Intent(MainActivity.this,VegetableDisplay.class));

    }

    public void displayDairy(View v){

        startActivity(new Intent(MainActivity.this,DairyDisplay.class));

    }

    public void displayProtien(View v){

        startActivity(new Intent(MainActivity.this,ProtienDisplay.class));

    }*/

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

        TextView veg1=(TextView)findViewById(R.id.veg1);
        TextView veg2=(TextView)findViewById(R.id.veg2);
        TextView veg3=(TextView)findViewById(R.id.veg3);
        TextView veg4=(TextView)findViewById(R.id.veg4);
        TextView veg5=(TextView)findViewById(R.id.veg5);
        TextView veg6=(TextView)findViewById(R.id.veg6);


        TextView nonveg1=(TextView)findViewById(R.id.nonveg1);
        TextView nonveg2=(TextView)findViewById(R.id.nonveg2);
        TextView nonveg3=(TextView)findViewById(R.id.nonveg3);
        TextView nonveg4=(TextView)findViewById(R.id.nonveg4);
        TextView nonveg5=(TextView)findViewById(R.id.nonveg5);
        TextView nonveg6=(TextView)findViewById(R.id.nonveg6);


        DietMeals d=new DietMeals();
        d=d.assignMeal(masslbs+"","WeightLoss");
        System.out.print(d.Meal1+d.Meal2+d.Meal3+d.Meal4+d.Meal5+d.Meal6);

        double protienIntake=0.8*masslbs;
        double fatsIntake=0.5*masslbs;
        double carbsIntake=1.5*masslbs;

        veg1.setText(d.Meal1);
        veg2.setText(d.Meal2);
        veg3.setText(d.Meal3);
        veg4.setText(d.Meal4);
        veg5.setText(d.Meal5);
        veg6.setText(d.Meal6);

        nonveg1.setText(d.NMeal1);
        nonveg2.setText(d.NMeal2);
        nonveg3.setText(d.NMeal3);
        nonveg4.setText(d.NMeal4);
        nonveg5.setText(d.NMeal5);
        nonveg6.setText(d.NMeal6);


        protien.setText(""+protienIntake);
        fats.setText(""+fatsIntake);
        carbs.setText(""+carbsIntake);

    }

}
