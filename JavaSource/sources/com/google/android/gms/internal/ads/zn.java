package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: MyApplication */
public final class zn extends rl {

    /* renamed from: b, reason: collision with root package name */
    public Long f20231b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f20232c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f20233d;

    public zn(String str) {
        HashMap b8 = rl.b(str);
        if (b8 != null) {
            this.f20231b = (Long) b8.get(0);
            this.f20232c = (Boolean) b8.get(1);
            this.f20233d = (Boolean) b8.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.rl
    protected final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f20231b);
        hashMap.put(1, this.f20232c);
        hashMap.put(2, this.f20233d);
        return hashMap;
    }
}
