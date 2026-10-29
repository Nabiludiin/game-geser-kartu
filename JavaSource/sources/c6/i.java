package c6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import c6.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
class i {

    /* renamed from: a, reason: collision with root package name */
    final b f3609a;

    /* renamed from: b, reason: collision with root package name */
    final Context f3610b;

    /* renamed from: c, reason: collision with root package name */
    final ExecutorService f3611c;

    /* renamed from: d, reason: collision with root package name */
    final j f3612d;

    /* renamed from: e, reason: collision with root package name */
    final Map f3613e;

    /* renamed from: f, reason: collision with root package name */
    final Map f3614f;

    /* renamed from: g, reason: collision with root package name */
    final Map f3615g;

    /* renamed from: h, reason: collision with root package name */
    final Set f3616h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f3617i;

    /* renamed from: j, reason: collision with root package name */
    final Handler f3618j;

    /* renamed from: k, reason: collision with root package name */
    final d f3619k;

    /* renamed from: l, reason: collision with root package name */
    final a0 f3620l;

    /* renamed from: m, reason: collision with root package name */
    final List f3621m;

    /* renamed from: n, reason: collision with root package name */
    final c f3622n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f3623o;

    /* renamed from: p, reason: collision with root package name */
    boolean f3624p;

    /* compiled from: MyApplication */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final i f3625a;

        /* compiled from: MyApplication */
        /* renamed from: c6.i$a$a, reason: collision with other inner class name */
        class RunnableC0070a implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Message f3626q;

            RunnableC0070a(Message message) {
                this.f3626q = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f3626q.what);
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.f3625a = iVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f3625a.v((c6.a) message.obj);
                    break;
                case 2:
                    this.f3625a.o((c6.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    t.f3667o.post(new RunnableC0070a(message));
                    break;
                case 4:
                    this.f3625a.p((c6.c) message.obj);
                    break;
                case 5:
                    this.f3625a.u((c6.c) message.obj);
                    break;
                case 6:
                    this.f3625a.q((c6.c) message.obj, false);
                    break;
                case 7:
                    this.f3625a.n();
                    break;
                case 9:
                    this.f3625a.r((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f3625a.m(message.arg1 == 1);
                    break;
                case 11:
                    this.f3625a.s(message.obj);
                    break;
                case 12:
                    this.f3625a.t(message.obj);
                    break;
            }
        }
    }

    /* compiled from: MyApplication */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* compiled from: MyApplication */
    static class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final i f3628a;

        c(i iVar) {
            this.f3628a = iVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f3628a.f3623o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f3628a.f3610b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f3628a.b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f3628a.f(((ConnectivityManager) e0.p(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    i(Context context, ExecutorService executorService, Handler handler, j jVar, d dVar, a0 a0Var) {
        b bVar = new b();
        this.f3609a = bVar;
        bVar.start();
        e0.j(bVar.getLooper());
        this.f3610b = context;
        this.f3611c = executorService;
        this.f3613e = new LinkedHashMap();
        this.f3614f = new WeakHashMap();
        this.f3615g = new WeakHashMap();
        this.f3616h = new HashSet();
        this.f3617i = new a(bVar.getLooper(), this);
        this.f3612d = jVar;
        this.f3618j = handler;
        this.f3619k = dVar;
        this.f3620l = a0Var;
        this.f3621m = new ArrayList(4);
        this.f3624p = e0.r(context);
        this.f3623o = e0.q(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f3622n = cVar;
        cVar.a();
    }

    private void a(c6.c cVar) {
        if (cVar.s()) {
            return;
        }
        this.f3621m.add(cVar);
        if (this.f3617i.hasMessages(7)) {
            return;
        }
        this.f3617i.sendEmptyMessageDelayed(7, 200L);
    }

    private void i() {
        if (this.f3614f.isEmpty()) {
            return;
        }
        Iterator it = this.f3614f.values().iterator();
        while (it.hasNext()) {
            c6.a aVar = (c6.a) it.next();
            it.remove();
            if (aVar.g().f3681m) {
                e0.u("Dispatcher", "replaying", aVar.i().d());
            }
            w(aVar, false);
        }
    }

    private void j(List list) {
        if (list == null || list.isEmpty() || !((c6.c) list.get(0)).o().f3681m) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c6.c cVar = (c6.c) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(e0.l(cVar));
        }
        e0.u("Dispatcher", "delivered", sb.toString());
    }

    private void k(c6.a aVar) {
        Object k7 = aVar.k();
        if (k7 != null) {
            aVar.f3552k = true;
            this.f3614f.put(k7, aVar);
        }
    }

    private void l(c6.c cVar) {
        c6.a h8 = cVar.h();
        if (h8 != null) {
            k(h8);
        }
        List i7 = cVar.i();
        if (i7 != null) {
            int size = i7.size();
            for (int i8 = 0; i8 < size; i8++) {
                k((c6.a) i7.get(i8));
            }
        }
    }

    void b(boolean z7) {
        Handler handler = this.f3617i;
        handler.sendMessage(handler.obtainMessage(10, z7 ? 1 : 0, 0));
    }

    void c(c6.a aVar) {
        Handler handler = this.f3617i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    void d(c6.c cVar) {
        Handler handler = this.f3617i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    void e(c6.c cVar) {
        Handler handler = this.f3617i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f3617i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void g(c6.c cVar) {
        Handler handler = this.f3617i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    void h(c6.a aVar) {
        Handler handler = this.f3617i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    void m(boolean z7) {
        this.f3624p = z7;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.f3621m);
        this.f3621m.clear();
        Handler handler = this.f3618j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(c6.a aVar) {
        String d8 = aVar.d();
        c6.c cVar = (c6.c) this.f3613e.get(d8);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f3613e.remove(d8);
                if (aVar.g().f3681m) {
                    e0.u("Dispatcher", "canceled", aVar.i().d());
                }
            }
        }
        if (this.f3616h.contains(aVar.j())) {
            this.f3615g.remove(aVar.k());
            if (aVar.g().f3681m) {
                e0.v("Dispatcher", "canceled", aVar.i().d(), "because paused request got canceled");
            }
        }
        c6.a aVar2 = (c6.a) this.f3614f.remove(aVar.k());
        if (aVar2 == null || !aVar2.g().f3681m) {
            return;
        }
        e0.v("Dispatcher", "canceled", aVar2.i().d(), "from replaying");
    }

    void p(c6.c cVar) {
        if (p.d(cVar.n())) {
            this.f3619k.c(cVar.l(), cVar.q());
        }
        this.f3613e.remove(cVar.l());
        a(cVar);
        if (cVar.o().f3681m) {
            e0.v("Dispatcher", "batched", e0.l(cVar), "for completion");
        }
    }

    void q(c6.c cVar, boolean z7) {
        if (cVar.o().f3681m) {
            String l7 = e0.l(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z7 ? " (will replay)" : "");
            e0.v("Dispatcher", "batched", l7, sb.toString());
        }
        this.f3613e.remove(cVar.l());
        a(cVar);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f3611c;
        if (executorService instanceof v) {
            ((v) executorService).c(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    void s(Object obj) {
        if (this.f3616h.add(obj)) {
            Iterator it = this.f3613e.values().iterator();
            while (it.hasNext()) {
                c6.c cVar = (c6.c) it.next();
                boolean z7 = cVar.o().f3681m;
                c6.a h8 = cVar.h();
                List i7 = cVar.i();
                boolean z8 = (i7 == null || i7.isEmpty()) ? false : true;
                if (h8 != null || z8) {
                    if (h8 != null && h8.j().equals(obj)) {
                        cVar.f(h8);
                        this.f3615g.put(h8.k(), h8);
                        if (z7) {
                            e0.v("Dispatcher", "paused", h8.f3543b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z8) {
                        for (int size = i7.size() - 1; size >= 0; size--) {
                            c6.a aVar = (c6.a) i7.get(size);
                            if (aVar.j().equals(obj)) {
                                cVar.f(aVar);
                                this.f3615g.put(aVar.k(), aVar);
                                if (z7) {
                                    e0.v("Dispatcher", "paused", aVar.f3543b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (cVar.c()) {
                        it.remove();
                        if (z7) {
                            e0.v("Dispatcher", "canceled", e0.l(cVar), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (this.f3616h.remove(obj)) {
            Iterator it = this.f3615g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                c6.a aVar = (c6.a) it.next();
                if (aVar.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f3618j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    void u(c6.c cVar) {
        if (cVar.s()) {
            return;
        }
        boolean z7 = false;
        if (this.f3611c.isShutdown()) {
            q(cVar, false);
            return;
        }
        NetworkInfo activeNetworkInfo = this.f3623o ? ((ConnectivityManager) e0.p(this.f3610b, "connectivity")).getActiveNetworkInfo() : null;
        boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean u7 = cVar.u(this.f3624p, activeNetworkInfo);
        boolean v7 = cVar.v();
        if (!u7) {
            if (this.f3623o && v7) {
                z7 = true;
            }
            q(cVar, z7);
            if (z7) {
                l(cVar);
                return;
            }
            return;
        }
        if (this.f3623o && !z8) {
            q(cVar, v7);
            if (v7) {
                l(cVar);
                return;
            }
            return;
        }
        if (cVar.o().f3681m) {
            e0.u("Dispatcher", "retrying", e0.l(cVar));
        }
        if (cVar.k() instanceof r.a) {
            cVar.f3596y |= q.NO_CACHE.f3663q;
        }
        cVar.D = this.f3611c.submit(cVar);
    }

    void v(c6.a aVar) {
        w(aVar, true);
    }

    void w(c6.a aVar, boolean z7) {
        if (this.f3616h.contains(aVar.j())) {
            this.f3615g.put(aVar.k(), aVar);
            if (aVar.g().f3681m) {
                e0.v("Dispatcher", "paused", aVar.f3543b.d(), "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        c6.c cVar = (c6.c) this.f3613e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
            return;
        }
        if (this.f3611c.isShutdown()) {
            if (aVar.g().f3681m) {
                e0.v("Dispatcher", "ignored", aVar.f3543b.d(), "because shut down");
                return;
            }
            return;
        }
        c6.c g8 = c6.c.g(aVar.g(), this, this.f3619k, this.f3620l, aVar);
        g8.D = this.f3611c.submit(g8);
        this.f3613e.put(aVar.d(), g8);
        if (z7) {
            this.f3614f.remove(aVar.k());
        }
        if (aVar.g().f3681m) {
            e0.u("Dispatcher", "enqueued", aVar.f3543b.d());
        }
    }
}
