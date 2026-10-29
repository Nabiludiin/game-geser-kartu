package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: MyApplication */
public final class eh0 extends q3.a {
    public static final Parcelable.Creator<eh0> CREATOR = new fh0();
    public final boolean A;
    public final boolean B;
    public final Bundle C;
    public final Bundle D;
    public final int E;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f7624q;

    /* renamed from: r, reason: collision with root package name */
    public final w2.a f7625r;

    /* renamed from: s, reason: collision with root package name */
    public final ApplicationInfo f7626s;

    /* renamed from: t, reason: collision with root package name */
    public final String f7627t;

    /* renamed from: u, reason: collision with root package name */
    public final List f7628u;

    /* renamed from: v, reason: collision with root package name */
    public final PackageInfo f7629v;

    /* renamed from: w, reason: collision with root package name */
    public final String f7630w;

    /* renamed from: x, reason: collision with root package name */
    public final String f7631x;

    /* renamed from: y, reason: collision with root package name */
    public u23 f7632y;

    /* renamed from: z, reason: collision with root package name */
    public String f7633z;

    public eh0(Bundle bundle, w2.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, u23 u23Var, String str4, boolean z7, boolean z8, Bundle bundle2, Bundle bundle3, int i7) {
        this.f7624q = bundle;
        this.f7625r = aVar;
        this.f7627t = str;
        this.f7626s = applicationInfo;
        this.f7628u = list;
        this.f7629v = packageInfo;
        this.f7630w = str2;
        this.f7631x = str3;
        this.f7632y = u23Var;
        this.f7633z = str4;
        this.A = z7;
        this.B = z8;
        this.C = bundle2;
        this.D = bundle3;
        this.E = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Bundle bundle = this.f7624q;
        int a8 = q3.c.a(parcel);
        q3.c.f(parcel, 1, bundle, false);
        q3.c.q(parcel, 2, this.f7625r, i7, false);
        q3.c.q(parcel, 3, this.f7626s, i7, false);
        q3.c.r(parcel, 4, this.f7627t, false);
        q3.c.t(parcel, 5, this.f7628u, false);
        q3.c.q(parcel, 6, this.f7629v, i7, false);
        q3.c.r(parcel, 7, this.f7630w, false);
        q3.c.r(parcel, 9, this.f7631x, false);
        q3.c.q(parcel, 10, this.f7632y, i7, false);
        q3.c.r(parcel, 11, this.f7633z, false);
        q3.c.c(parcel, 12, this.A);
        q3.c.c(parcel, 13, this.B);
        q3.c.f(parcel, 14, this.C, false);
        q3.c.f(parcel, 15, this.D, false);
        q3.c.l(parcel, 16, this.E);
        q3.c.b(parcel, a8);
    }
}
