package com.google.android.gms.internal.measurement;

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
public final class hb {
    public static final hb A;
    private static final /* synthetic */ hb[] B;

    /* renamed from: r, reason: collision with root package name */
    public static final hb f21007r;

    /* renamed from: s, reason: collision with root package name */
    public static final hb f21008s;

    /* renamed from: t, reason: collision with root package name */
    public static final hb f21009t;

    /* renamed from: u, reason: collision with root package name */
    public static final hb f21010u;

    /* renamed from: v, reason: collision with root package name */
    public static final hb f21011v;

    /* renamed from: w, reason: collision with root package name */
    public static final hb f21012w;

    /* renamed from: x, reason: collision with root package name */
    public static final hb f21013x;

    /* renamed from: y, reason: collision with root package name */
    public static final hb f21014y;

    /* renamed from: z, reason: collision with root package name */
    public static final hb f21015z;

    /* renamed from: q, reason: collision with root package name */
    private final Class f21016q;

    static {
        hb hbVar = new hb("VOID", 0, Void.class, Void.class, null);
        f21007r = hbVar;
        Class cls = Integer.TYPE;
        hb hbVar2 = new hb("INT", 1, cls, Integer.class, 0);
        f21008s = hbVar2;
        hb hbVar3 = new hb("LONG", 2, Long.TYPE, Long.class, 0L);
        f21009t = hbVar3;
        hb hbVar4 = new hb("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f21010u = hbVar4;
        hb hbVar5 = new hb("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f21011v = hbVar5;
        hb hbVar6 = new hb("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f21012w = hbVar6;
        hb hbVar7 = new hb("STRING", 6, String.class, String.class, "");
        f21013x = hbVar7;
        hb hbVar8 = new hb("BYTE_STRING", 7, ca.class, ca.class, ca.f20858r);
        f21014y = hbVar8;
        hb hbVar9 = new hb("ENUM", 8, cls, Integer.class, null);
        f21015z = hbVar9;
        hb hbVar10 = new hb("MESSAGE", 9, Object.class, Object.class, null);
        A = hbVar10;
        B = new hb[]{hbVar, hbVar2, hbVar3, hbVar4, hbVar5, hbVar6, hbVar7, hbVar8, hbVar9, hbVar10};
    }

    private hb(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f21016q = cls2;
    }

    public static hb[] values() {
        return (hb[]) B.clone();
    }

    public final Class c() {
        return this.f21016q;
    }
}
