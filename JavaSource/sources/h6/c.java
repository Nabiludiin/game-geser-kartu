package h6;

import e6.n;
import g6.e;
import i6.h;
import i6.j;
import p6.p;
import q6.i;
import q6.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class c {

    /* compiled from: MyApplication */
    public static final class a extends j {

        /* renamed from: r, reason: collision with root package name */
        private int f24102r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f24103s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f24104t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, p pVar, Object obj) {
            super(eVar);
            this.f24103s = pVar;
            this.f24104t = obj;
            i.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // i6.a
        protected Object m(Object obj) {
            int i7 = this.f24102r;
            if (i7 == 0) {
                this.f24102r = 1;
                n.b(obj);
                i.c(this.f24103s, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) s.a(this.f24103s, 2)).i(this.f24104t, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f24102r = 2;
            n.b(obj);
            return obj;
        }
    }

    /* compiled from: MyApplication */
    public static final class b extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        private int f24105t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ p f24106u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Object f24107v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, g6.i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f24106u = pVar;
            this.f24107v = obj;
            i.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // i6.a
        protected Object m(Object obj) {
            int i7 = this.f24105t;
            if (i7 == 0) {
                this.f24105t = 1;
                n.b(obj);
                i.c(this.f24106u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) s.a(this.f24106u, 2)).i(this.f24107v, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f24105t = 2;
            n.b(obj);
            return obj;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: h6.c$c, reason: collision with other inner class name */
    public static final class C0098c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0098c(e eVar) {
            super(eVar);
            i.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // i6.a
        protected Object m(Object obj) {
            n.b(obj);
            return obj;
        }
    }

    /* compiled from: MyApplication */
    public static final class d extends i6.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e eVar, g6.i iVar) {
            super(eVar, iVar);
            i.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // i6.a
        protected Object m(Object obj) {
            n.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(p pVar, Object obj, e eVar) {
        i.e(pVar, "<this>");
        i.e(eVar, "completion");
        e a8 = h.a(eVar);
        if (pVar instanceof i6.a) {
            return ((i6.a) pVar).j(obj, a8);
        }
        g6.i context = a8.getContext();
        return context == g6.j.f24049q ? new a(a8, pVar, obj) : new b(a8, context, pVar, obj);
    }

    private static final e b(e eVar) {
        g6.i context = eVar.getContext();
        return context == g6.j.f24049q ? new C0098c(eVar) : new d(eVar, context);
    }

    public static e c(e eVar) {
        e o7;
        i.e(eVar, "<this>");
        i6.d dVar = eVar instanceof i6.d ? (i6.d) eVar : null;
        return (dVar == null || (o7 = dVar.o()) == null) ? eVar : o7;
    }

    public static Object d(p pVar, Object obj, e eVar) {
        i.e(pVar, "<this>");
        i.e(eVar, "completion");
        return ((p) s.a(pVar, 2)).i(obj, b(h.a(eVar)));
    }
}
