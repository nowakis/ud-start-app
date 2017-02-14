package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] ids = {R.id.btn_build_bigger, R.id.btn_capstone, R.id.btn_go_ubiquitous, R.id.btn_material, R.id.btn_popular_movies, R.id.btn_stock_hawk};
        for (int id:ids) {
            Button b = (Button) findViewById(id);
            b.setOnClickListener(this);
        }
    }

    public void onClick(View v)
    {
        Button b = (Button) findViewById(v.getId());
        Toast.makeText(MainActivity.this, "This button will launch " + b.getText(), Toast.LENGTH_SHORT).show();
    }


}
