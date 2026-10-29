package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class ot {

    /* renamed from: a, reason: collision with root package name */
    public Object f13475a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13476b;

    /* renamed from: c, reason: collision with root package name */
    public int f13477c;

    /* renamed from: d, reason: collision with root package name */
    public long f13478d;

    /* renamed from: e, reason: collision with root package name */
    public long f13479e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13480f;

    /* renamed from: g, reason: collision with root package name */
    public ck0 f13481g = ck0.f6475e;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final ot a(Object obj, Object obj2, int i7, long j7, long j8, ck0 ck0Var, boolean z7) {
        this.f13475a = obj;
        this.f13476b = obj2;
        this.f13477c = i7;
        this.f13478d = j7;
        this.f13479e = 0L;
        this.f13481g = ck0Var;
        this.f13480f = z7;
        return this;
    }

    public final int b() {
        int i7 = this.f13481g.f6477a;
        return 0;
    }

    public final long c(int i7) {
        long j7 = this.f13481g.a(i7).f4614a;
        return 0L;
    }

    public final int d(int i7) {
        return this.f13481g.a(i7).a(-1);
    }

    public final int e(long j7) {
        this.f13481g.b(-1);
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ot.class.equals(obj.getClass())) {
            ot otVar = (ot) obj;
            if (Objects.equals(this.f13475a, otVar.f13475a) && Objects.equals(this.f13476b, otVar.f13476b) && this.f13477c == otVar.f13477c && this.f13478d == otVar.f13478d && this.f13480f == otVar.f13480f && Objects.equals(this.f13481g, otVar.f13481g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(long j7) {
        return -1;
    }

    public final int g(int i7) {
        return this.f13481g.a(i7).f4615b;
    }

    public final long h(int i7, int i8) {
        a a8 = this.f13481g.a(i7);
        if (a8.f4615b != -1) {
            return a8.f4619f[i8];
        }
        return -9223372036854775807L;
    }

    public final int hashCode() {
        Object obj = this.f13475a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f13476b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f13477c;
        long j7 = this.f13478d;
        return (((((hashCode2 * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 961) + (this.f13480f ? 1 : 0)) * 31) + this.f13481g.hashCode();
    }

    public final boolean i(int i7) {
        b();
        if (i7 != -1) {
            return false;
        }
        this.f13481g.b(-1);
        return false;
    }

    public final long j() {
        long j7 = this.f13481g.f6478b;
        return 0L;
    }

    public final boolean k(int i7) {
        boolean z7 = this.f13481g.a(i7).f4623j;
        return false;
    }
}
