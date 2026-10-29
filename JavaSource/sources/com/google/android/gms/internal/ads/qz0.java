package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class qz0 implements ry0 {

    /* renamed from: a, reason: collision with root package name */
    private final b12 f14671a;

    qz0(b12 b12Var) {
        this.f14671a = b12Var;
    }

    @Override // com.google.android.gms.internal.ads.ry0
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f14671a.d(str.equals("true"));
    }
}
