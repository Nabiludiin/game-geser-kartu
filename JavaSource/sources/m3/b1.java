package m3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: MyApplication */
abstract class b1 extends q0 {

    /* renamed from: b, reason: collision with root package name */
    protected final w4.j f24767b;

    public b1(int i7, w4.j jVar) {
        super(i7);
        this.f24767b = jVar;
    }

    @Override // m3.f1
    public final void a(Status status) {
        this.f24767b.d(new l3.b(status));
    }

    @Override // m3.f1
    public final void b(Exception exc) {
        this.f24767b.d(exc);
    }

    @Override // m3.f1
    public final void c(h0 h0Var) {
        try {
            h(h0Var);
        } catch (DeadObjectException e8) {
            a(f1.e(e8));
            throw e8;
        } catch (RemoteException e9) {
            a(f1.e(e9));
        } catch (RuntimeException e10) {
            this.f24767b.d(e10);
        }
    }

    protected abstract void h(h0 h0Var);
}
