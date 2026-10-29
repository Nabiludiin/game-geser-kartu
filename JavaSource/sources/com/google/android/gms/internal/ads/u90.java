package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class u90 extends pm0 {

    /* renamed from: c, reason: collision with root package name */
    private final Object f16645c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final aa0 f16646d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16647e;

    public u90(aa0 aa0Var) {
        this.f16646d = aa0Var;
    }

    public final void g() {
        v2.n1.k("release: Trying to acquire lock");
        synchronized (this.f16645c) {
            try {
                v2.n1.k("release: Lock acquired");
                if (this.f16647e) {
                    v2.n1.k("release: Lock already released");
                    return;
                }
                this.f16647e = true;
                a(new r90(this), new lm0());
                a(new s90(this), new t90(this));
                v2.n1.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ aa0 h() {
        return this.f16646d;
    }
}
