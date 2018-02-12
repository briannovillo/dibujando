package com.onlyaman.dibujando;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DrawActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_view_layout);
    }

    public void changePencil(View v) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Not implemented yet!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void changeColor(View v) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Not implemented yet!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void changeStroke(View v) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Not implemented yet!", Toast.LENGTH_SHORT);
        toast.show();
    }
}