package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class mj1 extends eg1 {

    /* renamed from: r, reason: collision with root package name */
    private boolean f12272r;

    protected mj1(Set set) {
        super(set);
    }

    public final void U0() {
        K0(hj1.f9551a);
    }

    public final synchronized void W0() {
        try {
            if (!this.f12272r) {
                K0(kj1.f11075a);
                this.f12272r = true;
            }
            K0(jj1.f10570a);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a() {
        K0(lj1.f11623a);
    }

    public final synchronized void d() {
        K0(ij1.f10064a);
        this.f12272r = true;
    }
}
