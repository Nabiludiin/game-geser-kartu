package p4;

import android.app.Application;

/* compiled from: MyApplication */
public final class q implements n2 {

    /* renamed from: a, reason: collision with root package name */
    private final q2 f25496a;

    /* renamed from: b, reason: collision with root package name */
    private final q2 f25497b;

    /* renamed from: c, reason: collision with root package name */
    private final q2 f25498c;

    public q(q2 q2Var, q2 q2Var2, q2 q2Var3, q2 q2Var4) {
        this.f25496a = q2Var;
        this.f25497b = q2Var2;
        this.f25498c = q2Var3;
    }

    @Override // p4.r2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p a() {
        return new p((Application) this.f25496a.a(), (r) this.f25497b.a(), (x2) this.f25498c.a(), w.b());
    }
}
