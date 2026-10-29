package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: MyApplication */
public abstract class f1 extends l1 {
    protected f1() {
    }

    static Object m(Object obj) {
        if (obj instanceof a1) {
            Throwable th = ((a1) obj).f21476b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (!(obj instanceof c1)) {
            if (obj == l1.f21598t) {
                return null;
            }
            return obj;
        }
        Throwable th2 = ((c1) obj).f21492a;
        if (th2 != null) {
            throw new ExecutionException(th2);
        }
        l1.f21599u.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(c1.f21491c.f21492a);
    }

    static boolean q(Object obj) {
        return !(obj instanceof b1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object t(a2 a2Var) {
        Throwable a8;
        if (a2Var instanceof e1) {
            Object obj = ((f1) a2Var).f21602q;
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                if (a1Var.f21475a) {
                    Throwable th = a1Var.f21476b;
                    obj = th != null ? new a1(false, th) : a1.f21474d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((a2Var instanceof h2) && (a8 = ((h2) a2Var).a()) != null) {
            return new c1(a8);
        }
        boolean isCancelled = a2Var.isCancelled();
        if ((!l1.f21600v) && isCancelled) {
            a1 a1Var2 = a1.f21474d;
            Objects.requireNonNull(a1Var2);
            return a1Var2;
        }
        try {
            Object u7 = u(a2Var);
            if (!isCancelled) {
                return u7 == null ? l1.f21598t : u7;
            }
            return new a1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(a2Var)));
        } catch (Error | Exception e8) {
            return new c1(e8);
        } catch (CancellationException e9) {
            return !isCancelled ? new c1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(a2Var)), e9)) : new a1(false, e9);
        } catch (ExecutionException e10) {
            return isCancelled ? new a1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(a2Var)), e10)) : new c1(e10.getCause());
        }
    }

    private static Object u(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void v(StringBuilder sb) {
        try {
            Object u7 = u(this);
            sb.append("SUCCESS, result=[");
            if (u7 == null) {
                sb.append("null");
            } else if (u7 == this) {
                sb.append("this future");
            } else {
                sb.append(u7.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(u7)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        } catch (Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(f1 f1Var, boolean z7) {
        d1 d1Var;
        d1 d1Var2 = null;
        while (true) {
            f1Var.h();
            f1Var.p();
            d1 d1Var3 = d1Var2;
            d1 d8 = f1Var.d(d1.f21508d);
            d1 d1Var4 = d1Var3;
            while (d8 != null) {
                d1 d1Var5 = d8.f21511c;
                d8.f21511c = d1Var4;
                d1Var4 = d8;
                d8 = d1Var5;
            }
            while (d1Var4 != null) {
                Runnable runnable = d1Var4.f21509a;
                d1Var = d1Var4.f21511c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof b1) {
                    b1 b1Var = (b1) runnable2;
                    f1Var = b1Var.f21482q;
                    if (f1Var.f21602q == b1Var && l1.k(f1Var, b1Var, t(b1Var.f21483r))) {
                        break;
                    }
                } else {
                    Executor executor = d1Var4.f21510b;
                    Objects.requireNonNull(executor);
                    x(runnable2, executor);
                }
                d1Var4 = d1Var;
            }
            return;
            d1Var2 = d1Var;
        }
    }

    private static void x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            l1.f21599u.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h2
    protected final Throwable a() {
        if (!(this instanceof e1)) {
            return null;
        }
        Object obj = this.f21602q;
        if (obj instanceof c1) {
            return ((c1) obj).f21492a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        a1 a1Var;
        Object obj = this.f21602q;
        if (!(obj instanceof b1) && !(obj == null)) {
            return false;
        }
        if (l1.f21600v) {
            a1Var = new a1(z7, new CancellationException("Future.cancel() was called."));
        } else {
            a1Var = z7 ? a1.f21473c : a1.f21474d;
            Objects.requireNonNull(a1Var);
        }
        f1 f1Var = this;
        boolean z8 = false;
        while (true) {
            if (l1.k(f1Var, obj, a1Var)) {
                w(f1Var, z7);
                if (!(obj instanceof b1)) {
                    break;
                }
                a2 a2Var = ((b1) obj).f21483r;
                if (!(a2Var instanceof e1)) {
                    a2Var.cancel(z7);
                    break;
                }
                f1Var = (f1) a2Var;
                obj = f1Var.f21602q;
                if (!(obj == null) && !(obj instanceof b1)) {
                    return true;
                }
                z8 = true;
            } else {
                obj = f1Var.f21602q;
                if (q(obj)) {
                    return z8;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return e();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21602q instanceof a1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f21602q;
        return (obj != null) & q(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.a2
    public final void j(Runnable runnable, Executor executor) {
        d1 d1Var;
        w.c(executor, "Executor was null.");
        if (!isDone() && (d1Var = this.f21603r) != d1.f21508d) {
            d1 d1Var2 = new d1(runnable, executor);
            do {
                d1Var2.f21511c = d1Var;
                if (i(d1Var, d1Var2)) {
                    return;
                } else {
                    d1Var = this.f21603r;
                }
            } while (d1Var != d1.f21508d);
        }
        x(runnable, executor);
    }

    protected abstract String n();

    protected abstract void p();

    protected final boolean r(Throwable th) {
        if (!l1.k(this, null, new c1(th))) {
            return false;
        }
        w(this, false);
        return true;
    }

    protected final boolean s(a2 a2Var) {
        c1 c1Var;
        Object obj = this.f21602q;
        if (obj == null) {
            if (a2Var.isDone()) {
                if (!l1.k(this, null, t(a2Var))) {
                    return false;
                }
                w(this, false);
                return true;
            }
            b1 b1Var = new b1(this, a2Var);
            if (l1.k(this, null, b1Var)) {
                try {
                    a2Var.j(b1Var, q1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c1Var = new c1(th);
                    } catch (Error | Exception unused) {
                        c1Var = c1.f21490b;
                    }
                    l1.k(this, b1Var, c1Var);
                }
                return true;
            }
            obj = this.f21602q;
        }
        if (obj instanceof a1) {
            a2Var.cancel(((a1) obj).f21475a);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r3.isEmpty() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r6.f21602q
            boolean r1 = r1 instanceof com.google.android.gms.internal.play_billing.a1
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Ld0
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.v(r0)
            goto Ld0
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f21602q
            boolean r4 = r3 instanceof com.google.android.gms.internal.play_billing.b1
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L94
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.play_billing.b1 r3 = (com.google.android.gms.internal.play_billing.b1) r3
            com.google.android.gms.internal.play_billing.a2 r3 = r3.f21483r
            if (r3 != r6) goto L7f
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L90
        L7d:
            r3 = move-exception
            goto L83
        L7f:
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L90
        L83:
            com.google.android.gms.internal.play_billing.c2.a(r3)
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L90:
            r0.append(r2)
            goto Lc0
        L94:
            java.lang.String r3 = r6.n()     // Catch: java.lang.Throwable -> La3
            r4 = 0
            if (r3 == 0) goto La1
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto Lb3
        La1:
            r3 = r4
            goto Lb3
        La3:
            r3 = move-exception
            com.google.android.gms.internal.play_billing.c2.a(r3)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lb3:
            if (r3 == 0) goto Lc0
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lc0:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Ld0
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.v(r0)
        Ld0:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f1.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return f(j7, timeUnit);
    }
}
