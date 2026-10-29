package com.google.android.gms.internal.measurement;

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
public final class ed {
    public static final ed A;
    public static final ed B;
    public static final ed C;
    public static final ed D;
    public static final ed E;
    public static final ed F;
    public static final ed G;
    public static final ed H;
    public static final ed I;
    public static final ed J;
    private static final /* synthetic */ ed[] K;

    /* renamed from: s, reason: collision with root package name */
    public static final ed f20915s;

    /* renamed from: t, reason: collision with root package name */
    public static final ed f20916t;

    /* renamed from: u, reason: collision with root package name */
    public static final ed f20917u;

    /* renamed from: v, reason: collision with root package name */
    public static final ed f20918v;

    /* renamed from: w, reason: collision with root package name */
    public static final ed f20919w;

    /* renamed from: x, reason: collision with root package name */
    public static final ed f20920x;

    /* renamed from: y, reason: collision with root package name */
    public static final ed f20921y;

    /* renamed from: z, reason: collision with root package name */
    public static final ed f20922z;

    /* renamed from: q, reason: collision with root package name */
    private final fd f20923q;

    /* renamed from: r, reason: collision with root package name */
    private final int f20924r;

    static {
        ed edVar = new ed("DOUBLE", 0, fd.DOUBLE, 1);
        f20915s = edVar;
        ed edVar2 = new ed("FLOAT", 1, fd.FLOAT, 5);
        f20916t = edVar2;
        fd fdVar = fd.LONG;
        ed edVar3 = new ed("INT64", 2, fdVar, 0);
        f20917u = edVar3;
        ed edVar4 = new ed("UINT64", 3, fdVar, 0);
        f20918v = edVar4;
        fd fdVar2 = fd.INT;
        ed edVar5 = new ed("INT32", 4, fdVar2, 0);
        f20919w = edVar5;
        ed edVar6 = new ed("FIXED64", 5, fdVar, 1);
        f20920x = edVar6;
        ed edVar7 = new ed("FIXED32", 6, fdVar2, 5);
        f20921y = edVar7;
        ed edVar8 = new ed("BOOL", 7, fd.BOOLEAN, 0);
        f20922z = edVar8;
        ed edVar9 = new ed("STRING", 8, fd.STRING, 2);
        A = edVar9;
        fd fdVar3 = fd.MESSAGE;
        ed edVar10 = new ed("GROUP", 9, fdVar3, 3);
        B = edVar10;
        ed edVar11 = new ed("MESSAGE", 10, fdVar3, 2);
        C = edVar11;
        ed edVar12 = new ed("BYTES", 11, fd.BYTE_STRING, 2);
        D = edVar12;
        ed edVar13 = new ed("UINT32", 12, fdVar2, 0);
        E = edVar13;
        ed edVar14 = new ed("ENUM", 13, fd.ENUM, 0);
        F = edVar14;
        ed edVar15 = new ed("SFIXED32", 14, fdVar2, 5);
        G = edVar15;
        ed edVar16 = new ed("SFIXED64", 15, fdVar, 1);
        H = edVar16;
        ed edVar17 = new ed("SINT32", 16, fdVar2, 0);
        I = edVar17;
        ed edVar18 = new ed("SINT64", 17, fdVar, 0);
        J = edVar18;
        K = new ed[]{edVar, edVar2, edVar3, edVar4, edVar5, edVar6, edVar7, edVar8, edVar9, edVar10, edVar11, edVar12, edVar13, edVar14, edVar15, edVar16, edVar17, edVar18};
    }

    private ed(String str, int i7, fd fdVar, int i8) {
        this.f20923q = fdVar;
        this.f20924r = i8;
    }

    public static ed[] values() {
        return (ed[]) K.clone();
    }

    public final fd c() {
        return this.f20923q;
    }

    public final int d() {
        return this.f20924r;
    }
}
