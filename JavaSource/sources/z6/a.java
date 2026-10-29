package z6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyApplication */
public final class a {

    /* renamed from: q, reason: collision with root package name */
    public static final a f27990q = new a("SUSPEND", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final a f27991r = new a("DROP_OLDEST", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final a f27992s = new a("DROP_LATEST", 2);

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ a[] f27993t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ j6.a f27994u;

    static {
        a[] c8 = c();
        f27993t = c8;
        f27994u = j6.b.a(c8);
    }

    private a(String str, int i7) {
    }

    private static final /* synthetic */ a[] c() {
        return new a[]{f27990q, f27991r, f27992s};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27993t.clone();
    }
}
