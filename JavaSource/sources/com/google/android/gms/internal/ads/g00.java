package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public class g00 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8571a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8572b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8573c;

    protected g00(String str, Object obj, int i7) {
        this.f8571a = str;
        this.f8572b = obj;
        this.f8573c = i7;
    }

    public static g00 a(String str, boolean z7) {
        return new g00(str, Boolean.valueOf(z7), 1);
    }

    public static g00 b(String str, long j7) {
        return new g00(str, Long.valueOf(j7), 2);
    }

    public static g00 c(String str, double d8) {
        return new g00(str, Double.valueOf(d8), 3);
    }

    public static g00 d(String str, String str2) {
        return new g00("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object e() {
        m10 a8 = o10.a();
        if (a8 == null) {
            o10.b();
            return this.f8572b;
        }
        int i7 = this.f8573c - 1;
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? a8.a(this.f8571a, (String) this.f8572b) : a8.c(this.f8571a, ((Double) this.f8572b).doubleValue()) : a8.b(this.f8571a, ((Long) this.f8572b).longValue()) : a8.d(this.f8571a, ((Boolean) this.f8572b).booleanValue());
    }
}
