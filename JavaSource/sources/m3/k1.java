package m3;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: MyApplication */
final class k1 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final i1 f24821q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ m1 f24822r;

    k1(m1 m1Var, i1 i1Var) {
        this.f24822r = m1Var;
        this.f24821q = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24822r.f24831r) {
            k3.b b8 = this.f24821q.b();
            if (b8.P0()) {
                m1 m1Var = this.f24822r;
                m1Var.f24812q.startActivityForResult(GoogleApiActivity.a(m1Var.b(), (PendingIntent) p3.o.m(b8.O0()), this.f24821q.a(), false), 1);
                return;
            }
            m1 m1Var2 = this.f24822r;
            if (m1Var2.f24834u.d(m1Var2.b(), b8.M0(), null) != null) {
                m1 m1Var3 = this.f24822r;
                m1Var3.f24834u.y(m1Var3.b(), m1Var3.f24812q, b8.M0(), 2, this.f24822r);
                return;
            }
            if (b8.M0() != 18) {
                this.f24822r.l(b8, this.f24821q.a());
                return;
            }
            m1 m1Var4 = this.f24822r;
            Dialog t7 = m1Var4.f24834u.t(m1Var4.b(), m1Var4);
            m1 m1Var5 = this.f24822r;
            m1Var5.f24834u.u(m1Var5.b().getApplicationContext(), new j1(this, t7));
        }
    }
}
