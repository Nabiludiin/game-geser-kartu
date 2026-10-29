package r0;

import a5.d;
import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.c;
import androidx.privacysandbox.ads.adservices.topics.w;
import e6.n;
import e6.s;
import g6.e;
import i6.k;
import p6.p;
import q6.i;
import x6.g;
import x6.g0;
import x6.h0;
import x6.n0;
import x6.t0;

/* compiled from: MyApplication */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25773a = new b(null);

    /* compiled from: MyApplication */
    /* renamed from: r0.a$a, reason: collision with other inner class name */
    private static final class C0125a extends a {

        /* renamed from: b, reason: collision with root package name */
        private final w f25774b;

        /* compiled from: MyApplication */
        /* renamed from: r0.a$a$a, reason: collision with other inner class name */
        static final class C0126a extends k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f25775u;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ c f25777w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0126a(c cVar, e eVar) {
                super(2, eVar);
                this.f25777w = cVar;
            }

            @Override // i6.a
            public final e j(Object obj, e eVar) {
                return C0125a.this.new C0126a(this.f25777w, eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f25775u;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                    return obj;
                }
                n.b(obj);
                w wVar = C0125a.this.f25774b;
                c cVar = this.f25777w;
                this.f25775u = 1;
                Object a8 = wVar.a(cVar, this);
                return a8 == e8 ? e8 : a8;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0 g0Var, e eVar) {
                return ((C0126a) j(g0Var, eVar)).m(s.f23253a);
            }
        }

        public C0125a(w wVar) {
            i.e(wVar, "mTopicsManager");
            this.f25774b = wVar;
        }

        @Override // r0.a
        public d b(c cVar) {
            n0 b8;
            i.e(cVar, "request");
            b8 = g.b(h0.a(t0.c()), null, null, new C0126a(cVar, null), 3, null);
            return p0.b.c(b8, null, 1, null);
        }
    }

    /* compiled from: MyApplication */
    public static final class b {
        public /* synthetic */ b(q6.e eVar) {
            this();
        }

        public final a a(Context context) {
            i.e(context, "context");
            w a8 = w.f2591a.a(context);
            if (a8 != null) {
                return new C0125a(a8);
            }
            return null;
        }

        private b() {
        }
    }

    public static final a a(Context context) {
        return f25773a.a(context);
    }

    public abstract d b(c cVar);
}
