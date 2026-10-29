package p3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p3.c;

/* compiled from: MyApplication */
public final class c1 extends n0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f25148g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f25149h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(c cVar, int i7, IBinder iBinder, Bundle bundle) {
        super(cVar, i7, bundle);
        this.f25149h = cVar;
        this.f25148g = iBinder;
    }

    @Override // p3.n0
    protected final void f(k3.b bVar) {
        if (this.f25149h.f25142v != null) {
            this.f25149h.f25142v.a(bVar);
        }
        this.f25149h.Q(bVar);
    }

    @Override // p3.n0
    protected final boolean g() {
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f25148g;
            o.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f25149h.J().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f25149h.J() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface x7 = this.f25149h.x(this.f25148g);
            if (x7 == null || !(c.l0(this.f25149h, 2, 4, x7) || c.l0(this.f25149h, 3, 4, x7))) {
                return false;
            }
            this.f25149h.f25146z = null;
            c cVar = this.f25149h;
            Bundle C = cVar.C();
            aVar = cVar.f25141u;
            if (aVar == null) {
                return true;
            }
            aVar2 = this.f25149h.f25141u;
            aVar2.r0(C);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
