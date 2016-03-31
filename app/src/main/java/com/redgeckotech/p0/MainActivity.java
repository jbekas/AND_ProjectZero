package com.redgeckotech.p0;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button spotifyStreamButton;
    Button scoresAppButton;
    Button libraryAppButton;
    Button buildItBiggerButton;
    Button xyzReaderButton;
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getButtonAndAddDefaultListener(spotifyStreamButton, R.id.spotifyStreamer, R.string.spotify_app_toast);
        getButtonAndAddDefaultListener(scoresAppButton, R.id.scoresApp, R.string.scores_app_toast);
        getButtonAndAddDefaultListener(libraryAppButton, R.id.libraryApp, R.string.library_app_toast);
        getButtonAndAddDefaultListener(buildItBiggerButton, R.id.buildItBigger, R.string.build_it_bigger_app_toast);
        getButtonAndAddDefaultListener(xyzReaderButton, R.id.xyzReader, R.string.xyz_reader_app_toast);
        getButtonAndAddDefaultListener(capstoneButton, R.id.capstone, R.string.capstone_app_toast);
    }

    private void getButtonAndAddDefaultListener(Button button,
                                                final @IdRes int resourceId,
                                                final @StringRes int stringResourceId) {
        button = (Button) findViewById(resourceId);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, stringResourceId, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
