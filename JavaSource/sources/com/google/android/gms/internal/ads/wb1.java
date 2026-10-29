package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: MyApplication */
public final class wb1 extends eg1 implements n40 {

    /* renamed from: r, reason: collision with root package name */
    private final Bundle f18169r;

    wb1(Set set) {
        super(set);
        this.f18169r = new Bundle();
    }

    public final synchronized Bundle U0() {
        return new Bundle(this.f18169r);
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final synchronized void n(String str, Bundle bundle) {
        this.f18169r.putAll(bundle);
        K0(vb1.f17517a);
    }
}
