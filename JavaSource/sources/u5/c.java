package u5;

import f5.r;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MyApplication */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f26573a;

    /* renamed from: b, reason: collision with root package name */
    private final d f26574b;

    c(Set set, d dVar) {
        this.f26573a = d(set);
        this.f26574b = dVar;
    }

    public static /* synthetic */ i b(f5.e eVar) {
        return new c(eVar.g(f.class), d.a());
    }

    public static f5.c c() {
        return f5.c.e(i.class).b(r.k(f.class)).e(new f5.h() { // from class: u5.b
            @Override // f5.h
            public final Object a(f5.e eVar) {
                return c.b(eVar);
            }
        }).c();
    }

    private static String d(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // u5.i
    public String a() {
        if (this.f26574b.b().isEmpty()) {
            return this.f26573a;
        }
        return this.f26573a + ' ' + d(this.f26574b.b());
    }
}
