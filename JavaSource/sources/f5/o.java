package f5;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import f5.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m3.l1;

/* compiled from: MyApplication */
public class o implements e, h5.a {

    /* renamed from: i, reason: collision with root package name */
    private static final o5.b f23759i = new o5.b() { // from class: f5.k
        @Override // o5.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f23760a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f23761b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f23762c;

    /* renamed from: d, reason: collision with root package name */
    private final List f23763d;

    /* renamed from: e, reason: collision with root package name */
    private Set f23764e;

    /* renamed from: f, reason: collision with root package name */
    private final v f23765f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f23766g;

    /* renamed from: h, reason: collision with root package name */
    private final j f23767h;

    public static /* synthetic */ Object h(o oVar, c cVar) {
        oVar.getClass();
        return cVar.h().a(new f0(cVar, oVar));
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List list) {
        int i7;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f23763d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((o5.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f23767h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            Iterator it2 = list.iterator();
            while (true) {
                i7 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object[] array = ((c) it2.next()).j().toArray();
                int length = array.length;
                while (true) {
                    if (i7 < length) {
                        Object obj = array[i7];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f23764e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f23764e.add(obj.toString());
                        }
                        i7++;
                    }
                }
            }
            if (this.f23760a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f23760a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final c cVar = (c) it3.next();
                this.f23760a.put(cVar, new x(new o5.b() { // from class: f5.l
                    @Override // o5.b
                    public final Object get() {
                        return o.h(o.this, cVar);
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
        p();
    }

    private void m(Map map, boolean z7) {
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            o5.b bVar = (o5.b) entry.getValue();
            if (cVar.n() || (cVar.o() && z7)) {
                bVar.get();
            }
        }
        this.f23765f.c();
    }

    private static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void p() {
        Boolean bool = (Boolean) this.f23766g.get();
        if (bool != null) {
            m(this.f23760a, bool.booleanValue());
        }
    }

    private void q() {
        for (c cVar : this.f23760a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.f() && !this.f23762c.containsKey(rVar.b())) {
                    this.f23762c.put(rVar.b(), y.b(Collections.EMPTY_SET));
                } else if (this.f23761b.containsKey(rVar.b())) {
                    continue;
                } else {
                    if (rVar.e()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", cVar, rVar.b()));
                    }
                    if (!rVar.f()) {
                        this.f23761b.put(rVar.b(), c0.c());
                    }
                }
            }
        }
    }

    private List r(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.p()) {
                final o5.b bVar = (o5.b) this.f23760a.get(cVar);
                for (e0 e0Var : cVar.j()) {
                    if (this.f23761b.containsKey(e0Var)) {
                        final c0 c0Var = (c0) ((o5.b) this.f23761b.get(e0Var));
                        arrayList.add(new Runnable() { // from class: f5.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0.this.d(bVar);
                            }
                        });
                    } else {
                        this.f23761b.put(e0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f23760a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (!cVar.p()) {
                o5.b bVar = (o5.b) entry.getValue();
                for (e0 e0Var : cVar.j()) {
                    if (!hashMap.containsKey(e0Var)) {
                        hashMap.put(e0Var, new HashSet());
                    }
                    ((Set) hashMap.get(e0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f23762c.containsKey(entry2.getKey())) {
                final y yVar = (y) this.f23762c.get(entry2.getKey());
                for (final o5.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: f5.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(bVar2);
                        }
                    });
                }
            } else {
                this.f23762c.put((e0) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // f5.e
    public /* synthetic */ Object a(Class cls) {
        return d.b(this, cls);
    }

    @Override // f5.e
    public /* synthetic */ Object b(e0 e0Var) {
        return d.a(this, e0Var);
    }

    @Override // f5.e
    public synchronized o5.b c(e0 e0Var) {
        d0.c(e0Var, "Null interface requested.");
        return (o5.b) this.f23761b.get(e0Var);
    }

    @Override // f5.e
    public /* synthetic */ o5.b d(Class cls) {
        return d.c(this, cls);
    }

    @Override // f5.e
    public synchronized o5.b e(e0 e0Var) {
        y yVar = (y) this.f23762c.get(e0Var);
        if (yVar != null) {
            return yVar;
        }
        return f23759i;
    }

    @Override // f5.e
    public /* synthetic */ Set f(e0 e0Var) {
        return d.d(this, e0Var);
    }

    @Override // f5.e
    public /* synthetic */ Set g(Class cls) {
        return d.e(this, cls);
    }

    public void n(boolean z7) {
        HashMap hashMap;
        if (l1.a(this.f23766g, null, Boolean.valueOf(z7))) {
            synchronized (this) {
                hashMap = new HashMap(this.f23760a);
            }
            m(hashMap, z7);
        }
    }

    private o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f23760a = new HashMap();
        this.f23761b = new HashMap();
        this.f23762c = new HashMap();
        this.f23764e = new HashSet();
        this.f23766g = new AtomicReference();
        v vVar = new v(executor);
        this.f23765f = vVar;
        this.f23767h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.q(vVar, v.class, m5.d.class, m5.c.class));
        arrayList.add(c.q(this, h5.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f23763d = o(iterable);
        l(arrayList);
    }

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f23768a;

        /* renamed from: b, reason: collision with root package name */
        private final List f23769b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f23770c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private j f23771d = j.f23752a;

        b(Executor executor) {
            this.f23768a = executor;
        }

        public b b(c cVar) {
            this.f23770c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f23769b.add(new o5.b() { // from class: f5.p
                @Override // o5.b
                public final Object get() {
                    return o.b.a(ComponentRegistrar.this);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f23769b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f23768a, this.f23769b, this.f23770c, this.f23771d);
        }

        public b f(j jVar) {
            this.f23771d = jVar;
            return this;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
