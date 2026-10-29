package b7;

import p6.q;
import q6.s;

/* compiled from: MyApplication */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final q f3458a;

    /* compiled from: MyApplication */
    /* synthetic */ class a extends q6.h implements q {

        /* renamed from: z, reason: collision with root package name */
        public static final a f3459z = new a();

        a() {
            super(3, a7.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p6.q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final Object e(a7.c cVar, Object obj, g6.e eVar) {
            return cVar.c(obj, eVar);
        }
    }

    static {
        a aVar = a.f3459z;
        q6.i.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f3458a = (q) s.a(aVar, 3);
    }
}
