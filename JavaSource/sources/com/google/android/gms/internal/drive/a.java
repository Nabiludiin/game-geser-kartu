package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.l0;

public final class a extends l0 implements k1 {
    private static volatile r1 zzhk;
    private static final a zzhp;
    private int zzhd;
    private byte zzhi = 2;
    private int zzhe = 1;
    private String zzhm = "";
    private long zzhn = -1;
    private long zzhg = -1;
    private int zzho = -1;

    /* renamed from: com.google.android.gms.internal.drive.a$a, reason: collision with other inner class name */
    public static final class C0079a extends l0.a implements k1 {
        private C0079a() {
            super(a.zzhp);
        }

        public final C0079a q(String str) {
            m();
            ((a) this.f20638r).A(str);
            return this;
        }

        public final C0079a r(long j7) {
            m();
            ((a) this.f20638r).B(j7);
            return this;
        }

        public final C0079a s(long j7) {
            m();
            ((a) this.f20638r).q(j7);
            return this;
        }

        public final C0079a v(int i7) {
            m();
            ((a) this.f20638r).C(1);
            return this;
        }

        public final C0079a w(int i7) {
            m();
            ((a) this.f20638r).D(i7);
            return this;
        }

        /* synthetic */ C0079a(b bVar) {
            this();
        }
    }

    static {
        a aVar = new a();
        zzhp = aVar;
        l0.l(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(String str) {
        str.getClass();
        this.zzhd |= 2;
        this.zzhm = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j7) {
        this.zzhd |= 4;
        this.zzhn = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i7) {
        this.zzhd |= 1;
        this.zzhe = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i7) {
        this.zzhd |= 16;
        this.zzho = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long j7) {
        this.zzhd |= 8;
        this.zzhg = j7;
    }

    public static C0079a w() {
        return (C0079a) zzhp.o();
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.drive.l0$b, com.google.android.gms.internal.drive.r1] */
    @Override // com.google.android.gms.internal.drive.l0
    protected final Object i(int i7, Object obj, Object obj2) {
        r1 r1Var;
        b bVar = null;
        switch (b.f20551a[i7 - 1]) {
            case 1:
                return new a();
            case 2:
                return new C0079a(bVar);
            case 3:
                return l0.j(zzhp, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001Ԅ\u0000\u0002Ԉ\u0001\u0003Ԑ\u0002\u0004Ԑ\u0003\u0005\u0004\u0004", new Object[]{"zzhd", "zzhe", "zzhm", "zzhn", "zzhg", "zzho"});
            case 4:
                return zzhp;
            case 5:
                r1 r1Var2 = zzhk;
                if (r1Var2 != null) {
                    return r1Var2;
                }
                synchronized (a.class) {
                    try {
                        r1 r1Var3 = zzhk;
                        r1Var = r1Var3;
                        if (r1Var3 == null) {
                            ?? bVar2 = new l0.b(zzhp);
                            zzhk = bVar2;
                            r1Var = bVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return r1Var;
            case 6:
                return Byte.valueOf(this.zzhi);
            case 7:
                this.zzhi = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
