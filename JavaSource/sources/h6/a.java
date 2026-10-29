package h6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyApplication */
public final class a {

    /* renamed from: q, reason: collision with root package name */
    public static final a f24097q = new a("COROUTINE_SUSPENDED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final a f24098r = new a("UNDECIDED", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final a f24099s = new a("RESUMED", 2);

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ a[] f24100t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ j6.a f24101u;

    static {
        a[] c8 = c();
        f24100t = c8;
        f24101u = j6.b.a(c8);
    }

    private a(String str, int i7) {
    }

    private static final /* synthetic */ a[] c() {
        return new a[]{f24097q, f24098r, f24099s};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f24100t.clone();
    }
}
