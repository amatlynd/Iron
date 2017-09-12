package com.example.lyndonamat.iron;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.sign_in_button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                launchActivity();
            }
        });
    }
    //
    private void launchActivity(){
        Intent intent = new Intent(this,EmptyActivity.class);
        startActivity(intent);
    }
}
