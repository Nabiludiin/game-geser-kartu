package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class dj4 extends RuntimeException {
    public dj4(String str) {
        super(str);
    }

    public static Object a(cj4 cj4Var) {
        try {
            return cj4Var.a();
        } catch (Exception e8) {
            throw new dj4(e8);
        }
    }

    public dj4(String str, Throwable th) {
        super(str, th);
    }

    public dj4(Throwable th) {
        super(th);
    }
}
