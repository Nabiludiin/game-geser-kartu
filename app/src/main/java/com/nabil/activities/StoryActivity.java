package com.nabil.activities;

import androidx.core.content.ContextCompat;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.UnfetchedProduct;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.nabil.R;
import com.nabil.activities.StoryActivity;
import com.nabil.swipedeck.SwipeDeck;
import com.nabil.utilities.MusicService;
import com.nabil.utilities.GamesClient;
import com.nabil.utilities.MyScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StoryActivity extends androidx.appcompat.app.AppCompatActivity implements View.OnClickListener, GamesClient.Callbacks {
    TextView A0;
    TextView B0;
    TextView C0;
    TextView D0;
    TextView E0;
    TextView F0;
    CountDownTimer G0;
    boolean H0;
    private GamesClient I;
    MediaPlayer I0;
    private RewardedAd J;
    private boolean K;
    private MusicService L0;
    BillingClient N0;
    private ArrayList O0;
    t1.e Q;
    private boolean f_R;
    private int S;
    com.nabil.utilities.f T;
    boolean X;
    boolean Z;

    boolean f4167a0;

    boolean f4168b0;

    private int f4169c0;

    private FrameLayout.LayoutParams f4170d0;

    private FrameLayout.LayoutParams f4171e0;

    private FrameLayout.LayoutParams f4172f0;

    private FrameLayout.LayoutParams f4173g0;

    private Activity f4174h0;

    private t1.a f4175i0;

    private SharedPreferences f4176j0;

    SharedPreferences.Editor f4177k0;

    View f4178l0;

    View f4179m0;

    ImageView f4182p0;

    ImageView f4183q0;

    ImageView f4184r0;

    MyScrollView f4185s0;

    TextView f4186t0;

    TextView f4187u0;

    SwipeDeck f4188v0;

    ArrayList f4189w0;

    u1.a f4190x0;

    View f4191y0;

    Typeface f4192z0;
    int H = 0;
    private String L = "ca-app-pub-3940256099942544/5224354917";
    private String M = "ca-app-pub-7665600901089938/2870884852";
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean U = false;
    private int V = 0;
    private int W = 0;
    ImageView[] Y = new ImageView[4];

    View[] f4180n0 = new View[4];

    View[] f4181o0 = new View[4];
    Intent J0 = new Intent();
    private boolean K0 = false;
    private ServiceConnection M0 = new i();
    private Map P0 = new HashMap();
    boolean Q0 = false;
    boolean R0 = false;
    int[] S0 = null;
    t1.g T0 = null;
    private int U0 = 8;

    class a implements ValueAnimator.AnimatorUpdateListener {

        final float[] f4193a;

        final float[] f4194b;

        final float[] f4195c;

        final View f4196d;

        a(float[] fArr, float[] fArr2, float[] fArr3, View view) {
            this.f4193a = fArr;
            this.f4194b = fArr2;
            this.f4195c = fArr3;
            this.f4196d = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr = this.f4193a;
            float f8 = this.f4194b[0];
            fArr[0] = f8 + ((this.f4195c[0] - f8) * valueAnimator.getAnimatedFraction());
            float[] fArr2 = this.f4193a;
            float f9 = this.f4194b[1];
            fArr2[1] = f9 + ((this.f4195c[1] - f9) * valueAnimator.getAnimatedFraction());
            float[] fArr3 = this.f4193a;
            float f10 = this.f4194b[2];
            fArr3[2] = f10 + ((this.f4195c[2] - f10) * valueAnimator.getAnimatedFraction());
            this.f4196d.setBackgroundColor(Color.HSVToColor(this.f4193a));
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        final float[] f4198a;

        final float[] f4199b;

        final float[] f4200c;

        final View f4201d;

        b(float[] fArr, float[] fArr2, float[] fArr3, View view) {
            this.f4198a = fArr;
            this.f4199b = fArr2;
            this.f4200c = fArr3;
            this.f4201d = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr = this.f4198a;
            float f8 = this.f4199b[0];
            fArr[0] = f8 + ((this.f4200c[0] - f8) * valueAnimator.getAnimatedFraction());
            float[] fArr2 = this.f4198a;
            float f9 = this.f4199b[1];
            fArr2[1] = f9 + ((this.f4200c[1] - f9) * valueAnimator.getAnimatedFraction());
            float[] fArr3 = this.f4198a;
            float f10 = this.f4199b[2];
            fArr3[2] = f10 + ((this.f4200c[2] - f10) * valueAnimator.getAnimatedFraction());
            this.f4201d.setBackgroundColor(Color.HSVToColor(this.f4198a));
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoryActivity.this.w0();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoryActivity.this.q0();
        }
    }

    class e extends RewardedAdLoadCallback {

        class a extends FullScreenContentCallback {
            a() {
            }

            @Override
            public void onAdClicked() {
                Log.d("TAG", "Ad was clicked.");
            }

            @Override
            public void onAdDismissedFullScreenContent() {
                Log.d("TAG", "Ad dismissed fullscreen content.");
                StoryActivity.this.J = null;
                StoryActivity.this.v0();
            }

            @Override
            public void onAdFailedToShowFullScreenContent(AdError bVar) {
                Log.e("TAG", "Ad failed to show fullscreen content.");
                StoryActivity.this.J = null;
                StoryActivity.this.v0();
            }

            @Override
            public void onAdImpression() {
                Log.d("TAG", "Ad recorded an impression.");
            }

            @Override
            public void onAdShowedFullScreenContent() {
                Log.d("TAG", "Ad showed fullscreen content.");
            }
        }

        e() {
        }

        @Override
        public void onAdFailedToLoad(LoadAdError mVar) {
            Log.d("TAG", mVar.toString());
            StoryActivity.this.J = null;
        }

        @Override
        public void onAdLoaded(RewardedAd cVar) {
            StoryActivity.this.J = cVar;
            Log.d("TAG", "Ad was loaded.");
            StoryActivity.this.J.setFullScreenContentCallback(new a());
        }
    }

    class f implements PurchasesUpdatedListener {
        f() {
        }

        @Override
        public void onPurchasesUpdated(BillingResult dVar, List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    Log.d("storyactivity", purchase.toString());
                    StoryActivity.this.o0(purchase);
                }
            }
        }
    }

    class h implements ConsumeResponseListener {

        final Purchase f4209a;

        h(Purchase purchase) {
            this.f4209a = purchase;
        }

        @Override
        public void onConsumeResponse(BillingResult dVar, String str) {
            Log.d("Tag2", "onConsumeResponse started");
            Log.d("Tag3", "BillingResponseCode is " + dVar.getResponseCode());
            if (dVar.getResponseCode() == 0) {
                Log.d("Tag4", "ids: " + this.f4209a.getProducts().toString());
            }
        }
    }

    class i implements ServiceConnection {
        i() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StoryActivity.this.L0 = ((MusicService.a) iBinder).a();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            StoryActivity.this.L0 = null;
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoryActivity.this.w0();
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoryActivity.this.q0();
        }
    }

    class l implements SwipeDeck.d {
        l() {
        }

        @Override // com.nabil.swipedeck.SwipeDeck.d
        public void a(long j7) {
            StoryActivity.this.h0(1);
            Log.i("MainActivity", "card was swiped left, position: " + j7);
        }

        @Override // com.nabil.swipedeck.SwipeDeck.d
        public boolean b(long j7) {
            Log.i("MainActivity", "drag enabled " + j7);
            return true;
        }

        @Override // com.nabil.swipedeck.SwipeDeck.d
        public void c(long j7) {
            StoryActivity.this.h0(0);
            Log.i("MainActivity", "card was swiped right, position: " + j7);
        }
    }

    class n implements OnUserEarnedRewardListener {
        n() {
        }

        @Override
        public void onUserEarnedReward(RewardItem bVar) {
            Log.d("TAG", "The user earned the reward.");
            bVar.getAmount();
            bVar.getType();
            StoryActivity.this.K = true;
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoryActivity.this.w0();
        }
    }

    class p implements MediaPlayer.OnCompletionListener {
        p() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    class q implements ValueAnimator.AnimatorUpdateListener {

        final float[] f4220a;

        final float[] f4221b;

        final float[] f4222c;

        final View f4223d;

        q(float[] fArr, float[] fArr2, float[] fArr3, View view) {
            this.f4220a = fArr;
            this.f4221b = fArr2;
            this.f4222c = fArr3;
            this.f4223d = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr = this.f4220a;
            float f8 = this.f4221b[0];
            fArr[0] = f8 + ((this.f4222c[0] - f8) * valueAnimator.getAnimatedFraction());
            float[] fArr2 = this.f4220a;
            float f9 = this.f4221b[1];
            fArr2[1] = f9 + ((this.f4222c[1] - f9) * valueAnimator.getAnimatedFraction());
            float[] fArr3 = this.f4220a;
            float f10 = this.f4221b[2];
            fArr3[2] = f10 + ((this.f4222c[2] - f10) * valueAnimator.getAnimatedFraction());
            this.f4223d.setBackgroundColor(Color.HSVToColor(this.f4220a));
        }
    }

    public static void X(StoryActivity storyActivity, BillingResult dVar) {
        storyActivity.getClass();
        if (dVar.getResponseCode() == 0) {
            storyActivity.Q0 = true;
            SharedPreferences.Editor edit = storyActivity.f4176j0.edit();
            storyActivity.f4177k0 = edit;
            edit.putBoolean("PREMIUM_VERSION", storyActivity.Q0);
            storyActivity.f4177k0.apply();
            Log.d("Tag", "Acknowledged ad free version");
            Toast.makeText(storyActivity.f4174h0, storyActivity.getString(R.string.ads_removed), 0).show();
        }
    }

    public static void Y(StoryActivity storyActivity, BillingResult dVar, QueryProductDetailsResult hVar) {
        storyActivity.getClass();
        if (dVar.getResponseCode() == 0) {
            storyActivity.P0.clear();
            for (ProductDetails fVar : hVar.getProductDetailsList()) {
                Log.i("queryProductDetails: ", fVar + "");
                storyActivity.P0.put(fVar.getProductId(), fVar);
            }
            for (UnfetchedProduct iVar : hVar.getUnfetchedProductList()) {
            }
        }
    }

    private void k0() {
        this.N0.startConnection(new g());
    }

    public void o0(Purchase purchase) {
        if (purchase.getPurchaseState() != 1 || purchase.isAcknowledged()) {
            return;
        }
        Log.d("Tag 1", "handlePurchase started");
        ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        new h(purchase);
        String str = (String) purchase.getProducts().get(0);
        str.getClass();
        if (!str.equals("ads_free_version_2") && !str.equals("ads_free_version")) {
            Toast.makeText(this.f4174h0, "Error purchase 03, please contact the developer", 1).show();
        } else {
            this.N0.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgePurchaseResponseListener() { // from class: r1.e
                @Override
                public final void onAcknowledgePurchaseResponse(BillingResult dVar) {
                    StoryActivity.X(StoryActivity.this, dVar);
                }
            });
        }
    }

    private void p0() {
        Log.i("storyactivity", "initializeBillingClient");
        f fVar = new f();
        this.N0 = BillingClient.newBuilder(this).setListener(fVar).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).enableAutoServiceReconnection().build();
    }

    public static boolean s0(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3 && ((double) (((float) displayMetrics.heightPixels) / ((float) displayMetrics.widthPixels))) < 1.6d;
    }

    private void t0(String str) {
        List a8;
        ProductDetails fVar = (ProductDetails) this.P0.get(str);
        if (fVar == null) {
            Toast.makeText(this, "Prodotto non disponibile", 0).show();
            return;
        }
        a8 = java.util.Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(fVar).build());
        this.N0.launchBillingFlow(this, BillingFlowParams.newBuilder().setProductDetailsParamsList(a8).build());
    }

    private ArrayList u0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ads_free_version");
        arrayList.add("item_1x1");
        arrayList.add("item_1x2");
        arrayList.add("item_1x3");
        arrayList.add("item_2x1");
        arrayList.add("item_3x1");
        arrayList.add("item_3x2");
        arrayList.add("item_3x3");
        return arrayList;
    }

    public void v0() {
        RewardedAd.load(this, this.M, new AdRequest.Builder().build(), new e());
    }

    public void y0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) obj).setProductType("inapp").build());
        }
        this.N0.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new ProductDetailsResponseListener() { // from class: r1.f
            @Override
            public final void onProductDetailsResponse(BillingResult dVar, QueryProductDetailsResult hVar) {
                StoryActivity.Y(StoryActivity.this, dVar, hVar);
            }
        });
    }

    public void A0(int i7) {
        if (i7 != 32 && i7 != 119) {
            x0(R.raw.new_effect);
        }
        this.H0 = true;
        this.G0.start();
        View findViewById = findViewById(R.id.event_new_effect);
        ((TextView) findViewById(R.id.titleEffect)).setText(getResources().getString(R.string.new_cards));
        TextView textView = (TextView) findViewById(R.id.detailsEffect);
        switch (i7) {
            case 1:
                textView.setText(getResources().getString(R.string.event_1));
                break;
            case 10:
                textView.setText(getResources().getString(R.string.event_10));
            case 18:
                textView.setText(getResources().getString(R.string.event_18));
                break;
            case 32:
                textView.setText(getResources().getString(R.string.event_32));
                break;
            case 36:
                textView.setText(getResources().getString(R.string.event_36));
                break;
            case 78:
                textView.setText(getResources().getString(R.string.event_78));
                break;
            case 91:
                textView.setText(getResources().getString(R.string.event_91));
                break;
            case 93:
                textView.setText(getResources().getString(R.string.event_93));
                break;
            case 119:
                textView.setText(getResources().getString(R.string.event_119));
                break;
            case 136:
                textView.setText(getResources().getString(R.string.event_136));
                break;
            case 142:
                textView.setText(getResources().getString(R.string.event_142));
                break;
            case 146:
                textView.setText(getResources().getString(R.string.event_146));
                break;
            case 190:
                textView.setText(getResources().getString(R.string.event_190));
                break;
            case 192:
                textView.setText(getResources().getString(R.string.event_192));
                break;
            case 214:
                textView.setText(getResources().getString(R.string.event_214));
                break;
            case 235:
                textView.setText(getResources().getString(R.string.event_235));
                break;
            case 240:
                textView.setText(getResources().getString(R.string.event_240));
                break;
            case 264:
                textView.setText(getResources().getString(R.string.event_264));
                break;
            case 270:
                textView.setText(getResources().getString(R.string.event_270));
                break;
            case 277:
                textView.setText(getResources().getString(R.string.event_277));
                break;
            case 323:
                textView.setText(getResources().getString(R.string.goal_323));
                break;
            case 336:
                textView.setText(getResources().getString(R.string.goal_336));
                break;
            case 361:
                textView.setText(getResources().getString(R.string.goal_361));
                break;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_entry);
        loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        loadAnimation.setFillAfter(true);
        findViewById.startAnimation(loadAnimation);
        new Handler().postDelayed(new o(), 1000L);
    }

    public void B0(int i7) {
        this.f4189w0.add(this.f4175i0.n0(i7));
    }

    public void C0() {
        int[] q7 = this.f4175i0.q(0);
        int[] q8 = this.f4175i0.q(1);
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = q7[i7];
            if (i8 == 0) {
                this.f4180n0[i7].setVisibility(4);
            } else if (i8 == 0 || Math.abs(i8) >= 20) {
                int i9 = q7[i7];
                if (i9 != 0 && Math.abs(i9) >= 20) {
                    this.f4180n0[i7].setVisibility(0);
                    this.f4180n0[i7].setLayoutParams(this.f4171e0);
                }
            } else {
                this.f4180n0[i7].setVisibility(0);
                this.f4180n0[i7].setLayoutParams(this.f4170d0);
            }
            int i10 = q8[i7];
            if (i10 == 0) {
                this.f4181o0[i7].setVisibility(4);
            } else if (i10 == 0 || Math.abs(i10) >= 20) {
                int i11 = q8[i7];
                if (i11 != 0 && Math.abs(i11) >= 20) {
                    this.f4181o0[i7].setVisibility(0);
                    this.f4181o0[i7].setLayoutParams(this.f4171e0);
                }
            } else {
                this.f4181o0[i7].setVisibility(0);
                this.f4181o0[i7].setLayoutParams(this.f4170d0);
            }
            if (this.f4175i0.F(10)) {
                int i12 = q7[i7];
                if (i12 <= -20) {
                    this.f4180n0[i7].setBackgroundResource(R.drawable.circle_design_red);
                    this.f4180n0[i7].setLayoutParams(this.f4173g0);
                } else if (i12 < 0) {
                    this.f4180n0[i7].setBackgroundResource(R.drawable.circle_design_red);
                    this.f4180n0[i7].setLayoutParams(this.f4172f0);
                } else if (i12 >= 20) {
                    this.f4180n0[i7].setBackgroundResource(R.drawable.circle_design_green);
                    this.f4180n0[i7].setLayoutParams(this.f4173g0);
                } else if (i12 > 0) {
                    this.f4180n0[i7].setBackgroundResource(R.drawable.circle_design_green);
                    this.f4180n0[i7].setLayoutParams(this.f4172f0);
                }
                int i13 = q8[i7];
                if (i13 <= -20) {
                    this.f4181o0[i7].setBackgroundResource(R.drawable.circle_design_red);
                    this.f4181o0[i7].setLayoutParams(this.f4173g0);
                } else if (i13 < 0) {
                    this.f4181o0[i7].setBackgroundResource(R.drawable.circle_design_red);
                    this.f4181o0[i7].setLayoutParams(this.f4172f0);
                } else if (i13 >= 20) {
                    this.f4181o0[i7].setBackgroundResource(R.drawable.circle_design_green);
                    this.f4181o0[i7].setLayoutParams(this.f4173g0);
                } else if (i13 > 0) {
                    this.f4181o0[i7].setBackgroundResource(R.drawable.circle_design_green);
                    this.f4181o0[i7].setLayoutParams(this.f4172f0);
                }
            } else if (this.f4175i0.G()) {
                this.f4180n0[i7].setBackgroundResource(R.drawable.circle_design);
                this.f4181o0[i7].setBackgroundResource(R.drawable.circle_design);
            }
        }
    }

    public void D0() {
        x0(R.raw.end_effect_try);
        View findViewById = findViewById(R.id.activity_story);
        findViewById.setBackgroundColor(ContextCompat.getColor(this, R.color.dead_background));
        this.f4186t0.setTextColor(ContextCompat.getColor(this, R.color.stats_full));
        this.f4187u0.setTextColor(ContextCompat.getColor(this, R.color.stats_full));
        float[] fArr = new float[3];
        float[] fArr2 = new float[3];
        Color.colorToHSV(this.f4174h0.getResources().getColor(R.color.main_background), fArr);
        Color.colorToHSV(this.f4174h0.getResources().getColor(R.color.dead_background), fArr2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.addUpdateListener(new b(new float[3], fArr, fArr2, findViewById));
        ofFloat.start();
        if (this.f4176j0.getBoolean("MUSIC", true)) {
            this.L0.d();
            this.L0.c(R.raw.thewinterlegion);
            this.L0.a();
        }
        this.f4189w0.add(this.f4175i0.t(0));
        C0();
        this.U = true;
        this.f4175i0.h();
        this.f4175i0.c0();
        this.f4177k0 = this.f4176j0.edit();
        this.f4175i0.d0();
        t1.a aVar = this.f4175i0;
        aVar.m0(aVar.w() + 1);
        this.f4177k0.putBoolean("SHOW_ENDING", true);
        this.f4177k0.apply();
    }

    public void E0(int i7) {
        x0(R.raw.death_sound);
        View findViewById = findViewById(R.id.activity_story);
        findViewById.setBackgroundColor(ContextCompat.getColor(this, R.color.dead_background));
        this.f4186t0.setTextColor(ContextCompat.getColor(this, R.color.stats_full));
        this.f4187u0.setTextColor(ContextCompat.getColor(this, R.color.stats_full));
        float[] fArr = new float[3];
        float[] fArr2 = new float[3];
        Color.colorToHSV(this.f4174h0.getResources().getColor(R.color.main_background), fArr);
        Color.colorToHSV(this.f4174h0.getResources().getColor(R.color.dead_background), fArr2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.addUpdateListener(new q(new float[3], fArr, fArr2, findViewById));
        ofFloat.start();
        this.f4189w0.add(this.f4175i0.k(i7));
        C0();
        if (this.f4176j0.getInt("AMOUNT_ITEM_1", 0) > 0 && !this.f4175i0.M()) {
            this.Z = true;
            return;
        }
        this.U = true;
        this.f4175i0.h();
        this.f4175i0.c0();
        this.f4177k0 = this.f4176j0.edit();
        this.f4175i0.d0();
        t1.a aVar = this.f4175i0;
        aVar.m0(aVar.w() + 1);
        this.f4177k0.putBoolean("FIRST_INTRO_FINISHED", false);
        this.f4177k0.putBoolean("SECOND_INTRO_FINISHED", false);
        if (!this.f4176j0.getBoolean("IS_FIRST_DEATH", false)) {
            this.f4177k0.putBoolean("IS_FIRST_DEATH", true);
            this.f4175i0.o0("CgkIkMOR47gLEAIQCw");
        }
        this.f4177k0.apply();
        try {
            if (this.I != null) {
                this.I.submitScore("CgkIkMOR47gLEAIQCA", this.f4175i0.j());
            }
        } catch (Exception unused) {
        }
        this.f4175i0.g();
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(com.nabil.utilities.e.b(context, context.getString(R.string.prefix)));
    }

    public void h0(int i7) {
        int i8;
        x0(R.raw.use_card);
        if (!this.f_R && this.S <= 1) {
            this.f4189w0.add(this.Q.a(i7));
            this.f_R = this.Q.c();
            return;
        }
        if (this.f4175i0.E() && i7 == 0) {
            try {
                t0("ads_free_version_2");
            } catch (Exception unused) {
            }
        }
        if (this.f4175i0.D() && i7 == 0) {
            try {
                RewardedAd cVar = this.J;
                if (cVar != null) {
                    cVar.show(this, new n());
                } else {
                    Log.d("TAG", "The rewarded ad wasn't ready yet.");
                }
            } catch (Exception unused2) {
            }
        }
        if (this.Z) {
            this.f4189w0.add(this.f4175i0.e0());
            C0();
            this.f4167a0 = true;
            this.Z = false;
            return;
        }
        if (this.f4167a0) {
            if (i7 == 0) {
                int[] iArr = {50, 50, 50, 50};
                this.T.u(iArr);
                this.f4175i0.l0(iArr);
                this.f4189w0.add(this.f4175i0.p());
                C0();
                this.f4186t0.setTextColor(getResources().getColor(R.color.main_text));
                this.f4187u0.setTextColor(getResources().getColor(R.color.main_text));
                i0(R.color.dead_background, R.color.main_background);
                x0(R.raw.new_effect);
                this.V = 0;
                this.W = 0;
                this.f4167a0 = false;
                SharedPreferences.Editor edit = this.f4176j0.edit();
                this.f4177k0 = edit;
                edit.putInt("AMOUNT_ITEM_1", this.f4176j0.getInt("AMOUNT_ITEM_1", 0) - 1);
                this.f4177k0.apply();
                return;
            }
            this.U = true;
            this.f4175i0.h();
            this.f4175i0.c0();
            this.f4175i0.d0();
            t1.a aVar = this.f4175i0;
            aVar.m0(aVar.w() + 1);
        }
        if (this.U) {
            Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
            intent.putExtra("adsActive", 1);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            return;
        }
        if (this.f4168b0) {
            this.f4189w0.add(this.Q.a(i7));
            if (this.Q.b()) {
                startActivity(new Intent(this, (Class<?>) HomeActivity.class));
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
                return;
            }
            return;
        }
        if (this.f4175i0.i() != null) {
            if (i7 == 0) {
                t1.a aVar2 = this.f4175i0;
                i8 = aVar2.V(aVar2.q(0));
            } else {
                t1.a aVar3 = this.f4175i0;
                i8 = aVar3.V(aVar3.q(1));
            }
            this.T.u(this.f4175i0.u());
        } else {
            i8 = 0;
        }
        if (this.f4175i0.G()) {
            z0();
        }
        if (this.f4175i0.M()) {
            D0();
        } else if (this.f4175i0.s() != 0) {
            E0(this.f4175i0.s());
            this.f4175i0.k0(0);
        } else if (this.f4175i0.K() && this.f4175i0.i().j() == 413) {
            this.f4189w0.add(this.f4175i0.y(this.K));
        } else if (this.f4175i0.K()) {
            if (i7 == 0) {
                this.f4189w0.add(this.f4175i0.t(0));
            } else {
                this.f4189w0.add(this.f4175i0.t(1));
            }
            if (this.X && !this.f4175i0.J()) {
                j0(R.color.sidebar_text);
                i0(R.color.main_background_geser, R.color.main_background);
                x0(R.raw.new_effect);
                if (this.f4176j0.getBoolean("MUSIC", true)) {
                    this.L0.d();
                    this.L0.c(R.raw.thewinterlegion);
                }
                this.X = false;
            } else if (!this.X && this.f4175i0.J()) {
                j0(R.color.sidebar_text_geser);
                i0(R.color.main_background, R.color.main_background_geser);
                x0(R.raw.geser_sound);
                if (this.f4176j0.getBoolean("MUSIC", true)) {
                    this.L0.d();
                    this.L0.c(R.raw.evil_chanting_bgm);
                }
                this.X = true;
            }
            if (this.f4175i0.i().j() == 376 && this.J != null) {
                v0();
            }
        } else if (this.W != 0) {
            this.f4189w0.add(this.f4175i0.x());
            this.W = 0;
        } else {
            int i9 = this.V;
            if (i9 != 0) {
                E0(i9);
            } else if (i8 != 0) {
                this.f4189w0.add(this.f4175i0.o(i8));
                if (this.f4175i0.N() != 0) {
                    this.W = this.f4175i0.N();
                } else {
                    this.V = i8;
                    this.W = 0;
                }
            } else if (this.f4175i0.L()) {
                B0(this.f4175i0.n());
            } else {
                this.f4189w0.add(this.f4175i0.p());
                this.f4175i0.W();
            }
        }
        C0();
        if (this.f4175i0.m() != 0) {
            A0(this.f4175i0.m());
        }
        this.f4169c0++;
        if (this.f4189w0.size() != this.f4169c0) {
            this.f4169c0 = 1;
            this.f4188v0.j();
            this.f4189w0.clear();
            this.f4189w0.add(this.f4175i0.p());
            C0();
        }
    }

    public void i0(int i7, int i8) {
        View findViewById = findViewById(R.id.activity_story);
        float[] fArr = new float[3];
        float[] fArr2 = new float[3];
        Color.colorToHSV(this.f4174h0.getResources().getColor(i7), fArr);
        Color.colorToHSV(this.f4174h0.getResources().getColor(i8), fArr2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.addUpdateListener(new a(new float[3], fArr, fArr2, findViewById));
        ofFloat.start();
    }

    public void j0(int i7) {
        this.B0.setTextColor(getResources().getColor(i7));
        this.D0.setTextColor(getResources().getColor(i7));
        this.C0.setTextColor(getResources().getColor(i7));
        this.F0.setTextColor(getResources().getColor(i7));
        this.E0.setTextColor(getResources().getColor(i7));
        this.A0.setTextColor(getResources().getColor(i7));
    }

    void l0() {
        bindService(this.J0, this.M0, 1);
        this.K0 = true;
    }

    void m0() {
        if (this.K0) {
            unbindService(this.M0);
            this.K0 = false;
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        try {
            super.onActivityResult(i7, i8, intent);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.bottom_menu) {
            Intent intent = new Intent(this, (Class<?>) OptionActivity.class);
            intent.putExtra("page", "2");
            startActivity(intent);
        } else if (id == R.id.bottom_menu_effects || id == R.id.top_menu) {
            Intent intent2 = new Intent(this, (Class<?>) OptionActivity.class);
            intent2.putExtra("page", "1");
            startActivity(intent2);
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (s0(this)) {
            setRequestedOrientation(6);
            this.R0 = true;
        } else {
            setRequestedOrientation(1);
            this.R0 = false;
        }
        try {
            this.I = new GamesClient(this, this);
        } catch (Exception unused) {
        }
        getWindow().getDecorView().setSystemUiVisibility(5126);
        if (this.R0) {
            setContentView(R.layout.activity_story_double);
        } else {
            setContentView(R.layout.activity_story);
        }
        this.f4174h0 = this;
        v0();
        this.K = false;
        p0();
        k0();
        this.O0 = u0();
        this.f4192z0 = t1.b.a(this);
        this.f4176j0 = getSharedPreferences("SharedPref", 0);
        this.J0.setClass(this, MusicService.class);
        l0();
        if (this.f4176j0.getBoolean("MUSIC", true)) {
            try {
                startService(this.J0);
            } catch (Exception unused2) {
            }
        }
        this.Q0 = this.f4176j0.getBoolean("PREMIUM_VERSION", this.Q0);
        this.f4175i0 = new t1.a(this);
        this.T = new com.nabil.utilities.f(this);
        this.f_R = this.f4175i0.H();
        this.S = this.f4175i0.w();
        this.f4169c0 = 1;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Z = false;
        this.f4167a0 = false;
        this.f4168b0 = this.f4176j0.getBoolean("SHOW_ENDING", false);
        this.T.u(this.f4175i0.u());
        this.Y[0] = (ImageView) findViewById(R.id.item_0);
        this.Y[1] = (ImageView) findViewById(R.id.item_1);
        this.Y[2] = (ImageView) findViewById(R.id.item_2);
        this.Y[3] = (ImageView) findViewById(R.id.item_3);
        float f8 = getResources().getDisplayMetrics().density;
        double d8 = f8;
        int i7 = (int) ((6.5d * d8) + 0.5d);
        int i8 = (int) ((10.0f * f8) + 0.5f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i7);
        this.f4170d0 = layoutParams;
        layoutParams.gravity = 17;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i8);
        this.f4171e0 = layoutParams2;
        layoutParams2.gravity = 17;
        int i9 = (int) ((d8 * 11.5d) + 0.5d);
        int i10 = (int) ((f8 * 15.0f) + 0.5f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i9, i9);
        this.f4172f0 = layoutParams3;
        layoutParams3.gravity = 17;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i10, i10);
        this.f4173g0 = layoutParams4;
        layoutParams4.gravity = 17;
        this.f4178l0 = findViewById(R.id.circle_menu_left);
        this.f4179m0 = findViewById(R.id.circle_menu_right);
        this.f4180n0[0] = findViewById(R.id.circle_0);
        this.f4180n0[1] = findViewById(R.id.circle_1);
        this.f4180n0[2] = findViewById(R.id.circle_2);
        this.f4180n0[3] = findViewById(R.id.circle_3);
        this.f4181o0[0] = findViewById(R.id.circle_right_0);
        this.f4181o0[1] = findViewById(R.id.circle_right_1);
        this.f4181o0[2] = findViewById(R.id.circle_right_2);
        this.f4181o0[3] = findViewById(R.id.circle_right_3);
        this.f4182p0 = (ImageView) findViewById(R.id.arrow1);
        this.f4183q0 = (ImageView) findViewById(R.id.arrow2);
        this.f4184r0 = (ImageView) findViewById(R.id.arrow3);
        z0();
        this.f4185s0 = (MyScrollView) findViewById(R.id.main_scroll_text);
        this.f4186t0 = (TextView) findViewById(R.id.main_text);
        this.f4187u0 = (TextView) findViewById(R.id.character_text);
        this.f4186t0.setTypeface(this.f4192z0);
        this.f4187u0.setTypeface(this.f4192z0);
        this.f4188v0 = (SwipeDeck) findViewById(R.id.swipe_deck);
        this.f4189w0 = new ArrayList();
        this.f4191y0 = findViewById(R.id.card_frame);
        new Handler().postDelayed(new j(), 750L);
        new Handler().postDelayed(new k(), 2300L);
        this.f4188v0.setCallback(new l());
        this.f4188v0.o(R.id.left_image, R.id.left_layout);
        this.f4188v0.p(R.id.right_image, R.id.right_layout);
        this.f4188v0.n(this.f4178l0, this.f4179m0);
        this.f4188v0.setContext(this);
        this.A0 = (TextView) findViewById(R.id.in_office_text);
        this.B0 = (TextView) findViewById(R.id.year_text);
        this.C0 = (TextView) findViewById(R.id.years_count);
        this.D0 = (TextView) findViewById(R.id.yeasr_text);
        this.E0 = (TextView) findViewById(R.id.days_count);
        this.F0 = (TextView) findViewById(R.id.days_text);
        this.A0.setTypeface(this.f4192z0);
        this.B0.setTypeface(this.f4192z0);
        this.C0.setTypeface(this.f4192z0);
        this.D0.setTypeface(this.f4192z0);
        this.E0.setTypeface(this.f4192z0);
        this.F0.setTypeface(this.f4192z0);
        View findViewById = findViewById(R.id.event_new_effect);
        TextView textView = (TextView) findViewById(R.id.titleEffect);
        TextView textView2 = (TextView) findViewById(R.id.detailsEffect);
        textView.setTypeface(this.f4192z0);
        textView2.setTypeface(this.f4192z0);
        this.H0 = false;
        this.G0 = new m(5000L, 1000L, findViewById);
        View findViewById2 = findViewById(R.id.bottom_menu);
        View findViewById3 = findViewById(R.id.top_menu);
        View findViewById4 = findViewById(R.id.bottom_menu_effects);
        View findViewById5 = findViewById(R.id.main_linear_layout);
        View findViewById6 = findViewById(R.id.name_layout);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        findViewById4.setOnClickListener(this);
        findViewById5.setOnClickListener(this);
        findViewById6.setOnClickListener(this);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        try {
            MusicService musicService = this.L0;
            if (musicService != null) {
                musicService.d();
                stopService(this.J0);
                m0();
            }
            super.onDestroy();
        } catch (Exception e8) {
            System.out.println("StoryActivity onDestroy, Exception: " + e8);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        getWindow().getDecorView().setSystemUiVisibility(5126);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        v0();
        this.K = false;
        this.f4186t0.setText(getResources().getString(R.string.empty_string));
        this.f4187u0.setText(getResources().getString(R.string.empty_string));
        findViewById(R.id.activity_story).setBackgroundColor(ContextCompat.getColor(this, R.color.main_background));
        this.f4186t0.setTextColor(ContextCompat.getColor(this, R.color.main_text));
        this.f4187u0.setTextColor(ContextCompat.getColor(this, R.color.main_text));
        t1.a aVar = new t1.a(this);
        this.f4175i0 = aVar;
        try {
            aVar.i0(this.I);
        } catch (Exception unused) {
        }
        this.T = new com.nabil.utilities.f(this);
        this.f_R = this.f4175i0.H();
        this.S = this.f4175i0.w();
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Z = false;
        this.f4167a0 = false;
        this.f4168b0 = this.f4176j0.getBoolean("SHOW_ENDING", false);
        this.T.u(this.f4175i0.u());
        z0();
        for (int i7 = 0; i7 < 4; i7++) {
            this.f4180n0[i7].setBackgroundResource(R.drawable.circle_design);
            this.f4181o0[i7].setBackgroundResource(R.drawable.circle_design);
        }
        this.f4191y0.setVisibility(4);
        new Handler().postDelayed(new c(), 750L);
        new Handler().postDelayed(new d(), 2300L);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPause() {
        MusicService musicService = this.L0;
        if (musicService != null) {
            musicService.a();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.L0 == null || !this.f4176j0.getBoolean("MUSIC", true)) {
            return;
        }
        this.L0.b();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            this.I.connect();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onSignedIn() {
        try {
            this.f4175i0.i0(this.I);
        } catch (Exception unused) {
        }
    }

    @Override
    public void onSignInFailed() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            getWindow().getDecorView().setSystemUiVisibility(5126);
        }
    }

    public void q0() {
        this.f4169c0 = 1;
        this.f4188v0.j();
        this.f4189w0.clear();
        if ((this.f_R || this.S > 1) && !this.f4168b0) {
            if (this.f4176j0.getInt("AMOUNT_ITEM_3", 0) <= 0 || this.f4175i0.F(10)) {
                this.f4189w0.add(this.f4175i0.p());
            } else {
                t1.g gVar = new t1.g(303, R.string.character_1, R.string.sp_quest_303, R.drawable.character_01, R.string.sp_quest_303_l, R.string.sp_quest_303_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar.m(true);
                this.f4175i0.j0(true);
                this.f4175i0.f0(gVar);
                this.f4189w0.add(gVar);
            }
            C0();
        } else {
            this.Q = new t1.e(this.f4174h0);
            for (int i7 = 0; i7 < 4; i7++) {
                this.f4180n0[i7].setVisibility(4);
                this.f4181o0[i7].setVisibility(4);
            }
            this.f4189w0.add(this.Q.a(0));
        }
        u1.a aVar = new u1.a(this.f4189w0, this);
        this.f4190x0 = aVar;
        SwipeDeck swipeDeck = this.f4188v0;
        if (swipeDeck != null) {
            swipeDeck.setAdapter(aVar);
        }
    }

    public void w0() {
        this.f4191y0.setVisibility(0);
        x0(R.raw.cardshuffle_02);
        findViewById(R.id.card_back_0).startAnimation(AnimationUtils.loadAnimation(this.f4174h0, R.anim.new_cards));
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f4174h0, R.anim.new_cards);
        loadAnimation.setStartOffset(120L);
        findViewById(R.id.card_back_1).startAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f4174h0, R.anim.new_cards);
        loadAnimation2.setStartOffset(240L);
        findViewById(R.id.card_back_2).startAnimation(loadAnimation2);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this.f4174h0, R.anim.new_cards);
        loadAnimation3.setStartOffset(360L);
        findViewById(R.id.card_back_3).startAnimation(loadAnimation3);
        Animation loadAnimation4 = AnimationUtils.loadAnimation(this.f4174h0, R.anim.new_cards);
        loadAnimation4.setStartOffset(480L);
        findViewById(R.id.card_back_4).startAnimation(loadAnimation4);
        Animation loadAnimation5 = AnimationUtils.loadAnimation(this.f4174h0, R.anim.new_cards);
        loadAnimation5.setStartOffset(600L);
        findViewById(R.id.card_back_5).startAnimation(loadAnimation5);
        Animation loadAnimation6 = AnimationUtils.loadAnimation(this.f4174h0, R.anim.new_cards);
        loadAnimation6.setStartOffset(720L);
        findViewById(R.id.card_back_6).startAnimation(loadAnimation6);
        Animation loadAnimation7 = AnimationUtils.loadAnimation(this.f4174h0, R.anim.new_cards);
        loadAnimation7.setStartOffset(840L);
        findViewById(R.id.card_back_7).startAnimation(loadAnimation7);
    }

    public void x0(int i7) {
        if (this.f4176j0.getBoolean("EFFECTS", true)) {
            try {
                MediaPlayer create = MediaPlayer.create(getApplicationContext(), i7);
                this.I0 = create;
                create.setOnCompletionListener(new p());
                this.I0.start();
            } catch (Exception unused) {
            }
        }
    }

    public void z0() {
        int[] l7 = this.f4175i0.l();
        int i7 = 0;
        while (true) {
            ImageView[] imageViewArr = this.Y;
            if (i7 >= imageViewArr.length) {
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (int i8 : l7) {
                    if (i8 == 8) {
                        z9 = true;
                    }
                    if (i8 == 9) {
                        z8 = true;
                    }
                    if (i8 == 11) {
                        z7 = true;
                    }
                }
                if (z7) {
                    this.f4184r0.setVisibility(0);
                    this.f4184r0.startAnimation(AnimationUtils.loadAnimation(this.f4174h0, R.anim.blink));
                } else {
                    this.f4184r0.clearAnimation();
                    this.f4184r0.setVisibility(4);
                }
                if (z8) {
                    this.f4183q0.setVisibility(0);
                    this.f4183q0.startAnimation(AnimationUtils.loadAnimation(this.f4174h0, R.anim.blink));
                } else {
                    this.f4183q0.clearAnimation();
                    this.f4183q0.setVisibility(4);
                }
                if (!z9) {
                    this.f4182p0.clearAnimation();
                    this.f4182p0.setVisibility(4);
                    return;
                } else {
                    this.f4182p0.setVisibility(0);
                    this.f4182p0.startAnimation(AnimationUtils.loadAnimation(this.f4174h0, R.anim.blink));
                    return;
                }
            }
            switch (l7[i7]) {
                case 0:
                    imageViewArr[i7].setImageDrawable(null);
                    break;
                case 1:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.radar));
                    break;
                case 2:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.antiradiation));
                    break;
                case 3:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.time));
                    break;
                case 4:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.lover));
                    break;
                case 5:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.euro));
                    break;
                case 6:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.church));
                    break;
                case 7:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.fox));
                    break;
                case 8:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.virus));
                    break;
                case 9:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.cobra));
                    break;
                case 10:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.oracle));
                    break;
                case 11:
                    imageViewArr[i7].setImageDrawable(getResources().getDrawable(R.drawable.war));
                    break;
            }
            i7++;
        }
    }

    class g implements BillingClientStateListener {
        g() {
        }

        @Override
        public void onBillingSetupFinished(BillingResult dVar) {
            if (dVar.getResponseCode() == 0) {
                Log.i("storyactivity", "Connection Success");
                StoryActivity.this.y0();
            }
        }

        @Override
        public void onBillingServiceDisconnected() {
        }
    }

    class m extends CountDownTimer {

        final View f4215a;

        m(long j7, long j8, View view) {
            super(j7, j8);
            this.f4215a = view;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Animation loadAnimation = AnimationUtils.loadAnimation(StoryActivity.this.f4174h0, R.anim.translate_exit);
            loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f4215a.startAnimation(loadAnimation);
            StoryActivity.this.H0 = false;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j7) {
        }
    }
}
