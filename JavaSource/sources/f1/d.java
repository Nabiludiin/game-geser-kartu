package f1;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import f1.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import n1.n;

/* compiled from: MyApplication */
public class d implements b, l1.a {
    private static final String B = e1.j.f("Processor");

    /* renamed from: r, reason: collision with root package name */
    private Context f23578r;

    /* renamed from: s, reason: collision with root package name */
    private androidx.work.a f23579s;

    /* renamed from: t, reason: collision with root package name */
    private o1.a f23580t;

    /* renamed from: u, reason: collision with root package name */
    private WorkDatabase f23581u;

    /* renamed from: x, reason: collision with root package name */
    private List f23584x;

    /* renamed from: w, reason: collision with root package name */
    private Map f23583w = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private Map f23582v = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    private Set f23585y = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    private final List f23586z = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private PowerManager.WakeLock f23577q = null;
    private final Object A = new Object();

    /* compiled from: MyApplication */
    private static class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private b f23587q;

        /* renamed from: r, reason: collision with root package name */
        private String f23588r;

        /* renamed from: s, reason: collision with root package name */
        private a5.d f23589s;

        a(b bVar, String str, a5.d dVar) {
            this.f23587q = bVar;
            this.f23588r = str;
            this.f23589s = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z7;
            try {
                z7 = ((Boolean) this.f23589s.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z7 = true;
            }
            this.f23587q.c(this.f23588r, z7);
        }
    }

    public d(Context context, androidx.work.a aVar, o1.a aVar2, WorkDatabase workDatabase, List list) {
        this.f23578r = context;
        this.f23579s = aVar;
        this.f23580t = aVar2;
        this.f23581u = workDatabase;
        this.f23584x = list;
    }

    private static boolean e(String str, k kVar) {
        if (kVar == null) {
            e1.j.c().a(B, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        kVar.d();
        e1.j.c().a(B, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void m() {
        synchronized (this.A) {
            try {
                if (this.f23582v.isEmpty()) {
                    try {
                        this.f23578r.startService(androidx.work.impl.foreground.a.e(this.f23578r));
                    } catch (Throwable th) {
                        e1.j.c().b(B, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f23577q;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f23577q = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l1.a
    public void a(String str) {
        synchronized (this.A) {
            this.f23582v.remove(str);
            m();
        }
    }

    @Override // l1.a
    public void b(String str, e1.e eVar) {
        synchronized (this.A) {
            try {
                e1.j.c().d(B, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                k kVar = (k) this.f23583w.remove(str);
                if (kVar != null) {
                    if (this.f23577q == null) {
                        PowerManager.WakeLock b8 = n.b(this.f23578r, "ProcessorForegroundLck");
                        this.f23577q = b8;
                        b8.acquire();
                    }
                    this.f23582v.put(str, kVar);
                    androidx.core.content.a.k(this.f23578r, androidx.work.impl.foreground.a.d(this.f23578r, str, eVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f1.b
    public void c(String str, boolean z7) {
        synchronized (this.A) {
            try {
                this.f23583w.remove(str);
                e1.j.c().a(B, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z7)), new Throwable[0]);
                Iterator it = this.f23586z.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).c(str, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(b bVar) {
        synchronized (this.A) {
            this.f23586z.add(bVar);
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.A) {
            contains = this.f23585y.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z7;
        synchronized (this.A) {
            try {
                z7 = this.f23583w.containsKey(str) || this.f23582v.containsKey(str);
            } finally {
            }
        }
        return z7;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.A) {
            containsKey = this.f23582v.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.A) {
            this.f23586z.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        Throwable th;
        synchronized (this.A) {
            try {
                try {
                    if (g(str)) {
                        try {
                            e1.j.c().a(B, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    k a8 = new k.c(this.f23578r, this.f23579s, this.f23580t, this, this.f23581u, str).c(this.f23584x).b(aVar).a();
                    a5.d b8 = a8.b();
                    b8.c(new a(this, str, b8), this.f23580t.a());
                    this.f23583w.put(str, a8);
                    this.f23580t.c().execute(a8);
                    e1.j.c().a(B, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public boolean l(String str) {
        boolean e8;
        synchronized (this.A) {
            try {
                boolean z7 = true;
                e1.j.c().a(B, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f23585y.add(str);
                k kVar = (k) this.f23582v.remove(str);
                if (kVar == null) {
                    z7 = false;
                }
                if (kVar == null) {
                    kVar = (k) this.f23583w.remove(str);
                }
                e8 = e(str, kVar);
                if (z7) {
                    m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e8;
    }

    public boolean n(String str) {
        boolean e8;
        synchronized (this.A) {
            e1.j.c().a(B, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e8 = e(str, (k) this.f23582v.remove(str));
        }
        return e8;
    }

    public boolean o(String str) {
        boolean e8;
        synchronized (this.A) {
            e1.j.c().a(B, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e8 = e(str, (k) this.f23583w.remove(str));
        }
        return e8;
    }
}
