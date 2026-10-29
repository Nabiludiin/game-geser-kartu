package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class le0 extends me0 implements y50 {

    /* renamed from: c, reason: collision with root package name */
    private final mr0 f11577c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f11578d;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f11579e;

    /* renamed from: f, reason: collision with root package name */
    private final ay f11580f;

    /* renamed from: g, reason: collision with root package name */
    DisplayMetrics f11581g;

    /* renamed from: h, reason: collision with root package name */
    private float f11582h;

    /* renamed from: i, reason: collision with root package name */
    int f11583i;

    /* renamed from: j, reason: collision with root package name */
    int f11584j;

    /* renamed from: k, reason: collision with root package name */
    private int f11585k;

    /* renamed from: l, reason: collision with root package name */
    int f11586l;

    /* renamed from: m, reason: collision with root package name */
    int f11587m;

    /* renamed from: n, reason: collision with root package name */
    int f11588n;

    /* renamed from: o, reason: collision with root package name */
    int f11589o;

    public le0(mr0 mr0Var, Context context, ay ayVar) {
        super(mr0Var, "");
        this.f11583i = -1;
        this.f11584j = -1;
        this.f11586l = -1;
        this.f11587m = -1;
        this.f11588n = -1;
        this.f11589o = -1;
        this.f11577c = mr0Var;
        this.f11578d = context;
        this.f11580f = ayVar;
        this.f11579e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObject;
        this.f11581g = new DisplayMetrics();
        Display defaultDisplay = this.f11579e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f11581g);
        this.f11582h = this.f11581g.density;
        this.f11585k = defaultDisplay.getRotation();
        s2.z.a();
        DisplayMetrics displayMetrics = this.f11581g;
        this.f11583i = w2.g.a(displayMetrics, displayMetrics.widthPixels);
        s2.z.a();
        DisplayMetrics displayMetrics2 = this.f11581g;
        this.f11584j = w2.g.a(displayMetrics2, displayMetrics2.heightPixels);
        mr0 mr0Var = this.f11577c;
        Activity i7 = mr0Var.i();
        if (i7 == null || i7.getWindow() == null) {
            this.f11586l = this.f11583i;
            this.f11587m = this.f11584j;
        } else {
            r2.t.g();
            int[] w7 = v2.f2.w(i7);
            s2.z.a();
            this.f11586l = w2.g.a(this.f11581g, w7[0]);
            s2.z.a();
            this.f11587m = w2.g.a(this.f11581g, w7[1]);
        }
        if (mr0Var.R().g()) {
            this.f11588n = this.f11583i;
            this.f11589o = this.f11584j;
        } else {
            mr0Var.measure(0, 0);
        }
        g(this.f11583i, this.f11584j, this.f11586l, this.f11587m, this.f11582h, this.f11585k);
        ke0 ke0Var = new ke0();
        ay ayVar = this.f11580f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        ke0Var.b(ayVar.c(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        ke0Var.a(ayVar.c(intent2));
        ke0Var.c(ayVar.b());
        ke0Var.d(ayVar.a());
        ke0Var.e(true);
        boolean f8 = ke0Var.f();
        boolean g8 = ke0Var.g();
        boolean h8 = ke0Var.h();
        boolean i8 = ke0Var.i();
        try {
            jSONObject = new JSONObject().put("sms", f8).put("tel", g8).put("calendar", h8).put("storePicture", i8).put("inlineVideo", ke0Var.j());
        } catch (JSONException e8) {
            int i9 = v2.n1.f26802b;
            w2.p.d("Error occurred while obtaining the MRAID capabilities.", e8);
            jSONObject = null;
        }
        mr0Var.a("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        mr0Var.getLocationOnScreen(iArr);
        Context context = this.f11578d;
        h(s2.z.a().j(context, iArr[0]), s2.z.a().j(context, iArr[1]));
        if (w2.p.j(2)) {
            w2.p.e("Dispatching Ready Event.");
        }
        c(mr0Var.p().f27051q);
    }

    public final void h(int i7, int i8) {
        int i9;
        Context context = this.f11578d;
        int i10 = 0;
        if (context instanceof Activity) {
            r2.t.g();
            i9 = v2.f2.x((Activity) context)[0];
        } else {
            i9 = 0;
        }
        mr0 mr0Var = this.f11577c;
        if (mr0Var.R() == null || !mr0Var.R().g()) {
            int width = mr0Var.getWidth();
            int height = mr0Var.getHeight();
            if (((Boolean) s2.b0.c().d(uy.f17142l0)).booleanValue()) {
                if (width == 0) {
                    width = mr0Var.R() != null ? mr0Var.R().f6005c : 0;
                }
                if (height == 0) {
                    if (mr0Var.R() != null) {
                        i10 = mr0Var.R().f6004b;
                    }
                    this.f11588n = s2.z.a().j(context, width);
                    this.f11589o = s2.z.a().j(context, i10);
                }
            }
            i10 = height;
            this.f11588n = s2.z.a().j(context, width);
            this.f11589o = s2.z.a().j(context, i10);
        }
        e(i7, i8 - i9, this.f11588n, this.f11589o);
        mr0Var.s0().F(i7, i8);
    }
}
