package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* compiled from: MyApplication */
final class ma {

    /* renamed from: a, reason: collision with root package name */
    public final String f12141a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12142b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f12143c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f12144d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12145e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12146f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12147g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12148h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12149i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12150j;

    private ma(String str, int i7, Integer num, Integer num2, float f8, boolean z7, boolean z8, boolean z9, boolean z10, int i8) {
        this.f12141a = str;
        this.f12142b = i7;
        this.f12143c = num;
        this.f12144d = num2;
        this.f12145e = f8;
        this.f12146f = z7;
        this.f12147g = z8;
        this.f12148h = z9;
        this.f12149i = z10;
        this.f12150j = i8;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static com.google.android.gms.internal.ads.ma a(java.lang.String r21, com.google.android.gms.internal.ads.ja r22) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.String, com.google.android.gms.internal.ads.ja):com.google.android.gms.internal.ads.ma");
    }

    public static Integer b(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            rx3.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(m44.a(((parseLong >> 24) & 255) ^ 255), m44.a(parseLong & 255), m44.a((parseLong >> 8) & 255), m44.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e8) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            gv1.d("SsaStyle", sb.toString(), e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                gv1.c("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e8) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            gv1.d("SsaStyle", sb.toString(), e8);
            return false;
        }
    }
}
