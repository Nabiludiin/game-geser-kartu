package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import e1.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.k;
import n1.n;
import n1.r;

/* compiled from: MyApplication */
public class e implements f1.b {
    static final String A = j.f("SystemAlarmDispatcher");

    /* renamed from: q, reason: collision with root package name */
    final Context f3044q;

    /* renamed from: r, reason: collision with root package name */
    private final o1.a f3045r;

    /* renamed from: s, reason: collision with root package name */
    private final r f3046s;

    /* renamed from: t, reason: collision with root package name */
    private final f1.d f3047t;

    /* renamed from: u, reason: collision with root package name */
    private final f1.j f3048u;

    /* renamed from: v, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f3049v;

    /* renamed from: w, reason: collision with root package name */
    private final Handler f3050w;

    /* renamed from: x, reason: collision with root package name */
    final List f3051x;

    /* renamed from: y, reason: collision with root package name */
    Intent f3052y;

    /* renamed from: z, reason: collision with root package name */
    private c f3053z;

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f3051x) {
                e eVar2 = e.this;
                eVar2.f3052y = (Intent) eVar2.f3051x.get(0);
            }
            Intent intent = e.this.f3052y;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f3052y.getIntExtra("KEY_START_ID", 0);
                j c8 = j.c();
                String str = e.A;
                c8.a(str, String.format("Processing command %s, %s", e.this.f3052y, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b8 = n.b(e.this.f3044q, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    j.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b8), new Throwable[0]);
                    b8.acquire();
                    e eVar3 = e.this;
                    eVar3.f3049v.o(eVar3.f3052y, intExtra, eVar3);
                    j.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b8), new Throwable[0]);
                    b8.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        j c9 = j.c();
                        String str2 = e.A;
                        c9.b(str2, "Unexpected error in onHandleIntent", th);
                        j.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b8), new Throwable[0]);
                        b8.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        j.c().a(e.A, String.format("Releasing operation wake lock (%s) %s", action, b8), new Throwable[0]);
                        b8.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* compiled from: MyApplication */
    static class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final e f3055q;

        /* renamed from: r, reason: collision with root package name */
        private final Intent f3056r;

        /* renamed from: s, reason: collision with root package name */
        private final int f3057s;

        b(e eVar, Intent intent, int i7) {
            this.f3055q = eVar;
            this.f3056r = intent;
            this.f3057s = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3055q.a(this.f3056r, this.f3057s);
        }
    }

    /* compiled from: MyApplication */
    interface c {
        void a();
    }

    /* compiled from: MyApplication */
    static class d implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final e f3058q;

        d(e eVar) {
            this.f3058q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3058q.d();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f3050w.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f3051x) {
            try {
                Iterator it = this.f3051x.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b8 = n.b(this.f3044q, "ProcessCommand");
        try {
            b8.acquire();
            this.f3048u.p().b(new a());
        } finally {
            b8.release();
        }
    }

    public boolean a(Intent intent, int i7) {
        j c8 = j.c();
        String str = A;
        c8.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i7)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f3051x) {
            try {
                boolean isEmpty = this.f3051x.isEmpty();
                this.f3051x.add(intent);
                if (isEmpty) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // f1.b
    public void c(String str, boolean z7) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.d(this.f3044q, str, z7), 0));
    }

    void d() {
        j c8 = j.c();
        String str = A;
        c8.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f3051x) {
            try {
                if (this.f3052y != null) {
                    j.c().a(str, String.format("Removing command %s", this.f3052y), new Throwable[0]);
                    if (!((Intent) this.f3051x.remove(0)).equals(this.f3052y)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f3052y = null;
                }
                k c9 = this.f3045r.c();
                if (!this.f3049v.n() && this.f3051x.isEmpty() && !c9.b()) {
                    j.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.f3053z;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.f3051x.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    f1.d e() {
        return this.f3047t;
    }

    o1.a f() {
        return this.f3045r;
    }

    f1.j g() {
        return this.f3048u;
    }

    r h() {
        return this.f3046s;
    }

    void j() {
        j.c().a(A, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f3047t.i(this);
        this.f3046s.a();
        this.f3053z = null;
    }

    void k(Runnable runnable) {
        this.f3050w.post(runnable);
    }

    void m(c cVar) {
        if (this.f3053z != null) {
            j.c().b(A, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f3053z = cVar;
        }
    }

    e(Context context, f1.d dVar, f1.j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3044q = applicationContext;
        this.f3049v = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f3046s = new r();
        jVar = jVar == null ? f1.j.k(context) : jVar;
        this.f3048u = jVar;
        dVar = dVar == null ? jVar.m() : dVar;
        this.f3047t = dVar;
        this.f3045r = jVar.p();
        dVar.d(this);
        this.f3051x = new ArrayList();
        this.f3052y = null;
        this.f3050w = new Handler(Looper.getMainLooper());
    }
}
