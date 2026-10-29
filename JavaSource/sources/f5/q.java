package f5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MyApplication */
abstract class q {

    /* compiled from: MyApplication */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final f5.c f23773a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f23774b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f23775c = new HashSet();

        b(f5.c cVar) {
            this.f23773a = cVar;
        }

        void a(b bVar) {
            this.f23774b.add(bVar);
        }

        void b(b bVar) {
            this.f23775c.add(bVar);
        }

        f5.c c() {
            return this.f23773a;
        }

        Set d() {
            return this.f23774b;
        }

        boolean e() {
            return this.f23774b.isEmpty();
        }

        boolean f() {
            return this.f23775c.isEmpty();
        }

        void g(b bVar) {
            this.f23775c.remove(bVar);
        }
    }

    /* compiled from: MyApplication */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final e0 f23776a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f23777b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f23776a.equals(this.f23776a) && cVar.f23777b == this.f23777b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f23776a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f23777b).hashCode();
        }

        private c(e0 e0Var, boolean z7) {
            this.f23776a = e0Var;
            this.f23777b = z7;
        }
    }

    static void a(List list) {
        Set<b> c8 = c(list);
        Set b8 = b(c8);
        int i7 = 0;
        while (!b8.isEmpty()) {
            b bVar = (b) b8.iterator().next();
            b8.remove(bVar);
            i7++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b8.add(bVar2);
                }
            }
        }
        if (i7 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c8) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new s(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.d() && (set = (Set) hashMap.get(new c(rVar.b(), rVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            f5.c cVar = (f5.c) it.next();
            b bVar3 = new b(cVar);
            for (e0 e0Var : cVar.j()) {
                c cVar2 = new c(e0Var, !cVar.p());
                if (!hashMap.containsKey(cVar2)) {
                    hashMap.put(cVar2, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar2);
                if (!set2.isEmpty() && !cVar2.f23777b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", e0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
