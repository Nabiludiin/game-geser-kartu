package m3;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public abstract class m1 extends i implements DialogInterface.OnCancelListener {

    /* renamed from: r, reason: collision with root package name */
    protected volatile boolean f24831r;

    /* renamed from: s, reason: collision with root package name */
    protected final AtomicReference f24832s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f24833t;

    /* renamed from: u, reason: collision with root package name */
    protected final k3.g f24834u;

    m1(j jVar, k3.g gVar) {
        super(jVar);
        this.f24832s = new AtomicReference(null);
        this.f24833t = new n4.l(Looper.getMainLooper());
        this.f24834u = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(k3.b bVar, int i7) {
        this.f24832s.set(null);
        m(bVar, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f24832s.set(null);
        n();
    }

    private static final int p(i1 i1Var) {
        if (i1Var == null) {
            return -1;
        }
        return i1Var.a();
    }

    @Override // m3.i
    public final void e(int i7, int i8, Intent intent) {
        i1 i1Var = (i1) this.f24832s.get();
        if (i7 != 1) {
            if (i7 == 2) {
                int i9 = this.f24834u.i(b());
                if (i9 == 0) {
                    o();
                    return;
                } else {
                    if (i1Var == null) {
                        return;
                    }
                    if (i1Var.b().M0() == 18 && i9 == 18) {
                        return;
                    }
                }
            }
        } else if (i8 == -1) {
            o();
            return;
        } else if (i8 == 0) {
            if (i1Var != null) {
                l(new k3.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, i1Var.b().toString()), p(i1Var));
                return;
            }
            return;
        }
        if (i1Var != null) {
            l(i1Var.b(), i1Var.a());
        }
    }

    @Override // m3.i
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f24832s.set(bundle.getBoolean("resolving_error", false) ? new i1(new k3.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // m3.i
    public final void i(Bundle bundle) {
        super.i(bundle);
        i1 i1Var = (i1) this.f24832s.get();
        if (i1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", i1Var.a());
        bundle.putInt("failed_status", i1Var.b().M0());
        bundle.putParcelable("failed_resolution", i1Var.b().O0());
    }

    @Override // m3.i
    public void j() {
        super.j();
        this.f24831r = true;
    }

    @Override // m3.i
    public void k() {
        super.k();
        this.f24831r = false;
    }

    protected abstract void m(k3.b bVar, int i7);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new k3.b(13, null), p((i1) this.f24832s.get()));
    }

    public final void s(k3.b bVar, int i7) {
        AtomicReference atomicReference;
        i1 i1Var = new i1(bVar, i7);
        do {
            atomicReference = this.f24832s;
            if (l1.a(atomicReference, null, i1Var)) {
                this.f24833t.post(new k1(this, i1Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
