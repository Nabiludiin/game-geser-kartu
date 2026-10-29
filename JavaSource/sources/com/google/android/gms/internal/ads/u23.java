package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class u23 extends q3.a {
    public static final Parcelable.Creator<u23> CREATOR = new v23();
    private final int[] A;
    private final int[] B;
    public final int C;

    /* renamed from: q, reason: collision with root package name */
    private final r23[] f16551q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f16552r;

    /* renamed from: s, reason: collision with root package name */
    private final int f16553s;

    /* renamed from: t, reason: collision with root package name */
    public final r23 f16554t;

    /* renamed from: u, reason: collision with root package name */
    public final int f16555u;

    /* renamed from: v, reason: collision with root package name */
    public final int f16556v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16557w;

    /* renamed from: x, reason: collision with root package name */
    public final String f16558x;

    /* renamed from: y, reason: collision with root package name */
    private final int f16559y;

    /* renamed from: z, reason: collision with root package name */
    private final int f16560z;

    public u23(int i7, int i8, int i9, int i10, String str, int i11, int i12) {
        r23[] values = r23.values();
        this.f16551q = values;
        int[] a8 = s23.a();
        this.A = a8;
        int[] a9 = t23.a();
        this.B = a9;
        this.f16552r = null;
        this.f16553s = i7;
        this.f16554t = values[i7];
        this.f16555u = i8;
        this.f16556v = i9;
        this.f16557w = i10;
        this.f16558x = str;
        this.f16559y = i11;
        this.C = a8[i11];
        this.f16560z = i12;
        int i13 = a9[i12];
    }

    public static u23 M0(r23 r23Var, Context context) {
        if (r23Var == r23.Rewarded) {
            return new u23(context, r23Var, ((Integer) s2.b0.c().d(uy.S6)).intValue(), ((Integer) s2.b0.c().d(uy.Y6)).intValue(), ((Integer) s2.b0.c().d(uy.f17053a7)).intValue(), (String) s2.b0.c().d(uy.f17071c7), (String) s2.b0.c().d(uy.U6), (String) s2.b0.c().d(uy.W6));
        }
        if (r23Var == r23.Interstitial) {
            return new u23(context, r23Var, ((Integer) s2.b0.c().d(uy.T6)).intValue(), ((Integer) s2.b0.c().d(uy.Z6)).intValue(), ((Integer) s2.b0.c().d(uy.f17062b7)).intValue(), (String) s2.b0.c().d(uy.f17080d7), (String) s2.b0.c().d(uy.V6), (String) s2.b0.c().d(uy.X6));
        }
        if (r23Var != r23.AppOpen) {
            return null;
        }
        return new u23(context, r23Var, ((Integer) s2.b0.c().d(uy.f17107g7)).intValue(), ((Integer) s2.b0.c().d(uy.i7)).intValue(), ((Integer) s2.b0.c().d(uy.j7)).intValue(), (String) s2.b0.c().d(uy.f17089e7), (String) s2.b0.c().d(uy.f17098f7), (String) s2.b0.c().d(uy.f17116h7));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f16553s;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.l(parcel, 2, this.f16555u);
        q3.c.l(parcel, 3, this.f16556v);
        q3.c.l(parcel, 4, this.f16557w);
        q3.c.r(parcel, 5, this.f16558x, false);
        q3.c.l(parcel, 6, this.f16559y);
        q3.c.l(parcel, 7, this.f16560z);
        q3.c.b(parcel, a8);
    }

    private u23(Context context, r23 r23Var, int i7, int i8, int i9, String str, String str2, String str3) {
        int i10;
        this.f16551q = r23.values();
        this.A = s23.a();
        this.B = t23.a();
        this.f16552r = context;
        this.f16553s = r23Var.ordinal();
        this.f16554t = r23Var;
        this.f16555u = i7;
        this.f16556v = i8;
        this.f16557w = i9;
        this.f16558x = str;
        if ("oldest".equals(str2)) {
            i10 = 1;
        } else {
            i10 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.C = i10;
        this.f16559y = i10 - 1;
        "onAdClosed".equals(str3);
        this.f16560z = 0;
    }
}
