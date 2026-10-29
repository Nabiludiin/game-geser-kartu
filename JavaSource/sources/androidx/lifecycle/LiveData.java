package androidx.lifecycle;

import androidx.lifecycle.g;
import java.util.Map;
import n.b;

/* compiled from: MyApplication */
public abstract class LiveData {

    /* renamed from: k, reason: collision with root package name */
    static final Object f2474k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f2475a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private n.b f2476b = new n.b();

    /* renamed from: c, reason: collision with root package name */
    int f2477c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2478d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f2479e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f2480f;

    /* renamed from: g, reason: collision with root package name */
    private int f2481g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2482h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2483i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f2484j;

    /* compiled from: MyApplication */
    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements i {

        /* renamed from: e, reason: collision with root package name */
        final k f2485e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LiveData f2486f;

        @Override // androidx.lifecycle.i
        public void c(k kVar, g.b bVar) {
            g.c b8 = this.f2485e.t().b();
            if (b8 == g.c.DESTROYED) {
                this.f2486f.i(this.f2489a);
                return;
            }
            g.c cVar = null;
            while (cVar != b8) {
                h(j());
                cVar = b8;
                b8 = this.f2485e.t().b();
            }
        }

        void i() {
            this.f2485e.t().c(this);
        }

        boolean j() {
            return this.f2485e.t().b().c(g.c.STARTED);
        }
    }

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2475a) {
                obj = LiveData.this.f2480f;
                LiveData.this.f2480f = LiveData.f2474k;
            }
            LiveData.this.j(obj);
        }
    }

    /* compiled from: MyApplication */
    private class b extends c {
        b(q qVar) {
            super(qVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j() {
            return true;
        }
    }

    public LiveData() {
        Object obj = f2474k;
        this.f2480f = obj;
        this.f2484j = new a();
        this.f2479e = obj;
        this.f2481g = -1;
    }

    static void a(String str) {
        if (m.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(c cVar) {
        if (cVar.f2490b) {
            if (!cVar.j()) {
                cVar.h(false);
                return;
            }
            int i7 = cVar.f2491c;
            int i8 = this.f2481g;
            if (i7 >= i8) {
                return;
            }
            cVar.f2491c = i8;
            cVar.f2489a.a(this.f2479e);
        }
    }

    void b(int i7) {
        int i8 = this.f2477c;
        this.f2477c = i7 + i8;
        if (this.f2478d) {
            return;
        }
        this.f2478d = true;
        while (true) {
            try {
                int i9 = this.f2477c;
                if (i8 == i9) {
                    this.f2478d = false;
                    return;
                }
                boolean z7 = i8 == 0 && i9 > 0;
                boolean z8 = i8 > 0 && i9 == 0;
                if (z7) {
                    f();
                } else if (z8) {
                    g();
                }
                i8 = i9;
            } catch (Throwable th) {
                this.f2478d = false;
                throw th;
            }
        }
    }

    void d(c cVar) {
        if (this.f2482h) {
            this.f2483i = true;
            return;
        }
        this.f2482h = true;
        do {
            this.f2483i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                b.d g8 = this.f2476b.g();
                while (g8.hasNext()) {
                    c((c) ((Map.Entry) g8.next()).getValue());
                    if (this.f2483i) {
                        break;
                    }
                }
            }
        } while (this.f2483i);
        this.f2482h = false;
    }

    public void e(q qVar) {
        a("observeForever");
        b bVar = new b(qVar);
        c cVar = (c) this.f2476b.j(qVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.h(true);
    }

    protected void h(Object obj) {
        boolean z7;
        synchronized (this.f2475a) {
            z7 = this.f2480f == f2474k;
            this.f2480f = obj;
        }
        if (z7) {
            m.a.e().c(this.f2484j);
        }
    }

    public void i(q qVar) {
        a("removeObserver");
        c cVar = (c) this.f2476b.k(qVar);
        if (cVar == null) {
            return;
        }
        cVar.i();
        cVar.h(false);
    }

    protected void j(Object obj) {
        a("setValue");
        this.f2481g++;
        this.f2479e = obj;
        d(null);
    }

    /* compiled from: MyApplication */
    private abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final q f2489a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2490b;

        /* renamed from: c, reason: collision with root package name */
        int f2491c = -1;

        c(q qVar) {
            this.f2489a = qVar;
        }

        void h(boolean z7) {
            if (z7 == this.f2490b) {
                return;
            }
            this.f2490b = z7;
            LiveData.this.b(z7 ? 1 : -1);
            if (this.f2490b) {
                LiveData.this.d(this);
            }
        }

        abstract boolean j();

        void i() {
        }
    }

    protected void f() {
    }

    protected void g() {
    }
}
