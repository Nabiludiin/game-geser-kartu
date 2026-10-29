package f1;

import android.text.TextUtils;
import e1.m;
import e1.r;
import e1.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MyApplication */
public class g extends r {

    /* renamed from: j, reason: collision with root package name */
    private static final String f23591j = e1.j.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final j f23592a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23593b;

    /* renamed from: c, reason: collision with root package name */
    private final e1.d f23594c;

    /* renamed from: d, reason: collision with root package name */
    private final List f23595d;

    /* renamed from: e, reason: collision with root package name */
    private final List f23596e;

    /* renamed from: f, reason: collision with root package name */
    private final List f23597f;

    /* renamed from: g, reason: collision with root package name */
    private final List f23598g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23599h;

    /* renamed from: i, reason: collision with root package name */
    private m f23600i;

    public g(j jVar, List list) {
        this(jVar, null, e1.d.KEEP, list, null);
    }

    private static boolean i(g gVar, Set set) {
        set.addAll(gVar.c());
        Set l7 = l(gVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l7.contains((String) it.next())) {
                return true;
            }
        }
        List e8 = gVar.e();
        if (e8 != null && !e8.isEmpty()) {
            Iterator it2 = e8.iterator();
            while (it2.hasNext()) {
                if (i((g) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set l(g gVar) {
        HashSet hashSet = new HashSet();
        List e8 = gVar.e();
        if (e8 != null && !e8.isEmpty()) {
            Iterator it = e8.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((g) it.next()).c());
            }
        }
        return hashSet;
    }

    public m a() {
        if (this.f23599h) {
            e1.j.c().h(f23591j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f23596e)), new Throwable[0]);
        } else {
            n1.b bVar = new n1.b(this);
            this.f23592a.p().b(bVar);
            this.f23600i = bVar.d();
        }
        return this.f23600i;
    }

    public e1.d b() {
        return this.f23594c;
    }

    public List c() {
        return this.f23596e;
    }

    public String d() {
        return this.f23593b;
    }

    public List e() {
        return this.f23598g;
    }

    public List f() {
        return this.f23595d;
    }

    public j g() {
        return this.f23592a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f23599h;
    }

    public void k() {
        this.f23599h = true;
    }

    public g(j jVar, String str, e1.d dVar, List list, List list2) {
        this.f23592a = jVar;
        this.f23593b = str;
        this.f23594c = dVar;
        this.f23595d = list;
        this.f23598g = list2;
        this.f23596e = new ArrayList(list.size());
        this.f23597f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f23597f.addAll(((g) it.next()).f23597f);
            }
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            String a8 = ((u) list.get(i7)).a();
            this.f23596e.add(a8);
            this.f23597f.add(a8);
        }
    }
}
