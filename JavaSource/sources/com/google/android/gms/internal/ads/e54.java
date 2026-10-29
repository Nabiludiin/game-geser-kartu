package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class e54 extends c54 {
    /* synthetic */ e54(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.c54
    public final void a(h54 h54Var, Thread thread) {
        h54Var.f9346a = thread;
    }

    @Override // com.google.android.gms.internal.ads.c54
    final void b(h54 h54Var, h54 h54Var2) {
        h54Var.f9347b = h54Var2;
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean c(i54 i54Var, h54 h54Var, h54 h54Var2) {
        synchronized (i54Var) {
            try {
                if (i54Var.f9843s != h54Var) {
                    return false;
                }
                i54Var.f9843s = h54Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean d(i54 i54Var, y44 y44Var, y44 y44Var2) {
        synchronized (i54Var) {
            try {
                if (i54Var.f9842r != y44Var) {
                    return false;
                }
                i54Var.f9842r = y44Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c54
    final h54 e(i54 i54Var, h54 h54Var) {
        h54 h54Var2;
        synchronized (i54Var) {
            try {
                h54Var2 = i54Var.f9843s;
                if (h54Var2 != h54Var) {
                    i54Var.f9843s = h54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h54Var2;
    }

    @Override // com.google.android.gms.internal.ads.c54
    final y44 f(i54 i54Var, y44 y44Var) {
        y44 y44Var2;
        synchronized (i54Var) {
            try {
                y44Var2 = i54Var.f9842r;
                if (y44Var2 != y44Var) {
                    i54Var.f9842r = y44Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y44Var2;
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean g(i54 i54Var, Object obj, Object obj2) {
        synchronized (i54Var) {
            try {
                if (i54Var.f9841q != obj) {
                    return false;
                }
                i54Var.f9841q = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
