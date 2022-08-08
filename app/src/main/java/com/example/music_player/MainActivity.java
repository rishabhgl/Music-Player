package com.example.music_player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.song);
        TextView statusText = findViewById(R.id.statusText);
        TextView playText = findViewById(R.id.playButton);
        TextView pauseText = findViewById(R.id.pauseButton);
        TextView resetText = findViewById(R.id.resetButton);

        statusText.setText("Ready To Play");

        playText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                statusText.setText("Now Playing");
            }
        });

        pauseText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                statusText.setText("Paused");
            }
        });
//        resetText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaPlayer.reset();
//                statusText.setText("Ready To Play");
//            }
//        });
    }


}