package m3;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: MyApplication */
public final class c1 extends f1 {

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.a f24774b;

    public c1(int i7, com.google.android.gms.common.api.internal.a aVar) {
        super(i7);
        this.f24774b = (com.google.android.gms.common.api.internal.a) p3.o.n(aVar, "Null methods are not runnable.");
    }

    @Override // m3.f1
    public final void a(Status status) {
        try {
            this.f24774b.a(status);
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // m3.f1
    public final void b(Exception exc) {
        try {
            this.f24774b.a(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // m3.f1
    public final void c(h0 h0Var) {
        try {
            this.f24774b.v(h0Var.t());
        } catch (RuntimeException e8) {
            b(e8);
        }
    }

    @Override // m3.f1
    public final void d(u uVar, boolean z7) {
        uVar.c(this.f24774b, z7);
    }
}
