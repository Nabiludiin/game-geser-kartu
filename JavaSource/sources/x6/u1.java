package x6;

/* compiled from: MyApplication */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    private static final c7.f0 f27439a = new c7.f0("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final c7.f0 f27440b = new c7.f0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final c7.f0 f27441c = new c7.f0("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final c7.f0 f27442d = new c7.f0("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final c7.f0 f27443e = new c7.f0("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final w0 f27444f = new w0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final w0 f27445g = new w0(true);

    public static final Object g(Object obj) {
        return obj instanceof h1 ? new i1((h1) obj) : obj;
    }

    public static final Object h(Object obj) {
        h1 h1Var;
        i1 i1Var = obj instanceof i1 ? (i1) obj : null;
        return (i1Var == null || (h1Var = i1Var.f27393a) == null) ? obj : h1Var;
    }
}
