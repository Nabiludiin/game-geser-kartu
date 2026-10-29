package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: MyApplication */
public final class jn extends rl {

    /* renamed from: b, reason: collision with root package name */
    public Long f10649b;

    /* renamed from: c, reason: collision with root package name */
    public Long f10650c;

    /* renamed from: d, reason: collision with root package name */
    public Long f10651d;

    public jn(String str) {
        HashMap b8 = rl.b(str);
        if (b8 != null) {
            this.f10649b = (Long) b8.get(0);
            this.f10650c = (Long) b8.get(1);
            this.f10651d = (Long) b8.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.rl
    protected final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f10649b);
        hashMap.put(1, this.f10650c);
        hashMap.put(2, this.f10651d);
        return hashMap;
    }
}
