package p3;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: MyApplication */
public final class a1 extends p0 {

    /* renamed from: q, reason: collision with root package name */
    private c f25115q;

    /* renamed from: r, reason: collision with root package name */
    private final int f25116r;

    public a1(c cVar, int i7) {
        this.f25115q = cVar;
        this.f25116r = i7;
    }

    @Override // p3.k
    public final void D0(int i7, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p3.k
    public final void j4(int i7, IBinder iBinder, f1 f1Var) {
        c cVar = this.f25115q;
        o.n(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        o.m(f1Var);
        c.h0(cVar, f1Var);
        y4(i7, iBinder, f1Var.f25184q);
    }

    @Override // p3.k
    public final void y4(int i7, IBinder iBinder, Bundle bundle) {
        o.n(this.f25115q, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f25115q.S(i7, iBinder, bundle, this.f25116r);
        this.f25115q = null;
    }
}
