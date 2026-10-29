package v;

import v.e;

/* compiled from: MyApplication */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f26697a = new boolean[3];

    static void a(f fVar, s.d dVar, e eVar) {
        eVar.f26659t = -1;
        eVar.f26661u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i7 = eVar.O.f26607g;
            int U = fVar.U() - eVar.Q.f26607g;
            d dVar2 = eVar.O;
            dVar2.f26609i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f26609i = dVar.q(dVar3);
            dVar.f(eVar.O.f26609i, i7);
            dVar.f(eVar.Q.f26609i, U);
            eVar.f26659t = 2;
            eVar.L0(i7, U);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i8 = eVar.P.f26607g;
        int v7 = fVar.v() - eVar.R.f26607g;
        d dVar4 = eVar.P;
        dVar4.f26609i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f26609i = dVar.q(dVar5);
        dVar.f(eVar.P.f26609i, i8);
        dVar.f(eVar.R.f26609i, v7);
        if (eVar.f26644l0 > 0 || eVar.T() == 8) {
            d dVar6 = eVar.S;
            dVar6.f26609i = dVar.q(dVar6);
            dVar.f(eVar.S.f26609i, eVar.f26644l0 + i8);
        }
        eVar.f26661u = 2;
        eVar.b1(i8, v7);
    }

    public static final boolean b(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}
