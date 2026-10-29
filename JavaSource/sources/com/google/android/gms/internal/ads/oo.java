package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: MyApplication */
public final class oo extends rl {

    /* renamed from: b, reason: collision with root package name */
    public Long f13416b;

    /* renamed from: c, reason: collision with root package name */
    public Long f13417c;

    /* renamed from: d, reason: collision with root package name */
    public Long f13418d;

    /* renamed from: e, reason: collision with root package name */
    public Long f13419e;

    /* renamed from: f, reason: collision with root package name */
    public Long f13420f;

    public oo(String str) {
        HashMap b8 = rl.b(str);
        if (b8 != null) {
            this.f13416b = (Long) b8.get(0);
            this.f13417c = (Long) b8.get(1);
            this.f13418d = (Long) b8.get(2);
            this.f13419e = (Long) b8.get(3);
            this.f13420f = (Long) b8.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.rl
    protected final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f13416b);
        hashMap.put(1, this.f13417c);
        hashMap.put(2, this.f13418d);
        hashMap.put(3, this.f13419e);
        hashMap.put(4, this.f13420f);
        return hashMap;
    }
}
