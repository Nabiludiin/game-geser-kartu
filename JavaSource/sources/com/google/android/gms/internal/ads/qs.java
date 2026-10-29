package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class qs {

    /* renamed from: a, reason: collision with root package name */
    final long f14597a;

    /* renamed from: b, reason: collision with root package name */
    final String f14598b;

    /* renamed from: c, reason: collision with root package name */
    final int f14599c;

    qs(long j7, String str, int i7) {
        this.f14597a = j7;
        this.f14598b = str;
        this.f14599c = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qs)) {
            return false;
        }
        qs qsVar = (qs) obj;
        return qsVar.f14597a == this.f14597a && qsVar.f14599c == this.f14599c;
    }

    public final int hashCode() {
        return (int) this.f14597a;
    }
}
