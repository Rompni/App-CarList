package com.edu.unimagdalena.appmoviles.carlist_quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class CarAdapter extends ArrayAdapter<Car> {
    private Context context;
    private ArrayList<Car> cars;
    private LayoutInflater inflater;

    public CarAdapter(@NonNull Context context, @NonNull ArrayList<Car> cars) {
        super(context,0, cars);
        this.context = context;
        this.cars = cars;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Nullable
    @Override
    public Car getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView = inflater.inflate(R.layout.car_row,null);

        }
        Car p = getItem(position);
        TextView mod = convertView.findViewById(R.id.txtModel);
        TextView bra = convertView.findViewById(R.id.txtBrand);
        TextView pla = convertView.findViewById(R.id.txtPlate);
        mod.setText(p.getModel());
        bra.setText(p.getBrand());
        pla.setText(p.getPlate());
        return convertView;
    }
}
