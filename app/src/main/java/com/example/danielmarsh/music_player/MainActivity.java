package com.example.danielmarsh.music_player;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playButton = (Button) findViewById(R.id.playButtonView);
        Button pauseButton = (Button) findViewById(R.id.pauseButtonView);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           mediaPlayer.start();
            }

        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }

        });
    }
}
