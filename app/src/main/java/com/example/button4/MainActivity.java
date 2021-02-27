package com.example.button4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int counter =1;

    public void clicked(View view) {
        Button button = (Button)findViewById(R.id.button);

        if(counter%7==0 || include(counter,7)) {

            button.setText("BOOM!");
            counter++;

        }
        else{
            button.setText("This is a click number: " + counter);
            counter++;
        }

    }
    private boolean include(int n1, int n2){
        while(n1>0){
            if(n1%10==n2)
                return true;
            n1/=10;
        }
        return false;
    }

}