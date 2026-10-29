package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: MyApplication */
public final class eo extends rl {

    /* renamed from: b, reason: collision with root package name */
    public Long f7728b;

    /* renamed from: c, reason: collision with root package name */
    public Long f7729c;

    public eo(String str) {
        HashMap b8 = rl.b(str);
        if (b8 != null) {
            this.f7728b = (Long) b8.get(0);
            this.f7729c = (Long) b8.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.rl
    protected final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f7728b);
        hashMap.put(1, this.f7729c);
        return hashMap;
    }
}
