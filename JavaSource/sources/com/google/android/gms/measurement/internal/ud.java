package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class ud extends q3.a {
    public static final Parcelable.Creator<ud> CREATOR = new vd();

    /* renamed from: q, reason: collision with root package name */
    public final int f22700q;

    /* renamed from: r, reason: collision with root package name */
    public final String f22701r;

    /* renamed from: s, reason: collision with root package name */
    public final long f22702s;

    /* renamed from: t, reason: collision with root package name */
    public final Long f22703t;

    /* renamed from: u, reason: collision with root package name */
    public final String f22704u;

    /* renamed from: v, reason: collision with root package name */
    public final String f22705v;

    /* renamed from: w, reason: collision with root package name */
    public final Double f22706w;

    ud(int i7, String str, long j7, Long l7, Float f8, String str2, String str3, Double d8) {
        this.f22700q = i7;
        this.f22701r = str;
        this.f22702s = j7;
        this.f22703t = l7;
        this.f22706w = i7 == 1 ? f8 != null ? Double.valueOf(f8.doubleValue()) : null : d8;
        this.f22704u = str2;
        this.f22705v = str3;
    }

    public final Object M0() {
        Long l7 = this.f22703t;
        if (l7 != null) {
            return l7;
        }
        Double d8 = this.f22706w;
        if (d8 != null) {
            return d8;
        }
        String str = this.f22704u;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        vd.a(this, parcel, i7);
    }

    ud(wd wdVar) {
        this(wdVar.f22832c, wdVar.f22833d, wdVar.f22834e, wdVar.f22831b);
    }

    ud(String str, long j7, Object obj, String str2) {
        p3.o.g(str);
        this.f22700q = 2;
        this.f22701r = str;
        this.f22702s = j7;
        this.f22705v = str2;
        if (obj == null) {
            this.f22703t = null;
            this.f22706w = null;
            this.f22704u = null;
            return;
        }
        if (obj instanceof Long) {
            this.f22703t = (Long) obj;
            this.f22706w = null;
            this.f22704u = null;
        } else if (obj instanceof String) {
            this.f22703t = null;
            this.f22706w = null;
            this.f22704u = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f22703t = null;
                this.f22706w = (Double) obj;
                this.f22704u = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
