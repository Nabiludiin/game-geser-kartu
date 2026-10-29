package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class aa0 extends pm0 {

    /* renamed from: d, reason: collision with root package name */
    private final v2.e0 f4840d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4839c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f4841e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f4842f = 0;

    public aa0(v2.e0 e0Var) {
        this.f4840d = e0Var;
    }

    public final u90 g() {
        u90 u90Var = new u90(this);
        v2.n1.k("createNewReference: Trying to acquire lock");
        synchronized (this.f4839c) {
            v2.n1.k("createNewReference: Lock acquired");
            a(new v90(this, u90Var), new w90(this, u90Var));
            p3.o.p(this.f4842f >= 0);
            this.f4842f++;
        }
        v2.n1.k("createNewReference: Lock released");
        return u90Var;
    }

    protected final void h() {
        v2.n1.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f4839c) {
            v2.n1.k("releaseOneReference: Lock acquired");
            p3.o.p(this.f4842f > 0);
            v2.n1.k("Releasing 1 reference for JS Engine");
            this.f4842f--;
            j();
        }
        v2.n1.k("releaseOneReference: Lock released");
    }

    public final void i() {
        v2.n1.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f4839c) {
            v2.n1.k("markAsDestroyable: Lock acquired");
            p3.o.p(this.f4842f >= 0);
            v2.n1.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f4841e = true;
            j();
        }
        v2.n1.k("markAsDestroyable: Lock released");
    }

    protected final void j() {
        v2.n1.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f4839c) {
            try {
                v2.n1.k("maybeDestroy: Lock acquired");
                p3.o.p(this.f4842f >= 0);
                if (this.f4841e && this.f4842f == 0) {
                    v2.n1.k("No reference is left (including root). Cleaning up engine.");
                    a(new y90(this), new lm0());
                } else {
                    v2.n1.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v2.n1.k("maybeDestroy: Lock released");
    }
}
