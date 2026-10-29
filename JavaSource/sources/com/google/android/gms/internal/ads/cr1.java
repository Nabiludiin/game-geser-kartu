package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class cr1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6583a;

    /* renamed from: b, reason: collision with root package name */
    private xk5 f6584b = new xk5();

    /* renamed from: c, reason: collision with root package name */
    private boolean f6585c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6586d;

    public cr1(Object obj) {
        this.f6583a = obj;
    }

    public final void a(bq1 bq1Var) {
        this.f6586d = true;
        if (this.f6585c) {
            this.f6585c = false;
            bq1Var.a(this.f6583a, this.f6584b.b());
        }
    }

    public final void b(int i7, ap1 ap1Var) {
        if (this.f6586d) {
            return;
        }
        if (i7 != -1) {
            this.f6584b.a(i7);
        }
        this.f6585c = true;
        ap1Var.d(this.f6583a);
    }

    public final void c(bq1 bq1Var) {
        if (this.f6586d || !this.f6585c) {
            return;
        }
        km5 b8 = this.f6584b.b();
        this.f6584b = new xk5();
        this.f6585c = false;
        bq1Var.a(this.f6583a, b8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cr1.class != obj.getClass()) {
            return false;
        }
        return this.f6583a.equals(((cr1) obj).f6583a);
    }

    public final int hashCode() {
        return this.f6583a.hashCode();
    }
}
