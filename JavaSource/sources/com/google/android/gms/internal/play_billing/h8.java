package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public class h8 implements a2 {

    /* renamed from: t, reason: collision with root package name */
    static final boolean f21554t = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: u, reason: collision with root package name */
    private static final Logger f21555u = Logger.getLogger(h8.class.getName());

    /* renamed from: v, reason: collision with root package name */
    static final b2 f21556v;

    /* renamed from: w, reason: collision with root package name */
    private static final Object f21557w;

    /* renamed from: q, reason: collision with root package name */
    volatile Object f21558q;

    /* renamed from: r, reason: collision with root package name */
    volatile m5 f21559r;

    /* renamed from: s, reason: collision with root package name */
    volatile f8 f21560s;

    static {
        b2 e8Var;
        try {
            e8Var = new h7(AtomicReferenceFieldUpdater.newUpdater(f8.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f8.class, f8.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h8.class, f8.class, "s"), AtomicReferenceFieldUpdater.newUpdater(h8.class, m5.class, "r"), AtomicReferenceFieldUpdater.newUpdater(h8.class, Object.class, "q"));
            th = null;
        } catch (Throwable th) {
            th = th;
            e8Var = new e8();
        }
        Throwable th2 = th;
        f21556v = e8Var;
        if (th2 != null) {
            f21555u.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f21557w = new Object();
    }

    protected h8() {
    }

    static void b(h8 h8Var) {
        f8 f8Var;
        b2 b2Var;
        m5 m5Var;
        m5 m5Var2;
        m5 m5Var3;
        do {
            f8Var = h8Var.f21560s;
            b2Var = f21556v;
        } while (!b2Var.e(h8Var, f8Var, f8.f21527c));
        while (true) {
            m5Var = null;
            if (f8Var == null) {
                break;
            }
            Thread thread = f8Var.f21528a;
            if (thread != null) {
                f8Var.f21528a = null;
                LockSupport.unpark(thread);
            }
            f8Var = f8Var.f21529b;
        }
        do {
            m5Var2 = h8Var.f21559r;
        } while (!b2Var.c(h8Var, m5Var2, m5.f21687d));
        while (true) {
            m5Var3 = m5Var;
            m5Var = m5Var2;
            if (m5Var == null) {
                break;
            }
            m5Var2 = m5Var.f21690c;
            m5Var.f21690c = m5Var3;
        }
        while (m5Var3 != null) {
            Runnable runnable = m5Var3.f21688a;
            m5 m5Var4 = m5Var3.f21690c;
            f(runnable, m5Var3.f21689b);
            m5Var3 = m5Var4;
        }
    }

    private final void e(StringBuilder sb) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e8) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e8.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e9) {
                sb.append("FAILURE, cause=[");
                sb.append(e9.getCause());
                sb.append("]");
                return;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    private static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f21555u.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    private final void g(f8 f8Var) {
        f8Var.f21528a = null;
        while (true) {
            f8 f8Var2 = this.f21560s;
            if (f8Var2 != f8.f21527c) {
                f8 f8Var3 = null;
                while (f8Var2 != null) {
                    f8 f8Var4 = f8Var2.f21529b;
                    if (f8Var2.f21528a != null) {
                        f8Var3 = f8Var2;
                    } else if (f8Var3 != null) {
                        f8Var3.f21529b = f8Var4;
                        if (f8Var3.f21528a == null) {
                            break;
                        }
                    } else if (!f21556v.e(this, f8Var2, f8Var4)) {
                        break;
                    }
                    f8Var2 = f8Var4;
                }
                return;
            }
            return;
        }
    }

    private static final Object h(Object obj) {
        if (obj instanceof a3) {
            Throwable th = ((a3) obj).f21479a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p4) {
            throw new ExecutionException(((p4) obj).f21710a);
        }
        if (obj == f21557w) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f21558q;
        if (obj == null) {
            if (f21556v.d(this, obj, f21554t ? new a3(z7, new CancellationException("Future.cancel() was called.")) : z7 ? a3.f21477b : a3.f21478c)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    protected boolean d(Object obj) {
        if (obj == null) {
            obj = f21557w;
        }
        if (!f21556v.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f21558q;
        if (obj2 != null) {
            return h(obj2);
        }
        f8 f8Var = this.f21560s;
        f8 f8Var2 = f8.f21527c;
        if (f8Var != f8Var2) {
            f8 f8Var3 = new f8();
            do {
                b2 b2Var = f21556v;
                b2Var.a(f8Var3, f8Var);
                if (b2Var.e(this, f8Var, f8Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(f8Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f21558q;
                    } while (!(obj != null));
                    return h(obj);
                }
                f8Var = this.f21560s;
            } while (f8Var != f8Var2);
        }
        return h(this.f21558q);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21558q instanceof a3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21558q != null;
    }

    @Override // com.google.android.gms.internal.play_billing.a2
    public final void j(Runnable runnable, Executor executor) {
        executor.getClass();
        m5 m5Var = this.f21559r;
        m5 m5Var2 = m5.f21687d;
        if (m5Var != m5Var2) {
            m5 m5Var3 = new m5(runnable, executor);
            do {
                m5Var3.f21690c = m5Var;
                if (f21556v.c(this, m5Var, m5Var3)) {
                    return;
                } else {
                    m5Var = this.f21559r;
                }
            } while (m5Var != m5Var2);
        }
        f(runnable, executor);
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f21558q instanceof a3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = a();
            } catch (RuntimeException e8) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e8.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.f21558q;
            if (obj != null) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f8 f8Var = this.f21560s;
                f8 f8Var2 = f8.f21527c;
                if (f8Var != f8Var2) {
                    f8 f8Var3 = new f8();
                    do {
                        b2 b2Var = f21556v;
                        b2Var.a(f8Var3, f8Var);
                        if (b2Var.e(this, f8Var, f8Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f21558q;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    g(f8Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(f8Var3);
                        } else {
                            f8Var = this.f21560s;
                        }
                    } while (f8Var != f8Var2);
                }
                return h(this.f21558q);
            }
            while (nanos > 0) {
                Object obj3 = this.f21558q;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String h8Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j8 = -nanos;
                long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(convert);
                boolean z7 = convert == 0 || nanos2 > 1000;
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
            throw new TimeoutException(str + " for " + h8Var);
        }
        throw new InterruptedException();
    }
}
