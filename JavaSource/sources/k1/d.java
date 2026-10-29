package k1;

import android.content.Context;
import e1.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    private static final String f24354f = j.f("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    protected final o1.a f24355a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f24356b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f24357c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Set f24358d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    Object f24359e;

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ List f24360q;

        a(List list) {
            this.f24360q = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f24360q.iterator();
            while (it.hasNext()) {
                ((i1.a) it.next()).a(d.this.f24359e);
            }
        }
    }

    d(Context context, o1.a aVar) {
        this.f24356b = context.getApplicationContext();
        this.f24355a = aVar;
    }

    public void a(i1.a aVar) {
        synchronized (this.f24357c) {
            try {
                if (this.f24358d.add(aVar)) {
                    if (this.f24358d.size() == 1) {
                        this.f24359e = b();
                        j.c().a(f24354f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f24359e), new Throwable[0]);
                        e();
                    }
                    aVar.a(this.f24359e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object b();

    public void c(i1.a aVar) {
        synchronized (this.f24357c) {
            try {
                if (this.f24358d.remove(aVar) && this.f24358d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Object obj) {
        synchronized (this.f24357c) {
            try {
                Object obj2 = this.f24359e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f24359e = obj;
                    this.f24355a.a().execute(new a(new ArrayList(this.f24358d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
