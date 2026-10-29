package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
abstract class j85 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10397a;

    j85(Map map) {
        this.f10397a = Collections.unmodifiableMap(map);
    }

    final Map a() {
        return this.f10397a;
    }
}
