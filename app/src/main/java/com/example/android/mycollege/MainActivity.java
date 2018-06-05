package com.example.android.mycollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import static com.example.android.mycollege.R.id.phone_tv;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = findViewById(R.id.phone_tv);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t2 = findViewById(R.id.web_tv);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t3 = findViewById(R.id.loc_tv);
        t3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
