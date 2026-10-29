package c5;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.os.r;
import com.google.android.gms.common.util.n;
import com.google.android.gms.common.util.q;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import f5.o;
import f5.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m3.c;
import m3.l1;

/* compiled from: MyApplication */
public class e {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f3520k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map f3521l = new r.a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f3522a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3523b;

    /* renamed from: c, reason: collision with root package name */
    private final l f3524c;

    /* renamed from: d, reason: collision with root package name */
    private final o f3525d;

    /* renamed from: g, reason: collision with root package name */
    private final x f3528g;

    /* renamed from: h, reason: collision with root package name */
    private final o5.b f3529h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3526e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f3527f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List f3530i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List f3531j = new CopyOnWriteArrayList();

    /* compiled from: MyApplication */
    public interface a {
        void a(boolean z7);
    }

    /* compiled from: MyApplication */
    private static class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference f3532a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (n.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f3532a.get() == null) {
                    b bVar = new b();
                    if (l1.a(f3532a, null, bVar)) {
                        m3.c.c(application);
                        m3.c.b().a(bVar);
                    }
                }
            }
        }

        @Override // m3.c.a
        public void a(boolean z7) {
            synchronized (e.f3520k) {
                try {
                    ArrayList arrayList = new ArrayList(e.f3521l.values());
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        e eVar = (e) obj;
                        if (eVar.f3526e.get()) {
                            eVar.v(z7);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: MyApplication */
    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference f3533b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final Context f3534a;

        public c(Context context) {
            this.f3534a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f3533b.get() == null) {
                c cVar = new c(context);
                if (l1.a(f3533b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f3534a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f3520k) {
                try {
                    Iterator it = e.f3521l.values().iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, l lVar) {
        this.f3522a = (Context) p3.o.m(context);
        this.f3523b = p3.o.g(str);
        this.f3524c = (l) p3.o.m(lVar);
        m b8 = FirebaseInitProvider.b();
        v5.c.b("Firebase");
        v5.c.b("ComponentDiscovery");
        List b9 = f5.g.c(context, ComponentDiscoveryService.class).b();
        v5.c.a();
        v5.c.b("Runtime");
        o.b f8 = o.k(g5.j.INSTANCE).d(b9).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(f5.c.q(context, Context.class, new Class[0])).b(f5.c.q(this, e.class, new Class[0])).b(f5.c.q(lVar, l.class, new Class[0])).f(new v5.b());
        if (r.a(context) && FirebaseInitProvider.c()) {
            f8.b(f5.c.q(b8, m.class, new Class[0]));
        }
        o e8 = f8.e();
        this.f3525d = e8;
        v5.c.a();
        this.f3528g = new x(new o5.b() { // from class: c5.c
            @Override // o5.b
            public final Object get() {
                return e.b(e.this, context);
            }
        });
        this.f3529h = e8.d(n5.f.class);
        g(new a() { // from class: c5.d
            @Override // c5.e.a
            public final void a(boolean z7) {
                e.a(e.this, z7);
            }
        });
        v5.c.a();
    }

    public static /* synthetic */ void a(e eVar, boolean z7) {
        if (z7) {
            eVar.getClass();
        } else {
            ((n5.f) eVar.f3529h.get()).g();
        }
    }

    public static /* synthetic */ t5.a b(e eVar, Context context) {
        return new t5.a(context, eVar.n(), (m5.c) eVar.f3525d.a(m5.c.class));
    }

    private void h() {
        p3.o.q(!this.f3527f.get(), "FirebaseApp was deleted");
    }

    public static e k() {
        e eVar;
        synchronized (f3520k) {
            try {
                eVar = (e) f3521l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + q.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((n5.f) eVar.f3529h.get()).g();
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!r.a(this.f3522a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            c.b(this.f3522a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f3525d.n(t());
        ((n5.f) this.f3529h.get()).g();
    }

    public static e p(Context context) {
        synchronized (f3520k) {
            try {
                if (f3521l.containsKey("[DEFAULT]")) {
                    return k();
                }
                l a8 = l.a(context);
                if (a8 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return q(context, a8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e q(Context context, l lVar) {
        return r(context, lVar, "[DEFAULT]");
    }

    public static e r(Context context, l lVar, String str) {
        e eVar;
        b.c(context);
        String u7 = u(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f3520k) {
            Map map = f3521l;
            p3.o.q(!map.containsKey(u7), "FirebaseApp name " + u7 + " already exists!");
            p3.o.n(context, "Application context cannot be null.");
            eVar = new e(context, u7, lVar);
            map.put(u7, eVar);
        }
        eVar.o();
        return eVar;
    }

    private static String u(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z7) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f3530i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z7);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f3523b.equals(((e) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f3526e.get() && m3.c.b().d()) {
            aVar.a(true);
        }
        this.f3530i.add(aVar);
    }

    public int hashCode() {
        return this.f3523b.hashCode();
    }

    public Object i(Class cls) {
        h();
        return this.f3525d.a(cls);
    }

    public Context j() {
        h();
        return this.f3522a;
    }

    public String l() {
        h();
        return this.f3523b;
    }

    public l m() {
        h();
        return this.f3524c;
    }

    public String n() {
        return com.google.android.gms.common.util.c.b(l().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.b(m().c().getBytes(Charset.defaultCharset()));
    }

    public boolean s() {
        h();
        return ((t5.a) this.f3528g.get()).b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return p3.n.c(this).a("name", this.f3523b).a("options", this.f3524c).toString();
    }
}
