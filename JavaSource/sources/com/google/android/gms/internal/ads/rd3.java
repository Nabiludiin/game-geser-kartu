package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class rd3 extends q3.a {
    public static final Parcelable.Creator<rd3> CREATOR = new sd3();

    /* renamed from: q, reason: collision with root package name */
    public final int f14871q;

    /* renamed from: r, reason: collision with root package name */
    private xk f14872r = null;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f14873s;

    rd3(int i7, byte[] bArr) {
        this.f14871q = i7;
        this.f14873s = bArr;
        b();
    }

    private final void b() {
        xk xkVar = this.f14872r;
        if (xkVar != null || this.f14873s == null) {
            if (xkVar == null || this.f14873s != null) {
                if (xkVar != null && this.f14873s != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (xkVar != null || this.f14873s != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final xk M0() {
        if (this.f14872r == null) {
            try {
                this.f14872r = xk.f1(this.f14873s, ez4.a());
                this.f14873s = null;
            } catch (e05 | NullPointerException e8) {
                throw new IllegalStateException(e8);
            }
        }
        b();
        return this.f14872r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14871q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        byte[] bArr = this.f14873s;
        if (bArr == null) {
            bArr = this.f14872r.e();
        }
        q3.c.g(parcel, 2, bArr, false);
        q3.c.b(parcel, a8);
    }
}
