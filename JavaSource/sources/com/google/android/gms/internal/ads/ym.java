package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: MyApplication */
public final class ym {

    /* renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f19650c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    protected static volatile je3 f19651d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile Random f19652e = null;

    /* renamed from: a, reason: collision with root package name */
    private final ko f19653a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile Boolean f19654b;

    public ym(ko koVar) {
        this.f19653a = koVar;
        koVar.d().execute(new xm(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (f19652e == null) {
                synchronized (ym.class) {
                    try {
                        if (f19652e == null) {
                            f19652e = new Random();
                        }
                    } finally {
                    }
                }
            }
            return f19652e.nextInt();
        }
    }

    public final void a(int i7, int i8, long j7, String str, Exception exc) {
        try {
            f19650c.block();
            if (!this.f19654b.booleanValue() || f19651d == null) {
                return;
            }
            fj d02 = jj.d0();
            d02.E(this.f19653a.f11151a.getPackageName());
            d02.F(j7);
            if (str != null) {
                d02.I(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                d02.G(stringWriter.toString());
                d02.H(exc.getClass().getName());
            }
            ie3 a8 = f19651d.a(((jj) d02.A()).e());
            a8.c(i7);
            if (i8 != -1) {
                a8.b(i8);
            }
            a8.a();
        } catch (Exception unused) {
        }
    }

    final /* synthetic */ ko b() {
        return this.f19653a;
    }
}
