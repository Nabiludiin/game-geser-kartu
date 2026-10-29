package w;

import java.util.ArrayList;
import v.e;

/* compiled from: MyApplication */
public abstract class i {
    public static o a(v.e eVar, int i7, ArrayList arrayList, o oVar) {
        int o12;
        int i8 = i7 == 0 ? eVar.I0 : eVar.J0;
        if (i8 != -1 && (oVar == null || i8 != oVar.f26985b)) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i9);
                if (oVar2.c() == i8) {
                    if (oVar != null) {
                        oVar.g(i7, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i9++;
                }
            }
        } else if (i8 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof v.i) && (o12 = ((v.i) eVar).o1(i7)) != -1) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i10);
                    if (oVar3.c() == o12) {
                        oVar = oVar3;
                        break;
                    }
                    i10++;
                }
            }
            if (oVar == null) {
                oVar = new o(i7);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof v.g) {
                v.g gVar = (v.g) eVar;
                gVar.n1().b(gVar.o1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i7 == 0) {
                eVar.I0 = oVar.c();
                eVar.O.b(i7, arrayList, oVar);
                eVar.Q.b(i7, arrayList, oVar);
            } else {
                eVar.J0 = oVar.c();
                eVar.P.b(i7, arrayList, oVar);
                eVar.S.b(i7, arrayList, oVar);
                eVar.R.b(i7, arrayList, oVar);
            }
            eVar.V.b(i7, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i7) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) arrayList.get(i8);
            if (i7 == oVar.f26985b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(v.f r17, w.b.InterfaceC0139b r18) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i.c(v.f, w.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
