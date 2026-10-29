package g1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import e1.j;
import e1.s;
import f1.e;
import i1.c;
import i1.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m1.p;

/* compiled from: MyApplication */
public class b implements e, c, f1.b {

    /* renamed from: y, reason: collision with root package name */
    private static final String f23944y = j.f("GreedyScheduler");

    /* renamed from: q, reason: collision with root package name */
    private final Context f23945q;

    /* renamed from: r, reason: collision with root package name */
    private final f1.j f23946r;

    /* renamed from: s, reason: collision with root package name */
    private final d f23947s;

    /* renamed from: u, reason: collision with root package name */
    private a f23949u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f23950v;

    /* renamed from: x, reason: collision with root package name */
    Boolean f23952x;

    /* renamed from: t, reason: collision with root package name */
    private final Set f23948t = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    private final Object f23951w = new Object();

    public b(Context context, androidx.work.a aVar, o1.a aVar2, f1.j jVar) {
        this.f23945q = context;
        this.f23946r = jVar;
        this.f23947s = new d(context, aVar2, this);
        this.f23949u = new a(this, aVar.k());
    }

    private void g() {
        this.f23952x = Boolean.valueOf(n1.j.b(this.f23945q, this.f23946r.i()));
    }

    private void h() {
        if (this.f23950v) {
            return;
        }
        this.f23946r.m().d(this);
        this.f23950v = true;
    }

    private void i(String str) {
        synchronized (this.f23951w) {
            try {
                Iterator it = this.f23948t.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (pVar.f24709a.equals(str)) {
                        j.c().a(f23944y, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f23948t.remove(pVar);
                        this.f23947s.d(this.f23948t);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f1.e
    public boolean a() {
        return false;
    }

    @Override // i1.c
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            j.c().a(f23944y, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f23946r.x(str);
        }
    }

    @Override // f1.b
    public void c(String str, boolean z7) {
        i(str);
    }

    @Override // f1.e
    public void d(String str) {
        if (this.f23952x == null) {
            g();
        }
        if (!this.f23952x.booleanValue()) {
            j.c().d(f23944y, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        j.c().a(f23944y, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f23949u;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f23946r.x(str);
    }

    @Override // f1.e
    public void e(p... pVarArr) {
        if (this.f23952x == null) {
            g();
        }
        if (!this.f23952x.booleanValue()) {
            j.c().d(f23944y, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a8 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f24710b == s.ENQUEUED) {
                if (currentTimeMillis < a8) {
                    a aVar = this.f23949u;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i7 = Build.VERSION.SDK_INT;
                    if (pVar.f24718j.h()) {
                        j.c().a(f23944y, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i7 < 24 || !pVar.f24718j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f24709a);
                    } else {
                        j.c().a(f23944y, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    j.c().a(f23944y, String.format("Starting work for %s", pVar.f24709a), new Throwable[0]);
                    this.f23946r.u(pVar.f24709a);
                }
            }
        }
        synchronized (this.f23951w) {
            try {
                if (!hashSet.isEmpty()) {
                    j.c().a(f23944y, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f23948t.addAll(hashSet);
                    this.f23947s.d(this.f23948t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            j.c().a(f23944y, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f23946r.u(str);
        }
    }
}
