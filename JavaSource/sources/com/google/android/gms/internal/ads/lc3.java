package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public class lc3 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f11553e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11554f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f11555a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f11556b;

    /* renamed from: c, reason: collision with root package name */
    private final w4.i f11557c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11558d;

    public lc3(Context context, Executor executor, w4.i iVar, boolean z7) {
        this.f11555a = context;
        this.f11556b = executor;
        this.f11557c = iVar;
        this.f11558d = z7;
    }

    public static lc3 a(final Context context, Executor executor, boolean z7) {
        final w4.j jVar = new w4.j();
        if (z7) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hc3
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i7 = lc3.f11554f;
                    jVar.c(je3.b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jc3
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i7 = lc3.f11554f;
                    w4.j.this.c(je3.c());
                }
            });
        }
        return new lc3(context, executor, jVar.a(), z7);
    }

    static void g(int i7) {
        f11553e = i7;
    }

    private final w4.i h(final int i7, long j7, Exception exc, String str, Map map, String str2) {
        if (!this.f11558d) {
            return this.f11557c.g(this.f11556b, kc3.f10968a);
        }
        Context context = this.f11555a;
        final fj d02 = jj.d0();
        d02.E(context.getPackageName());
        d02.F(j7);
        d02.K(f11553e);
        if (exc != null) {
            int i8 = py3.f14159b;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            d02.G(stringWriter.toString());
            d02.H(exc.getClass().getName());
        }
        if (str2 != null) {
            d02.I(str2);
        }
        if (str != null) {
            d02.J(str);
        }
        return this.f11557c.g(this.f11556b, new w4.b() { // from class: com.google.android.gms.internal.ads.ic3
            @Override // w4.b
            public final /* synthetic */ Object a(w4.i iVar) {
                int i9 = lc3.f11554f;
                if (!iVar.n()) {
                    return Boolean.FALSE;
                }
                int i10 = i7;
                ie3 a8 = ((je3) iVar.k()).a(((jj) fj.this.A()).e());
                a8.c(i10);
                a8.a();
                return Boolean.TRUE;
            }
        });
    }

    public w4.i b(int i7, long j7) {
        return h(i7, j7, null, null, null, null);
    }

    public w4.i c(int i7, long j7, Exception exc) {
        return h(i7, j7, exc, null, null, null);
    }

    public final w4.i d(int i7, long j7, String str, Map map) {
        return h(i7, j7, null, str, null, null);
    }

    public w4.i e(int i7, String str) {
        return h(i7, 0L, null, null, null, str);
    }

    public final w4.i f(int i7, long j7, String str) {
        return h(i7, j7, null, null, null, str);
    }
}
