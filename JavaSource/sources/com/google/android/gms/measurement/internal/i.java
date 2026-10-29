package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class i extends q3.a {
    public static final Parcelable.Creator<i> CREATOR = new j();
    public final g0 A;

    /* renamed from: q, reason: collision with root package name */
    public String f22220q;

    /* renamed from: r, reason: collision with root package name */
    public String f22221r;

    /* renamed from: s, reason: collision with root package name */
    public ud f22222s;

    /* renamed from: t, reason: collision with root package name */
    public long f22223t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22224u;

    /* renamed from: v, reason: collision with root package name */
    public String f22225v;

    /* renamed from: w, reason: collision with root package name */
    public final g0 f22226w;

    /* renamed from: x, reason: collision with root package name */
    public long f22227x;

    /* renamed from: y, reason: collision with root package name */
    public g0 f22228y;

    /* renamed from: z, reason: collision with root package name */
    public final long f22229z;

    i(i iVar) {
        p3.o.m(iVar);
        this.f22220q = iVar.f22220q;
        this.f22221r = iVar.f22221r;
        this.f22222s = iVar.f22222s;
        this.f22223t = iVar.f22223t;
        this.f22224u = iVar.f22224u;
        this.f22225v = iVar.f22225v;
        this.f22226w = iVar.f22226w;
        this.f22227x = iVar.f22227x;
        this.f22228y = iVar.f22228y;
        this.f22229z = iVar.f22229z;
        this.A = iVar.A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, this.f22220q, false);
        q3.c.r(parcel, 3, this.f22221r, false);
        q3.c.q(parcel, 4, this.f22222s, i7, false);
        q3.c.o(parcel, 5, this.f22223t);
        q3.c.c(parcel, 6, this.f22224u);
        q3.c.r(parcel, 7, this.f22225v, false);
        q3.c.q(parcel, 8, this.f22226w, i7, false);
        q3.c.o(parcel, 9, this.f22227x);
        q3.c.q(parcel, 10, this.f22228y, i7, false);
        q3.c.o(parcel, 11, this.f22229z);
        q3.c.q(parcel, 12, this.A, i7, false);
        q3.c.b(parcel, a8);
    }

    i(String str, String str2, ud udVar, long j7, boolean z7, String str3, g0 g0Var, long j8, g0 g0Var2, long j9, g0 g0Var3) {
        this.f22220q = str;
        this.f22221r = str2;
        this.f22222s = udVar;
        this.f22223t = j7;
        this.f22224u = z7;
        this.f22225v = str3;
        this.f22226w = g0Var;
        this.f22227x = j8;
        this.f22228y = g0Var2;
        this.f22229z = j9;
        this.A = g0Var3;
    }
}
