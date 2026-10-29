package com.google.android.gms.internal.drive;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'u' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
public final class q0 {
    public static final q0 A;
    public static final q0 B;
    public static final q0 C;
    private static final /* synthetic */ q0[] D;

    /* renamed from: t, reason: collision with root package name */
    public static final q0 f20696t;

    /* renamed from: u, reason: collision with root package name */
    public static final q0 f20697u;

    /* renamed from: v, reason: collision with root package name */
    public static final q0 f20698v;

    /* renamed from: w, reason: collision with root package name */
    public static final q0 f20699w;

    /* renamed from: x, reason: collision with root package name */
    public static final q0 f20700x;

    /* renamed from: y, reason: collision with root package name */
    public static final q0 f20701y;

    /* renamed from: z, reason: collision with root package name */
    public static final q0 f20702z;

    /* renamed from: q, reason: collision with root package name */
    private final Class f20703q;

    /* renamed from: r, reason: collision with root package name */
    private final Class f20704r;

    /* renamed from: s, reason: collision with root package name */
    private final Object f20705s;

    static {
        q0 q0Var = new q0("VOID", 0, Void.class, Void.class, null);
        f20696t = q0Var;
        Class cls = Integer.TYPE;
        q0 q0Var2 = new q0("INT", 1, cls, Integer.class, 0);
        f20697u = q0Var2;
        q0 q0Var3 = new q0("LONG", 2, Long.TYPE, Long.class, 0L);
        f20698v = q0Var3;
        q0 q0Var4 = new q0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f20699w = q0Var4;
        q0 q0Var5 = new q0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f20700x = q0Var5;
        q0 q0Var6 = new q0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f20701y = q0Var6;
        q0 q0Var7 = new q0("STRING", 6, String.class, String.class, "");
        f20702z = q0Var7;
        q0 q0Var8 = new q0("BYTE_STRING", 7, i.class, i.class, i.f20619r);
        A = q0Var8;
        q0 q0Var9 = new q0("ENUM", 8, cls, Integer.class, null);
        B = q0Var9;
        q0 q0Var10 = new q0("MESSAGE", 9, Object.class, Object.class, null);
        C = q0Var10;
        D = new q0[]{q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, q0Var9, q0Var10};
    }

    private q0(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f20703q = cls;
        this.f20704r = cls2;
        this.f20705s = obj;
    }

    public static q0[] values() {
        return (q0[]) D.clone();
    }

    public final Class c() {
        return this.f20704r;
    }
}
