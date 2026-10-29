package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: MyApplication */
public final class n84 implements xg4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f12630a;

    /* renamed from: b, reason: collision with root package name */
    private final fh4 f12631b;

    /* renamed from: c, reason: collision with root package name */
    private final n84 f12632c;

    /* synthetic */ n84(ho4 ho4Var, List list, fh4 fh4Var, byte[] bArr) {
        this(ho4Var, list, fh4Var);
    }

    static final n84 a(ho4 ho4Var) {
        n(ho4Var);
        return new n84(ho4Var, l(ho4Var), fh4.f8261b);
    }

    public static final n84 e(s84 s84Var) {
        h84 h84Var = new h84();
        f84 f84Var = new f84(s84Var, null);
        f84Var.b();
        f84Var.a();
        h84Var.a(f84Var);
        return h84Var.b();
    }

    static /* synthetic */ n84 g(final n84 n84Var) {
        final fh4 fh4Var = n84Var.f12631b;
        if (fh4Var.a()) {
            return n84Var;
        }
        j84 j84Var = new j84() { // from class: com.google.android.gms.internal.ads.m84
            @Override // com.google.android.gms.internal.ads.j84
            public final /* synthetic */ void a(l84 l84Var) {
                qh4.a().b().a(n84.this, fh4Var, "keyset_handle", "get_key");
            }
        };
        List<l84> list = n84Var.f12630a;
        ArrayList arrayList = new ArrayList(list.size());
        for (l84 l84Var : list) {
            arrayList.add(new l84(l84Var.f(), l84Var.j(), l84Var.g(), l84Var.h(), l84Var.i(), j84Var, null));
        }
        return new n84(arrayList, fh4Var, n84Var);
    }

    static /* synthetic */ int j(d84 d84Var) {
        if (d84.f6978b.equals(d84Var)) {
            return 3;
        }
        if (d84.f6979c.equals(d84Var)) {
            return 4;
        }
        if (d84.f6980d.equals(d84Var)) {
            return 5;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static List l(ho4 ho4Var) {
        b84 ch4Var;
        boolean z7;
        j84 j84Var;
        ArrayList arrayList = new ArrayList(ho4Var.f0());
        for (go4 go4Var : ho4Var.e0()) {
            int f02 = go4Var.f0();
            try {
                ri4 o7 = o(go4Var);
                wh4 a8 = wh4.a();
                w84 a9 = w84.a();
                ch4Var = !a8.f(o7) ? new ch4(o7, a9) : a8.g(o7, a9);
                z7 = false;
            } catch (GeneralSecurityException e8) {
                if (lf4.f11602a.a()) {
                    throw e8;
                }
                ch4Var = new ch4(o(go4Var), w84.a());
                z7 = true;
            }
            if (lf4.f11602a.a() && !p(go4Var.m0())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z8 = true;
            int m02 = go4Var.m0();
            if (f02 != ho4Var.d0()) {
                z8 = false;
            }
            j84Var = l84.f11450h;
            arrayList.add(new l84(ch4Var, m02, f02, z8, z7, j84Var, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final n84 m() {
        n84 n84Var = this.f12632c;
        return n84Var == null ? this : n84Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(ho4 ho4Var) {
        if (ho4Var == null || ho4Var.f0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static ri4 o(go4 go4Var) {
        return ri4.a(go4Var.e0().d0(), go4Var.e0().e0(), go4Var.e0().f0(), go4Var.g0(), go4Var.g0() == uo4.RAW ? null : Integer.valueOf(go4Var.f0()));
    }

    private static boolean p(int i7) {
        int i8 = i7 - 2;
        return i8 == 1 || i8 == 2 || i8 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static go4 q(b84 b84Var, int i7, int i8) {
        ri4 ri4Var = (ri4) wh4.a().h(b84Var, ri4.class, w84.a());
        Integer f8 = ri4Var.f();
        if (f8 != null && f8.intValue() != i8) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        fo4 h02 = go4.h0();
        vn4 g02 = xn4.g0();
        g02.E(ri4Var.g());
        g02.F(ri4Var.b());
        g02.G(ri4Var.c());
        h02.F(g02);
        h02.I(i7);
        h02.G(i8);
        h02.H(ri4Var.d());
        return (go4) h02.A();
    }

    final ho4 b() {
        try {
            eo4 j02 = ho4.j0();
            for (l84 l84Var : this.f12630a) {
                j02.F(q(l84Var.a(), l84Var.j(), l84Var.c()));
                if (l84Var.d()) {
                    j02.E(l84Var.c());
                }
            }
            return (ho4) j02.A();
        } catch (GeneralSecurityException e8) {
            throw new dj4(e8);
        }
    }

    public final l84 c() {
        for (l84 l84Var : this.f12630a) {
            if (l84Var != null && l84Var.d()) {
                if (l84Var.b() == d84.f6978b) {
                    return l84Var;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final l84 d(int i7) {
        if (i7 < 0 || i7 >= h()) {
            int h8 = h();
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 34 + String.valueOf(h8).length());
            sb.append("Invalid index ");
            sb.append(i7);
            sb.append(" for keyset of size ");
            sb.append(h8);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.f12630a;
        l84 l84Var = (l84) list.get(i7);
        if (!p(l84Var.j())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i7);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!l84Var.i()) {
            return (l84) list.get(i7);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i7);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    public final Object f(y74 y74Var, Class cls) {
        if (!(y74Var instanceof lg4)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        lg4 lg4Var = (lg4) y74Var;
        ho4 b8 = m().b();
        int i7 = z84.f20069a;
        int d02 = b8.d0();
        boolean z7 = true;
        int i8 = 0;
        boolean z8 = false;
        for (go4 go4Var : b8.e0()) {
            if (go4Var.m0() == 3) {
                if (!go4Var.d0()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(go4Var.f0())));
                }
                if (go4Var.g0() == uo4.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(go4Var.f0())));
                }
                if (go4Var.m0() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(go4Var.f0())));
                }
                if (go4Var.f0() == d02) {
                    if (z8) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z8 = true;
                }
                z7 &= go4Var.e0().f0() == wn4.ASYMMETRIC_PUBLIC;
                i8++;
            }
        }
        if (i8 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z8 && !z7) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i9 = 0; i9 < h(); i9++) {
            List list = this.f12630a;
            if (((l84) list.get(i9)).i() || !p(((l84) list.get(i9)).j())) {
                String d03 = b8.g0(i9).e0().d0();
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 44 + String.valueOf(d03).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i9);
                sb.append(" and type_url ");
                sb.append(d03);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return lg4Var.a(m(), this.f12631b, cls);
    }

    @Override // com.google.android.gms.internal.ads.xg4
    public final int h() {
        return this.f12630a.size();
    }

    public final String toString() {
        ho4 b8 = b();
        int i7 = z84.f20069a;
        io4 d02 = lo4.d0();
        d02.E(b8.d0());
        for (go4 go4Var : b8.e0()) {
            jo4 d03 = ko4.d0();
            d03.E(go4Var.e0().d0());
            d03.H(go4Var.m0());
            d03.G(go4Var.g0());
            d03.F(go4Var.f0());
            d02.F((ko4) d03.A());
        }
        return ((lo4) d02.A()).toString();
    }

    private n84(List list, fh4 fh4Var, n84 n84Var) {
        this.f12630a = list;
        this.f12631b = fh4Var;
        this.f12632c = n84Var;
    }

    private n84(ho4 ho4Var, List list, fh4 fh4Var) {
        this.f12630a = list;
        this.f12631b = fh4Var;
        if (lf4.f11602a.a()) {
            HashSet hashSet = new HashSet();
            for (go4 go4Var : ho4Var.e0()) {
                if (!hashSet.contains(Integer.valueOf(go4Var.f0()))) {
                    hashSet.add(Integer.valueOf(go4Var.f0()));
                } else {
                    int f02 = go4Var.f0();
                    StringBuilder sb = new StringBuilder(String.valueOf(f02).length() + 121);
                    sb.append("KeyID ");
                    sb.append(f02);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            if (!hashSet.contains(Integer.valueOf(ho4Var.d0()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.f12632c = null;
    }
}
