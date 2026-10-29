package w5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyApplication */
public abstract class o {

    /* renamed from: q, reason: collision with root package name */
    public static final o f27180q;

    /* renamed from: r, reason: collision with root package name */
    public static final o f27181r;

    /* renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ o[] f27182s;

    /* compiled from: MyApplication */
    enum a extends o {
        a(String str, int i7) {
            super(str, i7, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f27180q = aVar;
        o oVar = new o("STRING", 1) { // from class: w5.o.b
            {
                a aVar2 = null;
            }
        };
        f27181r = oVar;
        f27182s = new o[]{aVar, oVar};
    }

    private o(String str, int i7) {
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f27182s.clone();
    }

    /* synthetic */ o(String str, int i7, a aVar) {
        this(str, i7);
    }
}
