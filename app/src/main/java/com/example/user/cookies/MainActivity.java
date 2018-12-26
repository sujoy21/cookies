package com.example.user.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("I'm so full!!!");

        ImageView displayImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        displayImageView.setImageResource(R.drawable.after_cookie);

    }

}
