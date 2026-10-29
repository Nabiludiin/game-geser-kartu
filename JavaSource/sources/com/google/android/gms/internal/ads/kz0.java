package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class kz0 implements ry0 {

    /* renamed from: a, reason: collision with root package name */
    private final b03 f11301a;

    public kz0(b03 b03Var) {
        this.f11301a = b03Var;
    }

    @Override // com.google.android.gms.internal.ads.ry0
    public final void a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f11301a.a(Boolean.parseBoolean(str));
        } catch (Exception e8) {
            throw new IllegalStateException("Invalid render_in_browser state", e8);
        }
    }
}
