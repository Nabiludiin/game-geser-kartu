package w4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class f0 extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27114a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final c0 f27115b = new c0();

    /* renamed from: c, reason: collision with root package name */
    private boolean f27116c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f27117d;

    /* renamed from: e, reason: collision with root package name */
    private Object f27118e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f27119f;

    f0() {
    }

    private final void t() {
        p3.o.q(this.f27116c, "Task is not yet complete");
    }

    private final void u() {
        if (this.f27117d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void v() {
        if (this.f27116c) {
            throw c.a(this);
        }
    }

    private final void w() {
        synchronized (this.f27114a) {
            try {
                if (this.f27116c) {
                    this.f27115b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w4.i
    public final i a(Executor executor, d dVar) {
        this.f27115b.a(new u(executor, dVar));
        w();
        return this;
    }

    @Override // w4.i
    public final i b(Executor executor, e eVar) {
        this.f27115b.a(new w(executor, eVar));
        w();
        return this;
    }

    @Override // w4.i
    public final i c(e eVar) {
        this.f27115b.a(new w(k.f27123a, eVar));
        w();
        return this;
    }

    @Override // w4.i
    public final i d(Executor executor, f fVar) {
        this.f27115b.a(new y(executor, fVar));
        w();
        return this;
    }

    @Override // w4.i
    public final i e(f fVar) {
        d(k.f27123a, fVar);
        return this;
    }

    @Override // w4.i
    public final i f(Executor executor, g gVar) {
        this.f27115b.a(new a0(executor, gVar));
        w();
        return this;
    }

    @Override // w4.i
    public final i g(Executor executor, b bVar) {
        f0 f0Var = new f0();
        this.f27115b.a(new q(executor, bVar, f0Var));
        w();
        return f0Var;
    }

    @Override // w4.i
    public final i h(Executor executor, b bVar) {
        f0 f0Var = new f0();
        this.f27115b.a(new s(executor, bVar, f0Var));
        w();
        return f0Var;
    }

    @Override // w4.i
    public final i i(b bVar) {
        return h(k.f27123a, bVar);
    }

    @Override // w4.i
    public final Exception j() {
        Exception exc;
        synchronized (this.f27114a) {
            exc = this.f27119f;
        }
        return exc;
    }

    @Override // w4.i
    public final Object k() {
        Object obj;
        synchronized (this.f27114a) {
            try {
                t();
                u();
                Exception exc = this.f27119f;
                if (exc != null) {
                    throw new h(exc);
                }
                obj = this.f27118e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // w4.i
    public final boolean l() {
        return this.f27117d;
    }

    @Override // w4.i
    public final boolean m() {
        boolean z7;
        synchronized (this.f27114a) {
            z7 = this.f27116c;
        }
        return z7;
    }

    @Override // w4.i
    public final boolean n() {
        boolean z7;
        synchronized (this.f27114a) {
            try {
                z7 = false;
                if (this.f27116c && !this.f27117d && this.f27119f == null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    public final void o(Exception exc) {
        p3.o.n(exc, "Exception must not be null");
        synchronized (this.f27114a) {
            v();
            this.f27116c = true;
            this.f27119f = exc;
        }
        this.f27115b.b(this);
    }

    public final void p(Object obj) {
        synchronized (this.f27114a) {
            v();
            this.f27116c = true;
            this.f27118e = obj;
        }
        this.f27115b.b(this);
    }

    public final boolean q() {
        synchronized (this.f27114a) {
            try {
                if (this.f27116c) {
                    return false;
                }
                this.f27116c = true;
                this.f27117d = true;
                this.f27115b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r(Exception exc) {
        p3.o.n(exc, "Exception must not be null");
        synchronized (this.f27114a) {
            try {
                if (this.f27116c) {
                    return false;
                }
                this.f27116c = true;
                this.f27119f = exc;
                this.f27115b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s(Object obj) {
        synchronized (this.f27114a) {
            try {
                if (this.f27116c) {
                    return false;
                }
                this.f27116c = true;
                this.f27118e = obj;
                this.f27115b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
