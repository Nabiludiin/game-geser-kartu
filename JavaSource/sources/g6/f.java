package g6;

import com.google.android.gms.internal.ads.kc0;
import g6.i;

/* compiled from: MyApplication */
public interface f extends i.b {

    /* renamed from: n, reason: collision with root package name */
    public static final b f24047n = b.f24048q;

    /* compiled from: MyApplication */
    public static final class a {
        public static i.b a(f fVar, i.c cVar) {
            q6.i.e(cVar, "key");
            if (!(cVar instanceof g6.b)) {
                if (f.f24047n != cVar) {
                    return null;
                }
                q6.i.c(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            g6.b bVar = (g6.b) cVar;
            if (bVar.a(fVar.getKey())) {
                i.b b8 = bVar.b(fVar);
                if (kc0.a(b8)) {
                    return b8;
                }
            }
            return null;
        }

        public static i b(f fVar, i.c cVar) {
            q6.i.e(cVar, "key");
            if (!(cVar instanceof g6.b)) {
                return f.f24047n == cVar ? j.f24049q : fVar;
            }
            g6.b bVar = (g6.b) cVar;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.f24049q;
        }
    }

    /* compiled from: MyApplication */
    public static final class b implements i.c {

        /* renamed from: q, reason: collision with root package name */
        static final /* synthetic */ b f24048q = new b();

        private b() {
        }
    }

    e o(e eVar);

    void r(e eVar);
}
