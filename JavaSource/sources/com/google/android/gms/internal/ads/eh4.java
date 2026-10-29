package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public final class eh4 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f7645a = new HashMap();

    public final fh4 a() {
        if (this.f7645a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        fh4 fh4Var = new fh4(Collections.unmodifiableMap(this.f7645a), null);
        this.f7645a = null;
        return fh4Var;
    }
}
