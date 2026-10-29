package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: MyApplication */
abstract class q54 extends u54 {
    private static final x64 E = new x64(q54.class);
    private s04 B;
    private final boolean C;
    private final boolean D;

    q54(s04 s04Var, boolean z7, boolean z8) {
        super(s04Var.size());
        this.B = s04Var;
        this.C = z7;
        this.D = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void P(int i7, a5.d dVar) {
        try {
            if (dVar.isCancelled()) {
                this.B = null;
                cancel(false);
            } else {
                J(i7, dVar);
            }
            Q(null);
        } catch (Throwable th) {
            Q(null);
            throw th;
        }
    }

    private final void H(Throwable th) {
        th.getClass();
        if (this.C && !m(th) && L(C(), th)) {
            I(th);
        } else if (th instanceof Error) {
            I(th);
        }
    }

    private static void I(Throwable th) {
        E.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void J(int i7, Future future) {
        try {
            N(i7, r74.a(future));
        } catch (ExecutionException e8) {
            H(e8.getCause());
        } catch (Throwable th) {
            H(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void Q(s04 s04Var) {
        int D = D();
        int i7 = 0;
        rx3.i(D >= 0, "Less than 0 remaining futures");
        if (D == 0) {
            if (s04Var != null) {
                j34 c8 = s04Var.c();
                while (c8.hasNext()) {
                    Future future = (Future) c8.next();
                    if (!future.isCancelled()) {
                        J(i7, future);
                    }
                    i7++;
                }
            }
            this.f16602x = null;
            O();
            F(2);
        }
    }

    private static boolean L(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.u54
    final void E(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable a8 = a();
        Objects.requireNonNull(a8);
        L(set, a8);
    }

    void F(int i7) {
        this.B = null;
    }

    final void M() {
        Objects.requireNonNull(this.B);
        if (this.B.isEmpty()) {
            O();
            return;
        }
        if (this.C) {
            j34 c8 = this.B.c();
            final int i7 = 0;
            while (c8.hasNext()) {
                final a5.d dVar = (a5.d) c8.next();
                int i8 = i7 + 1;
                if (dVar.isDone()) {
                    P(i7, dVar);
                } else {
                    dVar.c(new Runnable() { // from class: com.google.android.gms.internal.ads.p54
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            q54.this.P(i7, dVar);
                        }
                    }, d64.INSTANCE);
                }
                i7 = i8;
            }
            return;
        }
        s04 s04Var = this.B;
        final s04 s04Var2 = true != this.D ? null : s04Var;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.o54
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                q54.this.Q(s04Var2);
            }
        };
        j34 c9 = s04Var.c();
        while (c9.hasNext()) {
            a5.d dVar2 = (a5.d) c9.next();
            if (dVar2.isDone()) {
                Q(s04Var2);
            } else {
                dVar2.c(runnable, d64.INSTANCE);
            }
        }
    }

    abstract void N(int i7, Object obj);

    abstract void O();

    @Override // com.google.android.gms.internal.ads.b54
    protected final void n() {
        s04 s04Var = this.B;
        F(1);
        if ((s04Var != null) && isCancelled()) {
            boolean u7 = u();
            j34 c8 = s04Var.c();
            while (c8.hasNext()) {
                ((Future) c8.next()).cancel(u7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final String o() {
        s04 s04Var = this.B;
        return s04Var != null ? "futures=".concat(s04Var.toString()) : super.o();
    }
}
