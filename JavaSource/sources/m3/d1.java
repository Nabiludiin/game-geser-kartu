package m3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: MyApplication */
public final class d1 extends q0 {

    /* renamed from: b, reason: collision with root package name */
    private final q f24776b;

    /* renamed from: c, reason: collision with root package name */
    private final w4.j f24777c;

    /* renamed from: d, reason: collision with root package name */
    private final p f24778d;

    public d1(int i7, q qVar, w4.j jVar, p pVar) {
        super(i7);
        this.f24777c = jVar;
        this.f24776b = qVar;
        this.f24778d = pVar;
        if (i7 == 2 && qVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // m3.f1
    public final void a(Status status) {
        this.f24777c.d(this.f24778d.a(status));
    }

    @Override // m3.f1
    public final void b(Exception exc) {
        this.f24777c.d(exc);
    }

    @Override // m3.f1
    public final void c(h0 h0Var) {
        try {
            this.f24776b.b(h0Var.t(), this.f24777c);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            a(f1.e(e9));
        } catch (RuntimeException e10) {
            this.f24777c.d(e10);
        }
    }

    @Override // m3.f1
    public final void d(u uVar, boolean z7) {
        uVar.d(this.f24777c, z7);
    }

    @Override // m3.q0
    public final boolean f(h0 h0Var) {
        return this.f24776b.c();
    }

    @Override // m3.q0
    public final k3.d[] g(h0 h0Var) {
        return this.f24776b.e();
    }
}
