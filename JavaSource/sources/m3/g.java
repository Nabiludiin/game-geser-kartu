package m3;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public class g implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status G = new Status(4, "The user must be signed in to make this API call.");
    private static final Object H = new Object();
    private static g I;
    private final Handler D;
    private volatile boolean E;

    /* renamed from: s, reason: collision with root package name */
    private p3.s f24787s;

    /* renamed from: t, reason: collision with root package name */
    private p3.u f24788t;

    /* renamed from: u, reason: collision with root package name */
    private final Context f24789u;

    /* renamed from: v, reason: collision with root package name */
    private final k3.g f24790v;

    /* renamed from: w, reason: collision with root package name */
    private final p3.h0 f24791w;

    /* renamed from: q, reason: collision with root package name */
    private long f24785q = 10000;

    /* renamed from: r, reason: collision with root package name */
    private boolean f24786r = false;

    /* renamed from: x, reason: collision with root package name */
    private final AtomicInteger f24792x = new AtomicInteger(1);

    /* renamed from: y, reason: collision with root package name */
    private final AtomicInteger f24793y = new AtomicInteger(0);

    /* renamed from: z, reason: collision with root package name */
    private final Map f24794z = new ConcurrentHashMap(5, 0.75f, 1);
    private v A = null;
    private final Set B = new r.b();
    private final Set C = new r.b();

    private g(Context context, Looper looper, k3.g gVar) {
        this.E = true;
        this.f24789u = context;
        n4.l lVar = new n4.l(looper, this);
        this.D = lVar;
        this.f24790v = gVar;
        this.f24791w = new p3.h0(gVar);
        if (com.google.android.gms.common.util.i.a(context)) {
            this.E = false;
        }
        lVar.sendMessage(lVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status f(b bVar, k3.b bVar2) {
        return new Status(bVar2, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(bVar2));
    }

    private final h0 g(l3.e eVar) {
        Map map = this.f24794z;
        b h8 = eVar.h();
        h0 h0Var = (h0) map.get(h8);
        if (h0Var == null) {
            h0Var = new h0(this, eVar);
            this.f24794z.put(h8, h0Var);
        }
        if (h0Var.b()) {
            this.C.add(h8);
        }
        h0Var.C();
        return h0Var;
    }

    private final p3.u h() {
        if (this.f24788t == null) {
            this.f24788t = p3.t.a(this.f24789u);
        }
        return this.f24788t;
    }

    private final void i() {
        p3.s sVar = this.f24787s;
        if (sVar != null) {
            if (sVar.M0() > 0 || d()) {
                h().b(sVar);
            }
            this.f24787s = null;
        }
    }

    private final void j(w4.j jVar, int i7, l3.e eVar) {
        s0 b8;
        if (i7 == 0 || (b8 = s0.b(this, i7, eVar.h())) == null) {
            return;
        }
        w4.i a8 = jVar.a();
        final Handler handler = this.D;
        handler.getClass();
        a8.b(new Executor() { // from class: m3.b0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b8);
    }

    public static g t(Context context) {
        g gVar;
        synchronized (H) {
            try {
                if (I == null) {
                    I = new g(context.getApplicationContext(), p3.h.b().getLooper(), k3.g.p());
                }
                gVar = I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public final void A(l3.e eVar, int i7, q qVar, w4.j jVar, p pVar) {
        j(jVar, qVar.d(), eVar);
        this.D.sendMessage(this.D.obtainMessage(4, new u0(new d1(i7, qVar, jVar, pVar), this.f24793y.get(), eVar)));
    }

    final void B(p3.m mVar, int i7, long j7, int i8) {
        this.D.sendMessage(this.D.obtainMessage(18, new t0(mVar, i7, j7, i8)));
    }

    public final void C(k3.b bVar, int i7) {
        if (e(bVar, i7)) {
            return;
        }
        Handler handler = this.D;
        handler.sendMessage(handler.obtainMessage(5, i7, 0, bVar));
    }

    public final void D() {
        Handler handler = this.D;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void E(l3.e eVar) {
        Handler handler = this.D;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void a(v vVar) {
        synchronized (H) {
            try {
                if (this.A != vVar) {
                    this.A = vVar;
                    this.B.clear();
                }
                this.B.addAll(vVar.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void b(v vVar) {
        synchronized (H) {
            try {
                if (this.A == vVar) {
                    this.A = null;
                    this.B.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean d() {
        if (this.f24786r) {
            return false;
        }
        p3.q a8 = p3.p.b().a();
        if (a8 != null && !a8.O0()) {
            return false;
        }
        int a9 = this.f24791w.a(this.f24789u, 203400000);
        return a9 == -1 || a9 == 0;
    }

    final boolean e(k3.b bVar, int i7) {
        return this.f24790v.z(this.f24789u, bVar, i7);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        int i7 = message.what;
        h0 h0Var = null;
        switch (i7) {
            case 1:
                this.f24785q = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.D.removeMessages(12);
                for (b bVar6 : this.f24794z.keySet()) {
                    Handler handler = this.D;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar6), this.f24785q);
                }
                return true;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (h0 h0Var2 : this.f24794z.values()) {
                    h0Var2.B();
                    h0Var2.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                u0 u0Var = (u0) message.obj;
                h0 h0Var3 = (h0) this.f24794z.get(u0Var.f24869c.h());
                if (h0Var3 == null) {
                    h0Var3 = g(u0Var.f24869c);
                }
                if (!h0Var3.b() || this.f24793y.get() == u0Var.f24868b) {
                    h0Var3.D(u0Var.f24867a);
                } else {
                    u0Var.f24867a.a(F);
                    h0Var3.I();
                }
                return true;
            case 5:
                int i8 = message.arg1;
                k3.b bVar7 = (k3.b) message.obj;
                Iterator it = this.f24794z.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        h0 h0Var4 = (h0) it.next();
                        if (h0Var4.q() == i8) {
                            h0Var = h0Var4;
                        }
                    }
                }
                if (h0Var == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i8 + " while trying to fail enqueued calls.", new Exception());
                } else if (bVar7.M0() == 13) {
                    h0Var.f(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f24790v.g(bVar7.M0()) + ": " + bVar7.N0()));
                } else {
                    bVar = h0Var.f24803s;
                    h0Var.f(f(bVar, bVar7));
                }
                return true;
            case 6:
                if (this.f24789u.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f24789u.getApplicationContext());
                    c.b().a(new c0(this));
                    if (!c.b().e(true)) {
                        this.f24785q = 300000L;
                    }
                }
                return true;
            case 7:
                g((l3.e) message.obj);
                return true;
            case 9:
                if (this.f24794z.containsKey(message.obj)) {
                    ((h0) this.f24794z.get(message.obj)).H();
                }
                return true;
            case 10:
                Iterator it2 = this.C.iterator();
                while (it2.hasNext()) {
                    h0 h0Var5 = (h0) this.f24794z.remove((b) it2.next());
                    if (h0Var5 != null) {
                        h0Var5.I();
                    }
                }
                this.C.clear();
                return true;
            case 11:
                if (this.f24794z.containsKey(message.obj)) {
                    ((h0) this.f24794z.get(message.obj)).J();
                }
                return true;
            case 12:
                if (this.f24794z.containsKey(message.obj)) {
                    ((h0) this.f24794z.get(message.obj)).c();
                }
                return true;
            case 14:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 15:
                j0 j0Var = (j0) message.obj;
                Map map = this.f24794z;
                bVar2 = j0Var.f24815a;
                if (map.containsKey(bVar2)) {
                    Map map2 = this.f24794z;
                    bVar3 = j0Var.f24815a;
                    h0.z((h0) map2.get(bVar3), j0Var);
                }
                return true;
            case 16:
                j0 j0Var2 = (j0) message.obj;
                Map map3 = this.f24794z;
                bVar4 = j0Var2.f24815a;
                if (map3.containsKey(bVar4)) {
                    Map map4 = this.f24794z;
                    bVar5 = j0Var2.f24815a;
                    h0.A((h0) map4.get(bVar5), j0Var2);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                t0 t0Var = (t0) message.obj;
                if (t0Var.f24860c == 0) {
                    h().b(new p3.s(t0Var.f24859b, Arrays.asList(t0Var.f24858a)));
                } else {
                    p3.s sVar = this.f24787s;
                    if (sVar != null) {
                        List N0 = sVar.N0();
                        if (sVar.M0() != t0Var.f24859b || (N0 != null && N0.size() >= t0Var.f24861d)) {
                            this.D.removeMessages(17);
                            i();
                        } else {
                            this.f24787s.O0(t0Var.f24858a);
                        }
                    }
                    if (this.f24787s == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(t0Var.f24858a);
                        this.f24787s = new p3.s(t0Var.f24859b, arrayList);
                        Handler handler2 = this.D;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), t0Var.f24860c);
                    }
                }
                return true;
            case 19:
                this.f24786r = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i7);
                return false;
        }
    }

    public final int k() {
        return this.f24792x.getAndIncrement();
    }

    final h0 s(b bVar) {
        return (h0) this.f24794z.get(bVar);
    }

    public final void z(l3.e eVar, int i7, com.google.android.gms.common.api.internal.a aVar) {
        this.D.sendMessage(this.D.obtainMessage(4, new u0(new c1(i7, aVar), this.f24793y.get(), eVar)));
    }
}
