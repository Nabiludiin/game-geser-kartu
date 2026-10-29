package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: MyApplication */
public final class tl extends rl {

    /* renamed from: b, reason: collision with root package name */
    public String f16234b;

    /* renamed from: c, reason: collision with root package name */
    public long f16235c;

    /* renamed from: d, reason: collision with root package name */
    public String f16236d;

    /* renamed from: e, reason: collision with root package name */
    public String f16237e;

    /* renamed from: f, reason: collision with root package name */
    public String f16238f;

    public tl(String str) {
        this.f16234b = "E";
        this.f16235c = -1L;
        this.f16236d = "E";
        this.f16237e = "E";
        this.f16238f = "E";
        HashMap b8 = rl.b(str);
        if (b8 != null) {
            this.f16234b = b8.get(0) == null ? "E" : (String) b8.get(0);
            this.f16235c = b8.get(1) != null ? ((Long) b8.get(1)).longValue() : -1L;
            this.f16236d = b8.get(2) == null ? "E" : (String) b8.get(2);
            this.f16237e = b8.get(3) == null ? "E" : (String) b8.get(3);
            this.f16238f = b8.get(4) != null ? (String) b8.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.rl
    protected final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f16234b);
        hashMap.put(4, this.f16238f);
        hashMap.put(3, this.f16237e);
        hashMap.put(2, this.f16236d);
        hashMap.put(1, Long.valueOf(this.f16235c));
        return hashMap;
    }
}
