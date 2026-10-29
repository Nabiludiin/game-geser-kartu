package p3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
public final class b1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f25119a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f25120b;

    public b1(c cVar, int i7) {
        this.f25120b = cVar;
        this.f25119a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        c cVar = this.f25120b;
        if (iBinder == null) {
            c.i0(cVar, 16);
            return;
        }
        obj = cVar.f25134n;
        synchronized (obj) {
            try {
                c cVar2 = this.f25120b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cVar2.f25135o = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new q0(iBinder) : (l) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f25120b.j0(0, null, this.f25119a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f25120b.f25134n;
        synchronized (obj) {
            this.f25120b.f25135o = null;
        }
        c cVar = this.f25120b;
        int i7 = this.f25119a;
        Handler handler = cVar.f25132l;
        handler.sendMessage(handler.obtainMessage(6, i7, 1));
    }
}
