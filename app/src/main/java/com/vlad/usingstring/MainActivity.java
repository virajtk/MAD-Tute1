package com.vlad.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i( "Lifecycle","OnCreate() Invoked");

        txtView2 = findViewById(R.id.textView2); //variable assign to the txt field
        txtView2.setText(R.string.Msg2); //get String resource to the variable
    }
    public void onStart(){
        super.onStart();
        Log.i( "Lifecycle","onStart() Invoked");
    }
    public void onRestart(){
        super.onRestart();
        Log.i( "Lifecycle","onRestart() Invoked");
    }
    public void onResume(){
        super.onResume();
        Log.i( "Lifecycle","onResume() Invoked");
    }
    public void onPause(){
        super.onPause();
        Log.i( "Lifecycle","onPause() Invoked");
    }
    public void onStop(){
        super.onStop();
        Log.i( "Lifecycle","onStop() Invoked");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.i( "Lifecycle","onDestroy() Invoked");
    }
}
