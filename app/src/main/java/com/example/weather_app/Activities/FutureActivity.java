package com.example.weather_app.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_app.R;

public class FutureActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterTommorow;
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewholder_future);

        setVariable();
    }

    private void setVariable() {

    }
}
