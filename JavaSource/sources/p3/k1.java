package p3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class k1 implements ServiceConnection, o1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f25217a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f25218b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25219c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f25220d;

    /* renamed from: e, reason: collision with root package name */
    private final j1 f25221e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f25222f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n1 f25223g;

    public k1(n1 n1Var, j1 j1Var) {
        this.f25223g = n1Var;
        this.f25221e = j1Var;
    }

    static /* bridge */ /* synthetic */ k3.b d(k1 k1Var, String str, Executor executor) {
        Context context;
        s3.a aVar;
        Context context2;
        s3.a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j7;
        try {
            j1 j1Var = k1Var.f25221e;
            context = k1Var.f25223g.f25245h;
            Intent b8 = j1Var.b(context);
            k1Var.f25218b = 3;
            StrictMode.VmPolicy a8 = com.google.android.gms.common.util.x.a();
            try {
                n1 n1Var = k1Var.f25223g;
                aVar = n1Var.f25248k;
                context2 = n1Var.f25245h;
                boolean d8 = aVar.d(context2, str, b8, k1Var, 4225, executor);
                k1Var.f25219c = d8;
                if (d8) {
                    handler = k1Var.f25223g.f25246i;
                    Message obtainMessage = handler.obtainMessage(1, k1Var.f25221e);
                    handler2 = k1Var.f25223g.f25246i;
                    j7 = k1Var.f25223g.f25250m;
                    handler2.sendMessageDelayed(obtainMessage, j7);
                    k3.b bVar = k3.b.f24462u;
                    StrictMode.setVmPolicy(a8);
                    return bVar;
                }
                k1Var.f25218b = 2;
                try {
                    n1 n1Var2 = k1Var.f25223g;
                    aVar2 = n1Var2.f25248k;
                    context3 = n1Var2.f25245h;
                    aVar2.c(context3, k1Var);
                } catch (IllegalArgumentException unused) {
                }
                k3.b bVar2 = new k3.b(16);
                StrictMode.setVmPolicy(a8);
                return bVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(a8);
                throw th;
            }
        } catch (w0 e8) {
            return e8.f25278q;
        }
    }

    public final int a() {
        return this.f25218b;
    }

    public final ComponentName b() {
        return this.f25222f;
    }

    public final IBinder c() {
        return this.f25220d;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f25217a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f25217a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        s3.a aVar;
        Context context;
        j1 j1Var = this.f25221e;
        handler = this.f25223g.f25246i;
        handler.removeMessages(1, j1Var);
        n1 n1Var = this.f25223g;
        aVar = n1Var.f25248k;
        context = n1Var.f25245h;
        aVar.c(context, this);
        this.f25219c = false;
        this.f25218b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f25217a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f25217a.isEmpty();
    }

    public final boolean j() {
        return this.f25219c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f25223g.f25244g;
        synchronized (hashMap) {
            try {
                handler = this.f25223g.f25246i;
                handler.removeMessages(1, this.f25221e);
                this.f25220d = iBinder;
                this.f25222f = componentName;
                Iterator it = this.f25217a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f25218b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f25223g.f25244g;
        synchronized (hashMap) {
            try {
                handler = this.f25223g.f25246i;
                handler.removeMessages(1, this.f25221e);
                this.f25220d = null;
                this.f25222f = componentName;
                Iterator it = this.f25217a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f25218b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
