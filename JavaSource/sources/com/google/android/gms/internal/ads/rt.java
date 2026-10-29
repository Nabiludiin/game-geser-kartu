package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* compiled from: MyApplication */
public final class rt extends q3.a {
    public static final Parcelable.Creator<rt> CREATOR = new st();

    /* renamed from: q, reason: collision with root package name */
    private ParcelFileDescriptor f15211q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f15212r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f15213s;

    /* renamed from: t, reason: collision with root package name */
    private final long f15214t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f15215u;

    public rt() {
        this(null, false, false, 0L, false);
    }

    public final synchronized InputStream M0() {
        if (this.f15211q == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f15211q);
        this.f15211q = null;
        return autoCloseInputStream;
    }

    final synchronized ParcelFileDescriptor N0() {
        return this.f15211q;
    }

    public final synchronized boolean O0() {
        return this.f15213s;
    }

    public final synchronized long P0() {
        return this.f15214t;
    }

    public final synchronized boolean Q0() {
        return this.f15215u;
    }

    public final synchronized boolean a() {
        return this.f15211q != null;
    }

    public final synchronized boolean h() {
        return this.f15212r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.q(parcel, 2, N0(), i7, false);
        q3.c.c(parcel, 3, h());
        q3.c.c(parcel, 4, O0());
        q3.c.o(parcel, 5, P0());
        q3.c.c(parcel, 6, Q0());
        q3.c.b(parcel, a8);
    }

    public rt(ParcelFileDescriptor parcelFileDescriptor, boolean z7, boolean z8, long j7, boolean z9) {
        this.f15211q = parcelFileDescriptor;
        this.f15212r = z7;
        this.f15213s = z8;
        this.f15214t = j7;
        this.f15215u = z9;
    }
}
