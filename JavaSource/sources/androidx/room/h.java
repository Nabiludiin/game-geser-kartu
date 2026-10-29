package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x0.c;

/* compiled from: MyApplication */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    protected volatile x0.b f2765a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f2766b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f2767c;

    /* renamed from: d, reason: collision with root package name */
    private x0.c f2768d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2770f;

    /* renamed from: g, reason: collision with root package name */
    boolean f2771g;

    /* renamed from: h, reason: collision with root package name */
    protected List f2772h;

    /* renamed from: i, reason: collision with root package name */
    private final ReentrantReadWriteLock f2773i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    private final ThreadLocal f2774j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    private final Map f2775k = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final e f2769e = e();

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f2776a;

        /* renamed from: b, reason: collision with root package name */
        private final String f2777b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f2778c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f2779d;

        /* renamed from: e, reason: collision with root package name */
        private Executor f2780e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f2781f;

        /* renamed from: g, reason: collision with root package name */
        private c.InterfaceC0143c f2782g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2783h;

        /* renamed from: j, reason: collision with root package name */
        private boolean f2785j;

        /* renamed from: l, reason: collision with root package name */
        private boolean f2787l;

        /* renamed from: n, reason: collision with root package name */
        private Set f2789n;

        /* renamed from: o, reason: collision with root package name */
        private Set f2790o;

        /* renamed from: p, reason: collision with root package name */
        private String f2791p;

        /* renamed from: q, reason: collision with root package name */
        private File f2792q;

        /* renamed from: i, reason: collision with root package name */
        private c f2784i = c.AUTOMATIC;

        /* renamed from: k, reason: collision with root package name */
        private boolean f2786k = true;

        /* renamed from: m, reason: collision with root package name */
        private final d f2788m = new d();

        a(Context context, Class cls, String str) {
            this.f2778c = context;
            this.f2776a = cls;
            this.f2777b = str;
        }

        public a a(b bVar) {
            if (this.f2779d == null) {
                this.f2779d = new ArrayList();
            }
            this.f2779d.add(bVar);
            return this;
        }

        public a b(v0.a... aVarArr) {
            if (this.f2790o == null) {
                this.f2790o = new HashSet();
            }
            for (v0.a aVar : aVarArr) {
                this.f2790o.add(Integer.valueOf(aVar.f26698a));
                this.f2790o.add(Integer.valueOf(aVar.f26699b));
            }
            this.f2788m.b(aVarArr);
            return this;
        }

        public a c() {
            this.f2783h = true;
            return this;
        }

        public h d() {
            Executor executor;
            if (this.f2778c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f2776a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f2780e;
            if (executor2 == null && this.f2781f == null) {
                Executor d8 = m.a.d();
                this.f2781f = d8;
                this.f2780e = d8;
            } else if (executor2 != null && this.f2781f == null) {
                this.f2781f = executor2;
            } else if (executor2 == null && (executor = this.f2781f) != null) {
                this.f2780e = executor;
            }
            Set<Integer> set = this.f2790o;
            if (set != null && this.f2789n != null) {
                for (Integer num : set) {
                    if (this.f2789n.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.f2782g == null) {
                this.f2782g = new y0.c();
            }
            String str = this.f2791p;
            if (str != null || this.f2792q != null) {
                if (this.f2777b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.f2792q != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.f2782g = new k(str, this.f2792q, this.f2782g);
            }
            Context context = this.f2778c;
            androidx.room.a aVar = new androidx.room.a(context, this.f2777b, this.f2782g, this.f2788m, this.f2779d, this.f2783h, this.f2784i.d(context), this.f2780e, this.f2781f, this.f2785j, this.f2786k, this.f2787l, this.f2789n, this.f2791p, this.f2792q);
            h hVar = (h) g.b(this.f2776a, "_Impl");
            hVar.l(aVar);
            return hVar;
        }

        public a e() {
            this.f2786k = false;
            this.f2787l = true;
            return this;
        }

        public a f(c.InterfaceC0143c interfaceC0143c) {
            this.f2782g = interfaceC0143c;
            return this;
        }

        public a g(Executor executor) {
            this.f2780e = executor;
            return this;
        }
    }

    /* compiled from: MyApplication */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean c(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        c d(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || c(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: MyApplication */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private HashMap f2797a = new HashMap();

        private void a(v0.a aVar) {
            int i7 = aVar.f26698a;
            int i8 = aVar.f26699b;
            TreeMap treeMap = (TreeMap) this.f2797a.get(Integer.valueOf(i7));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f2797a.put(Integer.valueOf(i7), treeMap);
            }
            v0.a aVar2 = (v0.a) treeMap.get(Integer.valueOf(i8));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i8), aVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
        
            return r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List d(java.util.List r6, boolean r7, int r8, int r9) {
            /*
                r5 = this;
            L0:
                if (r7 == 0) goto L5
                if (r8 >= r9) goto L52
                goto L7
            L5:
                if (r8 <= r9) goto L52
            L7:
                java.util.HashMap r0 = r5.f2797a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r7 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4a
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r4 = r3.intValue()
                if (r7 == 0) goto L3d
                if (r4 > r9) goto L26
                if (r4 <= r8) goto L26
                goto L41
            L3d:
                if (r4 < r9) goto L26
                if (r4 >= r8) goto L26
            L41:
                java.lang.Object r8 = r0.get(r3)
                r6.add(r8)
                r8 = 1
                goto L4d
            L4a:
                r0 = 0
                r4 = r8
                r8 = r0
            L4d:
                if (r8 != 0) goto L50
                return r1
            L50:
                r8 = r4
                goto L0
            L52:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(v0.a... aVarArr) {
            for (v0.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List c(int i7, int i8) {
            if (i7 == i8) {
                return Collections.EMPTY_LIST;
            }
            return d(new ArrayList(), i8 > i7, i7, i8);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f2770f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f2774j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void c() {
        a();
        x0.b h02 = this.f2768d.h0();
        this.f2769e.m(h02);
        h02.x();
    }

    public x0.f d(String str) {
        a();
        b();
        return this.f2768d.h0().K(str);
    }

    protected abstract e e();

    protected abstract x0.c f(androidx.room.a aVar);

    public void g() {
        this.f2768d.h0().l0();
        if (k()) {
            return;
        }
        this.f2769e.f();
    }

    Lock h() {
        return this.f2773i.readLock();
    }

    public x0.c i() {
        return this.f2768d;
    }

    public Executor j() {
        return this.f2766b;
    }

    public boolean k() {
        return this.f2768d.h0().t0();
    }

    public void l(androidx.room.a aVar) {
        x0.c f8 = f(aVar);
        this.f2768d = f8;
        if (f8 instanceof j) {
            ((j) f8).c(aVar);
        }
        boolean z7 = aVar.f2707g == c.WRITE_AHEAD_LOGGING;
        this.f2768d.setWriteAheadLoggingEnabled(z7);
        this.f2772h = aVar.f2705e;
        this.f2766b = aVar.f2708h;
        this.f2767c = new l(aVar.f2709i);
        this.f2770f = aVar.f2706f;
        this.f2771g = z7;
        if (aVar.f2710j) {
            this.f2769e.i(aVar.f2702b, aVar.f2703c);
        }
    }

    protected void m(x0.b bVar) {
        this.f2769e.d(bVar);
    }

    public boolean o() {
        x0.b bVar = this.f2765a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(x0.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(x0.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.f2768d.h0().s0(eVar, cancellationSignal) : this.f2768d.h0().v(eVar);
    }

    public void r() {
        this.f2768d.h0().X();
    }

    /* compiled from: MyApplication */
    public static abstract class b {
        public void a(x0.b bVar) {
        }

        public void b(x0.b bVar) {
        }

        public void c(x0.b bVar) {
        }
    }
}
