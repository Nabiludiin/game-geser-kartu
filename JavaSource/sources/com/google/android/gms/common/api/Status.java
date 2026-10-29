package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l3.c;
import l3.j;
import p3.n;

/* compiled from: MyApplication */
public final class Status extends q3.a implements j, ReflectedParcelable {

    /* renamed from: q, reason: collision with root package name */
    private final int f4421q;

    /* renamed from: r, reason: collision with root package name */
    private final String f4422r;

    /* renamed from: s, reason: collision with root package name */
    private final PendingIntent f4423s;

    /* renamed from: t, reason: collision with root package name */
    private final k3.b f4424t;

    /* renamed from: u, reason: collision with root package name */
    public static final Status f4415u = new Status(-1);

    /* renamed from: v, reason: collision with root package name */
    public static final Status f4416v = new Status(0);

    /* renamed from: w, reason: collision with root package name */
    public static final Status f4417w = new Status(14);

    /* renamed from: x, reason: collision with root package name */
    public static final Status f4418x = new Status(8);

    /* renamed from: y, reason: collision with root package name */
    public static final Status f4419y = new Status(15);

    /* renamed from: z, reason: collision with root package name */
    public static final Status f4420z = new Status(16);
    public static final Status B = new Status(17);
    public static final Status A = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i7, String str, PendingIntent pendingIntent, k3.b bVar) {
        this.f4421q = i7;
        this.f4422r = str;
        this.f4423s = pendingIntent;
        this.f4424t = bVar;
    }

    public k3.b M0() {
        return this.f4424t;
    }

    public int N0() {
        return this.f4421q;
    }

    public String O0() {
        return this.f4422r;
    }

    public boolean P0() {
        return this.f4423s != null;
    }

    public boolean Q0() {
        return this.f4421q <= 0;
    }

    public final String R0() {
        String str = this.f4422r;
        return str != null ? str : c.a(this.f4421q);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4421q == status.f4421q && n.a(this.f4422r, status.f4422r) && n.a(this.f4423s, status.f4423s) && n.a(this.f4424t, status.f4424t);
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f4421q), this.f4422r, this.f4423s, this.f4424t);
    }

    public String toString() {
        n.a c8 = n.c(this);
        c8.a("statusCode", R0());
        c8.a("resolution", this.f4423s);
        return c8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, N0());
        q3.c.r(parcel, 2, O0(), false);
        q3.c.q(parcel, 3, this.f4423s, i7, false);
        q3.c.q(parcel, 4, M0(), i7, false);
        q3.c.b(parcel, a8);
    }

    public Status(int i7) {
        this(i7, (String) null);
    }

    public Status(k3.b bVar, String str) {
        this(bVar, str, 17);
    }

    public Status(int i7, String str) {
        this(i7, str, (PendingIntent) null);
    }

    public Status(k3.b bVar, String str, int i7) {
        this(i7, str, bVar.O0(), bVar);
    }

    public Status(int i7, String str, PendingIntent pendingIntent) {
        this(i7, str, pendingIntent, null);
    }

    @Override // l3.j
    public Status x0() {
        return this;
    }
}
