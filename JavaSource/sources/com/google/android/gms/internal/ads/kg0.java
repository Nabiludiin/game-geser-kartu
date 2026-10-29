package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class kg0 extends q3.a {
    public static final Parcelable.Creator<kg0> CREATOR = new lg0();
    public final w2.a A;
    public final Bundle B;
    public final int C;
    public final List D;
    public final Bundle E;
    public final boolean F;
    public final int G;
    public final int H;
    public final float I;
    public final String J;
    public final long K;
    public final String L;
    public final List M;
    public final String N;
    public final z10 O;
    public final List P;
    public final long Q;
    public final String R;
    public final float S;
    public final int T;
    public final int U;
    public final boolean V;
    public final String W;
    public final boolean X;
    public final String Y;
    public final boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public final int f11011a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Bundle f11012b0;

    /* renamed from: c0, reason: collision with root package name */
    public final String f11013c0;

    /* renamed from: d0, reason: collision with root package name */
    public final s2.f3 f11014d0;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f11015e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Bundle f11016f0;

    /* renamed from: g0, reason: collision with root package name */
    public final String f11017g0;

    /* renamed from: h0, reason: collision with root package name */
    public final String f11018h0;

    /* renamed from: i0, reason: collision with root package name */
    public final String f11019i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f11020j0;

    /* renamed from: k0, reason: collision with root package name */
    public final List f11021k0;

    /* renamed from: l0, reason: collision with root package name */
    public final String f11022l0;

    /* renamed from: m0, reason: collision with root package name */
    public final List f11023m0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f11024n0;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f11025o0;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f11026p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f11027q;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f11028q0;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f11029r;

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f11030r0;

    /* renamed from: s, reason: collision with root package name */
    public final s2.b5 f11031s;

    /* renamed from: s0, reason: collision with root package name */
    public final String f11032s0;

    /* renamed from: t, reason: collision with root package name */
    public final s2.g5 f11033t;

    /* renamed from: t0, reason: collision with root package name */
    public final f80 f11034t0;

    /* renamed from: u, reason: collision with root package name */
    public final String f11035u;

    /* renamed from: u0, reason: collision with root package name */
    public final String f11036u0;

    /* renamed from: v, reason: collision with root package name */
    public final ApplicationInfo f11037v;

    /* renamed from: v0, reason: collision with root package name */
    public final Bundle f11038v0;

    /* renamed from: w, reason: collision with root package name */
    public final PackageInfo f11039w;

    /* renamed from: x, reason: collision with root package name */
    public final String f11040x;

    /* renamed from: y, reason: collision with root package name */
    public final String f11041y;

    /* renamed from: z, reason: collision with root package name */
    public final String f11042z;

    kg0(int i7, Bundle bundle, s2.b5 b5Var, s2.g5 g5Var, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, w2.a aVar, Bundle bundle2, int i8, List list, Bundle bundle3, boolean z7, int i9, int i10, float f8, String str5, long j7, String str6, List list2, String str7, z10 z10Var, List list3, long j8, String str8, float f9, boolean z8, int i11, int i12, boolean z9, String str9, String str10, boolean z10, int i13, Bundle bundle4, String str11, s2.f3 f3Var, boolean z11, Bundle bundle5, String str12, String str13, String str14, boolean z12, List list4, String str15, List list5, int i14, boolean z13, boolean z14, boolean z15, ArrayList arrayList, String str16, f80 f80Var, String str17, Bundle bundle6) {
        this.f11027q = i7;
        this.f11029r = bundle;
        this.f11031s = b5Var;
        this.f11033t = g5Var;
        this.f11035u = str;
        this.f11037v = applicationInfo;
        this.f11039w = packageInfo;
        this.f11040x = str2;
        this.f11041y = str3;
        this.f11042z = str4;
        this.A = aVar;
        this.B = bundle2;
        this.C = i8;
        this.D = list;
        this.P = list3 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list3);
        this.E = bundle3;
        this.F = z7;
        this.G = i9;
        this.H = i10;
        this.I = f8;
        this.J = str5;
        this.K = j7;
        this.L = str6;
        this.M = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.N = str7;
        this.O = z10Var;
        this.Q = j8;
        this.R = str8;
        this.S = f9;
        this.X = z8;
        this.T = i11;
        this.U = i12;
        this.V = z9;
        this.W = str9;
        this.Y = str10;
        this.Z = z10;
        this.f11011a0 = i13;
        this.f11012b0 = bundle4;
        this.f11013c0 = str11;
        this.f11014d0 = f3Var;
        this.f11015e0 = z11;
        this.f11016f0 = bundle5;
        this.f11017g0 = str12;
        this.f11018h0 = str13;
        this.f11019i0 = str14;
        this.f11020j0 = z12;
        this.f11021k0 = list4;
        this.f11022l0 = str15;
        this.f11023m0 = list5;
        this.f11024n0 = i14;
        this.f11025o0 = z13;
        this.f11026p0 = z14;
        this.f11028q0 = z15;
        this.f11030r0 = arrayList;
        this.f11032s0 = str16;
        this.f11034t0 = f80Var;
        this.f11036u0 = str17;
        this.f11038v0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f11027q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.f(parcel, 2, this.f11029r, false);
        q3.c.q(parcel, 3, this.f11031s, i7, false);
        q3.c.q(parcel, 4, this.f11033t, i7, false);
        q3.c.r(parcel, 5, this.f11035u, false);
        q3.c.q(parcel, 6, this.f11037v, i7, false);
        q3.c.q(parcel, 7, this.f11039w, i7, false);
        q3.c.r(parcel, 8, this.f11040x, false);
        q3.c.r(parcel, 9, this.f11041y, false);
        q3.c.r(parcel, 10, this.f11042z, false);
        q3.c.q(parcel, 11, this.A, i7, false);
        q3.c.f(parcel, 12, this.B, false);
        q3.c.l(parcel, 13, this.C);
        q3.c.t(parcel, 14, this.D, false);
        q3.c.f(parcel, 15, this.E, false);
        q3.c.c(parcel, 16, this.F);
        q3.c.l(parcel, 18, this.G);
        q3.c.l(parcel, 19, this.H);
        q3.c.i(parcel, 20, this.I);
        q3.c.r(parcel, 21, this.J, false);
        q3.c.o(parcel, 25, this.K);
        q3.c.r(parcel, 26, this.L, false);
        q3.c.t(parcel, 27, this.M, false);
        q3.c.r(parcel, 28, this.N, false);
        q3.c.q(parcel, 29, this.O, i7, false);
        q3.c.t(parcel, 30, this.P, false);
        q3.c.o(parcel, 31, this.Q);
        q3.c.r(parcel, 33, this.R, false);
        q3.c.i(parcel, 34, this.S);
        q3.c.l(parcel, 35, this.T);
        q3.c.l(parcel, 36, this.U);
        q3.c.c(parcel, 37, this.V);
        q3.c.r(parcel, 39, this.W, false);
        q3.c.c(parcel, 40, this.X);
        q3.c.r(parcel, 41, this.Y, false);
        q3.c.c(parcel, 42, this.Z);
        q3.c.l(parcel, 43, this.f11011a0);
        q3.c.f(parcel, 44, this.f11012b0, false);
        q3.c.r(parcel, 45, this.f11013c0, false);
        q3.c.q(parcel, 46, this.f11014d0, i7, false);
        q3.c.c(parcel, 47, this.f11015e0);
        q3.c.f(parcel, 48, this.f11016f0, false);
        q3.c.r(parcel, 49, this.f11017g0, false);
        q3.c.r(parcel, 50, this.f11018h0, false);
        q3.c.r(parcel, 51, this.f11019i0, false);
        q3.c.c(parcel, 52, this.f11020j0);
        q3.c.n(parcel, 53, this.f11021k0, false);
        q3.c.r(parcel, 54, this.f11022l0, false);
        q3.c.t(parcel, 55, this.f11023m0, false);
        q3.c.l(parcel, 56, this.f11024n0);
        q3.c.c(parcel, 57, this.f11025o0);
        q3.c.c(parcel, 58, this.f11026p0);
        q3.c.c(parcel, 59, this.f11028q0);
        q3.c.t(parcel, 60, this.f11030r0, false);
        q3.c.r(parcel, 61, this.f11032s0, false);
        q3.c.q(parcel, 63, this.f11034t0, i7, false);
        q3.c.r(parcel, 64, this.f11036u0, false);
        q3.c.f(parcel, 65, this.f11038v0, false);
        q3.c.b(parcel, a8);
    }
}
