package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class wc1 extends eg1 {

    /* renamed from: r, reason: collision with root package name */
    private boolean f18187r;

    public wc1(Set set) {
        super(set);
        this.f18187r = false;
    }

    public final synchronized void a() {
        if (this.f18187r) {
            return;
        }
        K0(vc1.f17553a);
        this.f18187r = true;
    }
}
