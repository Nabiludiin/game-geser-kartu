package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class yy0 implements ry0 {

    /* renamed from: a, reason: collision with root package name */
    private final b12 f19916a;

    yy0(b12 b12Var) {
        this.f19916a = b12Var;
    }

    @Override // com.google.android.gms.internal.ads.ry0
    public final void a(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                this.f19916a.f(x02.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.f19916a.f(x02.FLICK);
            return;
        }
        this.f19916a.f(x02.NONE);
    }
}
