package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public final class x61 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18626a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f18627b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f18628c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f18629d = new ConcurrentHashMap();

    public final void a(String str) {
        synchronized (this.f18626a) {
            try {
                ConcurrentHashMap concurrentHashMap = this.f18627b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(String str) {
        Integer num = (Integer) this.f18627b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long c(String str) {
        Long l7 = (Long) this.f18629d.get(str);
        if (l7 == null) {
            return -1L;
        }
        return l7.longValue();
    }

    public final void d(String str, long j7) {
        this.f18628c.put(str, Long.valueOf(j7));
    }

    public final void e(String str, String str2, long j7) {
        ConcurrentHashMap concurrentHashMap = this.f18628c;
        Long l7 = (Long) concurrentHashMap.get(str2);
        if (l7 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.f18629d.put(str, Long.valueOf(j7 - l7.longValue()));
    }
}
