package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class e8 extends b2 {
    e8() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final void a(f8 f8Var, f8 f8Var2) {
        f8Var.f21529b = f8Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final void b(f8 f8Var, Thread thread) {
        f8Var.f21528a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final boolean c(h8 h8Var, m5 m5Var, m5 m5Var2) {
        synchronized (h8Var) {
            try {
                if (h8Var.f21559r != m5Var) {
                    return false;
                }
                h8Var.f21559r = m5Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final boolean d(h8 h8Var, Object obj, Object obj2) {
        synchronized (h8Var) {
            try {
                if (h8Var.f21558q != obj) {
                    return false;
                }
                h8Var.f21558q = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final boolean e(h8 h8Var, f8 f8Var, f8 f8Var2) {
        synchronized (h8Var) {
            try {
                if (h8Var.f21560s != f8Var) {
                    return false;
                }
                h8Var.f21560s = f8Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
