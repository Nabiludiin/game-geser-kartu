package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: MyApplication */
public final class f60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8045a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8046b;

    public f60(Context context, Map map) {
        this.f8045a = context;
        this.f8046b = map;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        jk0 d8 = r2.t.d();
        Context context = this.f8045a;
        if (d8.a(context)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        r2.t.d().l(context, str2, (Map) this.f8046b.get("_ai"));
                        return;
                    }
                } else if (str.equals("_ac")) {
                    r2.t.d().k(context, str2, (Map) this.f8046b.get("_ac"));
                    return;
                }
            } else if (str.equals("_aa")) {
                r2.t.d().n(context, str2);
                return;
            }
            int i7 = v2.n1.f26802b;
            w2.p.c("logScionEvent gmsg contained unsupported eventName");
        }
    }
}
