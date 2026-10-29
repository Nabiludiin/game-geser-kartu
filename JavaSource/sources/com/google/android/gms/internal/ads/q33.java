package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class q33 {

    /* renamed from: a, reason: collision with root package name */
    private final h33 f14230a;

    /* renamed from: b, reason: collision with root package name */
    private final a5.d f14231b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14232c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14233d = false;

    public q33(final n23 n23Var, final g33 g33Var, final h33 h33Var) {
        this.f14230a = h33Var;
        this.f14231b = p64.h(p64.j(g33Var.a(h33Var), new w54() { // from class: com.google.android.gms.internal.ads.p33
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return q33.this.c(g33Var, n23Var, h33Var, (w23) obj);
            }
        }, h33Var.a()), Exception.class, new w54() { // from class: com.google.android.gms.internal.ads.n33
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return q33.this.d(g33Var, (Exception) obj);
            }
        }, h33Var.a());
    }

    public final synchronized void a(m64 m64Var) {
        h33 h33Var = this.f14230a;
        p64.r(p64.j(this.f14231b, o33.f13177a, h33Var.a()), m64Var, h33Var.a());
    }

    public final synchronized a5.d b(h33 h33Var) {
        if (!this.f14233d && !this.f14232c) {
            h33 h33Var2 = this.f14230a;
            if (h33Var2.b() != null && h33Var.b() != null && h33Var2.b().equals(h33Var.b())) {
                this.f14232c = true;
                return this.f14231b;
            }
        }
        return null;
    }

    final /* synthetic */ a5.d c(g33 g33Var, n23 n23Var, h33 h33Var, w23 w23Var) {
        synchronized (this) {
            try {
                this.f14233d = true;
                g33Var.b(w23Var);
                if (this.f14232c) {
                    return p64.a(new f33(w23Var, h33Var));
                }
                n23Var.b(h33Var.b(), w23Var);
                return p64.a(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ a5.d d(g33 g33Var, Exception exc) {
        synchronized (this) {
            this.f14233d = true;
            throw exc;
        }
    }
}
