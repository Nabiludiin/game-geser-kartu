package c7;

/* compiled from: MyApplication */
public abstract class x {

    /* compiled from: MyApplication */
    static final class a extends q6.j implements p6.l {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ p6.l f3828r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f3829s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ g6.i f3830t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p6.l lVar, Object obj, g6.i iVar) {
            super(1);
            this.f3828r = lVar;
            this.f3829s = obj;
            this.f3830t = iVar;
        }

        public final void c(Throwable th) {
            x.b(this.f3828r, this.f3829s, this.f3830t);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ Object g(Object obj) {
            c((Throwable) obj);
            return e6.s.f23253a;
        }
    }

    public static final p6.l a(p6.l lVar, Object obj, g6.i iVar) {
        return new a(lVar, obj, iVar);
    }

    public static final void b(p6.l lVar, Object obj, g6.i iVar) {
        o0 c8 = c(lVar, obj, null);
        if (c8 != null) {
            x6.f0.a(iVar, c8);
        }
    }

    public static final o0 c(p6.l lVar, Object obj, o0 o0Var) {
        try {
            lVar.g(obj);
            return o0Var;
        } catch (Throwable th) {
            if (o0Var != null && o0Var.getCause() != th) {
                e6.a.a(o0Var, th);
                return o0Var;
            }
            return new o0("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ o0 d(p6.l lVar, Object obj, o0 o0Var, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            o0Var = null;
        }
        return c(lVar, obj, o0Var);
    }
}
