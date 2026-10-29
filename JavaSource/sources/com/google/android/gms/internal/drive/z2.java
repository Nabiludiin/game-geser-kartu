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
public class z2 {
    public static final z2 A;
    public static final z2 B;
    public static final z2 C;
    public static final z2 D;
    public static final z2 E;
    public static final z2 F;
    public static final z2 G;
    public static final z2 H;
    public static final z2 I;
    public static final z2 J;
    private static final /* synthetic */ z2[] K;

    /* renamed from: s, reason: collision with root package name */
    public static final z2 f20786s;

    /* renamed from: t, reason: collision with root package name */
    public static final z2 f20787t;

    /* renamed from: u, reason: collision with root package name */
    public static final z2 f20788u;

    /* renamed from: v, reason: collision with root package name */
    public static final z2 f20789v;

    /* renamed from: w, reason: collision with root package name */
    public static final z2 f20790w;

    /* renamed from: x, reason: collision with root package name */
    public static final z2 f20791x;

    /* renamed from: y, reason: collision with root package name */
    public static final z2 f20792y;

    /* renamed from: z, reason: collision with root package name */
    public static final z2 f20793z;

    /* renamed from: q, reason: collision with root package name */
    private final e3 f20794q;

    /* renamed from: r, reason: collision with root package name */
    private final int f20795r;

    static {
        z2 z2Var = new z2("DOUBLE", 0, e3.DOUBLE, 1);
        f20786s = z2Var;
        z2 z2Var2 = new z2("FLOAT", 1, e3.FLOAT, 5);
        f20787t = z2Var2;
        e3 e3Var = e3.LONG;
        final int i7 = 2;
        z2 z2Var3 = new z2("INT64", 2, e3Var, 0);
        f20788u = z2Var3;
        final int i8 = 3;
        z2 z2Var4 = new z2("UINT64", 3, e3Var, 0);
        f20789v = z2Var4;
        e3 e3Var2 = e3.INT;
        z2 z2Var5 = new z2("INT32", 4, e3Var2, 0);
        f20790w = z2Var5;
        z2 z2Var6 = new z2("FIXED64", 5, e3Var, 1);
        f20791x = z2Var6;
        z2 z2Var7 = new z2("FIXED32", 6, e3Var2, 5);
        f20792y = z2Var7;
        z2 z2Var8 = new z2("BOOL", 7, e3.BOOLEAN, 0);
        f20793z = z2Var8;
        final e3 e3Var3 = e3.STRING;
        final String str = "STRING";
        final int i9 = 8;
        z2 z2Var9 = new z2(str, i9, e3Var3, i7) { // from class: com.google.android.gms.internal.drive.a3
            {
                int i10 = 2;
                int i11 = 8;
            }
        };
        A = z2Var9;
        final e3 e3Var4 = e3.MESSAGE;
        final String str2 = "GROUP";
        final int i10 = 9;
        z2 z2Var10 = new z2(str2, i10, e3Var4, i8) { // from class: com.google.android.gms.internal.drive.b3
            {
                int i11 = 3;
                int i12 = 9;
            }
        };
        B = z2Var10;
        final String str3 = "MESSAGE";
        final int i11 = 10;
        final int i12 = 2;
        z2 z2Var11 = new z2(str3, i11, e3Var4, i12) { // from class: com.google.android.gms.internal.drive.c3
            {
                int i13 = 2;
                int i14 = 10;
            }
        };
        C = z2Var11;
        final e3 e3Var5 = e3.BYTE_STRING;
        final String str4 = "BYTES";
        final int i13 = 11;
        z2 z2Var12 = new z2(str4, i13, e3Var5, i12) { // from class: com.google.android.gms.internal.drive.d3
            {
                int i14 = 2;
                int i15 = 11;
            }
        };
        D = z2Var12;
        z2 z2Var13 = new z2("UINT32", 12, e3Var2, 0);
        E = z2Var13;
        z2 z2Var14 = new z2("ENUM", 13, e3.ENUM, 0);
        F = z2Var14;
        z2 z2Var15 = new z2("SFIXED32", 14, e3Var2, 5);
        G = z2Var15;
        z2 z2Var16 = new z2("SFIXED64", 15, e3Var, 1);
        H = z2Var16;
        z2 z2Var17 = new z2("SINT32", 16, e3Var2, 0);
        I = z2Var17;
        z2 z2Var18 = new z2("SINT64", 17, e3Var, 0);
        J = z2Var18;
        K = new z2[]{z2Var, z2Var2, z2Var3, z2Var4, z2Var5, z2Var6, z2Var7, z2Var8, z2Var9, z2Var10, z2Var11, z2Var12, z2Var13, z2Var14, z2Var15, z2Var16, z2Var17, z2Var18};
    }

    private z2(String str, int i7, e3 e3Var, int i8) {
        this.f20794q = e3Var;
        this.f20795r = i8;
    }

    public static z2[] values() {
        return (z2[]) K.clone();
    }

    public final e3 c() {
        return this.f20794q;
    }
}
