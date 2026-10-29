package m3;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;
import l3.a;
import l3.f;

/* compiled from: MyApplication */
public final class y0 extends v4.d implements f.b, f.c {

    /* renamed from: x, reason: collision with root package name */
    private static final a.AbstractC0106a f24881x = u4.d.f26565c;

    /* renamed from: q, reason: collision with root package name */
    private final Context f24882q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f24883r;

    /* renamed from: s, reason: collision with root package name */
    private final a.AbstractC0106a f24884s;

    /* renamed from: t, reason: collision with root package name */
    private final Set f24885t;

    /* renamed from: u, reason: collision with root package name */
    private final p3.d f24886u;

    /* renamed from: v, reason: collision with root package name */
    private u4.e f24887v;

    /* renamed from: w, reason: collision with root package name */
    private x0 f24888w;

    public y0(Context context, Handler handler, p3.d dVar) {
        a.AbstractC0106a abstractC0106a = f24881x;
        this.f24882q = context;
        this.f24883r = handler;
        this.f24886u = (p3.d) p3.o.n(dVar, "ClientSettings must not be null");
        this.f24885t = dVar.f();
        this.f24884s = abstractC0106a;
    }

    static /* bridge */ /* synthetic */ void v3(y0 y0Var, v4.l lVar) {
        k3.b M0 = lVar.M0();
        if (M0.Q0()) {
            p3.l0 l0Var = (p3.l0) p3.o.m(lVar.N0());
            k3.b M02 = l0Var.M0();
            if (!M02.Q0()) {
                String valueOf = String.valueOf(M02);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                y0Var.f24888w.d(M02);
                y0Var.f24887v.h();
                return;
            }
            y0Var.f24888w.a(l0Var.N0(), y0Var.f24885t);
        } else {
            y0Var.f24888w.d(M0);
        }
        y0Var.f24887v.h();
    }

    @Override // m3.e
    public final void O(int i7) {
        this.f24888w.c(i7);
    }

    @Override // m3.n
    public final void a(k3.b bVar) {
        this.f24888w.d(bVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l3.a$f, u4.e] */
    public final void a4(x0 x0Var) {
        u4.e eVar = this.f24887v;
        if (eVar != null) {
            eVar.h();
        }
        this.f24886u.l(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0106a abstractC0106a = this.f24884s;
        Context context = this.f24882q;
        Handler handler = this.f24883r;
        p3.d dVar = this.f24886u;
        this.f24887v = abstractC0106a.c(context, handler.getLooper(), dVar, dVar.h(), this, this);
        this.f24888w = x0Var;
        Set set = this.f24885t;
        if (set == null || set.isEmpty()) {
            this.f24883r.post(new v0(this));
        } else {
            this.f24887v.u();
        }
    }

    @Override // m3.e
    public final void r0(Bundle bundle) {
        this.f24887v.n(this);
    }

    public final void u4() {
        u4.e eVar = this.f24887v;
        if (eVar != null) {
            eVar.h();
        }
    }

    @Override // v4.f
    public final void x2(v4.l lVar) {
        this.f24883r.post(new w0(this, lVar));
    }
}
