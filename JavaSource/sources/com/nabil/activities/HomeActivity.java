package com.nabil.activities;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nabil.R;
import java.util.ArrayList;
import k2.g;
import k2.l;
import k2.m;
import t1.i;

/* compiled from: MyApplication */
public class HomeActivity extends androidx.appcompat.app.c {
    private TextView H;
    private TextView I;
    private TextView J;
    View K;
    LinearLayout L;
    TextView M;
    private MediaPlayer N;
    private i P;
    private SharedPreferences Q;
    private SharedPreferences.Editor R;
    int S;
    int T;
    private x2.a W;
    boolean Y;
    boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f4089a0;

    /* renamed from: b0, reason: collision with root package name */
    Typeface f4090b0;

    /* renamed from: c0, reason: collision with root package name */
    private ArrayList f4091c0;
    private boolean O = false;
    private String U = "ca-app-pub-3940256099942544/1033173712";
    private String V = "ca-app-pub-7665600901089938/9812499355";
    int X = 0;

    /* compiled from: MyApplication */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HomeActivity homeActivity = HomeActivity.this;
            homeActivity.R = homeActivity.Q.edit();
            HomeActivity.this.R.putBoolean("GESER_2_NOT_CLICKED", false);
            HomeActivity.this.R.apply();
            HomeActivity.this.j0();
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeActivity.this.I.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            HomeActivity.this.I.startAnimation(alphaAnimation);
            try {
                String string = HomeActivity.this.getString(R.string.prefix);
                if ((string.equals("it") || string.equals("en") || string.equals("ru") || string.equals("pt") || string.equals("ja") || string.equals("zh") || string.equals("tr") || string.equals("fr") || string.equals("es") || string.equals("pl") || string.equals("in") || string.equals("hu") || string.equals("cs") || string.equals("ar") || string.equals("sk") || string.equals("fi") || string.equals("vi") || string.equals("de") || string.equals("el")) && HomeActivity.this.Q.getBoolean("GESER_2_NOT_CLICKED", true) && (HomeActivity.this.g0(168) || HomeActivity.this.g0(177) || HomeActivity.this.g0(183))) {
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation2.setStartOffset(1000L);
                    alphaAnimation2.setDuration(2000L);
                    alphaAnimation2.setFillAfter(true);
                    HomeActivity.this.L.startAnimation(alphaAnimation2);
                }
            } catch (Exception unused) {
            }
            HomeActivity homeActivity = HomeActivity.this;
            homeActivity.l0(homeActivity.T);
            HomeActivity.this.k0(R.raw.simple_click_01);
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {

        /* compiled from: MyApplication */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (HomeActivity.this.W != null) {
                    HomeActivity.this.W.e(HomeActivity.this);
                }
            }
        }

        /* compiled from: MyApplication */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                HomeActivity.this.O = true;
            }
        }

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7;
            HomeActivity.this.J.setVisibility(0);
            HomeActivity.this.K.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            HomeActivity.this.J.startAnimation(alphaAnimation);
            HomeActivity.this.K.startAnimation(alphaAnimation);
            HomeActivity homeActivity = HomeActivity.this;
            if (homeActivity.Y || !homeActivity.Z || homeActivity.X == 0 || homeActivity.W == null) {
                HomeActivity homeActivity2 = HomeActivity.this;
                if (!homeActivity2.Y && homeActivity2.Z && homeActivity2.X != 0 && homeActivity2.W != null) {
                    new Handler().postDelayed(new a(), 2000L);
                    i7 = 2100;
                    new Handler().postDelayed(new b(), i7);
                }
            } else {
                HomeActivity.this.W.e(HomeActivity.this);
            }
            i7 = 1000;
            new Handler().postDelayed(new b(), i7);
        }
    }

    /* compiled from: MyApplication */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HomeActivity.this.O) {
                HomeActivity.this.O = false;
                Intent intent = new Intent(HomeActivity.this, (Class<?>) StoryActivity.class);
                intent.setFlags(131072);
                HomeActivity.this.startActivity(intent);
                HomeActivity.this.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                HomeActivity.this.k0(R.raw.click_electronic);
                HomeActivity.this.finish();
            }
        }
    }

    /* compiled from: MyApplication */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(HomeActivity.this, (Class<?>) OptionActivity.class);
            intent.putExtra("page", "0");
            HomeActivity.this.startActivity(intent);
        }
    }

    /* compiled from: MyApplication */
    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            HomeActivity.this.I.setText("" + valueAnimator.getAnimatedValue());
        }
    }

    /* compiled from: MyApplication */
    class g implements MediaPlayer.OnCompletionListener {
        g() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    /* compiled from: MyApplication */
    class h extends x2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4101a;

        /* compiled from: MyApplication */
        class a extends l {
            a() {
            }

            @Override // k2.l
            public void b() {
                HomeActivity.this.W = null;
                h hVar = h.this;
                HomeActivity.this.i0(hVar.f4101a);
            }
        }

        h(String str) {
            this.f4101a = str;
        }

        @Override // k2.e
        public void a(m mVar) {
            HomeActivity.this.W = null;
        }

        @Override // k2.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(x2.a aVar) {
            HomeActivity.this.W = aVar;
            HomeActivity.this.W.c(new a());
        }
    }

    public static boolean h0(Context context) {
        DisplayMetrics displayMetrics;
        try {
            displayMetrics = context.getResources().getDisplayMetrics();
        } catch (Exception unused) {
        }
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3 && ((double) (((float) displayMetrics.heightPixels) / ((float) displayMetrics.widthPixels))) < 1.6d;
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(com.nabil.utilities.e.b(context, context.getString(R.string.prefix)));
    }

    public boolean g0(int i7) {
        ArrayList arrayList = this.f4091c0;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            t1.c cVar = (t1.c) obj;
            if (cVar.a() == i7 && cVar.b() == 2) {
                return true;
            }
        }
        return false;
    }

    protected void i0(String str) {
        if (this.W == null) {
            x2.a.b(this, str, new g.a().k(), new h(str));
        }
    }

    public void j0() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + getPackageName() + "2"));
        intent.addFlags(1208483840);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName() + "2")));
        }
    }

    public void k0(int i7) {
        if (this.Q.getBoolean("EFFECTS", true)) {
            MediaPlayer create = MediaPlayer.create(getApplicationContext(), i7);
            this.N = create;
            create.setOnCompletionListener(new g());
            this.N.start();
        }
    }

    public boolean l0(int i7) {
        if (i7 < 0) {
            return false;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setObjectValues(0, Integer.valueOf(i7));
        valueAnimator.setDuration(2800L);
        valueAnimator.addUpdateListener(new f());
        valueAnimator.start();
        return true;
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (h0(getApplicationContext())) {
            setRequestedOrientation(6);
        } else {
            setRequestedOrientation(1);
        }
        getWindow().getDecorView().setSystemUiVisibility(5126);
        setContentView(R.layout.activity_home);
        this.X = getIntent().getIntExtra("adsActive", 0);
        i0(this.V);
        this.H = (TextView) findViewById(R.id.year_text);
        this.I = (TextView) findViewById(R.id.year_count);
        this.J = (TextView) findViewById(R.id.continue_text);
        this.L = (LinearLayout) findViewById(R.id.geser_2_layout);
        this.M = (TextView) findViewById(R.id.text_geser2);
        Typeface a8 = t1.b.a(this);
        this.f4090b0 = a8;
        this.H.setTypeface(a8);
        this.I.setTypeface(this.f4090b0);
        this.J.setTypeface(this.f4090b0);
        this.M.setTypeface(this.f4090b0);
        this.Q = getSharedPreferences("SharedPref", 0);
        this.P = new i(this);
        int i7 = this.Q.getInt("TIME", 0);
        this.S = i7;
        this.T = (i7 / 365) + 2075;
        this.Y = this.Q.getBoolean("PREMIUM_VERSION", false);
        this.Z = this.Q.getBoolean("ADS_WARNING", false);
        this.f4089a0 = this.Q.getInt("TOTAL_DEATH", 0);
        if (this.T >= 2084 && !this.Z) {
            this.Z = true;
            SharedPreferences.Editor edit = this.Q.edit();
            this.R = edit;
            edit.putBoolean("ADS_WARNING", true);
            this.R.apply();
        }
        if (this.f4089a0 >= 3 && !this.Z) {
            this.Z = true;
            SharedPreferences.Editor edit2 = this.Q.edit();
            this.R = edit2;
            edit2.putBoolean("ADS_WARNING", true);
            this.R.apply();
        }
        this.f4091c0 = this.P.c("MyGoals", t1.c.class);
        this.L.setOnClickListener(new a());
        new Handler().postDelayed(new b(), 1000L);
        this.K = findViewById(R.id.continue_image);
        new Handler().postDelayed(new c(), 3300L);
        findViewById(R.id.screen).setOnClickListener(new d());
        findViewById(R.id.settings_icon).setOnClickListener(new e());
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            getWindow().getDecorView().setSystemUiVisibility(5126);
        }
    }
}
