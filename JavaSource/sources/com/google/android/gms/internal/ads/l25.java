package com.google.android.gms.internal.ads;

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
/* compiled from: MyApplication */
public final class l25 {
    public static final l25 A;
    public static final l25 B;
    public static final l25 C;
    public static final l25 D;
    public static final l25 E;
    public static final l25 F;
    public static final l25 G;
    public static final l25 H;
    public static final l25 I;
    public static final l25 J;
    private static final /* synthetic */ l25[] K;

    /* renamed from: s, reason: collision with root package name */
    public static final l25 f11367s;

    /* renamed from: t, reason: collision with root package name */
    public static final l25 f11368t;

    /* renamed from: u, reason: collision with root package name */
    public static final l25 f11369u;

    /* renamed from: v, reason: collision with root package name */
    public static final l25 f11370v;

    /* renamed from: w, reason: collision with root package name */
    public static final l25 f11371w;

    /* renamed from: x, reason: collision with root package name */
    public static final l25 f11372x;

    /* renamed from: y, reason: collision with root package name */
    public static final l25 f11373y;

    /* renamed from: z, reason: collision with root package name */
    public static final l25 f11374z;

    /* renamed from: q, reason: collision with root package name */
    private final m25 f11375q;

    /* renamed from: r, reason: collision with root package name */
    private final int f11376r;

    static {
        l25 l25Var = new l25("DOUBLE", 0, m25.DOUBLE, 1);
        f11367s = l25Var;
        l25 l25Var2 = new l25("FLOAT", 1, m25.FLOAT, 5);
        f11368t = l25Var2;
        m25 m25Var = m25.LONG;
        l25 l25Var3 = new l25("INT64", 2, m25Var, 0);
        f11369u = l25Var3;
        l25 l25Var4 = new l25("UINT64", 3, m25Var, 0);
        f11370v = l25Var4;
        m25 m25Var2 = m25.INT;
        l25 l25Var5 = new l25("INT32", 4, m25Var2, 0);
        f11371w = l25Var5;
        l25 l25Var6 = new l25("FIXED64", 5, m25Var, 1);
        f11372x = l25Var6;
        l25 l25Var7 = new l25("FIXED32", 6, m25Var2, 5);
        f11373y = l25Var7;
        l25 l25Var8 = new l25("BOOL", 7, m25.BOOLEAN, 0);
        f11374z = l25Var8;
        l25 l25Var9 = new l25("STRING", 8, m25.STRING, 2);
        A = l25Var9;
        m25 m25Var3 = m25.MESSAGE;
        l25 l25Var10 = new l25("GROUP", 9, m25Var3, 3);
        B = l25Var10;
        l25 l25Var11 = new l25("MESSAGE", 10, m25Var3, 2);
        C = l25Var11;
        l25 l25Var12 = new l25("BYTES", 11, m25.BYTE_STRING, 2);
        D = l25Var12;
        l25 l25Var13 = new l25("UINT32", 12, m25Var2, 0);
        E = l25Var13;
        l25 l25Var14 = new l25("ENUM", 13, m25.ENUM, 0);
        F = l25Var14;
        l25 l25Var15 = new l25("SFIXED32", 14, m25Var2, 5);
        G = l25Var15;
        l25 l25Var16 = new l25("SFIXED64", 15, m25Var, 1);
        H = l25Var16;
        l25 l25Var17 = new l25("SINT32", 16, m25Var2, 0);
        I = l25Var17;
        l25 l25Var18 = new l25("SINT64", 17, m25Var, 0);
        J = l25Var18;
        K = new l25[]{l25Var, l25Var2, l25Var3, l25Var4, l25Var5, l25Var6, l25Var7, l25Var8, l25Var9, l25Var10, l25Var11, l25Var12, l25Var13, l25Var14, l25Var15, l25Var16, l25Var17, l25Var18};
    }

    private l25(String str, int i7, m25 m25Var, int i8) {
        this.f11375q = m25Var;
        this.f11376r = i8;
    }

    public static l25[] values() {
        return (l25[]) K.clone();
    }

    public final m25 c() {
        return this.f11375q;
    }

    public final int d() {
        return this.f11376r;
    }
}
