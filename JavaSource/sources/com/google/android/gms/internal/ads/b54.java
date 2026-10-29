package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class b54 extends i54 {
    protected b54() {
    }

    private final void A(StringBuilder sb) {
        try {
            Object q7 = q(this);
            sb.append("SUCCESS, result=[");
            if (q7 == null) {
                sb.append("null");
            } else if (q7 == this) {
                sb.append("this future");
            } else {
                sb.append(q7.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(q7)));
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

    private static void B(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            Logger a8 = i54.f9838u.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            a8.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object p(a5.d dVar) {
        Throwable a8;
        if (dVar instanceof z44) {
            Object obj = ((b54) dVar).f9841q;
            if (obj instanceof v44) {
                v44 v44Var = (v44) obj;
                if (v44Var.f17382a) {
                    Throwable th = v44Var.f17383b;
                    obj = th != null ? new v44(false, th) : v44.f17381d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((dVar instanceof s74) && (a8 = ((s74) dVar).a()) != null) {
            return new x44(a8);
        }
        boolean isCancelled = dVar.isCancelled();
        if ((!i54.f9839v) && isCancelled) {
            v44 v44Var2 = v44.f17381d;
            Objects.requireNonNull(v44Var2);
            return v44Var2;
        }
        try {
            Object q7 = q(dVar);
            if (!isCancelled) {
                return q7 == null ? i54.f9837t : q7;
            }
            String valueOf = String.valueOf(dVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new v44(false, new IllegalArgumentException(sb.toString()));
        } catch (Error | Exception e8) {
            return new x44(e8);
        } catch (CancellationException e9) {
            return !isCancelled ? new x44(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(dVar)), e9)) : new v44(false, e9);
        } catch (ExecutionException e10) {
            return isCancelled ? new v44(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(dVar)), e10)) : new x44(e10.getCause());
        }
    }

    private static Object q(Future future) {
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

    static Object r(Object obj) {
        if (obj instanceof v44) {
            Throwable th = ((v44) obj).f17383b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof x44) {
            throw new ExecutionException(((x44) obj).f18538a);
        }
        if (obj == i54.f9837t) {
            return null;
        }
        return obj;
    }

    static boolean s(Object obj) {
        return !(obj instanceof w44);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(b54 b54Var, boolean z7) {
        y44 y44Var = null;
        while (true) {
            b54Var.g();
            if (z7) {
                b54Var.t();
            }
            b54Var.n();
            y44 y44Var2 = y44Var;
            y44 e8 = b54Var.e(y44.f19371d);
            y44 y44Var3 = y44Var2;
            while (e8 != null) {
                y44 y44Var4 = e8.f19374c;
                e8.f19374c = y44Var3;
                y44Var3 = e8;
                e8 = y44Var4;
            }
            while (y44Var3 != null) {
                Runnable runnable = y44Var3.f19372a;
                y44Var = y44Var3.f19374c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof w44) {
                    w44 w44Var = (w44) runnable2;
                    b54Var = w44Var.f18030q;
                    if (b54Var.f9841q == w44Var && i54.f(b54Var, w44Var, p(w44Var.f18031r))) {
                        break;
                    }
                } else {
                    Executor executor = y44Var3.f19373b;
                    Objects.requireNonNull(executor);
                    B(runnable2, executor);
                }
                y44Var3 = y44Var;
            }
            return;
            z7 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.s74
    protected final Throwable a() {
        if (!(this instanceof z44)) {
            return null;
        }
        Object obj = this.f9841q;
        if (obj instanceof x44) {
            return ((x44) obj).f18538a;
        }
        return null;
    }

    @Override // a5.d
    public void c(Runnable runnable, Executor executor) {
        y44 y44Var;
        rx3.k(runnable, "Runnable was null.");
        rx3.k(executor, "Executor was null.");
        if (!isDone() && (y44Var = this.f9842r) != y44.f19371d) {
            y44 y44Var2 = new y44(runnable, executor);
            do {
                y44Var2.f19374c = y44Var;
                if (d(y44Var, y44Var2)) {
                    return;
                } else {
                    y44Var = this.f9842r;
                }
            } while (y44Var != y44.f19371d);
        }
        B(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        v44 v44Var;
        Object obj = this.f9841q;
        if (!(obj instanceof w44) && !(obj == null)) {
            return false;
        }
        if (i54.f9839v) {
            v44Var = new v44(z7, new CancellationException("Future.cancel() was called."));
        } else {
            v44Var = z7 ? v44.f17380c : v44.f17381d;
            Objects.requireNonNull(v44Var);
        }
        b54 b54Var = this;
        boolean z8 = false;
        while (true) {
            if (i54.f(b54Var, obj, v44Var)) {
                z(b54Var, z7);
                if (!(obj instanceof w44)) {
                    break;
                }
                a5.d dVar = ((w44) obj).f18031r;
                if (!(dVar instanceof z44)) {
                    dVar.cancel(z7);
                    break;
                }
                b54Var = (b54) dVar;
                obj = b54Var.f9841q;
                if (!(obj == null) && !(obj instanceof w44)) {
                    return true;
                }
                z8 = true;
            } else {
                obj = b54Var.f9841q;
                if (s(obj)) {
                    return z8;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return i();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f9841q instanceof v44;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f9841q;
        return (obj != null) & s(obj);
    }

    protected boolean l(Object obj) {
        if (obj == null) {
            obj = i54.f9837t;
        }
        if (!i54.f(this, null, obj)) {
            return false;
        }
        z(this, false);
        return true;
    }

    protected boolean m(Throwable th) {
        th.getClass();
        if (!i54.f(this, null, new x44(th))) {
            return false;
        }
        z(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String o() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            A(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f9841q;
            if (obj instanceof w44) {
                sb.append(", setFuture=[");
                a5.d dVar = ((w44) obj).f18031r;
                try {
                    if (dVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(dVar);
                    }
                } catch (Throwable th) {
                    i74.b(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = iy3.b(o());
                } catch (Throwable th2) {
                    i74.b(th2);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                A(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final boolean u() {
        Object obj = this.f9841q;
        return (obj instanceof v44) && ((v44) obj).f17382a;
    }

    protected final boolean v(a5.d dVar) {
        x44 x44Var;
        dVar.getClass();
        Object obj = this.f9841q;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!i54.f(this, null, p(dVar))) {
                    return false;
                }
                z(this, false);
                return true;
            }
            w44 w44Var = new w44(this, dVar);
            if (i54.f(this, null, w44Var)) {
                try {
                    dVar.c(w44Var, d64.INSTANCE);
                } catch (Throwable th) {
                    try {
                        x44Var = new x44(th);
                    } catch (Error | Exception unused) {
                        x44Var = x44.f18537b;
                    }
                    i54.f(this, w44Var, x44Var);
                }
                return true;
            }
            obj = this.f9841q;
        }
        if (obj instanceof v44) {
            dVar.cancel(((v44) obj).f17382a);
        }
        return false;
    }

    final void w(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(u());
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j7, TimeUnit timeUnit) {
        return h(j7, timeUnit);
    }

    protected void n() {
    }

    protected void t() {
    }
}
