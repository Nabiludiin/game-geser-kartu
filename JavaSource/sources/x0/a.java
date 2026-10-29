package x0;

/* compiled from: MyApplication */
public final class a implements e {

    /* renamed from: q, reason: collision with root package name */
    private final String f27198q;

    /* renamed from: r, reason: collision with root package name */
    private final Object[] f27199r;

    public a(String str, Object[] objArr) {
        this.f27198q = str;
        this.f27199r = objArr;
    }

    private static void b(d dVar, int i7, Object obj) {
        if (obj == null) {
            dVar.p0(i7);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.Z(i7, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dVar.N(i7, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.N(i7, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.W(i7, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.W(i7, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.W(i7, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.W(i7, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            dVar.E(i7, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.W(i7, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i7 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i7 = 0;
        while (i7 < length) {
            Object obj = objArr[i7];
            i7++;
            b(dVar, i7, obj);
        }
    }

    @Override // x0.e
    public void a(d dVar) {
        d(dVar, this.f27199r);
    }

    @Override // x0.e
    public String c() {
        return this.f27198q;
    }

    public a(String str) {
        this(str, null);
    }
}
