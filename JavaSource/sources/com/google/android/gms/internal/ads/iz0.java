package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: MyApplication */
public final class iz0 implements ry0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10266a;

    /* renamed from: b, reason: collision with root package name */
    private final v2.p1 f10267b = r2.t.l().q();

    public iz0(Context context) {
        this.f10266a = context;
    }

    @Override // com.google.android.gms.internal.ads.ry0
    public final void a(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        v2.p1 p1Var = this.f10267b;
        boolean parseBoolean = Boolean.parseBoolean(str);
        p1Var.x0(parseBoolean);
        if (parseBoolean) {
            v2.d.a(this.f10266a);
        }
    }
}
