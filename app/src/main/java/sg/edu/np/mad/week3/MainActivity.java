package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView rabbidShow = findViewById(R.id.rabbidVideo);
        rabbidShow.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid));
        rabbidShow.start();

        ImageView babyPicture = (ImageView) findViewById(R.id.babyImage);
        babyPicture.setImageResource(R.drawable.cute_baby);

        MediaPlayer babyLaugh = MediaPlayer.create(MainActivity.this,R.raw.baby_laughing);
        babyLaugh.start();
    }
}
