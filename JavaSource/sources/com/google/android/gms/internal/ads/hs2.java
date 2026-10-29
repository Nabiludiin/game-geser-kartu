package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class hs2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9651a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9652b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9653c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9654d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9655e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9656f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9657g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9658h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9659i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f9660j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9661k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9662l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9663m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f9664n;

    /* renamed from: o, reason: collision with root package name */
    public final String f9665o;

    /* renamed from: p, reason: collision with root package name */
    public final long f9666p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9667q;

    /* renamed from: r, reason: collision with root package name */
    public final String f9668r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9669s;

    /* renamed from: t, reason: collision with root package name */
    public final String f9670t;

    public hs2(boolean z7, boolean z8, String str, boolean z9, boolean z10, boolean z11, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z12, String str6, long j7, boolean z13, String str7, int i7, String str8, String str9, String str10) {
        this.f9651a = z7;
        this.f9652b = z8;
        this.f9653c = str;
        this.f9654d = z9;
        this.f9655e = z10;
        this.f9656f = z11;
        this.f9657g = str2;
        this.f9658h = str8;
        this.f9660j = arrayList;
        this.f9661k = str3;
        this.f9662l = str4;
        this.f9663m = str5;
        this.f9664n = z12;
        this.f9665o = str6;
        this.f9666p = j7;
        this.f9667q = z13;
        this.f9668r = str7;
        this.f9669s = i7;
        this.f9670t = str10;
        this.f9659i = str9;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((x81) obj).f18665b;
        bundle.putBoolean("simulator", this.f9654d);
        bundle.putInt("build_api_level", this.f9669s);
        ArrayList<String> arrayList = this.f9660j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", this.f9665o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0070, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.te)).booleanValue() != false) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.wr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs2.d(java.lang.Object):void");
    }
}
