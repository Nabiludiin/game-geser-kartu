package b7;

import c7.b0;
import g6.i;
import p6.p;
import x6.m1;

/* compiled from: MyApplication */
public abstract class k {

    /* compiled from: MyApplication */
    static final class a extends q6.j implements p {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ i f3460r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(2);
            this.f3460r = iVar;
        }

        public final Integer c(int i7, i.b bVar) {
            i.c key = bVar.getKey();
            i.b e8 = this.f3460r.f3453u.e(key);
            if (key != m1.f27411p) {
                return Integer.valueOf(bVar != e8 ? Integer.MIN_VALUE : i7 + 1);
            }
            m1 m1Var = (m1) e8;
            q6.i.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            m1 b8 = k.b((m1) bVar, m1Var);
            if (b8 == m1Var) {
                if (m1Var != null) {
                    i7++;
                }
                return Integer.valueOf(i7);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b8 + ", expected child of " + m1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
            return c(((Number) obj).intValue(), (i.b) obj2);
        }
    }

    public static final void a(i iVar, g6.i iVar2) {
        if (((Number) iVar2.s(0, new a(iVar))).intValue() == iVar.f3454v) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.f3453u + ",\n\t\tbut emission happened in " + iVar2 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final m1 b(m1 m1Var, m1 m1Var2) {
        while (m1Var != null) {
            if (m1Var == m1Var2 || !(m1Var instanceof b0)) {
                return m1Var;
            }
            m1Var = m1Var.getParent();
        }
        return null;
    }
}
