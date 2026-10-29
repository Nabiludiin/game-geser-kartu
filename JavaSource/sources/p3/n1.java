package p3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class n1 extends h {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f25244g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Context f25245h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Handler f25246i;

    /* renamed from: j, reason: collision with root package name */
    private final l1 f25247j;

    /* renamed from: k, reason: collision with root package name */
    private final s3.a f25248k;

    /* renamed from: l, reason: collision with root package name */
    private final long f25249l;

    /* renamed from: m, reason: collision with root package name */
    private final long f25250m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Executor f25251n;

    n1(Context context, Looper looper, Executor executor) {
        l1 l1Var = new l1(this, null);
        this.f25247j = l1Var;
        this.f25245h = context.getApplicationContext();
        this.f25246i = new o4.f(looper, l1Var);
        this.f25248k = s3.a.b();
        this.f25249l = 5000L;
        this.f25250m = 300000L;
        this.f25251n = executor;
    }

    @Override // p3.h
    protected final k3.b c(j1 j1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        k3.b bVar;
        o.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f25244g) {
            try {
                k1 k1Var = (k1) this.f25244g.get(j1Var);
                if (executor == null) {
                    executor = this.f25251n;
                }
                if (k1Var == null) {
                    k1Var = new k1(this, j1Var);
                    k1Var.e(serviceConnection, serviceConnection, str);
                    bVar = k1.d(k1Var, str, executor);
                    this.f25244g.put(j1Var, k1Var);
                } else {
                    this.f25246i.removeMessages(0, j1Var);
                    if (k1Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + j1Var.toString());
                    }
                    k1Var.e(serviceConnection, serviceConnection, str);
                    int a8 = k1Var.a();
                    if (a8 == 1) {
                        serviceConnection.onServiceConnected(k1Var.b(), k1Var.c());
                    } else if (a8 == 2) {
                        bVar = k1.d(k1Var, str, executor);
                    }
                    bVar = null;
                }
                if (k1Var.j()) {
                    return k3.b.f24462u;
                }
                if (bVar == null) {
                    bVar = new k3.b(-1);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p3.h
    protected final void d(j1 j1Var, ServiceConnection serviceConnection, String str) {
        o.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f25244g) {
            try {
                k1 k1Var = (k1) this.f25244g.get(j1Var);
                if (k1Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + j1Var.toString());
                }
                if (!k1Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + j1Var.toString());
                }
                k1Var.f(serviceConnection, str);
                if (k1Var.i()) {
                    this.f25246i.sendMessageDelayed(this.f25246i.obtainMessage(0, j1Var), this.f25249l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
