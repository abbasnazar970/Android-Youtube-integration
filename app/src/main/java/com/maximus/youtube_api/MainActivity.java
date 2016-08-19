package com.maximus.youtube_api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    Button b;
    YouTubePlayerView View;
    YouTubePlayer.OnInitializedListener lis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b=(Button) findViewById(R.id.button);
        View=(YouTubePlayerView)findViewById(R.id.youtube_view);

        lis=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

              youTubePlayer.loadVideo("a4NT5iBFuZs");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View.initialize("AIzaSyDROnx--Kmlz8hNwZ7IEzyC-6dn_QH17RU",lis);
            }
        });


    }
}
