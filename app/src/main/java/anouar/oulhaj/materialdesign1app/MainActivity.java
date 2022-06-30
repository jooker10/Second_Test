package anouar.oulhaj.materialdesign1app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import anouar.oulhaj.materialdesign1app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{
    ActivityMainBinding activity_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity_main = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activity_main.getRoot());

    }

}