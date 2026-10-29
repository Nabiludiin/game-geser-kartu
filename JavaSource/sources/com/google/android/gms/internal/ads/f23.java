package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: MyApplication */
public final class f23 implements z91 {

    /* renamed from: q, reason: collision with root package name */
    private final HashSet f7986q = new HashSet();

    /* renamed from: r, reason: collision with root package name */
    private final Context f7987r;

    /* renamed from: s, reason: collision with root package name */
    private final tl0 f7988s;

    public f23(Context context, tl0 tl0Var) {
        this.f7987r = context;
        this.f7988s = tl0Var;
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f7986q;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle b() {
        return this.f7988s.m(this.f7987r, this);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final synchronized void o(s2.x2 x2Var) {
        if (x2Var.f26259q != 3) {
            this.f7988s.b(this.f7986q);
        }
    }
}
