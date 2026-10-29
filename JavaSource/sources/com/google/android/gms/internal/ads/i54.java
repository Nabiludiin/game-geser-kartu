package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
abstract class i54 extends s74 implements a5.d {

    /* renamed from: t, reason: collision with root package name */
    static final Object f9837t = new Object();

    /* renamed from: u, reason: collision with root package name */
    static final x64 f9838u = new x64(b54.class);

    /* renamed from: v, reason: collision with root package name */
    static final boolean f9839v;

    /* renamed from: w, reason: collision with root package name */
    private static final c54 f9840w;

    /* renamed from: q, reason: collision with root package name */
    volatile Object f9841q;

    /* renamed from: r, reason: collision with root package name */
    volatile y44 f9842r;

    /* renamed from: s, reason: collision with root package name */
    volatile h54 f9843s;

    static {
        boolean z7;
        Throwable th;
        Throwable th2;
        c54 e54Var;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z7 = false;
        }
        f9839v = z7;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                e54Var = new g54(bArr);
            } catch (Error | Exception e8) {
                try {
                    e54Var = new d54(bArr);
                    th = null;
                    th2 = e8;
                } catch (Error | Exception e9) {
                    th = e9;
                    th2 = e8;
                    e54Var = new e54(bArr);
                }
            }
        } else {
            try {
                e54Var = new d54(bArr);
            } catch (NoClassDefFoundError unused2) {
                e54Var = new e54(bArr);
            }
        }
        th = null;
        th2 = null;
        f9840w = e54Var;
        if (th != null) {
            x64 x64Var = f9838u;
            Logger a8 = x64Var.a();
            Level level = Level.SEVERE;
            a8.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            x64Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    i54() {
    }

    private final void b(h54 h54Var) {
        h54Var.f9346a = null;
        while (true) {
            h54 h54Var2 = this.f9843s;
            if (h54Var2 != h54.f9345c) {
                h54 h54Var3 = null;
                while (h54Var2 != null) {
                    h54 h54Var4 = h54Var2.f9347b;
                    if (h54Var2.f9346a != null) {
                        h54Var3 = h54Var2;
                    } else if (h54Var3 != null) {
                        h54Var3.f9347b = h54Var4;
                        if (h54Var3.f9346a == null) {
                            break;
                        }
                    } else if (!f9840w.c(this, h54Var2, h54Var4)) {
                        break;
                    }
                    h54Var2 = h54Var4;
                }
                return;
            }
            return;
        }
    }

    static boolean f(i54 i54Var, Object obj, Object obj2) {
        return f9840w.g(i54Var, obj, obj2);
    }

    final boolean d(y44 y44Var, y44 y44Var2) {
        return f9840w.d(this, y44Var, y44Var2);
    }

    final y44 e(y44 y44Var) {
        return f9840w.f(this, y44Var);
    }

    final void g() {
        for (h54 e8 = f9840w.e(this, h54.f9345c); e8 != null; e8 = e8.f9347b) {
            Thread thread = e8.f9346a;
            if (thread != null) {
                e8.f9346a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object h(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9841q;
        if ((obj != null) && b54.s(obj)) {
            return b54.r(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h54 h54Var = this.f9843s;
            if (h54Var != h54.f9345c) {
                h54 h54Var2 = new h54();
                do {
                    c54 c54Var = f9840w;
                    c54Var.b(h54Var2, h54Var);
                    if (c54Var.c(this, h54Var, h54Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(h54Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9841q;
                            if ((obj2 != null) && b54.s(obj2)) {
                                return b54.r(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(h54Var2);
                    } else {
                        h54Var = this.f9843s;
                    }
                } while (h54Var != h54.f9345c);
            }
            Object obj3 = this.f9841q;
            Objects.requireNonNull(obj3);
            return b54.r(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f9841q;
            if ((obj4 != null) && b54.s(obj4)) {
                return b54.r(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 8 + String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j7);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j8 = -nanos;
            long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(convert);
            boolean z7 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                StringBuilder sb3 = new StringBuilder(concat.length() + String.valueOf(convert).length() + 1 + String.valueOf(lowerCase).length());
                sb3.append(concat);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z7) {
                    sb4 = sb4.concat(",");
                }
                concat = sb4.concat(" ");
            }
            if (z7) {
                StringBuilder sb5 = new StringBuilder(concat.length() + String.valueOf(nanos2).length() + 13);
                sb5.append(concat);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(sb2.length() + 5 + String.valueOf(obj5).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(obj5);
        throw new TimeoutException(sb6.toString());
    }

    final Object i() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f9841q;
        if ((obj2 != null) && b54.s(obj2)) {
            return b54.r(obj2);
        }
        h54 h54Var = this.f9843s;
        if (h54Var != h54.f9345c) {
            h54 h54Var2 = new h54();
            do {
                c54 c54Var = f9840w;
                c54Var.b(h54Var2, h54Var);
                if (c54Var.c(this, h54Var, h54Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(h54Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f9841q;
                    } while (!((obj != null) & b54.s(obj)));
                    return b54.r(obj);
                }
                h54Var = this.f9843s;
            } while (h54Var != h54.f9345c);
        }
        Object obj3 = this.f9841q;
        Objects.requireNonNull(obj3);
        return b54.r(obj3);
    }
}
