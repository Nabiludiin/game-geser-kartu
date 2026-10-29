package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class i1 extends g1 {
    /* synthetic */ i1(p1 p1Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final d1 a(l1 l1Var, d1 d1Var) {
        d1 d1Var2;
        synchronized (l1Var) {
            try {
                d1Var2 = l1Var.f21603r;
                if (d1Var2 != d1Var) {
                    l1Var.f21603r = d1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final k1 b(l1 l1Var, k1 k1Var) {
        k1 k1Var2;
        synchronized (l1Var) {
            try {
                k1Var2 = l1Var.f21604s;
                if (k1Var2 != k1Var) {
                    l1Var.f21604s = k1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final void c(k1 k1Var, k1 k1Var2) {
        k1Var.f21592b = k1Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.g1
    public final void d(k1 k1Var, Thread thread) {
        k1Var.f21591a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean e(l1 l1Var, d1 d1Var, d1 d1Var2) {
        synchronized (l1Var) {
            try {
                if (l1Var.f21603r != d1Var) {
                    return false;
                }
                l1Var.f21603r = d1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean f(l1 l1Var, Object obj, Object obj2) {
        synchronized (l1Var) {
            try {
                if (l1Var.f21602q != obj) {
                    return false;
                }
                l1Var.f21602q = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean g(l1 l1Var, k1 k1Var, k1 k1Var2) {
        synchronized (l1Var) {
            try {
                if (l1Var.f21604s != k1Var) {
                    return false;
                }
                l1Var.f21604s = k1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
