package com.winnibear.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView dessertCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertCard = findViewById(R.id.card_view_desserts);



        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startersActivityIntent = new Intent(MainActivity.this,StarterActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainsActivityIntent = new Intent(MainActivity.this,MainCoursesActivity.class);
                startActivity(mainsActivityIntent);
            }
        });
        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dessertActivityIntent = new Intent(MainActivity.this,DessertsActivity.class);
                startActivity(dessertActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:myRestaurant@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });
    }
}