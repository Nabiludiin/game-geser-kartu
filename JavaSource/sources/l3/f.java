package l3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import l3.a;
import m3.h1;
import m3.o1;
import p3.o;

/* compiled from: MyApplication */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f24609a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f24610a;

        /* renamed from: d, reason: collision with root package name */
        private int f24613d;

        /* renamed from: e, reason: collision with root package name */
        private View f24614e;

        /* renamed from: f, reason: collision with root package name */
        private String f24615f;

        /* renamed from: g, reason: collision with root package name */
        private String f24616g;

        /* renamed from: i, reason: collision with root package name */
        private final Context f24618i;

        /* renamed from: k, reason: collision with root package name */
        private m3.h f24620k;

        /* renamed from: m, reason: collision with root package name */
        private c f24622m;

        /* renamed from: n, reason: collision with root package name */
        private Looper f24623n;

        /* renamed from: b, reason: collision with root package name */
        private final Set f24611b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f24612c = new HashSet();

        /* renamed from: h, reason: collision with root package name */
        private final Map f24617h = new r.a();

        /* renamed from: j, reason: collision with root package name */
        private final Map f24619j = new r.a();

        /* renamed from: l, reason: collision with root package name */
        private int f24621l = -1;

        /* renamed from: o, reason: collision with root package name */
        private k3.g f24624o = k3.g.p();

        /* renamed from: p, reason: collision with root package name */
        private a.AbstractC0106a f24625p = u4.d.f26565c;

        /* renamed from: q, reason: collision with root package name */
        private final ArrayList f24626q = new ArrayList();

        /* renamed from: r, reason: collision with root package name */
        private final ArrayList f24627r = new ArrayList();

        public a(Context context) {
            this.f24618i = context;
            this.f24623n = context.getMainLooper();
            this.f24615f = context.getPackageName();
            this.f24616g = context.getClass().getName();
        }

        public a a(l3.a aVar) {
            o.n(aVar, "Api must not be null");
            this.f24619j.put(aVar, null);
            List a8 = ((a.e) o.n(aVar.c(), "Base client builder must not be null")).a(null);
            this.f24612c.addAll(a8);
            this.f24611b.addAll(a8);
            return this;
        }

        public a b(b bVar) {
            o.n(bVar, "Listener must not be null");
            this.f24626q.add(bVar);
            return this;
        }

        public a c(c cVar) {
            o.n(cVar, "Listener must not be null");
            this.f24627r.add(cVar);
            return this;
        }

        public a d(Scope scope) {
            o.n(scope, "Scope must not be null");
            this.f24611b.add(scope);
            return this;
        }

        public f e() {
            o.b(!this.f24619j.isEmpty(), "must call addApi() to add at least one API");
            p3.d g8 = g();
            Map k7 = g8.k();
            r.a aVar = new r.a();
            r.a aVar2 = new r.a();
            ArrayList arrayList = new ArrayList();
            l3.a aVar3 = null;
            boolean z7 = false;
            for (l3.a aVar4 : this.f24619j.keySet()) {
                Object obj = this.f24619j.get(aVar4);
                boolean z8 = k7.get(aVar4) != null;
                aVar.put(aVar4, Boolean.valueOf(z8));
                o1 o1Var = new o1(aVar4, z8);
                arrayList.add(o1Var);
                a.AbstractC0106a abstractC0106a = (a.AbstractC0106a) o.m(aVar4.a());
                a.f c8 = abstractC0106a.c(this.f24618i, this.f24623n, g8, obj, o1Var, o1Var);
                aVar2.put(aVar4.b(), c8);
                if (abstractC0106a.b() == 1) {
                    z7 = obj != null;
                }
                if (c8.b()) {
                    if (aVar3 != null) {
                        throw new IllegalStateException(aVar4.d() + " cannot be used with " + aVar3.d());
                    }
                    aVar3 = aVar4;
                }
            }
            if (aVar3 != null) {
                if (z7) {
                    throw new IllegalStateException("With using " + aVar3.d() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
                o.r(this.f24610a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.d());
                o.r(this.f24611b.equals(this.f24612c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.d());
            }
            u uVar = new u(this.f24618i, new ReentrantLock(), this.f24623n, g8, this.f24624o, this.f24625p, aVar, this.f24626q, this.f24627r, aVar2, this.f24621l, u.p(aVar2.values(), true), arrayList);
            synchronized (f.f24609a) {
                f.f24609a.add(uVar);
            }
            if (this.f24621l >= 0) {
                h1.t(this.f24620k).u(this.f24621l, uVar, this.f24622m);
            }
            return uVar;
        }

        public a f(View view) {
            o.n(view, "View must not be null");
            this.f24614e = view;
            return this;
        }

        public final p3.d g() {
            u4.a aVar = u4.a.f26553k;
            Map map = this.f24619j;
            l3.a aVar2 = u4.d.f26569g;
            if (map.containsKey(aVar2)) {
                aVar = (u4.a) this.f24619j.get(aVar2);
            }
            return new p3.d(this.f24610a, this.f24611b, this.f24617h, this.f24613d, this.f24614e, this.f24615f, this.f24616g, aVar, false);
        }
    }

    /* compiled from: MyApplication */
    public interface b extends m3.e {
    }

    /* compiled from: MyApplication */
    public interface c extends m3.n {
    }

    public abstract void d();

    public abstract void e();

    public abstract void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract com.google.android.gms.common.api.internal.a g(com.google.android.gms.common.api.internal.a aVar);

    public a.f h(a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public abstract Looper i();

    public boolean j(l3.a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean k(l3.a aVar);

    public abstract boolean l();

    public abstract void m(c cVar);

    public abstract void n(c cVar);
}
