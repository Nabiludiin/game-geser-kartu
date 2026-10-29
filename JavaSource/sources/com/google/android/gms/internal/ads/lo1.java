package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class lo1 extends o20 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, op1 {
    public static final w04 E = w04.p("2011", "1009", "3010");
    private i20 A;
    private boolean B;
    private GestureDetector D;

    /* renamed from: q, reason: collision with root package name */
    private final String f11700q;

    /* renamed from: s, reason: collision with root package name */
    private FrameLayout f11702s;

    /* renamed from: t, reason: collision with root package name */
    private FrameLayout f11703t;

    /* renamed from: u, reason: collision with root package name */
    private final z64 f11704u;

    /* renamed from: v, reason: collision with root package name */
    private View f11705v;

    /* renamed from: x, reason: collision with root package name */
    private kn1 f11707x;

    /* renamed from: y, reason: collision with root package name */
    private ir f11708y;

    /* renamed from: r, reason: collision with root package name */
    private Map f11701r = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    private w3.a f11709z = null;
    private boolean C = false;

    /* renamed from: w, reason: collision with root package name */
    private final int f11706w = ModuleDescriptor.MODULE_VERSION;

    public lo1(FrameLayout frameLayout, FrameLayout frameLayout2, int i7) {
        String str;
        this.f11702s = frameLayout;
        this.f11703t = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f11700q = str;
        r2.t.c();
        qm0.a(frameLayout, this);
        r2.t.c();
        qm0.b(frameLayout, this);
        this.f11704u = cm0.f6505f;
        this.f11708y = new ir(this.f11702s.getContext(), this.f11702s);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void i0(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f11703t.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f11703t.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e8) {
                        w2.p.g("Encountered invalid base64 watermark.", e8);
                    }
                }
            }
            this.f11703t.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void r() {
        if (!((Boolean) s2.b0.c().d(uy.Bc)).booleanValue() || this.f11707x.r() == 0) {
            return;
        }
        this.D = new GestureDetector(this.f11702s.getContext(), new to1(this.f11707x, this));
    }

    private final synchronized void t() {
        this.f11704u.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ko1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                lo1.this.p();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final FrameLayout C1() {
        return this.f11703t;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized void D2(String str, View view, boolean z7) {
        if (!this.C) {
            if (view == null) {
                this.f11701r.remove(str);
                return;
            }
            this.f11701r.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (v2.u0.a(this.f11706w)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final synchronized void I1(i20 i20Var) {
        if (!this.C) {
            this.B = true;
            this.A = i20Var;
            kn1 kn1Var = this.f11707x;
            if (kn1Var != null) {
                kn1Var.A().b(i20Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final synchronized void N0(w3.a aVar, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final synchronized w3.a W(String str) {
        return w3.b.C1(n0(str));
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final synchronized void c() {
        try {
            if (this.C) {
                return;
            }
            kn1 kn1Var = this.f11707x;
            if (kn1Var != null) {
                kn1Var.b0(this);
                this.f11707x = null;
            }
            this.f11701r.clear();
            this.f11702s.removeAllViews();
            this.f11703t.removeAllViews();
            this.f11701r = null;
            this.f11702s = null;
            this.f11703t = null;
            this.f11705v = null;
            this.f11708y = null;
            this.C = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final synchronized void d0(w3.a aVar) {
        if (this.C) {
            return;
        }
        Object r02 = w3.b.r0(aVar);
        if (!(r02 instanceof kn1)) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        kn1 kn1Var = this.f11707x;
        if (kn1Var != null) {
            kn1Var.b0(this);
        }
        t();
        kn1 kn1Var2 = (kn1) r02;
        this.f11707x = kn1Var2;
        kn1Var2.a0(this);
        this.f11707x.y(this.f11702s);
        this.f11707x.z(this.f11703t);
        if (this.B) {
            this.f11707x.A().b(this.A);
        }
        if (((Boolean) s2.b0.c().d(uy.f17226v4)).booleanValue() && !TextUtils.isEmpty(this.f11707x.v())) {
            i0(this.f11707x.v());
        }
        r();
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final ir g() {
        return this.f11708y;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final synchronized void g8(String str, w3.a aVar) {
        D2(str, (View) w3.b.r0(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized Map i() {
        return this.f11701r;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized Map k() {
        return null;
    }

    public final FrameLayout k8() {
        return this.f11702s;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized Map l() {
        return this.f11701r;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized JSONObject m() {
        kn1 kn1Var = this.f11707x;
        if (kn1Var == null) {
            return null;
        }
        return kn1Var.g0(this.f11702s, i(), l());
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized View n0(String str) {
        WeakReference weakReference;
        if (!this.C && (weakReference = (WeakReference) this.f11701r.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void n6(w3.a aVar) {
        onTouch(this.f11702s, (MotionEvent) w3.b.r0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized String o() {
        return this.f11700q;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        kn1 kn1Var = this.f11707x;
        if (kn1Var == null || !kn1Var.s()) {
            return;
        }
        this.f11707x.j0();
        this.f11707x.c0(view, this.f11702s, i(), l(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        kn1 kn1Var = this.f11707x;
        if (kn1Var != null) {
            FrameLayout frameLayout = this.f11702s;
            kn1Var.e0(frameLayout, i(), l(), kn1.t(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        kn1 kn1Var = this.f11707x;
        if (kn1Var != null) {
            FrameLayout frameLayout = this.f11702s;
            kn1Var.e0(frameLayout, i(), l(), kn1.t(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        kn1 kn1Var = this.f11707x;
        if (kn1Var != null) {
            kn1Var.d0(view, motionEvent, this.f11702s);
            if (((Boolean) s2.b0.c().d(uy.Bc)).booleanValue() && this.D != null && this.f11707x.r() != 0) {
                this.D.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    final /* synthetic */ void p() {
        if (this.f11705v == null) {
            View view = new View(this.f11702s.getContext());
            this.f11705v = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f11702s != this.f11705v.getParent()) {
            this.f11702s.addView(this.f11705v);
        }
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final w3.a q() {
        return this.f11709z;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final synchronized void q0(w3.a aVar) {
        this.f11707x.h0((View) w3.b.r0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final /* synthetic */ View q5() {
        return this.f11702s;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized JSONObject s() {
        kn1 kn1Var = this.f11707x;
        if (kn1Var == null) {
            return null;
        }
        return kn1Var.f0(this.f11702s, i(), l());
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final synchronized void t5(w3.a aVar) {
        if (this.C) {
            return;
        }
        this.f11709z = aVar;
    }
}
