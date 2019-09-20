package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.animation.AlphaAnimation;
        import android.view.animation.Animation;
        import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);

        Animation mAnimation = new AlphaAnimation(1, 0);
        mAnimation.setDuration(400);
        mAnimation.setRepeatCount(Animation.INFINITE);
        mAnimation.setRepeatMode(Animation.REVERSE);
        play.startAnimation(mAnimation);
//
    }

    public void play(View view) {
        Intent intent = new Intent(this,play.class);
        startActivity(intent);
    }

    public void refer(View view) {
        Intent intent = new Intent(this,refer.class);
       startActivity(intent);

    }
    public void demo(View view) {
        Intent intent = new Intent(this,demo.class);
        startActivity(intent);
    }
}
