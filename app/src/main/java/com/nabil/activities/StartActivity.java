package com.nabil.activities;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.nabil.R;
import com.nabil.utilities.GeometricProgressView;
import com.nabil.utilities.e;
import com.google.android.gms.ads.MobileAds;

public class StartActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean I = false;
    private boolean J = true;
    private boolean K = false;
    private TextView L;
    private ImageView M;
    private Animation N;
    private MediaPlayer O;
    private boolean P;
    private SharedPreferences Q;
    private SharedPreferences.Editor f_R;
    Activity S;
    private Typeface T;

    class b implements Runnable {

        final TextView f4158q;

        class a implements Runnable {


            class RunnableC0075a implements Runnable {
                RunnableC0075a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.f4158q.setVisibility(0);
                    b.this.f4158q.startAnimation(AnimationUtils.loadAnimation(StartActivity.this.S, R.anim.blink));
                    StartActivity.this.P = true;
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                StartActivity.this.M.startAnimation(StartActivity.this.N);
                new Handler().postDelayed(new RunnableC0075a(), 1000L);
            }
        }

        b(TextView textView) {
            this.f4158q = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            StartActivity.this.L.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            StartActivity.this.L.startAnimation(alphaAnimation);
            new Handler().postDelayed(new a(), 1000L);
        }
    }

    class c implements View.OnClickListener {

        final TextView f4162q;

        class a implements MediaPlayer.OnCompletionListener {
            a() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                StartActivity.this.startActivity(new Intent(StartActivity.this, (Class<?>) HomeActivity.class));
                StartActivity.this.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }

        c(TextView textView) {
            this.f4162q = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (StartActivity.this.P) {
                StartActivity.this.P = false;
                this.f4162q.clearAnimation();
                this.f4162q.setText(StartActivity.this.getResources().getString(R.string.starting_message));
                this.f4162q.setVisibility(0);
                GeometricProgressView geometricProgressView = (GeometricProgressView) StartActivity.this.findViewById(R.id.loading_image);
                geometricProgressView.setType(GeometricProgressView.d.KITE);
                geometricProgressView.setNumberOfAngles(3);
                geometricProgressView.setColor(StartActivity.this.getResources().getColor(R.color.subtitle_text));
                geometricProgressView.setDuration(1000);
                geometricProgressView.setFigurePadding(10);
                geometricProgressView.setVisibility(0);
                if (StartActivity.this.Q.getBoolean("EFFECTS", true)) {
                    StartActivity startActivity = StartActivity.this;
                    startActivity.O = MediaPlayer.create(startActivity, R.raw.click_electronic);
                    StartActivity.this.O.setOnCompletionListener(new a());
                    StartActivity.this.O.start();
                }
                new Handler().postDelayed(new b(), 2000L);
            }
        }
    }

    class d implements MediaPlayer.OnCompletionListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    public static boolean f0(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3 && ((double) (((float) displayMetrics.heightPixels) / ((float) displayMetrics.widthPixels))) < 1.6d;
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(e.b(context, context.getString(R.string.prefix)));
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f0(getApplicationContext())) {
            setRequestedOrientation(6);
        } else {
            setRequestedOrientation(1);
        }
        getWindow().getDecorView().setSystemUiVisibility(5126);
        setContentView(R.layout.activity_start);
        com.nabil.utilities.d.e(this);
        MobileAds.initialize(this, new a());
        this.S = this;
        this.P = false;
        this.L = (TextView) findViewById(R.id.title_text);
        this.L.setTypeface(Typeface.createFromAsset(getAssets(), "aquifer.regular.ttf"));
        this.M = (ImageView) findViewById(R.id.circle_sun);
        this.N = AnimationUtils.loadAnimation(this, R.anim.rotate_and_fade);
        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref", 0);
        this.Q = sharedPreferences;
        this.J = sharedPreferences.getBoolean("AUTO_SIGN_IN", true);
        TextView textView = (TextView) findViewById(R.id.loading_text);
        Typeface a8 = t1.b.a(this);
        this.T = a8;
        textView.setTypeface(a8);
        new Handler().postDelayed(new b(textView), 1000L);
        findViewById(R.id.screen).setOnClickListener(new c(textView));
        if (this.Q.getBoolean("EFFECTS", true)) {
            MediaPlayer create = MediaPlayer.create(this, R.raw.intro_ambience);
            this.O = create;
            create.setOnCompletionListener(new d());
            this.O.start();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            getWindow().getDecorView().setSystemUiVisibility(5126);
        }
    }

    class a implements OnInitializationCompleteListener {
        a() {
        }

        @Override
        public void onInitializationComplete(InitializationStatus bVar) {
        }
    }

}
