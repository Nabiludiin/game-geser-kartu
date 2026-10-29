package p3;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: MyApplication */
abstract class n0 extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f25241d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f25242e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f25243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected n0(c cVar, int i7, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f25243f = cVar;
        this.f25241d = i7;
        this.f25242e = bundle;
    }

    @Override // p3.z0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f25241d != 0) {
            this.f25243f.n0(1, null);
            Bundle bundle = this.f25242e;
            f(new k3.b(this.f25241d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f25243f.n0(1, null);
            f(new k3.b(8, null));
        }
    }

    protected abstract void f(k3.b bVar);

    protected abstract boolean g();

    @Override // p3.z0
    protected final void b() {
    }
}
