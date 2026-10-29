package com.nabil.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.nabil.R;
import com.nabil.activities.OptionActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l3.f;

/* compiled from: MyApplication */
public class OptionActivity extends Activity implements f.b, f.c {

    /* renamed from: p0, reason: collision with root package name */
    private static int f4104p0 = 9001;
    private int B;
    private int C;
    private int D;
    private TextView E;
    private TextView F;
    private TextView G;
    View H;
    private MediaPlayer I;
    private View J;
    private View K;
    private View L;
    private ImageView M;
    private ImageView N;
    private ImageView O;
    private TextView S;
    private SharedPreferences T;
    private SharedPreferences.Editor U;
    private t1.i V;
    private ArrayList W;
    private ArrayList X;

    /* renamed from: b0, reason: collision with root package name */
    private int f4106b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f4107c0;

    /* renamed from: d0, reason: collision with root package name */
    Spinner f4108d0;

    /* renamed from: e0, reason: collision with root package name */
    View f4109e0;

    /* renamed from: f0, reason: collision with root package name */
    TextView f4110f0;

    /* renamed from: g0, reason: collision with root package name */
    View f4111g0;

    /* renamed from: i0, reason: collision with root package name */
    Typeface f4113i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f4114j0;

    /* renamed from: k0, reason: collision with root package name */
    boolean f4115k0;

    /* renamed from: l0, reason: collision with root package name */
    com.android.billingclient.api.a f4116l0;

    /* renamed from: m0, reason: collision with root package name */
    private ArrayList f4117m0;

    /* renamed from: q, reason: collision with root package name */
    View f4120q;

    /* renamed from: r, reason: collision with root package name */
    TextView f4121r;

    /* renamed from: s, reason: collision with root package name */
    private l3.f f4122s;

    /* renamed from: w, reason: collision with root package name */
    private Activity f4126w;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4123t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4124u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f4125v = false;

    /* renamed from: x, reason: collision with root package name */
    private View[] f4127x = new View[4];

    /* renamed from: y, reason: collision with root package name */
    private TextView[] f4128y = new TextView[4];

    /* renamed from: z, reason: collision with root package name */
    private TextView[] f4129z = new TextView[4];
    private ImageView[] A = new ImageView[4];
    private View[] P = new View[3];
    private ImageView[] Q = new ImageView[3];
    private String[] R = new String[3];
    private s1.a Y = new s1.a();
    private s1.c Z = new s1.c();

    /* renamed from: a0, reason: collision with root package name */
    private s1.b f4105a0 = new s1.b();

    /* renamed from: h0, reason: collision with root package name */
    boolean f4112h0 = false;

    /* renamed from: n0, reason: collision with root package name */
    private Map f4118n0 = new HashMap();

    /* renamed from: o0, reason: collision with root package name */
    private View.OnClickListener f4119o0 = new h();

    /* compiled from: MyApplication */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.C(R.raw.switching_options);
            OptionActivity.this.Z.d(OptionActivity.this.f4126w);
        }
    }

    /* compiled from: MyApplication */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (!OptionActivity.this.f4122s.l()) {
                    Toast.makeText(OptionActivity.this.f4126w, "Error: Bad Connection :(", 0).show();
                } else {
                    OptionActivity optionActivity = OptionActivity.this;
                    optionActivity.startActivityForResult(y3.b.f27673n.b(optionActivity.f4122s, "CgkIkMOR47gLEAIQCA"), 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: MyApplication */
    class c implements View.OnClickListener {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ AppCompatImageView f4132q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ TextView f4133r;

        c(AppCompatImageView appCompatImageView, TextView textView) {
            this.f4132q = appCompatImageView;
            this.f4133r = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity optionActivity = OptionActivity.this;
            if (optionActivity.f4114j0) {
                this.f4132q.setColorFilter(optionActivity.getResources().getColor(R.color.option_text_disabled));
                this.f4133r.setTextColor(OptionActivity.this.getResources().getColor(R.color.option_text_disabled));
                OptionActivity optionActivity2 = OptionActivity.this;
                optionActivity2.f4114j0 = false;
                optionActivity2.U = optionActivity2.T.edit();
                OptionActivity.this.U.putBoolean("MUSIC", false);
                OptionActivity.this.U.apply();
                return;
            }
            this.f4132q.setColorFilter(optionActivity.getResources().getColor(R.color.option_text_enabled));
            this.f4133r.setTextColor(OptionActivity.this.getResources().getColor(R.color.option_text_enabled));
            OptionActivity optionActivity3 = OptionActivity.this;
            optionActivity3.f4114j0 = true;
            optionActivity3.U = optionActivity3.T.edit();
            OptionActivity.this.U.putBoolean("MUSIC", true);
            OptionActivity.this.U.apply();
        }
    }

    /* compiled from: MyApplication */
    class d implements View.OnClickListener {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ AppCompatImageView f4135q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ TextView f4136r;

        d(AppCompatImageView appCompatImageView, TextView textView) {
            this.f4135q = appCompatImageView;
            this.f4136r = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity optionActivity = OptionActivity.this;
            if (optionActivity.f4115k0) {
                this.f4135q.setColorFilter(optionActivity.getResources().getColor(R.color.option_text_disabled));
                this.f4136r.setTextColor(OptionActivity.this.getResources().getColor(R.color.option_text_disabled));
                OptionActivity optionActivity2 = OptionActivity.this;
                optionActivity2.f4115k0 = false;
                optionActivity2.U = optionActivity2.T.edit();
                OptionActivity.this.U.putBoolean("EFFECTS", false);
                OptionActivity.this.U.apply();
                return;
            }
            this.f4135q.setColorFilter(optionActivity.getResources().getColor(R.color.option_text_enabled));
            this.f4136r.setTextColor(OptionActivity.this.getResources().getColor(R.color.option_text_enabled));
            OptionActivity optionActivity3 = OptionActivity.this;
            optionActivity3.f4115k0 = true;
            optionActivity3.U = optionActivity3.T.edit();
            OptionActivity.this.U.putBoolean("EFFECTS", true);
            OptionActivity.this.U.apply();
        }
    }

    /* compiled from: MyApplication */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.C(R.raw.switching_options);
            OptionActivity.this.f4105a0.r(OptionActivity.this.f4126w);
        }
    }

    /* compiled from: MyApplication */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.C(R.raw.closing_options);
            OptionActivity.this.f4116l0.c();
            OptionActivity.this.finish();
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
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.item_shop_1x1) {
                OptionActivity.this.A("item_1x1");
                return;
            }
            if (id == R.id.item_shop_1x2) {
                OptionActivity.this.A("item_1x2");
                return;
            }
            if (id == R.id.item_shop_1x3) {
                OptionActivity.this.A("item_1x3");
                return;
            }
            if (id == R.id.item_shop_2x1) {
                OptionActivity.this.A("item_2x1");
                return;
            }
            if (id == R.id.item_shop_3x1) {
                OptionActivity.this.A("item_3x1");
                return;
            }
            if (id == R.id.item_shop_3x2) {
                OptionActivity.this.A("item_3x1");
                return;
            }
            if (id == R.id.item_shop_3x3) {
                OptionActivity.this.A("item_3x3");
            } else if (id == R.id.upgrade_layout || id == R.id.upgrade_layout_effects) {
                OptionActivity.this.A("ads_free_version_2");
            } else {
                Toast.makeText(OptionActivity.this.f4126w, "Error purchase 01, please contact the developer", 1).show();
            }
        }
    }

    /* compiled from: MyApplication */
    class i implements p1.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Purchase f4142a;

        i(Purchase purchase) {
            this.f4142a = purchase;
        }

        @Override // p1.f
        public void a(com.android.billingclient.api.d dVar, String str) {
            Log.d("Tag2", "onConsumeResponse started");
            Log.d("Tag3", "BillingResponseCode is " + dVar.c());
            if (dVar.c() == 0) {
                Log.d("Tag4", "ids: " + this.f4142a.e().toString());
            }
        }
    }

    /* compiled from: MyApplication */
    class j implements p1.b {
        j() {
        }

        @Override // p1.b
        public void a(com.android.billingclient.api.d dVar) {
            if (dVar.c() == 0) {
                OptionActivity optionActivity = OptionActivity.this;
                optionActivity.f4112h0 = true;
                optionActivity.U = optionActivity.T.edit();
                OptionActivity.this.U.putBoolean("PREMIUM_VERSION", OptionActivity.this.f4112h0);
                OptionActivity.this.U.apply();
                OptionActivity optionActivity2 = OptionActivity.this;
                if (optionActivity2.f4112h0) {
                    optionActivity2.f4109e0.setVisibility(8);
                    OptionActivity.this.f4111g0.setVisibility(8);
                    OptionActivity.this.f4110f0.setVisibility(8);
                    OptionActivity.this.H.setVisibility(4);
                }
                Log.d("Tag", "Acknowledged ad free version");
                Toast.makeText(OptionActivity.this.f4126w, OptionActivity.this.getString(R.string.ads_removed), 0).show();
            }
        }
    }

    /* compiled from: MyApplication */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (OptionActivity.this.f4122s.l()) {
                    OptionActivity optionActivity = OptionActivity.this;
                    optionActivity.startActivityForResult(y3.b.f27670k.b(optionActivity.f4122s), 1);
                } else {
                    OptionActivity.this.f4125v = true;
                    OptionActivity.this.f4122s.d();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: MyApplication */
    class l implements p1.i {
        l() {
        }

        @Override // p1.i
        public void a(com.android.billingclient.api.d dVar, List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    Log.d("optionactivity_inappbilling", purchase.toString());
                    OptionActivity.this.x(purchase);
                }
            }
        }
    }

    /* compiled from: MyApplication */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.r(0, R.raw.switching_options);
        }
    }

    /* compiled from: MyApplication */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.r(1, R.raw.switching_options);
        }
    }

    /* compiled from: MyApplication */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.r(2, R.raw.switching_options);
        }
    }

    /* compiled from: MyApplication */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.t();
        }
    }

    /* compiled from: MyApplication */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.t();
        }
    }

    /* compiled from: MyApplication */
    class s extends ArrayAdapter {
        s(Context context, int i7, String[] strArr) {
            super(context, i7, strArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
            View dropDownView = super.getDropDownView(i7, view, viewGroup);
            ((TextView) dropDownView).setTextColor(OptionActivity.this.getResources().getColor(R.color.main_text));
            dropDownView.setBackgroundColor(OptionActivity.this.getResources().getColor(R.color.option_text_enabled));
            return dropDownView;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i7, view, viewGroup);
            ((TextView) view2).setTypeface(OptionActivity.this.f4113i0);
            return view2;
        }
    }

    /* compiled from: MyApplication */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OptionActivity.this.C(R.raw.switching_options);
            OptionActivity.this.Y.d(OptionActivity.this.f4126w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(String str) {
        List a8;
        com.android.billingclient.api.f fVar = (com.android.billingclient.api.f) this.f4118n0.get(str);
        if (fVar == null) {
            Toast.makeText(this, "Prodotto non disponibile", 0).show();
            return;
        }
        a8 = r1.b.a(new Object[]{c.b.a().b(fVar).a()});
        this.f4116l0.d(this, com.android.billingclient.api.c.a().b(a8).a());
    }

    private ArrayList B() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ads_free_version");
        arrayList.add("ads_free_version_2");
        arrayList.add("item_1x1");
        arrayList.add("item_1x2");
        arrayList.add("item_1x3");
        arrayList.add("item_2x1");
        arrayList.add("item_3x1");
        arrayList.add("item_3x2");
        arrayList.add("item_3x3");
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4117m0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(g.b.a().b((String) obj).c("inapp").a());
        }
        this.f4116l0.f(com.android.billingclient.api.g.a().b(arrayList).a(), new p1.g() { // from class: r1.d
            @Override // p1.g
            public final void a(com.android.billingclient.api.d dVar, h hVar) {
                OptionActivity.b(OptionActivity.this, dVar, hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Intent launchIntentForPackage = this.f4126w.getBaseContext().getPackageManager().getLaunchIntentForPackage(this.f4126w.getBaseContext().getPackageName());
        launchIntentForPackage.addFlags(67108864);
        this.f4126w.finish();
        this.f4126w.startActivity(launchIntentForPackage);
    }

    public static /* synthetic */ void b(OptionActivity optionActivity, com.android.billingclient.api.d dVar, com.android.billingclient.api.h hVar) {
        optionActivity.getClass();
        if (dVar.c() == 0) {
            optionActivity.f4118n0.clear();
            for (com.android.billingclient.api.f fVar : hVar.a()) {
                Log.i("queryProductDetails: ", fVar + "");
                optionActivity.f4118n0.put(fVar.c(), fVar);
            }
            for (com.android.billingclient.api.i iVar : hVar.b()) {
            }
        }
    }

    public static /* synthetic */ void c(OptionActivity optionActivity, com.android.billingclient.api.d dVar, List list) {
        optionActivity.getClass();
        if (dVar.c() == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.b() == 1 && !purchase.f()) {
                    optionActivity.x(purchase);
                } else if (purchase.f() && (((String) purchase.e().get(0)).equals("ads_free_version") || ((String) purchase.e().get(0)).equals("ads_free_version_2"))) {
                    Log.i("optionactivity_inappbilling", "ads_free_1: " + ((String) purchase.e().get(0)).equals("ads_free_version"));
                    Log.i("optionactivity_inappbilling", "ads_free_2: " + ((String) purchase.e().get(0)).equals("ads_free_version_2"));
                    optionActivity.f4112h0 = true;
                    SharedPreferences.Editor edit = optionActivity.T.edit();
                    optionActivity.U = edit;
                    edit.putBoolean("PREMIUM_VERSION", optionActivity.f4112h0);
                    optionActivity.U.apply();
                    Log.i("optionactivity_inappbilling", "getOfflinePurchases mIsPremium: " + optionActivity.f4112h0);
                    if (optionActivity.f4112h0) {
                        optionActivity.f4109e0.setVisibility(8);
                        optionActivity.f4111g0.setVisibility(8);
                        optionActivity.f4110f0.setVisibility(8);
                        optionActivity.H.setVisibility(4);
                    }
                }
            }
        }
    }

    private void s() {
        this.f4116l0.h(new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (Locale.getDefault().getDisplayLanguage().equals("italiano")) {
            int i7 = this.f4106b0 + 1;
            this.f4106b0 = i7;
            if (i7 == 5) {
                if (this.f4107c0) {
                    Toast.makeText(this.f4126w, R.string.commodore_already_on, 1).show();
                } else {
                    Toast.makeText(this.f4126w, R.string.commodore_enabled, 1).show();
                    this.f4107c0 = true;
                    SharedPreferences.Editor edit = this.T.edit();
                    this.U = edit;
                    edit.putBoolean("COMMODORE_ASSEMBLE", this.f4107c0);
                    this.U.apply();
                }
                this.f4106b0 = 0;
            }
        }
    }

    private void w() {
        try {
            this.f4116l0.g(p1.j.a().b("inapp").a(), new p1.h() { // from class: r1.c
                @Override // p1.h
                public final void a(com.android.billingclient.api.d dVar, List list) {
                    OptionActivity.c(OptionActivity.this, dVar, list);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(com.android.billingclient.api.Purchase r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nabil.activities.OptionActivity.x(com.android.billingclient.api.Purchase):void");
    }

    private void z() {
        Log.i("optionactivity_inappbilling", "initializeBillingClient");
        l lVar = new l();
        this.f4116l0 = com.android.billingclient.api.a.e(this).d(lVar).c(com.android.billingclient.api.e.c().b().a()).b().a();
    }

    public void C(int i7) {
        if (this.T.getBoolean("EFFECTS", true)) {
            MediaPlayer create = MediaPlayer.create(this.f4126w, i7);
            this.I = create;
            create.setOnCompletionListener(new g());
            this.I.start();
        }
    }

    @Override // m3.e
    public void O(int i7) {
        try {
            this.f4122s.d();
        } catch (Exception unused) {
        }
    }

    @Override // m3.n
    public void a(k3.b bVar) {
        if (this.f4123t) {
            return;
        }
        try {
            if (this.f4125v || this.f4124u) {
                this.f4124u = false;
                this.f4125v = false;
                this.f4123t = true;
                if (!b5.a.b(this, this.f4122s, bVar, f4104p0, R.string.signin_other_error)) {
                    this.f4123t = false;
                }
            }
        } catch (Exception unused) {
        }
        this.f4121r.setText(getResources().getString(R.string.play_games_login));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(com.nabil.utilities.e.b(context, context.getString(R.string.prefix)));
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == f4104p0) {
            this.f4125v = false;
            this.f4123t = false;
            if (i8 == -1) {
                this.f4122s.d();
            } else {
                b5.a.d(this, i7, i8, R.string.signin_failure);
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        char c8;
        super.onCreate(bundle);
        this.f4126w = this;
        requestWindowFeature(1);
        getWindow().getDecorView().setSystemUiVisibility(5126);
        setContentView(R.layout.activity_option);
        try {
            this.f4122s = new f.a(getApplicationContext()).b(this).c(this).a(y3.b.f27666g).d(y3.b.f27663d).f(findViewById(android.R.id.content)).e();
        } catch (Exception unused) {
        }
        String str = v().versionName;
        int parseInt = Integer.parseInt(getIntent().getStringExtra("page"));
        this.f4120q = findViewById(R.id.play_games_button);
        this.f4121r = (TextView) findViewById(R.id.play_games_text);
        this.f4120q.setOnClickListener(new k());
        z();
        s();
        this.f4117m0 = B();
        this.R[0] = getString(R.string.settings);
        this.R[1] = getString(R.string.effects);
        this.R[2] = getString(R.string.progress);
        this.f4106b0 = 0;
        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref", 0);
        this.T = sharedPreferences;
        this.f4114j0 = sharedPreferences.getBoolean("MUSIC", true);
        this.f4115k0 = this.T.getBoolean("EFFECTS", true);
        this.f4107c0 = this.T.getBoolean("COMMODORE_ASSEMBLE", false);
        this.J = findViewById(R.id.settings_view);
        this.K = findViewById(R.id.eye_view);
        this.L = findViewById(R.id.tower_view);
        ImageView imageView = (ImageView) findViewById(R.id.settings);
        this.M = imageView;
        imageView.setOnClickListener(new n());
        ImageView imageView2 = (ImageView) findViewById(R.id.eye);
        this.N = imageView2;
        imageView2.setOnClickListener(new o());
        ImageView imageView3 = (ImageView) findViewById(R.id.tower);
        this.O = imageView3;
        imageView3.setOnClickListener(new p());
        View[] viewArr = this.P;
        viewArr[0] = this.J;
        viewArr[1] = this.K;
        viewArr[2] = this.L;
        ImageView[] imageViewArr = this.Q;
        imageViewArr[0] = this.M;
        imageViewArr[1] = this.N;
        imageViewArr[2] = this.O;
        this.f4110f0 = (TextView) findViewById(R.id.ads_info);
        View findViewById = findViewById(R.id.upgrade_layout);
        this.f4109e0 = findViewById;
        findViewById.setOnClickListener(this.f4119o0);
        View findViewById2 = findViewById(R.id.upgrade_layout_effects);
        this.f4111g0 = findViewById2;
        findViewById2.setOnClickListener(this.f4119o0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = getWindow();
        layoutParams.copyFrom(window.getAttributes());
        Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        layoutParams.width = point.x;
        layoutParams.height = -1;
        window.setAttributes(layoutParams);
        TextView textView = (TextView) findViewById(R.id.version_subtext);
        textView.setText(str);
        this.S = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.version_text);
        Typeface a8 = t1.b.a(this);
        this.f4113i0 = a8;
        textView.setTypeface(a8);
        this.S.setTypeface(this.f4113i0);
        textView2.setTypeface(this.f4113i0);
        this.f4110f0.setTypeface(this.f4113i0);
        this.H = findViewById(R.id.divider_ads_info);
        this.f4121r.setTypeface(this.f4113i0);
        textView2.setOnClickListener(new q());
        textView.setOnClickListener(new r());
        ((TextView) findViewById(R.id.language_title)).setTypeface(this.f4113i0);
        this.f4108d0 = (Spinner) findViewById(R.id.language_spinner);
        int[] iArr = {0};
        s sVar = new s(this, R.layout.spinner_item, getResources().getStringArray(R.array.languages_list));
        sVar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.f4108d0.setAdapter((SpinnerAdapter) sVar);
        String string = this.f4126w.getString(R.string.prefix);
        string.getClass();
        switch (string.hashCode()) {
            case 3109:
                if (string.equals("af")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 3121:
                if (string.equals("ar")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 3129:
                if (string.equals("az")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 3141:
                if (string.equals("bg")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 3148:
                if (string.equals("bn")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 3184:
                if (string.equals("cs")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 3201:
                if (string.equals("de")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 3239:
                if (string.equals("el")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case 3241:
                if (string.equals("en")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case 3246:
                if (string.equals("es")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case 3267:
                if (string.equals("fi")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case 3276:
                if (string.equals("fr")) {
                    c8 = 11;
                    break;
                }
                c8 = 65535;
                break;
            case 3329:
                if (string.equals("hi")) {
                    c8 = '\f';
                    break;
                }
                c8 = 65535;
                break;
            case 3338:
                if (string.equals("hr")) {
                    c8 = '\r';
                    break;
                }
                c8 = 65535;
                break;
            case 3341:
                if (string.equals("hu")) {
                    c8 = 14;
                    break;
                }
                c8 = 65535;
                break;
            case 3365:
                if (string.equals("in")) {
                    c8 = 15;
                    break;
                }
                c8 = 65535;
                break;
            case 3371:
                if (string.equals("it")) {
                    c8 = 16;
                    break;
                }
                c8 = 65535;
                break;
            case 3383:
                if (string.equals("ja")) {
                    c8 = 17;
                    break;
                }
                c8 = 65535;
                break;
            case 3428:
                if (string.equals("ko")) {
                    c8 = 18;
                    break;
                }
                c8 = 65535;
                break;
            case 3494:
                if (string.equals("ms")) {
                    c8 = 19;
                    break;
                }
                c8 = 65535;
                break;
            case 3518:
                if (string.equals("nl")) {
                    c8 = 20;
                    break;
                }
                c8 = 65535;
                break;
            case 3580:
                if (string.equals("pl")) {
                    c8 = 21;
                    break;
                }
                c8 = 65535;
                break;
            case 3588:
                if (string.equals("pt")) {
                    c8 = 22;
                    break;
                }
                c8 = 65535;
                break;
            case 3645:
                if (string.equals("ro")) {
                    c8 = 23;
                    break;
                }
                c8 = 65535;
                break;
            case 3651:
                if (string.equals("ru")) {
                    c8 = 24;
                    break;
                }
                c8 = 65535;
                break;
            case 3672:
                if (string.equals("sk")) {
                    c8 = 25;
                    break;
                }
                c8 = 65535;
                break;
            case 3673:
                if (string.equals("sl")) {
                    c8 = 26;
                    break;
                }
                c8 = 65535;
                break;
            case 3710:
                if (string.equals("tr")) {
                    c8 = 27;
                    break;
                }
                c8 = 65535;
                break;
            case 3734:
                if (string.equals("uk")) {
                    c8 = 28;
                    break;
                }
                c8 = 65535;
                break;
            case 3763:
                if (string.equals("vi")) {
                    c8 = 29;
                    break;
                }
                c8 = 65535;
                break;
            case 3886:
                if (string.equals("zh")) {
                    c8 = 30;
                    break;
                }
                c8 = 65535;
                break;
            case 115861812:
                if (string.equals("zh_TW")) {
                    c8 = 31;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                this.f4108d0.setSelection(12);
                iArr[0] = 0;
                break;
            case 1:
                this.f4108d0.setSelection(18);
                iArr[0] = 0;
                break;
            case 2:
                this.f4108d0.setSelection(30);
                iArr[0] = 0;
                break;
            case 3:
                this.f4108d0.setSelection(26);
                iArr[0] = 0;
                break;
            case 4:
                this.f4108d0.setSelection(8);
                iArr[0] = 0;
                break;
            case 5:
                this.f4108d0.setSelection(11);
                iArr[0] = 0;
                break;
            case 6:
                this.f4108d0.setSelection(14);
                iArr[0] = 0;
                break;
            case 7:
                this.f4108d0.setSelection(24);
                iArr[0] = 0;
                break;
            case '\b':
                this.f4108d0.setSelection(0);
                iArr[0] = 0;
                break;
            case '\t':
                this.f4108d0.setSelection(4);
                iArr[0] = 0;
                break;
            case '\n':
                this.f4108d0.setSelection(7);
                iArr[0] = 0;
                break;
            case 11:
                this.f4108d0.setSelection(6);
                iArr[0] = 0;
                break;
            case '\f':
                this.f4108d0.setSelection(19);
                iArr[0] = 0;
                break;
            case '\r':
                this.f4108d0.setSelection(25);
                iArr[0] = 0;
                break;
            case 14:
                this.f4108d0.setSelection(16);
                iArr[0] = 0;
                break;
            case 15:
                this.f4108d0.setSelection(13);
                iArr[0] = 0;
                break;
            case 16:
                this.f4108d0.setSelection(1);
                iArr[0] = 0;
                break;
            case 17:
                this.f4108d0.setSelection(20);
                iArr[0] = 0;
                break;
            case 18:
                this.f4108d0.setSelection(29);
                iArr[0] = 0;
                break;
            case 19:
                this.f4108d0.setSelection(27);
                iArr[0] = 0;
                break;
            case 20:
                this.f4108d0.setSelection(21);
                iArr[0] = 0;
                break;
            case 21:
                this.f4108d0.setSelection(15);
                iArr[0] = 0;
                break;
            case 22:
                this.f4108d0.setSelection(2);
                iArr[0] = 0;
                break;
            case 23:
                this.f4108d0.setSelection(23);
                iArr[0] = 0;
                break;
            case 24:
                this.f4108d0.setSelection(3);
                iArr[0] = 0;
                break;
            case 25:
                this.f4108d0.setSelection(22);
                iArr[0] = 0;
                break;
            case 26:
                this.f4108d0.setSelection(28);
                iArr[0] = 0;
                break;
            case 27:
                this.f4108d0.setSelection(5);
                iArr[0] = 0;
                break;
            case 28:
                this.f4108d0.setSelection(31);
                iArr[0] = 0;
                break;
            case 29:
                this.f4108d0.setSelection(17);
                iArr[0] = 0;
                break;
            case 30:
                this.f4108d0.setSelection(9);
                iArr[0] = 0;
                break;
            case 31:
                this.f4108d0.setSelection(10);
                iArr[0] = 0;
                break;
        }
        this.f4108d0.setOnItemSelectedListener(new t(iArr));
        t1.i iVar = new t1.i(this.f4126w);
        this.V = iVar;
        this.W = iVar.c("MyEffects", t1.f.class);
        this.X = this.V.c("MyGoals", t1.c.class);
        View findViewById3 = findViewById(R.id.storyline_touch);
        View findViewById4 = findViewById(R.id.characters_touch);
        View findViewById5 = findViewById(R.id.record_touch);
        TextView textView3 = (TextView) findViewById(R.id.story_text);
        TextView textView4 = (TextView) findViewById(R.id.characters_text);
        TextView textView5 = (TextView) findViewById(R.id.record_title);
        TextView textView6 = (TextView) findViewById(R.id.record_1_number);
        TextView textView7 = (TextView) findViewById(R.id.record_1_text);
        TextView textView8 = (TextView) findViewById(R.id.record_2_number);
        TextView textView9 = (TextView) findViewById(R.id.record_2_text);
        TextView textView10 = (TextView) findViewById(R.id.record_3_number);
        TextView textView11 = (TextView) findViewById(R.id.record_3_text);
        textView3.setTypeface(this.f4113i0);
        textView4.setTypeface(this.f4113i0);
        textView5.setTypeface(this.f4113i0);
        textView6.setTypeface(this.f4113i0);
        textView7.setTypeface(this.f4113i0);
        textView8.setTypeface(this.f4113i0);
        textView9.setTypeface(this.f4113i0);
        textView10.setTypeface(this.f4113i0);
        textView11.setTypeface(this.f4113i0);
        String string2 = this.T.getString("RECORD_1_TEXT", getString(R.string.no_record));
        String string3 = this.T.getString("RECORD_2_TEXT", getString(R.string.no_record));
        String string4 = this.T.getString("RECORD_3_TEXT", getString(R.string.no_record));
        textView7.setText(string2);
        textView9.setText(string3);
        textView11.setText(string4);
        findViewById4.setOnClickListener(new u());
        findViewById3.setOnClickListener(new a());
        findViewById5.setOnClickListener(new b());
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            if (((t1.c) obj).b() == 2) {
                i7++;
            }
        }
        ((ProgressBar) findViewById(R.id.progressbar_characters)).setProgress(this.T.getInt("CHAR_NUM", 1));
        ((ProgressBar) findViewById(R.id.progressbar_storyline)).setProgress(i7);
        this.f4127x[0] = findViewById(R.id.view_effect_0);
        this.f4127x[1] = findViewById(R.id.view_effect_1);
        this.f4127x[2] = findViewById(R.id.view_effect_2);
        this.f4127x[3] = findViewById(R.id.view_effect_3);
        TextView textView12 = (TextView) findViewById(R.id.no_effects);
        textView12.setTypeface(this.f4113i0);
        this.f4128y[0] = (TextView) findViewById(R.id.titleEffect0);
        this.f4128y[0].setTypeface(this.f4113i0);
        this.f4128y[1] = (TextView) findViewById(R.id.titleEffect1);
        this.f4128y[1].setTypeface(this.f4113i0);
        this.f4128y[2] = (TextView) findViewById(R.id.titleEffect2);
        this.f4128y[2].setTypeface(this.f4113i0);
        this.f4128y[3] = (TextView) findViewById(R.id.titleEffect3);
        this.f4128y[3].setTypeface(this.f4113i0);
        this.f4129z[0] = (TextView) findViewById(R.id.detailsEffect0);
        this.f4129z[0].setTypeface(this.f4113i0);
        this.f4129z[1] = (TextView) findViewById(R.id.detailsEffect1);
        this.f4129z[1].setTypeface(this.f4113i0);
        this.f4129z[2] = (TextView) findViewById(R.id.detailsEffect2);
        this.f4129z[2].setTypeface(this.f4113i0);
        this.f4129z[3] = (TextView) findViewById(R.id.detailsEffect3);
        this.f4129z[3].setTypeface(this.f4113i0);
        this.A[0] = (ImageView) findViewById(R.id.imageEffect0);
        this.A[1] = (ImageView) findViewById(R.id.imageEffect1);
        this.A[2] = (ImageView) findViewById(R.id.imageEffect2);
        this.A[3] = (ImageView) findViewById(R.id.imageEffect3);
        int[] u7 = u();
        int i9 = 0;
        while (true) {
            View[] viewArr2 = this.f4127x;
            if (i9 >= viewArr2.length) {
                ((TextView) findViewById(R.id.shop_title)).setTypeface(this.f4113i0);
                TextView textView13 = (TextView) findViewById(R.id.item_title_1);
                TextView textView14 = (TextView) findViewById(R.id.item_description_1);
                this.E = (TextView) findViewById(R.id.item_amount_1);
                TextView textView15 = (TextView) findViewById(R.id.item_shop_1x1);
                TextView textView16 = (TextView) findViewById(R.id.item_shop_1x2);
                TextView textView17 = (TextView) findViewById(R.id.item_shop_1x3);
                textView15.setOnClickListener(this.f4119o0);
                textView16.setOnClickListener(this.f4119o0);
                textView17.setOnClickListener(this.f4119o0);
                textView13.setTypeface(this.f4113i0);
                textView14.setTypeface(this.f4113i0);
                this.E.setTypeface(this.f4113i0);
                textView15.setTypeface(this.f4113i0);
                textView16.setTypeface(this.f4113i0);
                textView17.setTypeface(this.f4113i0);
                TextView textView18 = (TextView) findViewById(R.id.item_title_2);
                TextView textView19 = (TextView) findViewById(R.id.item_description_2);
                this.F = (TextView) findViewById(R.id.item_amount_2);
                TextView textView20 = (TextView) findViewById(R.id.item_shop_2x1);
                TextView textView21 = (TextView) findViewById(R.id.item_shop_2x2);
                TextView textView22 = (TextView) findViewById(R.id.item_shop_2x3);
                textView20.setOnClickListener(this.f4119o0);
                textView21.setOnClickListener(this.f4119o0);
                textView22.setOnClickListener(this.f4119o0);
                textView18.setTypeface(this.f4113i0);
                textView19.setTypeface(this.f4113i0);
                this.F.setTypeface(this.f4113i0);
                textView20.setTypeface(this.f4113i0);
                textView21.setTypeface(this.f4113i0);
                textView22.setTypeface(this.f4113i0);
                TextView textView23 = (TextView) findViewById(R.id.item_title_3);
                TextView textView24 = (TextView) findViewById(R.id.item_description_3);
                this.G = (TextView) findViewById(R.id.item_amount_3);
                TextView textView25 = (TextView) findViewById(R.id.item_shop_3x1);
                TextView textView26 = (TextView) findViewById(R.id.item_shop_3x2);
                TextView textView27 = (TextView) findViewById(R.id.item_shop_3x3);
                textView25.setOnClickListener(this.f4119o0);
                textView26.setOnClickListener(this.f4119o0);
                textView27.setOnClickListener(this.f4119o0);
                textView23.setTypeface(this.f4113i0);
                textView24.setTypeface(this.f4113i0);
                this.G.setTypeface(this.f4113i0);
                textView25.setTypeface(this.f4113i0);
                textView26.setTypeface(this.f4113i0);
                textView27.setTypeface(this.f4113i0);
                this.B = this.T.getInt("AMOUNT_ITEM_1", 0);
                this.C = this.T.getInt("AMOUNT_ITEM_2", 0);
                this.D = this.T.getInt("AMOUNT_ITEM_3", 0);
                this.E.setText(getString(R.string.availability) + this.B);
                this.F.setText(getString(R.string.availability) + this.C);
                this.G.setText(getString(R.string.availability) + this.D);
                TextView textView28 = (TextView) findViewById(R.id.music_text);
                textView28.setTypeface(this.f4113i0);
                TextView textView29 = (TextView) findViewById(R.id.effects_text);
                textView29.setTypeface(this.f4113i0);
                AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.music_switch);
                if (!this.f4114j0) {
                    appCompatImageView.setColorFilter(getResources().getColor(R.color.option_text_disabled));
                    textView28.setTextColor(getResources().getColor(R.color.option_text_disabled));
                }
                findViewById(R.id.music_view).setOnClickListener(new c(appCompatImageView, textView28));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.effects_switch);
                if (!this.f4115k0) {
                    appCompatImageView2.setColorFilter(getResources().getColor(R.color.option_text_disabled));
                    textView29.setTextColor(getResources().getColor(R.color.option_text_disabled));
                }
                findViewById(R.id.effects_view).setOnClickListener(new d(appCompatImageView2, textView29));
                Button button = (Button) findViewById(R.id.info_button);
                button.setTypeface(this.f4113i0);
                button.setOnClickListener(new e());
                ((ImageView) findViewById(R.id.close_button)).setOnClickListener(new f());
                r(parseInt, R.raw.opening_options);
                Log.i("optionactivity_inappbilling", "mIsPremium: " + this.f4112h0);
                this.f4112h0 = this.T.getBoolean("PREMIUM_VERSION", this.f4112h0);
                Log.i("optionactivity_inappbilling", "mIsPremium: " + this.f4112h0);
                if (!this.f4112h0) {
                    w();
                    return;
                }
                this.f4109e0.setVisibility(8);
                this.f4111g0.setVisibility(8);
                this.f4110f0.setVisibility(8);
                this.H.setVisibility(4);
                return;
            }
            switch (u7[i9]) {
                case 0:
                    viewArr2[i9].setVisibility(8);
                    break;
                case 1:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_radar));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_radar));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.radar));
                    break;
                case 2:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_antiradiation));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_antiradiation));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.antiradiation));
                    break;
                case 3:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_time));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_time));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.time));
                    break;
                case 4:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_lover));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_lover));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.lover));
                    break;
                case 5:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_euro));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_euro));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.euro));
                    break;
                case 6:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_church));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_church));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.church));
                    break;
                case 7:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_fox));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_fox));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.fox));
                    break;
                case 8:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_virus));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_virus));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.virus));
                    break;
                case 9:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_cobra));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_cobra));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.cobra));
                    break;
                case 10:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_oracle));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_oracle));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.oracle));
                    break;
                case 11:
                    textView12.setVisibility(8);
                    this.f4127x[i9].setVisibility(0);
                    this.f4128y[i9].setText(getResources().getString(R.string.title_war));
                    this.f4129z[i9].setText(getResources().getString(R.string.details_war));
                    this.A[i9].setImageDrawable(getResources().getDrawable(R.drawable.war));
                    break;
            }
            i9++;
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            this.f4122s.d();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        try {
            this.f4122s.e();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            getWindow().getDecorView().setSystemUiVisibility(5126);
        }
    }

    public void r(int i7, int i8) {
        C(i8);
        for (int i9 = 0; i9 < 3; i9++) {
            if (i9 == i7) {
                this.P[i9].setVisibility(0);
                this.Q[i9].setColorFilter(getResources().getColor(R.color.option_text_enabled));
                this.S.setText(this.R[i9]);
            } else {
                this.P[i9].setVisibility(4);
                this.Q[i9].setColorFilter(getResources().getColor(R.color.colorAccent));
            }
        }
    }

    @Override // m3.e
    public void r0(Bundle bundle) {
        this.f4121r.setText(getResources().getString(R.string.play_games_logout));
    }

    public int[] u() {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        for (int i7 = 0; i7 < this.W.size(); i7++) {
            if (i7 < 4) {
                iArr[i7] = ((t1.f) this.W.get(i7)).b();
            }
        }
        return iArr;
    }

    public PackageInfo v() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public boolean y(int i7, int i8) {
        SharedPreferences.Editor edit = this.T.edit();
        this.U = edit;
        if (i7 == 1) {
            int i9 = this.B + i8;
            this.B = i9;
            edit.putInt("AMOUNT_ITEM_1", i9);
        } else if (i7 == 2) {
            int i10 = this.C + i8;
            this.C = i10;
            edit.putInt("AMOUNT_ITEM_2", i10);
        } else if (i7 == 3) {
            int i11 = this.D + i8;
            this.D = i11;
            edit.putInt("AMOUNT_ITEM_3", i11);
        }
        this.E.setText(((Object) getResources().getText(R.string.availability)) + "" + this.B);
        this.F.setText(((Object) getResources().getText(R.string.availability)) + "" + this.C);
        this.G.setText(((Object) getResources().getText(R.string.availability)) + "" + this.D);
        this.U.apply();
        return true;
    }

    /* compiled from: MyApplication */
    class m implements p1.d {
        m() {
        }

        @Override // p1.d
        public void a(com.android.billingclient.api.d dVar) {
            if (dVar.c() == 0) {
                Log.i("optionactivity_inappbilling", "Connection Success");
                OptionActivity.this.D();
            }
        }

        @Override // p1.d
        public void b() {
        }
    }

    /* compiled from: MyApplication */
    class t implements AdapterView.OnItemSelectedListener {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int[] f4154q;

        t(int[] iArr) {
            this.f4154q = iArr;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            int[] iArr = this.f4154q;
            int i8 = iArr[0] + 1;
            iArr[0] = i8;
            if (i8 > 1) {
                switch (i7) {
                    case 0:
                        com.nabil.utilities.e.d(OptionActivity.this, "en");
                        this.f4154q[0] = 0;
                        OptionActivity.this.E();
                        break;
                    case 1:
                        com.nabil.utilities.e.d(OptionActivity.this, "it");
                        OptionActivity.this.E();
                        break;
                    case 2:
                        com.nabil.utilities.e.d(OptionActivity.this, "pt");
                        OptionActivity.this.E();
                        break;
                    case 3:
                        com.nabil.utilities.e.d(OptionActivity.this, "ru");
                        OptionActivity.this.E();
                        break;
                    case 4:
                        com.nabil.utilities.e.d(OptionActivity.this, "es");
                        OptionActivity.this.E();
                        break;
                    case 5:
                        com.nabil.utilities.e.d(OptionActivity.this, "tr");
                        OptionActivity.this.E();
                        break;
                    case 6:
                        com.nabil.utilities.e.d(OptionActivity.this, "fr");
                        OptionActivity.this.E();
                        break;
                    case 7:
                        com.nabil.utilities.e.d(OptionActivity.this, "fi");
                        OptionActivity.this.E();
                        break;
                    case 8:
                        com.nabil.utilities.e.d(OptionActivity.this, "bn");
                        OptionActivity.this.E();
                        break;
                    case 9:
                        com.nabil.utilities.e.d(OptionActivity.this, "zh");
                        OptionActivity.this.E();
                        break;
                    case 10:
                        com.nabil.utilities.e.d(OptionActivity.this, "zh_TW");
                        OptionActivity.this.E();
                        break;
                    case 11:
                        com.nabil.utilities.e.d(OptionActivity.this, "cs");
                        OptionActivity.this.E();
                        break;
                    case 12:
                        com.nabil.utilities.e.d(OptionActivity.this, "af");
                        OptionActivity.this.E();
                        break;
                    case 13:
                        com.nabil.utilities.e.d(OptionActivity.this, "in");
                        OptionActivity.this.E();
                        break;
                    case 14:
                        com.nabil.utilities.e.d(OptionActivity.this, "de");
                        OptionActivity.this.E();
                        break;
                    case 15:
                        com.nabil.utilities.e.d(OptionActivity.this, "pl");
                        OptionActivity.this.E();
                        break;
                    case 16:
                        com.nabil.utilities.e.d(OptionActivity.this, "hu");
                        OptionActivity.this.E();
                        break;
                    case 17:
                        com.nabil.utilities.e.d(OptionActivity.this, "vi");
                        OptionActivity.this.E();
                        break;
                    case 18:
                        com.nabil.utilities.e.d(OptionActivity.this, "ar");
                        OptionActivity.this.E();
                        break;
                    case 19:
                        com.nabil.utilities.e.d(OptionActivity.this, "hi");
                        OptionActivity.this.E();
                        break;
                    case 20:
                        com.nabil.utilities.e.d(OptionActivity.this, "ja");
                        OptionActivity.this.E();
                        break;
                    case 21:
                        com.nabil.utilities.e.d(OptionActivity.this, "nl");
                        OptionActivity.this.E();
                        break;
                    case 22:
                        com.nabil.utilities.e.d(OptionActivity.this, "sk");
                        OptionActivity.this.E();
                        break;
                    case 23:
                        com.nabil.utilities.e.d(OptionActivity.this, "ro");
                        OptionActivity.this.E();
                        break;
                    case 24:
                        com.nabil.utilities.e.d(OptionActivity.this, "el");
                        OptionActivity.this.E();
                        break;
                    case 25:
                        com.nabil.utilities.e.d(OptionActivity.this, "hr");
                        OptionActivity.this.E();
                        break;
                    case 26:
                        com.nabil.utilities.e.d(OptionActivity.this, "bg");
                        OptionActivity.this.E();
                        break;
                    case 27:
                        com.nabil.utilities.e.d(OptionActivity.this, "ms");
                        OptionActivity.this.E();
                        break;
                    case 28:
                        com.nabil.utilities.e.d(OptionActivity.this, "sl");
                        OptionActivity.this.E();
                        break;
                    case 29:
                        com.nabil.utilities.e.d(OptionActivity.this, "ko");
                        OptionActivity.this.E();
                        break;
                    case 30:
                        com.nabil.utilities.e.d(OptionActivity.this, "az");
                        OptionActivity.this.E();
                        break;
                    case 31:
                        com.nabil.utilities.e.d(OptionActivity.this, "uk");
                        OptionActivity.this.E();
                        break;
                }
                OptionActivity.this.T.edit().putInt("LANG_POS", OptionActivity.this.f4108d0.getSelectedItemPosition()).commit();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }
}
