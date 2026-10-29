package c6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import c6.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public class t {

    /* renamed from: o, reason: collision with root package name */
    static final Handler f3667o = new a(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    static volatile t f3668p = null;

    /* renamed from: a, reason: collision with root package name */
    private final g f3669a;

    /* renamed from: b, reason: collision with root package name */
    private final c f3670b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3671c;

    /* renamed from: d, reason: collision with root package name */
    final Context f3672d;

    /* renamed from: e, reason: collision with root package name */
    final i f3673e;

    /* renamed from: f, reason: collision with root package name */
    final c6.d f3674f;

    /* renamed from: g, reason: collision with root package name */
    final a0 f3675g;

    /* renamed from: h, reason: collision with root package name */
    final Map f3676h;

    /* renamed from: i, reason: collision with root package name */
    final Map f3677i;

    /* renamed from: j, reason: collision with root package name */
    final ReferenceQueue f3678j;

    /* renamed from: k, reason: collision with root package name */
    final Bitmap.Config f3679k;

    /* renamed from: l, reason: collision with root package name */
    boolean f3680l;

    /* renamed from: m, reason: collision with root package name */
    volatile boolean f3681m;

    /* renamed from: n, reason: collision with root package name */
    boolean f3682n;

    /* compiled from: MyApplication */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 3) {
                c6.a aVar = (c6.a) message.obj;
                if (aVar.g().f3681m) {
                    e0.v("Main", "canceled", aVar.f3543b.d(), "target got garbage collected");
                }
                aVar.f3542a.b(aVar.k());
                return;
            }
            int i8 = 0;
            if (i7 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i8 < size) {
                    c6.c cVar = (c6.c) list.get(i8);
                    cVar.f3589r.d(cVar);
                    i8++;
                }
                return;
            }
            if (i7 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i8 < size2) {
                c6.a aVar2 = (c6.a) list2.get(i8);
                aVar2.f3542a.k(aVar2);
                i8++;
            }
        }
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f3683a;

        /* renamed from: b, reason: collision with root package name */
        private j f3684b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f3685c;

        /* renamed from: d, reason: collision with root package name */
        private c6.d f3686d;

        /* renamed from: e, reason: collision with root package name */
        private g f3687e;

        /* renamed from: f, reason: collision with root package name */
        private List f3688f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap.Config f3689g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f3690h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f3691i;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f3683a = context.getApplicationContext();
        }

        public t a() {
            Context context = this.f3683a;
            if (this.f3684b == null) {
                this.f3684b = e0.g(context);
            }
            if (this.f3686d == null) {
                this.f3686d = new m(context);
            }
            if (this.f3685c == null) {
                this.f3685c = new v();
            }
            if (this.f3687e == null) {
                this.f3687e = g.f3705a;
            }
            a0 a0Var = new a0(this.f3686d);
            return new t(context, new i(context, this.f3685c, t.f3667o, this.f3684b, this.f3686d, a0Var), this.f3686d, null, this.f3687e, this.f3688f, a0Var, this.f3689g, this.f3690h, this.f3691i);
        }
    }

    /* compiled from: MyApplication */
    private static class c extends Thread {

        /* renamed from: q, reason: collision with root package name */
        private final ReferenceQueue f3692q;

        /* renamed from: r, reason: collision with root package name */
        private final Handler f3693r;

        /* compiled from: MyApplication */
        class a implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Exception f3694q;

            a(Exception exc) {
                this.f3694q = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f3694q);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.f3692q = referenceQueue;
            this.f3693r = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0067a c0067a = (a.C0067a) this.f3692q.remove(1000L);
                    Message obtainMessage = this.f3693r.obtainMessage();
                    if (c0067a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0067a.f3554a;
                        this.f3693r.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e8) {
                    this.f3693r.post(new a(e8));
                    return;
                }
            }
        }
    }

    /* compiled from: MyApplication */
    public interface d {
    }

    /* compiled from: MyApplication */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);


        /* renamed from: q, reason: collision with root package name */
        final int f3700q;

        e(int i7) {
            this.f3700q = i7;
        }
    }

    /* compiled from: MyApplication */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    t(Context context, i iVar, c6.d dVar, d dVar2, g gVar, List list, a0 a0Var, Bitmap.Config config, boolean z7, boolean z8) {
        this.f3672d = context;
        this.f3673e = iVar;
        this.f3674f = dVar;
        this.f3669a = gVar;
        this.f3679k = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new c6.f(context));
        arrayList.add(new o(context));
        arrayList.add(new c6.g(context));
        arrayList.add(new c6.b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f3612d, a0Var));
        this.f3671c = Collections.unmodifiableList(arrayList);
        this.f3675g = a0Var;
        this.f3676h = new WeakHashMap();
        this.f3677i = new WeakHashMap();
        this.f3680l = z7;
        this.f3681m = z8;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f3678j = referenceQueue;
        c cVar = new c(referenceQueue, f3667o);
        this.f3670b = cVar;
        cVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        e0.c();
        c6.a aVar = (c6.a) this.f3676h.remove(obj);
        if (aVar != null) {
            aVar.a();
            this.f3673e.c(aVar);
        }
        if (obj instanceof ImageView) {
            h hVar = (h) this.f3677i.remove((ImageView) obj);
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    private void f(Bitmap bitmap, e eVar, c6.a aVar) {
        if (aVar.l()) {
            return;
        }
        if (!aVar.m()) {
            this.f3676h.remove(aVar.k());
        }
        if (bitmap == null) {
            aVar.c();
            if (this.f3681m) {
                e0.u("Main", "errored", aVar.f3543b.d());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.b(bitmap, eVar);
        if (this.f3681m) {
            e0.v("Main", "completed", aVar.f3543b.d(), "from " + eVar);
        }
    }

    public static t n(Context context) {
        if (f3668p == null) {
            synchronized (t.class) {
                try {
                    if (f3668p == null) {
                        f3668p = new b(context).a();
                    }
                } finally {
                }
            }
        }
        return f3668p;
    }

    public void c(ImageView imageView) {
        b(imageView);
    }

    void d(c6.c cVar) {
        c6.a h8 = cVar.h();
        List i7 = cVar.i();
        boolean z7 = (i7 == null || i7.isEmpty()) ? false : true;
        if (h8 != null || z7) {
            Uri uri = cVar.j().f3719d;
            cVar.k();
            Bitmap q7 = cVar.q();
            e m7 = cVar.m();
            if (h8 != null) {
                f(q7, m7, h8);
            }
            if (z7) {
                int size = i7.size();
                for (int i8 = 0; i8 < size; i8++) {
                    f(q7, m7, (c6.a) i7.get(i8));
                }
            }
        }
    }

    void e(ImageView imageView, h hVar) {
        this.f3677i.put(imageView, hVar);
    }

    void g(c6.a aVar) {
        Object k7 = aVar.k();
        if (k7 != null && this.f3676h.get(k7) != aVar) {
            b(k7);
            this.f3676h.put(k7, aVar);
        }
        l(aVar);
    }

    List h() {
        return this.f3671c;
    }

    public x i(int i7) {
        if (i7 != 0) {
            return new x(this, null, i7);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    Bitmap j(String str) {
        Bitmap a8 = this.f3674f.a(str);
        if (a8 != null) {
            this.f3675g.d();
            return a8;
        }
        this.f3675g.e();
        return a8;
    }

    void k(c6.a aVar) {
        Bitmap j7 = p.c(aVar.f3546e) ? j(aVar.d()) : null;
        if (j7 == null) {
            g(aVar);
            if (this.f3681m) {
                e0.u("Main", "resumed", aVar.f3543b.d());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        f(j7, eVar, aVar);
        if (this.f3681m) {
            e0.v("Main", "completed", aVar.f3543b.d(), "from " + eVar);
        }
    }

    void l(c6.a aVar) {
        this.f3673e.h(aVar);
    }

    w m(w wVar) {
        w a8 = this.f3669a.a(wVar);
        if (a8 != null) {
            return a8;
        }
        throw new IllegalStateException("Request transformer " + this.f3669a.getClass().getCanonicalName() + " returned null for " + wVar);
    }

    /* compiled from: MyApplication */
    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f3705a = new a();

        w a(w wVar);

        /* compiled from: MyApplication */
        static class a implements g {
            a() {
            }

            @Override // c6.t.g
            public w a(w wVar) {
                return wVar;
            }
        }
    }
}
