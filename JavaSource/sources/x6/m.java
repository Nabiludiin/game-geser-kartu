package x6;

/* compiled from: MyApplication */
public abstract class m {
    public static final void a(j jVar, u0 u0Var) {
        jVar.x(new v0(u0Var));
    }

    public static final k b(g6.e eVar) {
        if (!(eVar instanceof c7.j)) {
            return new k(eVar, 1);
        }
        k l7 = ((c7.j) eVar).l();
        if (l7 != null) {
            if (!l7.O()) {
                l7 = null;
            }
            if (l7 != null) {
                return l7;
            }
        }
        return new k(eVar, 2);
    }
}
