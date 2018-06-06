package com.example.android.mycollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

import static com.example.android.mycollege.R.id.phone_tv;

public class MainActivity extends AppCompatActivity {

    TextView locTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locTV = findViewById(R.id.loc_tv);
        SpannableString spanStr = new SpannableString(getText(R.string.location).toString());
        spanStr.setSpan(new UnderlineSpan(), 0, spanStr.length(), 0);
        locTV.setText(spanStr);
    }

    public void openLocation(View view) {//Using the following code to open it with map app on click:
        Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="
                + locTV.getText().toString()));
        startActivity(geoIntent);
    }
}
