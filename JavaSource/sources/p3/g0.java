package p3;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l3.f;

/* compiled from: MyApplication */
public final class g0 implements Handler.Callback {

    /* renamed from: q, reason: collision with root package name */
    private final f0 f25188q;

    /* renamed from: x, reason: collision with root package name */
    private final Handler f25195x;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f25189r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f25190s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f25191t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f25192u = false;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicInteger f25193v = new AtomicInteger(0);

    /* renamed from: w, reason: collision with root package name */
    private boolean f25194w = false;

    /* renamed from: y, reason: collision with root package name */
    private final Object f25196y = new Object();

    public g0(Looper looper, f0 f0Var) {
        this.f25188q = f0Var;
        this.f25195x = new n4.l(looper, this);
    }

    public final void a() {
        this.f25192u = false;
        this.f25193v.incrementAndGet();
    }

    public final void b() {
        this.f25192u = true;
    }

    public final void c(k3.b bVar) {
        o.e(this.f25195x, "onConnectionFailure must only be called on the Handler thread");
        this.f25195x.removeMessages(1);
        synchronized (this.f25196y) {
            try {
                ArrayList arrayList = new ArrayList(this.f25191t);
                int i7 = this.f25193v.get();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    f.c cVar = (f.c) obj;
                    if (this.f25192u && this.f25193v.get() == i7) {
                        if (this.f25191t.contains(cVar)) {
                            cVar.a(bVar);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    public final void d(Bundle bundle) {
        o.e(this.f25195x, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f25196y) {
            try {
                o.p(!this.f25194w);
                this.f25195x.removeMessages(1);
                this.f25194w = true;
                o.p(this.f25190s.isEmpty());
                ArrayList arrayList = new ArrayList(this.f25189r);
                int i7 = this.f25193v.get();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    f.b bVar = (f.b) obj;
                    if (!this.f25192u || !this.f25188q.a() || this.f25193v.get() != i7) {
                        break;
                    } else if (!this.f25190s.contains(bVar)) {
                        bVar.r0(bundle);
                    }
                }
                this.f25190s.clear();
                this.f25194w = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i7) {
        o.e(this.f25195x, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f25195x.removeMessages(1);
        synchronized (this.f25196y) {
            try {
                this.f25194w = true;
                ArrayList arrayList = new ArrayList(this.f25189r);
                int i8 = this.f25193v.get();
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    f.b bVar = (f.b) obj;
                    if (!this.f25192u || this.f25193v.get() != i8) {
                        break;
                    } else if (this.f25189r.contains(bVar)) {
                        bVar.O(i7);
                    }
                }
                this.f25190s.clear();
                this.f25194w = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(f.b bVar) {
        o.m(bVar);
        synchronized (this.f25196y) {
            try {
                if (this.f25189r.contains(bVar)) {
                    Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(bVar) + " is already registered");
                } else {
                    this.f25189r.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f25188q.a()) {
            Handler handler = this.f25195x;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(f.c cVar) {
        o.m(cVar);
        synchronized (this.f25196y) {
            try {
                if (this.f25191t.contains(cVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(cVar) + " is already registered");
                } else {
                    this.f25191t.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(f.c cVar) {
        o.m(cVar);
        synchronized (this.f25196y) {
            try {
                if (!this.f25191t.remove(cVar)) {
                    Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + String.valueOf(cVar) + " not found");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i7, new Exception());
            return false;
        }
        f.b bVar = (f.b) message.obj;
        synchronized (this.f25196y) {
            try {
                if (this.f25192u && this.f25188q.a() && this.f25189r.contains(bVar)) {
                    bVar.r0(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
