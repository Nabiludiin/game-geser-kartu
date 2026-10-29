package x6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyApplication */
public final class i0 {

    /* renamed from: q, reason: collision with root package name */
    public static final i0 f27386q = new i0("DEFAULT", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final i0 f27387r = new i0("LAZY", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final i0 f27388s = new i0("ATOMIC", 2);

    /* renamed from: t, reason: collision with root package name */
    public static final i0 f27389t = new i0("UNDISPATCHED", 3);

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ i0[] f27390u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ j6.a f27391v;

    /* compiled from: MyApplication */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27392a;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.f27386q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.f27388s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i0.f27389t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i0.f27387r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27392a = iArr;
        }
    }

    static {
        i0[] c8 = c();
        f27390u = c8;
        f27391v = j6.b.a(c8);
    }

    private i0(String str, int i7) {
    }

    private static final /* synthetic */ i0[] c() {
        return new i0[]{f27386q, f27387r, f27388s, f27389t};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f27390u.clone();
    }

    public final void d(p6.p pVar, Object obj, g6.e eVar) {
        int i7 = a.f27392a[ordinal()];
        if (i7 == 1) {
            d7.a.d(pVar, obj, eVar, null, 4, null);
            return;
        }
        if (i7 == 2) {
            g6.g.a(pVar, obj, eVar);
        } else if (i7 == 3) {
            d7.b.a(pVar, obj, eVar);
        } else if (i7 != 4) {
            throw new e6.k();
        }
    }

    public final boolean j() {
        return this == f27387r;
    }
}
