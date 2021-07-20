package com.example.myapplicationloc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class AddingLocation extends FragmentActivity {
    FloatingTextButton floatingTextButton;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_location);
        button3= findViewById(R.id.add_address);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddingLocation.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}