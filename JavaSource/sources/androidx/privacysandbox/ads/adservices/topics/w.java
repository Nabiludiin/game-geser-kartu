package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;

/* compiled from: MyApplication */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2591a = new a(null);

    /* compiled from: MyApplication */
    public static final class a {

        /* compiled from: MyApplication */
        /* renamed from: androidx.privacysandbox.ads.adservices.topics.w$a$a, reason: collision with other inner class name */
        static final class C0043a extends q6.j implements p6.l {

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Context f2592r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0043a(Context context) {
                super(1);
                this.f2592r = context;
            }

            @Override // p6.l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final y g(Context context) {
                q6.i.e(context, "it");
                return new y(this.f2592r);
            }
        }

        /* compiled from: MyApplication */
        static final class b extends q6.j implements p6.l {

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Context f2593r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(1);
                this.f2593r = context;
            }

            @Override // p6.l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final z g(Context context) {
                q6.i.e(context, "it");
                return new z(this.f2593r);
            }
        }

        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        public final w a(Context context) {
            q6.i.e(context, "context");
            o0.a aVar = o0.a.f25040a;
            if (aVar.a() >= 11) {
                return new c0(context);
            }
            if (aVar.a() >= 5) {
                return new e0(context);
            }
            if (aVar.a() == 4) {
                return new d0(context);
            }
            if (aVar.b() >= 11) {
                return (w) o0.b.f25043a.a(context, "TopicsManager", new C0043a(context));
            }
            if (aVar.b() >= 9) {
                return (w) o0.b.f25043a.a(context, "TopicsManager", new b(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(c cVar, g6.e eVar);
}
