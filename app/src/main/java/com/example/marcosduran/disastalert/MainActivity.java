package com.example.marcosduran.disastalert;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView logo_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo_textView = (TextView) findViewById(R.id.logo_tv);
        Typeface customFont = Typeface.createFromAsset(getAssets(),"fonts/KolnMesseDeutz.otf");
        logo_textView.setTypeface(customFont);



    }

    public void forgotPassword(View v){

        Intent intent = new Intent(this, RecoverPass.class);
        startActivity(intent);
    }


    public void signIn(View view) {

        Intent intent = new Intent(this, HOME.class);
        startActivity(intent);

    }


    public void signUp(View view) {

        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);

    }
}
