package com.google.android.gms.internal.play_billing;

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
public final class m4 {
    public static final m4 A;
    private static final /* synthetic */ m4[] B;

    /* renamed from: r, reason: collision with root package name */
    public static final m4 f21677r;

    /* renamed from: s, reason: collision with root package name */
    public static final m4 f21678s;

    /* renamed from: t, reason: collision with root package name */
    public static final m4 f21679t;

    /* renamed from: u, reason: collision with root package name */
    public static final m4 f21680u;

    /* renamed from: v, reason: collision with root package name */
    public static final m4 f21681v;

    /* renamed from: w, reason: collision with root package name */
    public static final m4 f21682w;

    /* renamed from: x, reason: collision with root package name */
    public static final m4 f21683x;

    /* renamed from: y, reason: collision with root package name */
    public static final m4 f21684y;

    /* renamed from: z, reason: collision with root package name */
    public static final m4 f21685z;

    /* renamed from: q, reason: collision with root package name */
    private final Class f21686q;

    static {
        m4 m4Var = new m4("VOID", 0, Void.class, Void.class, null);
        f21677r = m4Var;
        Class cls = Integer.TYPE;
        m4 m4Var2 = new m4("INT", 1, cls, Integer.class, 0);
        f21678s = m4Var2;
        m4 m4Var3 = new m4("LONG", 2, Long.TYPE, Long.class, 0L);
        f21679t = m4Var3;
        m4 m4Var4 = new m4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f21680u = m4Var4;
        m4 m4Var5 = new m4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f21681v = m4Var5;
        m4 m4Var6 = new m4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f21682w = m4Var6;
        m4 m4Var7 = new m4("STRING", 6, String.class, String.class, "");
        f21683x = m4Var7;
        m4 m4Var8 = new m4("BYTE_STRING", 7, i3.class, i3.class, i3.f21564r);
        f21684y = m4Var8;
        m4 m4Var9 = new m4("ENUM", 8, cls, Integer.class, null);
        f21685z = m4Var9;
        m4 m4Var10 = new m4("MESSAGE", 9, Object.class, Object.class, null);
        A = m4Var10;
        B = new m4[]{m4Var, m4Var2, m4Var3, m4Var4, m4Var5, m4Var6, m4Var7, m4Var8, m4Var9, m4Var10};
    }

    private m4(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f21686q = cls2;
    }

    public static m4[] values() {
        return (m4[]) B.clone();
    }

    public final Class c() {
        return this.f21686q;
    }
}
