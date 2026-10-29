package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
abstract class l1 extends h2 implements a2 {

    /* renamed from: t, reason: collision with root package name */
    static final Object f21598t = new Object();

    /* renamed from: u, reason: collision with root package name */
    static final z1 f21599u = new z1(f1.class);

    /* renamed from: v, reason: collision with root package name */
    static final boolean f21600v;

    /* renamed from: w, reason: collision with root package name */
    private static final g1 f21601w;

    /* renamed from: q, reason: collision with root package name */
    volatile Object f21602q;

    /* renamed from: r, reason: collision with root package name */
    volatile d1 f21603r;

    /* renamed from: s, reason: collision with root package name */
    volatile k1 f21604s;

    static {
        boolean z7;
        Throwable th;
        Throwable th2;
        g1 i1Var;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z7 = false;
        }
        f21600v = z7;
        String property = System.getProperty("java.runtime.name", "");
        p1 p1Var = null;
        if (property == null || property.contains("Android")) {
            try {
                i1Var = new j1(p1Var);
            } catch (Error | Exception e8) {
                try {
                    i1Var = new h1(p1Var);
                    th = null;
                    th2 = e8;
                } catch (Error | Exception e9) {
                    th = e9;
                    th2 = e8;
                    i1Var = new i1(p1Var);
                }
            }
        } else {
            try {
                i1Var = new h1(p1Var);
            } catch (NoClassDefFoundError unused2) {
                i1Var = new i1(p1Var);
            }
        }
        th = null;
        th2 = null;
        f21601w = i1Var;
        if (th != null) {
            z1 z1Var = f21599u;
            Logger a8 = z1Var.a();
            Level level = Level.SEVERE;
            a8.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            z1Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    l1() {
    }

    private final void b(k1 k1Var) {
        k1Var.f21591a = null;
        while (true) {
            k1 k1Var2 = this.f21604s;
            if (k1Var2 != k1.f21590c) {
                k1 k1Var3 = null;
                while (k1Var2 != null) {
                    k1 k1Var4 = k1Var2.f21592b;
                    if (k1Var2.f21591a != null) {
                        k1Var3 = k1Var2;
                    } else if (k1Var3 != null) {
                        k1Var3.f21592b = k1Var4;
                        if (k1Var3.f21591a == null) {
                            break;
                        }
                    } else if (!f21601w.g(this, k1Var2, k1Var4)) {
                        break;
                    }
                    k1Var2 = k1Var4;
                }
                return;
            }
            return;
        }
    }

    static boolean k(l1 l1Var, Object obj, Object obj2) {
        return f21601w.f(l1Var, obj, obj2);
    }

    final d1 d(d1 d1Var) {
        return f21601w.a(this, d1Var);
    }

    final Object e() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f21602q;
        if ((obj2 != null) && f1.q(obj2)) {
            return f1.m(obj2);
        }
        k1 k1Var = this.f21604s;
        if (k1Var != k1.f21590c) {
            k1 k1Var2 = new k1();
            do {
                g1 g1Var = f21601w;
                g1Var.c(k1Var2, k1Var);
                if (g1Var.g(this, k1Var, k1Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(k1Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f21602q;
                    } while (!((obj != null) & f1.q(obj)));
                    return f1.m(obj);
                }
                k1Var = this.f21604s;
            } while (k1Var != k1.f21590c);
        }
        Object obj3 = this.f21602q;
        Objects.requireNonNull(obj3);
        return f1.m(obj3);
    }

    final Object f(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f21602q;
        boolean z7 = true;
        if ((obj != null) && f1.q(obj)) {
            return f1.m(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k1 k1Var = this.f21604s;
            if (k1Var != k1.f21590c) {
                k1 k1Var2 = new k1();
                do {
                    g1 g1Var = f21601w;
                    g1Var.c(k1Var2, k1Var);
                    if (g1Var.g(this, k1Var, k1Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(k1Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f21602q;
                            if ((obj2 != null) && f1.q(obj2)) {
                                return f1.m(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(k1Var2);
                    } else {
                        k1Var = this.f21604s;
                    }
                } while (k1Var != k1.f21590c);
            }
            Object obj3 = this.f21602q;
            Objects.requireNonNull(obj3);
            return f1.m(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f21602q;
            if ((obj4 != null) && f1.q(obj4)) {
                return f1.m(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj5 = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j8 = -nanos;
            long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z7 = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z7) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z7) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + obj5);
    }

    final void h() {
        for (k1 b8 = f21601w.b(this, k1.f21590c); b8 != null; b8 = b8.f21592b) {
            Thread thread = b8.f21591a;
            if (thread != null) {
                b8.f21591a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final boolean i(d1 d1Var, d1 d1Var2) {
        return f21601w.e(this, d1Var, d1Var2);
    }
}
