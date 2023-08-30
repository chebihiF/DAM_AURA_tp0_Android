package org.m2i.tp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1 - déclaration (UI)
    TextView t_hello;
    Button btn_valider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 - relation via R
        t_hello = findViewById(R.id.t_hello);
        btn_valider = findViewById(R.id.btn_valider);

        // 3 - manipuler (UI)
        t_hello.setText("Hello from java file");
    }

    public void test(View view) {
        Toast.makeText(this,"Hello from Valider",Toast.LENGTH_LONG).show();
    }
}