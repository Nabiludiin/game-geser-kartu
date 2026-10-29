package com.google.android.gms.measurement.internal;

/* compiled from: MyApplication */
final class nd {

    /* renamed from: a, reason: collision with root package name */
    private final pd f22414a;

    /* renamed from: b, reason: collision with root package name */
    private int f22415b = 1;

    /* renamed from: c, reason: collision with root package name */
    private long f22416c = d();

    public nd(pd pdVar) {
        this.f22414a = pdVar;
    }

    private final long d() {
        pd pdVar = this.f22414a;
        p3.o.m(pdVar);
        long longValue = ((Long) c5.f21987v.b(null)).longValue();
        long longValue2 = ((Long) c5.f21989w.b(null)).longValue();
        for (int i7 = 1; i7 < this.f22415b; i7++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        return pdVar.f().a() + Math.min(longValue, longValue2);
    }

    public final void a() {
        this.f22415b++;
        this.f22416c = d();
    }

    public final boolean b() {
        return this.f22414a.f().a() >= this.f22416c;
    }

    final /* synthetic */ long c() {
        return this.f22416c;
    }
}
