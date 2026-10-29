package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class bu5 implements zt5 {

    /* renamed from: a, reason: collision with root package name */
    private final zt5 f6018a;

    public bu5(zt5 zt5Var) {
        this.f6018a = zt5Var;
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final int B(int i7) {
        return this.f6018a.B(i7);
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final int b0(int i7) {
        return this.f6018a.b0(i7);
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final int c() {
        return this.f6018a.c();
    }

    public final zt5 e() {
        return this.f6018a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bu5) {
            return this.f6018a.equals(((bu5) obj).f6018a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zt5
    public final int g() {
        return this.f6018a.g();
    }

    public int hashCode() {
        return this.f6018a.hashCode();
    }
}
