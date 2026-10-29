package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class jr5 implements ju5 {

    /* renamed from: a, reason: collision with root package name */
    public long f10726a;

    /* renamed from: b, reason: collision with root package name */
    public long f10727b;

    /* renamed from: c, reason: collision with root package name */
    public iu5 f10728c;

    /* renamed from: d, reason: collision with root package name */
    public jr5 f10729d;

    public jr5(long j7, int i7) {
        a(j7, 65536);
    }

    public final void a(long j7, int i7) {
        rx3.h(this.f10728c == null);
        this.f10726a = j7;
        this.f10727b = j7 + 65536;
    }

    public final int b(long j7) {
        long j8 = j7 - this.f10726a;
        int i7 = this.f10728c.f10216b;
        return (int) j8;
    }

    @Override // com.google.android.gms.internal.ads.ju5
    public final ju5 c() {
        jr5 jr5Var = this.f10729d;
        if (jr5Var == null || jr5Var.f10728c == null) {
            return null;
        }
        return jr5Var;
    }

    public final jr5 d() {
        this.f10728c = null;
        jr5 jr5Var = this.f10729d;
        this.f10729d = null;
        return jr5Var;
    }

    @Override // com.google.android.gms.internal.ads.ju5
    public final iu5 h() {
        iu5 iu5Var = this.f10728c;
        iu5Var.getClass();
        return iu5Var;
    }
}
