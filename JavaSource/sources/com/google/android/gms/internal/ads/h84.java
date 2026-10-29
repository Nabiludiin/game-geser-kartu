package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class h84 {

    /* renamed from: a, reason: collision with root package name */
    private final List f9374a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final fh4 f9375b = fh4.f8261b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9376c = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c() {
        Iterator it = this.f9374a.iterator();
        while (it.hasNext()) {
            ((f84) it.next()).d(false);
        }
    }

    public final h84 a(f84 f84Var) {
        if (f84Var.h() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (f84Var.c()) {
            c();
        }
        f84Var.i(this);
        this.f9374a.add(f84Var);
        return this;
    }

    public final n84 b() {
        g84 g84Var;
        int i7;
        j84 j84Var;
        go4 q7;
        g84 g84Var2;
        g84 g84Var3;
        if (this.f9376c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.f9376c = true;
        List<f84> list = this.f9374a;
        eo4 j02 = ho4.j0();
        ArrayList arrayList = new ArrayList(list.size());
        int i8 = 0;
        while (i8 < list.size() - 1) {
            int i9 = i8 + 1;
            g84 g8 = ((f84) list.get(i8)).g();
            g84Var2 = g84.f8698a;
            if (g8 == g84Var2) {
                g84 g9 = ((f84) list.get(i9)).g();
                g84Var3 = g84.f8698a;
                if (g9 != g84Var3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i8 = i9;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (f84 f84Var : list) {
            f84Var.e();
            if (f84Var.g() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            g84 g10 = f84Var.g();
            g84Var = g84.f8698a;
            if (g10 == g84Var) {
                int i10 = 0;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    int i11 = ej4.f7657a;
                    i10 = 0;
                    while (i10 == 0) {
                        byte[] a8 = ui4.a(4);
                        i10 = (a8[3] & 255) | ((a8[0] & 255) << 24) | ((a8[1] & 255) << 16) | ((a8[2] & 255) << 8);
                    }
                }
                i7 = i10;
            } else {
                f84Var.g();
                i7 = 0;
            }
            Integer valueOf = Integer.valueOf(i7);
            if (hashSet.contains(valueOf)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 31);
                sb.append("Id ");
                sb.append(i7);
                sb.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb.toString());
            }
            hashSet.add(valueOf);
            b84 c8 = mh4.a().c(f84Var.f(), true != f84Var.f().a() ? null : valueOf);
            int j7 = n84.j(f84Var.e());
            boolean c9 = f84Var.c();
            j84Var = l84.f11450h;
            l84 l84Var = new l84(c8, j7, i7, c9, false, j84Var, null);
            q7 = n84.q(c8, n84.j(f84Var.e()), i7);
            j02.F(q7);
            if (f84Var.c()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (f84Var.e() != d84.f6978b) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(l84Var);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        j02.E(num.intValue());
        ho4 ho4Var = (ho4) j02.A();
        n84.n(ho4Var);
        return n84.g(new n84(ho4Var, arrayList, this.f9375b, bArr));
    }
}
