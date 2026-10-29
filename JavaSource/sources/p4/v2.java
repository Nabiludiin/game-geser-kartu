package p4;

import android.app.Activity;
import x4.c;
import x4.d;

/* compiled from: MyApplication */
public final class v2 implements x4.c {

    /* renamed from: a, reason: collision with root package name */
    private final r f25519a;

    /* renamed from: b, reason: collision with root package name */
    private final k3 f25520b;

    /* renamed from: c, reason: collision with root package name */
    private final l0 f25521c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f25522d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f25523e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f25524f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25525g = false;

    /* renamed from: h, reason: collision with root package name */
    private x4.d f25526h = new d.a().a();

    public v2(r rVar, k3 k3Var, l0 l0Var) {
        this.f25519a = rVar;
        this.f25520b = k3Var;
        this.f25521c = l0Var;
    }

    @Override // x4.c
    public final void a(Activity activity, x4.d dVar, c.b bVar, c.a aVar) {
        synchronized (this.f25522d) {
            this.f25524f = true;
        }
        this.f25526h = dVar;
        this.f25520b.c(activity, dVar, bVar, aVar);
    }

    @Override // x4.c
    public final boolean b() {
        r rVar = this.f25519a;
        if (!rVar.i()) {
            int a8 = !c() ? 0 : rVar.a();
            if (a8 != 1 && a8 != 3) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        boolean z7;
        synchronized (this.f25522d) {
            z7 = this.f25524f;
        }
        return z7;
    }
}
