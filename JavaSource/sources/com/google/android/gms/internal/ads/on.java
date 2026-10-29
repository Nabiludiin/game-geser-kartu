package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: MyApplication */
public final class on extends rl {

    /* renamed from: b, reason: collision with root package name */
    public long f13394b;

    /* renamed from: c, reason: collision with root package name */
    public long f13395c;

    public on(String str) {
        this.f13394b = -1L;
        this.f13395c = -1L;
        HashMap b8 = rl.b(str);
        if (b8 != null) {
            this.f13394b = ((Long) b8.get(0)).longValue();
            this.f13395c = ((Long) b8.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.rl
    protected final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.f13394b));
        hashMap.put(1, Long.valueOf(this.f13395c));
        return hashMap;
    }
}
