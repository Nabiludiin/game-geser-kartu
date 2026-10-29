package q6;

/* compiled from: MyApplication */
public class r {
    public u6.b b(Class cls) {
        return new c(cls);
    }

    public u6.c c(Class cls, String str) {
        return new k(cls, str);
    }

    public String e(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String f(j jVar) {
        return e(jVar);
    }

    public u6.d a(g gVar) {
        return gVar;
    }

    public u6.e d(l lVar) {
        return lVar;
    }
}
