package com.edu.unimagdalena.appmoviles.carlist_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Car> cars= new ArrayList<>();
    Button add;
    EditText model, brand, plate;
    ListView carList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = findViewById(R.id.edtModel);
        brand = findViewById(R.id.edtBrand);
        plate = findViewById(R.id.edtPlate);
        carList = findViewById(R.id.carList);
        add = findViewById(R.id.btnInsert);
        final CarAdapter car_adapter = new CarAdapter(this, cars);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(model.getText().toString().compareTo("") == 0 ||
                        brand.getText().toString().compareTo("") == 0 ||
                            plate.getText().toString().compareTo("")==0)
                {
                    Toast.makeText(getApplicationContext(),"Hay valores vacios ", Toast.LENGTH_LONG).show();
                    return;
                }

                Car p = new Car(model.getText().toString(), brand.getText().toString(), plate.getText().toString());
                cars.add(p);
                Toast.makeText(getApplicationContext(),"Carro agregado", Toast.LENGTH_LONG).show();
                carList.setAdapter(car_adapter);

            }
        });
    }
}
