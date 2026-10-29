package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class z50 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final b12 f20020a;

    public z50(b12 b12Var) {
        p3.o.n(b12Var, "The Inspector Manager must not be null");
        this.f20020a = b12Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.f20020a.k((String) map.get("persistentData"));
    }
}
