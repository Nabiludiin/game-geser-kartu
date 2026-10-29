package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class pa1 extends eg1 {

    /* renamed from: r, reason: collision with root package name */
    private boolean f13760r;

    public pa1(Set set) {
        super(set);
        this.f13760r = false;
    }

    public final synchronized void a() {
        if (this.f13760r) {
            return;
        }
        K0(oa1.f13252a);
        this.f13760r = true;
    }
}
