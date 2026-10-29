package i1;

import android.content.Context;
import e1.j;
import j1.c;
import j1.e;
import j1.f;
import j1.g;
import j1.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public class d implements c.a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f24165d = j.f("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    private final c f24166a;

    /* renamed from: b, reason: collision with root package name */
    private final j1.c[] f24167b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f24168c;

    public d(Context context, o1.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f24166a = cVar;
        this.f24167b = new j1.c[]{new j1.a(applicationContext, aVar), new j1.b(applicationContext, aVar), new h(applicationContext, aVar), new j1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f24168c = new Object();
    }

    @Override // j1.c.a
    public void a(List list) {
        synchronized (this.f24168c) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c(str)) {
                        j.c().a(f24165d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                c cVar = this.f24166a;
                if (cVar != null) {
                    cVar.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j1.c.a
    public void b(List list) {
        synchronized (this.f24168c) {
            try {
                c cVar = this.f24166a;
                if (cVar != null) {
                    cVar.b(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f24168c) {
            try {
                for (j1.c cVar : this.f24167b) {
                    if (cVar.d(str)) {
                        j.c().a(f24165d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Iterable iterable) {
        synchronized (this.f24168c) {
            try {
                for (j1.c cVar : this.f24167b) {
                    cVar.g(null);
                }
                for (j1.c cVar2 : this.f24167b) {
                    cVar2.e(iterable);
                }
                for (j1.c cVar3 : this.f24167b) {
                    cVar3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f24168c) {
            try {
                for (j1.c cVar : this.f24167b) {
                    cVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
