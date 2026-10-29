package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 's' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: MyApplication */
public final class g05 {
    public static final g05 A;
    private static final /* synthetic */ g05[] B;

    /* renamed from: r, reason: collision with root package name */
    public static final g05 f8585r;

    /* renamed from: s, reason: collision with root package name */
    public static final g05 f8586s;

    /* renamed from: t, reason: collision with root package name */
    public static final g05 f8587t;

    /* renamed from: u, reason: collision with root package name */
    public static final g05 f8588u;

    /* renamed from: v, reason: collision with root package name */
    public static final g05 f8589v;

    /* renamed from: w, reason: collision with root package name */
    public static final g05 f8590w;

    /* renamed from: x, reason: collision with root package name */
    public static final g05 f8591x;

    /* renamed from: y, reason: collision with root package name */
    public static final g05 f8592y;

    /* renamed from: z, reason: collision with root package name */
    public static final g05 f8593z;

    /* renamed from: q, reason: collision with root package name */
    private final Class f8594q;

    static {
        g05 g05Var = new g05("VOID", 0, Void.class, Void.class, null);
        f8585r = g05Var;
        Class cls = Integer.TYPE;
        g05 g05Var2 = new g05("INT", 1, cls, Integer.class, 0);
        f8586s = g05Var2;
        g05 g05Var3 = new g05("LONG", 2, Long.TYPE, Long.class, 0L);
        f8587t = g05Var3;
        g05 g05Var4 = new g05("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f8588u = g05Var4;
        g05 g05Var5 = new g05("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f8589v = g05Var5;
        g05 g05Var6 = new g05("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f8590w = g05Var6;
        g05 g05Var7 = new g05("STRING", 6, String.class, String.class, "");
        f8591x = g05Var7;
        g05 g05Var8 = new g05("BYTE_STRING", 7, qy4.class, qy4.class, qy4.f14669r);
        f8592y = g05Var8;
        g05 g05Var9 = new g05("ENUM", 8, cls, Integer.class, null);
        f8593z = g05Var9;
        g05 g05Var10 = new g05("MESSAGE", 9, Object.class, Object.class, null);
        A = g05Var10;
        B = new g05[]{g05Var, g05Var2, g05Var3, g05Var4, g05Var5, g05Var6, g05Var7, g05Var8, g05Var9, g05Var10};
    }

    private g05(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f8594q = cls2;
    }

    public static g05[] values() {
        return (g05[]) B.clone();
    }

    public final Class c() {
        return this.f8594q;
    }
}
