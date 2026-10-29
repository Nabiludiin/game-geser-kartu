package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* compiled from: MyApplication */
public final class ae extends q3.a {
    public static final Parcelable.Creator<ae> CREATOR = new be();
    public final String A;
    public final long B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final Boolean F;
    public final long G;
    public final List H;
    public final String I;
    public final String J;
    public final String K;
    public final boolean L;
    public final long M;
    public final int N;
    public final String O;
    public final int P;
    public final long Q;
    public final String R;
    public final String S;
    public final long T;
    public final int U;

    /* renamed from: q, reason: collision with root package name */
    public final String f21861q;

    /* renamed from: r, reason: collision with root package name */
    public final String f21862r;

    /* renamed from: s, reason: collision with root package name */
    public final String f21863s;

    /* renamed from: t, reason: collision with root package name */
    public final String f21864t;

    /* renamed from: u, reason: collision with root package name */
    public final long f21865u;

    /* renamed from: v, reason: collision with root package name */
    public final long f21866v;

    /* renamed from: w, reason: collision with root package name */
    public final String f21867w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f21868x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f21869y;

    /* renamed from: z, reason: collision with root package name */
    public final long f21870z;

    ae(String str, String str2, String str3, long j7, String str4, long j8, long j9, String str5, boolean z7, boolean z8, String str6, long j10, int i7, boolean z9, boolean z10, Boolean bool, long j11, List list, String str7, String str8, String str9, boolean z11, long j12, int i8, String str10, int i9, long j13, String str11, String str12, long j14, int i10) {
        p3.o.g(str);
        this.f21861q = str;
        this.f21862r = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f21863s = str3;
        this.f21870z = j7;
        this.f21864t = str4;
        this.f21865u = j8;
        this.f21866v = j9;
        this.f21867w = str5;
        this.f21868x = z7;
        this.f21869y = z8;
        this.A = str6;
        this.B = j10;
        this.C = i7;
        this.D = z9;
        this.E = z10;
        this.F = bool;
        this.G = j11;
        this.H = list;
        this.I = str7;
        this.J = str8;
        this.K = str9;
        this.L = z11;
        this.M = j12;
        this.N = i8;
        this.O = str10;
        this.P = i9;
        this.Q = j13;
        this.R = str11;
        this.S = str12;
        this.T = j14;
        this.U = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f21861q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, str, false);
        q3.c.r(parcel, 3, this.f21862r, false);
        q3.c.r(parcel, 4, this.f21863s, false);
        q3.c.r(parcel, 5, this.f21864t, false);
        q3.c.o(parcel, 6, this.f21865u);
        q3.c.o(parcel, 7, this.f21866v);
        q3.c.r(parcel, 8, this.f21867w, false);
        q3.c.c(parcel, 9, this.f21868x);
        q3.c.c(parcel, 10, this.f21869y);
        q3.c.o(parcel, 11, this.f21870z);
        q3.c.r(parcel, 12, this.A, false);
        q3.c.o(parcel, 14, this.B);
        q3.c.l(parcel, 15, this.C);
        q3.c.c(parcel, 16, this.D);
        q3.c.c(parcel, 18, this.E);
        q3.c.e(parcel, 21, this.F, false);
        q3.c.o(parcel, 22, this.G);
        q3.c.t(parcel, 23, this.H, false);
        q3.c.r(parcel, 25, this.I, false);
        q3.c.r(parcel, 26, this.J, false);
        q3.c.r(parcel, 27, this.K, false);
        q3.c.c(parcel, 28, this.L);
        q3.c.o(parcel, 29, this.M);
        q3.c.l(parcel, 30, this.N);
        q3.c.r(parcel, 31, this.O, false);
        q3.c.l(parcel, 32, this.P);
        q3.c.o(parcel, 34, this.Q);
        q3.c.r(parcel, 35, this.R, false);
        q3.c.r(parcel, 36, this.S, false);
        q3.c.o(parcel, 37, this.T);
        q3.c.l(parcel, 38, this.U);
        q3.c.b(parcel, a8);
    }

    ae(String str, String str2, String str3, String str4, long j7, long j8, String str5, boolean z7, boolean z8, long j9, String str6, long j10, int i7, boolean z9, boolean z10, Boolean bool, long j11, List list, String str7, String str8, String str9, boolean z11, long j12, int i8, String str10, int i9, long j13, String str11, String str12, long j14, int i10) {
        this.f21861q = str;
        this.f21862r = str2;
        this.f21863s = str3;
        this.f21870z = j9;
        this.f21864t = str4;
        this.f21865u = j7;
        this.f21866v = j8;
        this.f21867w = str5;
        this.f21868x = z7;
        this.f21869y = z8;
        this.A = str6;
        this.B = j10;
        this.C = i7;
        this.D = z9;
        this.E = z10;
        this.F = bool;
        this.G = j11;
        this.H = list;
        this.I = str7;
        this.J = str8;
        this.K = str9;
        this.L = z11;
        this.M = j12;
        this.N = i8;
        this.O = str10;
        this.P = i9;
        this.Q = j13;
        this.R = str11;
        this.S = str12;
        this.T = j14;
        this.U = i10;
    }
}
