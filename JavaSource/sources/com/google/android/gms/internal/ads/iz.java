package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class iz {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10264a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final kz f10265b;

    public iz(kz kzVar) {
        this.f10265b = kzVar;
    }

    public final void a(String str, hz hzVar) {
        this.f10264a.put(str, hzVar);
    }

    public final void b(String str, String str2, long j7) {
        Map map = this.f10264a;
        hz hzVar = (hz) map.get(str2);
        String[] strArr = {str};
        if (hzVar != null) {
            this.f10265b.b(hzVar, j7, strArr);
        }
        map.put(str, new hz(j7, null, null));
    }

    public final kz c() {
        return this.f10265b;
    }
}
