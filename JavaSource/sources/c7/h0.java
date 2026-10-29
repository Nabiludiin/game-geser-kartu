package c7;

/* compiled from: MyApplication */
abstract /* synthetic */ class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f3782a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f3782a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
