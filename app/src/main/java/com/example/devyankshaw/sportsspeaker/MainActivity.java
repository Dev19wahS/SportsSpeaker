package com.example.devyankshaw.sportsspeaker;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing, imgKickBoxing, imgJudo, imgKarate, imgAikido, imgTaekwondo;
   // private MediaPlayer mediaPlayerBoxing, mediaPlayerKickBoxing, mediaPlayerJudo,mediaPlayerKarate, mediaPlayerAikido, mediaPlayerTaekwondo;
   // private AudioManager audioManager;
    private MediaPlayer sportsPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickBoxing = findViewById(R.id.imgKickBoxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);

//        mediaPlayerBoxing = MediaPlayer.create(MainActivity.this, R.raw.boxing);//Sets the path our music and this mediaPlayer object is responsible for playing music
//        mediaPlayerKickBoxing = MediaPlayer.create(MainActivity.this, R.raw.kickboxing);
//        mediaPlayerJudo = MediaPlayer.create(MainActivity.this, R.raw.judo);
//        mediaPlayerKarate = MediaPlayer.create(MainActivity.this, R.raw.karate);
//        mediaPlayerAikido = MediaPlayer.create(MainActivity.this, R.raw.aikido);
//        mediaPlayerTaekwondo = MediaPlayer.create(MainActivity.this, R.raw.taekwondo);

        //audioManager = (AudioManager)getSystemService(AUDIO_SERVICE);//Access the audio service


    }

    @Override
    protected void onResume() {
        super.onResume();

        imgBoxing.setOnClickListener(this);
        imgKickBoxing.setOnClickListener(this);
        imgJudo.setOnClickListener(this);
        imgKarate.setOnClickListener(this);
        imgAikido.setOnClickListener(this);
        imgTaekwondo.setOnClickListener(this);
    }

    @Override
    public void onClick(View imageButton) {
        switch (imageButton.getId()){
            case R.id.imgBoxing:
                playSportName(imgBoxing.getTag().toString());
                break;
            case R.id.imgKickBoxing:
                playSportName(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportName(imgJudo.getTag().toString());
                break;
            case R.id.imgKarate:
                playSportName(imgKarate.getTag().toString());
                break;
            case R.id.imgAikido:
                playSportName(imgAikido.getTag().toString());
                break;
            case R.id.imgTaekwondo:
                playSportName(imgTaekwondo.getTag().toString());
                break;

        }

    }

    private void playSportName(String sportName){

        sportsPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(sportName, "raw", getPackageName()));

        sportsPlayer.start();
    }
}
