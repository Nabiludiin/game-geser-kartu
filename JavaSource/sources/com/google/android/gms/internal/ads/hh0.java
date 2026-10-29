package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* compiled from: MyApplication */
public final class hh0 {
    private int A;
    private final String B;
    private boolean C;

    /* renamed from: a, reason: collision with root package name */
    private int f9502a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9503b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9504c;

    /* renamed from: d, reason: collision with root package name */
    private int f9505d;

    /* renamed from: e, reason: collision with root package name */
    private int f9506e;

    /* renamed from: f, reason: collision with root package name */
    private int f9507f;

    /* renamed from: g, reason: collision with root package name */
    private String f9508g;

    /* renamed from: h, reason: collision with root package name */
    private int f9509h;

    /* renamed from: i, reason: collision with root package name */
    private int f9510i;

    /* renamed from: j, reason: collision with root package name */
    private int f9511j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9512k;

    /* renamed from: l, reason: collision with root package name */
    private int f9513l;

    /* renamed from: m, reason: collision with root package name */
    private double f9514m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9515n;

    /* renamed from: o, reason: collision with root package name */
    private String f9516o;

    /* renamed from: p, reason: collision with root package name */
    private String f9517p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f9518q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f9519r;

    /* renamed from: s, reason: collision with root package name */
    private final String f9520s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f9521t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f9522u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f9523v;

    /* renamed from: w, reason: collision with root package name */
    private final String f9524w;

    /* renamed from: x, reason: collision with root package name */
    private final String f9525x;

    /* renamed from: y, reason: collision with root package name */
    private float f9526y;

    /* renamed from: z, reason: collision with root package name */
    private int f9527z;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:35)|4|(1:6)(1:34)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d5, blocks: (B:12:0x009f, B:14:0x00ad), top: B:11:0x009f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hh0(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            com.google.android.gms.internal.ads.uy.a(r8)
            r7.b(r8)
            r7.c(r8)
            r7.d(r8)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L23
            r2 = r4
            goto L24
        L23:
            r2 = r3
        L24:
            r7.f9518q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            if (r2 == 0) goto L30
            r2 = r4
            goto L31
        L30:
            r2 = r3
        L31:
            r7.f9519r = r2
            java.lang.String r2 = r1.getCountry()
            r7.f9520s = r2
            r2.t.g()
            s2.z.a()
            boolean r2 = w2.g.z()
            r7.f9521t = r2
            boolean r2 = com.google.android.gms.common.util.i.c(r8)
            r7.f9522u = r2
            boolean r2 = com.google.android.gms.common.util.i.d(r8)
            r7.f9523v = r2
            java.lang.String r1 = r1.getLanguage()
            r7.f9524w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = e(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L64
        L62:
            r0 = r2
            goto L9d
        L64:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L69
            goto L62
        L69:
            u3.d r5 = u3.e.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r6 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            android.content.pm.PackageInfo r3 = r5.f(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            if (r3 == 0) goto L62
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            int r5 = r5.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            int r5 = r5 + r4
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            int r6 = r6.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r6.<init>(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r6.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r6.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r6.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r0 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
        L9d:
            r7.f9525x = r0
            u3.d r0 = u3.e.a(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r3 = "com.android.vending"
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.f(r3, r5)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto Ld5
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Ld5
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Ld5
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Ld5
            int r5 = r5.length()     // Catch: java.lang.Exception -> Ld5
            int r5 = r5 + r4
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Ld5
            int r4 = r4.length()     // Catch: java.lang.Exception -> Ld5
            int r5 = r5 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r5)     // Catch: java.lang.Exception -> Ld5
            r4.append(r3)     // Catch: java.lang.Exception -> Ld5
            r4.append(r1)     // Catch: java.lang.Exception -> Ld5
            r4.append(r0)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Ld5
        Ld5:
            r7.B = r2
            android.content.res.Resources r8 = r8.getResources()
            if (r8 != 0) goto Lde
            goto Lf0
        Lde:
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            if (r8 == 0) goto Lf0
            float r0 = r8.density
            r7.f9526y = r0
            int r0 = r8.widthPixels
            r7.f9527z = r0
            int r8 = r8.heightPixels
            r7.A = r8
        Lf0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hh0.<init>(android.content.Context):void");
    }

    private final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f9502a = audioManager.getMode();
                this.f9503b = audioManager.isMusicActive();
                this.f9504c = audioManager.isSpeakerphoneOn();
                this.f9505d = audioManager.getStreamVolume(3);
                this.f9506e = audioManager.getRingerMode();
                this.f9507f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                r2.t.l().i(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f9502a = -2;
        this.f9503b = false;
        this.f9504c = false;
        this.f9505d = 0;
        this.f9506e = 2;
        this.f9507f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f9508g = r2
            boolean r2 = com.google.android.gms.common.util.n.i()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.z9
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r2 = r4.d(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f9510i = r2
            int r0 = r0.getPhoneType()
            r5.f9511j = r0
            r0 = -2
            r5.f9509h = r0
            r5.f9512k = r3
            r0 = -1
            r5.f9513l = r0
            r2.t.g()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = v2.f2.e(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f9509h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f9513l = r6
            goto L69
        L67:
            r5.f9509h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f9512k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hh0.c(android.content.Context):void");
    }

    private final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) s2.b0.c().d(uy.ac)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver == null) {
            this.f9514m = -1.0d;
            this.f9515n = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f9514m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            this.f9515n = intExtra == 2 || intExtra == 5;
        }
    }

    private static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            r2.t.l().i(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final ih0 a() {
        return new ih0(this.f9502a, this.f9518q, this.f9519r, this.f9508g, this.f9520s, this.f9521t, this.f9522u, this.f9523v, this.f9503b, this.f9504c, this.f9524w, this.f9525x, this.B, this.f9505d, this.f9509h, this.f9510i, this.f9511j, this.f9506e, this.f9507f, this.f9526y, this.f9527z, this.A, this.f9514m, this.f9515n, this.f9512k, this.f9513l, this.f9516o, this.C, this.f9517p);
    }

    public hh0(Context context, ih0 ih0Var) {
        uy.a(context);
        b(context);
        c(context);
        d(context);
        this.f9516o = Build.FINGERPRINT;
        this.f9517p = Build.DEVICE;
        this.C = wz.a(context);
        this.f9518q = ih0Var.f10035a;
        this.f9519r = ih0Var.f10036b;
        this.f9520s = ih0Var.f10037c;
        this.f9521t = ih0Var.f10038d;
        this.f9522u = ih0Var.f10039e;
        this.f9523v = ih0Var.f10040f;
        this.f9524w = ih0Var.f10041g;
        this.f9525x = ih0Var.f10042h;
        this.B = ih0Var.f10043i;
        this.f9526y = ih0Var.f10046l;
        this.f9527z = ih0Var.f10047m;
        this.A = ih0Var.f10048n;
    }
}
