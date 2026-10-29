package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class y15 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f19338a = 100;

    y15() {
    }

    abstract void a(Object obj, int i7, long j7);

    abstract void b(Object obj, int i7, int i8);

    abstract void c(Object obj, int i7, long j7);

    abstract void d(Object obj, int i7, qy4 qy4Var);

    abstract void e(Object obj, int i7, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract Object h(Object obj);

    abstract void i(Object obj, Object obj2);

    abstract void j(Object obj);

    final boolean k(Object obj, i15 i15Var, int i7) {
        int d8 = i15Var.d();
        int i8 = d8 >>> 3;
        int i9 = d8 & 7;
        if (i9 == 0) {
            a(obj, i8, i15Var.g());
            return true;
        }
        if (i9 == 1) {
            c(obj, i8, i15Var.i());
            return true;
        }
        if (i9 == 2) {
            d(obj, i8, i15Var.m());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                if (i7 != 0) {
                    return false;
                }
                throw new e05("Protocol message end-group tag did not match expected tag.");
            }
            if (i9 != 5) {
                throw new d05("Protocol message tag had invalid wire type.");
            }
            b(obj, i8, i15Var.l());
            return true;
        }
        Object f8 = f();
        int i10 = i8 << 3;
        int i11 = i7 + 1;
        if (i11 >= f19338a) {
            throw new e05("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (i15Var.b() != Integer.MAX_VALUE && k(f8, i15Var, i11)) {
        }
        if ((i10 | 4) != i15Var.d()) {
            throw new e05("Protocol message end-group tag did not match expected tag.");
        }
        e(obj, i8, g(f8));
        return true;
    }
}
