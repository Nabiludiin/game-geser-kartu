package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: MyApplication */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6594a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private as f6595b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6596c = false;

    public final void a(Context context) {
        synchronized (this.f6594a) {
            try {
                if (!this.f6596c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i7 = v2.n1.f26802b;
                        w2.p.f("Can not cast Context to Application");
                    } else {
                        if (this.f6595b == null) {
                            this.f6595b = new as();
                        }
                        this.f6595b.a(application, context);
                        this.f6596c = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(bs bsVar) {
        synchronized (this.f6594a) {
            try {
                if (this.f6595b == null) {
                    this.f6595b = new as();
                }
                this.f6595b.b(bsVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(bs bsVar) {
        synchronized (this.f6594a) {
            try {
                as asVar = this.f6595b;
                if (asVar == null) {
                    return;
                }
                asVar.c(bsVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity d() {
        synchronized (this.f6594a) {
            try {
                as asVar = this.f6595b;
                if (asVar == null) {
                    return null;
                }
                return asVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context e() {
        synchronized (this.f6594a) {
            try {
                as asVar = this.f6595b;
                if (asVar == null) {
                    return null;
                }
                return asVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        synchronized (this.f6594a) {
            try {
                as asVar = this.f6595b;
                if (asVar == null) {
                    return false;
                }
                return asVar.g().get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(wu1 wu1Var) {
        synchronized (this.f6594a) {
            try {
                if (this.f6595b == null) {
                    this.f6595b = new as();
                }
                this.f6595b.j(wu1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
