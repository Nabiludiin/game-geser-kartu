package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: MyApplication */
public final class ga0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8734a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f8735b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private pa0 f8736c;

    /* renamed from: d, reason: collision with root package name */
    private pa0 f8737d;

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean d(Context context) {
        if (((Boolean) g10.f8600c.e()).booleanValue()) {
            return Arrays.asList(((String) g10.f8601d.e()).split(",")).contains(v2.f2.Y(c(context)).a().toLowerCase(Locale.ROOT));
        }
        return false;
    }

    public final pa0 a(Context context, w2.a aVar, e63 e63Var) {
        pa0 pa0Var;
        synchronized (this.f8735b) {
            try {
                if (this.f8737d == null) {
                    this.f8737d = new pa0(c(context), aVar, d(context) ? (String) g10.f8599b.e() : (String) g10.f8603f.e(), e63Var);
                }
                pa0Var = this.f8737d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pa0Var;
    }

    public final pa0 b(Context context, w2.a aVar, e63 e63Var) {
        pa0 pa0Var;
        synchronized (this.f8734a) {
            try {
                if (this.f8736c == null) {
                    this.f8736c = new pa0(c(context), aVar, d(context) ? ((Boolean) c10.f6213g.e()).booleanValue() ? (String) g10.f8598a.e() : (String) g10.f8602e.e() : ((Boolean) c10.f6212f.e()).booleanValue() ? (String) s2.b0.c().d(uy.f17045a) : (String) s2.b0.c().d(uy.f17054b), e63Var);
                }
                pa0Var = this.f8736c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pa0Var;
    }
}
