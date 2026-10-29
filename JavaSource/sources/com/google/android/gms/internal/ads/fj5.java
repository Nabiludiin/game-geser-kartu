package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class fj5 {

    /* renamed from: d, reason: collision with root package name */
    public static final fj5 f8288d = new ej5().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8289a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8290b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8291c;

    /* synthetic */ fj5(ej5 ej5Var, byte[] bArr) {
        this.f8289a = ej5Var.e();
        this.f8290b = ej5Var.f();
        this.f8291c = ej5Var.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fj5.class == obj.getClass()) {
            fj5 fj5Var = (fj5) obj;
            if (this.f8289a == fj5Var.f8289a && this.f8290b == fj5Var.f8290b && this.f8291c == fj5Var.f8291c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z7 = this.f8289a;
        boolean z8 = this.f8290b;
        return ((z7 ? 1 : 0) << 2) + (z8 ? 1 : 0) + (z8 ? 1 : 0) + (this.f8291c ? 1 : 0);
    }
}
