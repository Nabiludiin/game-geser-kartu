package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
final class vy4 implements i15 {

    /* renamed from: a, reason: collision with root package name */
    private final uy4 f17921a;

    /* renamed from: b, reason: collision with root package name */
    private int f17922b;

    /* renamed from: c, reason: collision with root package name */
    private int f17923c;

    /* renamed from: d, reason: collision with root package name */
    private int f17924d = 0;

    private vy4(uy4 uy4Var) {
        c05.a(uy4Var, "input");
        this.f17921a = uy4Var;
        uy4Var.f17270d = this;
    }

    private final void O(int i7) {
        if ((this.f17922b & 7) != i7) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
    }

    private final void P(Object obj, n15 n15Var, ez4 ez4Var) {
        uy4 uy4Var = this.f17921a;
        int y7 = uy4Var.y();
        uy4Var.f();
        int E = uy4Var.E(y7);
        uy4Var.f17267a++;
        n15Var.l(obj, this, ez4Var);
        uy4Var.l(0);
        uy4Var.f17267a--;
        uy4Var.a(E);
    }

    private final Object Q(n15 n15Var, ez4 ez4Var) {
        Object a8 = n15Var.a();
        P(a8, n15Var, ez4Var);
        n15Var.e(a8);
        return a8;
    }

    private final void R(Object obj, n15 n15Var, ez4 ez4Var) {
        int i7 = this.f17923c;
        this.f17923c = ((this.f17922b >>> 3) << 3) | 4;
        try {
            n15Var.l(obj, this, ez4Var);
            if (this.f17922b == this.f17923c) {
            } else {
                throw new e05("Failed to parse the message.");
            }
        } finally {
            this.f17923c = i7;
        }
    }

    private final Object S(l25 l25Var, Class cls, ez4 ez4Var) {
        l25 l25Var2 = l25.f11367s;
        switch (l25Var.ordinal()) {
            case 0:
                return Double.valueOf(c());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(g());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(l());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return o();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                O(2);
                return Q(f15.a().b(cls), ez4Var);
            case 11:
                return m();
            case 12:
                return Integer.valueOf(w());
            case 13:
                return Integer.valueOf(p());
            case 14:
                return Integer.valueOf(r());
            case 15:
                return Long.valueOf(t());
            case 16:
                return Integer.valueOf(z());
            case 17:
                return Long.valueOf(G());
        }
    }

    private final void T(int i7) {
        if (this.f17921a.c() != i7) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void U(int i7) {
        if ((i7 & 3) != 0) {
            throw new e05("Failed to parse the message.");
        }
    }

    private static final void V(int i7) {
        if ((i7 & 7) != 0) {
            throw new e05("Failed to parse the message.");
        }
    }

    public static vy4 W(uy4 uy4Var) {
        Object obj = uy4Var.f17270d;
        return obj != null ? (vy4) obj : new vy4(uy4Var);
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void A(Object obj, n15 n15Var, ez4 ez4Var) {
        O(2);
        P(obj, n15Var, ez4Var);
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void B(List list) {
        int k7;
        int i7;
        if (list instanceof j05) {
            j05 j05Var = (j05) list;
            int i8 = this.f17922b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int c8 = uy4Var.c() + uy4Var.y();
                do {
                    j05Var.f(uy4Var.D());
                } while (uy4Var.c() < c8);
                T(c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                j05Var.f(uy4Var2.D());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int c9 = uy4Var3.c() + uy4Var3.y();
                do {
                    list.add(Long.valueOf(uy4Var3.D()));
                } while (uy4Var3.c() < c9);
                T(c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Long.valueOf(uy4Var4.D()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void C(List list) {
        int k7;
        int i7;
        if (list instanceof j05) {
            j05 j05Var = (j05) list;
            int i8 = this.f17922b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int c8 = uy4Var.c() + uy4Var.y();
                do {
                    j05Var.f(uy4Var.p());
                } while (uy4Var.c() < c8);
                T(c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                j05Var.f(uy4Var2.p());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int c9 = uy4Var3.c() + uy4Var3.y();
                do {
                    list.add(Long.valueOf(uy4Var3.p()));
                } while (uy4Var3.c() < c9);
                T(c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Long.valueOf(uy4Var4.p()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void D(List list) {
        int k7;
        int i7;
        if (list instanceof tz4) {
            tz4 tz4Var = (tz4) list;
            int i8 = this.f17922b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int c8 = uy4Var.c() + uy4Var.y();
                do {
                    tz4Var.I(uy4Var.y());
                } while (uy4Var.c() < c8);
                T(c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                tz4Var.I(uy4Var2.y());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int c9 = uy4Var3.c() + uy4Var3.y();
                do {
                    list.add(Integer.valueOf(uy4Var3.y()));
                } while (uy4Var3.c() < c9);
                T(c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Integer.valueOf(uy4Var4.y()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void E(List list) {
        int k7;
        int i7;
        if (list instanceof j05) {
            j05 j05Var = (j05) list;
            int i8 = this.f17922b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int c8 = uy4Var.c() + uy4Var.y();
                do {
                    j05Var.f(uy4Var.q());
                } while (uy4Var.c() < c8);
                T(c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                j05Var.f(uy4Var2.q());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int c9 = uy4Var3.c() + uy4Var3.y();
                do {
                    list.add(Long.valueOf(uy4Var3.q()));
                } while (uy4Var3.c() < c9);
                T(c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Long.valueOf(uy4Var4.q()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void F(List list, n15 n15Var, ez4 ez4Var) {
        int k7;
        int i7 = this.f17922b;
        if ((i7 & 7) != 2) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(Q(n15Var, ez4Var));
            uy4 uy4Var = this.f17921a;
            if (uy4Var.b() || this.f17924d != 0) {
                return;
            } else {
                k7 = uy4Var.k();
            }
        } while (k7 == i7);
        this.f17924d = k7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final long G() {
        O(0);
        return this.f17921a.D();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void H(List list) {
        int k7;
        if ((this.f17922b & 7) != 2) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(m());
            uy4 uy4Var = this.f17921a;
            if (uy4Var.b()) {
                return;
            } else {
                k7 = uy4Var.k();
            }
        } while (k7 == this.f17922b);
        this.f17924d = k7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void I(List list) {
        int k7;
        int i7;
        if (list instanceof tz4) {
            tz4 tz4Var = (tz4) list;
            int i8 = this.f17922b & 7;
            if (i8 == 2) {
                uy4 uy4Var = this.f17921a;
                int y7 = uy4Var.y();
                U(y7);
                int c8 = uy4Var.c() + y7;
                do {
                    tz4Var.I(uy4Var.A());
                } while (uy4Var.c() < c8);
                return;
            }
            if (i8 != 5) {
                throw new d05("Protocol message tag had invalid wire type.");
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                tz4Var.I(uy4Var2.A());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 == 2) {
                uy4 uy4Var3 = this.f17921a;
                int y8 = uy4Var3.y();
                U(y8);
                int c9 = uy4Var3.c() + y8;
                do {
                    list.add(Integer.valueOf(uy4Var3.A()));
                } while (uy4Var3.c() < c9);
                return;
            }
            if (i9 != 5) {
                throw new d05("Protocol message tag had invalid wire type.");
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Integer.valueOf(uy4Var4.A()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void J(List list, n15 n15Var, ez4 ez4Var) {
        int k7;
        int i7 = this.f17922b;
        if ((i7 & 7) != 3) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
        do {
            Object a8 = n15Var.a();
            R(a8, n15Var, ez4Var);
            n15Var.e(a8);
            list.add(a8);
            uy4 uy4Var = this.f17921a;
            if (uy4Var.b() || this.f17924d != 0) {
                return;
            } else {
                k7 = uy4Var.k();
            }
        } while (k7 == i7);
        this.f17924d = k7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void K(List list) {
        int k7;
        int i7;
        if (list instanceof j05) {
            j05 j05Var = (j05) list;
            int i8 = this.f17922b & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int y7 = uy4Var.y();
                V(y7);
                int c8 = uy4Var.c() + y7;
                do {
                    j05Var.f(uy4Var.s());
                } while (uy4Var.c() < c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                j05Var.f(uy4Var2.s());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int y8 = uy4Var3.y();
                V(y8);
                int c9 = uy4Var3.c() + y8;
                do {
                    list.add(Long.valueOf(uy4Var3.s()));
                } while (uy4Var3.c() < c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Long.valueOf(uy4Var4.s()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void L(List list) {
        int k7;
        int i7;
        if (list instanceof tz4) {
            tz4 tz4Var = (tz4) list;
            int i8 = this.f17922b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int c8 = uy4Var.c() + uy4Var.y();
                do {
                    tz4Var.I(uy4Var.z());
                } while (uy4Var.c() < c8);
                T(c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                tz4Var.I(uy4Var2.z());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int c9 = uy4Var3.c() + uy4Var3.y();
                do {
                    list.add(Integer.valueOf(uy4Var3.z()));
                } while (uy4Var3.c() < c9);
                T(c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Integer.valueOf(uy4Var4.z()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void M(List list) {
        int k7;
        int i7;
        if (list instanceof tz4) {
            tz4 tz4Var = (tz4) list;
            int i8 = this.f17922b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int c8 = uy4Var.c() + uy4Var.y();
                do {
                    tz4Var.I(uy4Var.r());
                } while (uy4Var.c() < c8);
                T(c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                tz4Var.I(uy4Var2.r());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int c9 = uy4Var3.c() + uy4Var3.y();
                do {
                    list.add(Integer.valueOf(uy4Var3.r()));
                } while (uy4Var3.c() < c9);
                T(c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Integer.valueOf(uy4Var4.r()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    public final void N(List list, boolean z7) {
        int k7;
        if ((this.f17922b & 7) != 2) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(z7 ? o() : n());
            uy4 uy4Var = this.f17921a;
            if (uy4Var.b()) {
                return;
            } else {
                k7 = uy4Var.k();
            }
        } while (k7 == this.f17922b);
        this.f17924d = k7;
    }

    public final boolean X() {
        int i7;
        uy4 uy4Var = this.f17921a;
        if (uy4Var.b() || (i7 = this.f17922b) == this.f17923c) {
            return false;
        }
        return uy4Var.m(i7);
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void a(List list) {
        int k7;
        int i7;
        if (list instanceof tz4) {
            tz4 tz4Var = (tz4) list;
            int i8 = this.f17922b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int c8 = uy4Var.c() + uy4Var.y();
                do {
                    tz4Var.I(uy4Var.C());
                } while (uy4Var.c() < c8);
                T(c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                tz4Var.I(uy4Var2.C());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int c9 = uy4Var3.c() + uy4Var3.y();
                do {
                    list.add(Integer.valueOf(uy4Var3.C()));
                } while (uy4Var3.c() < c9);
                T(c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Integer.valueOf(uy4Var4.C()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final int b() {
        int i7 = this.f17924d;
        if (i7 != 0) {
            this.f17922b = i7;
            this.f17924d = 0;
        } else {
            i7 = this.f17921a.k();
            this.f17922b = i7;
        }
        if (i7 == 0 || i7 == this.f17923c) {
            return Integer.MAX_VALUE;
        }
        return i7 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final double c() {
        O(1);
        return this.f17921a.n();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final int d() {
        return this.f17922b;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final float e() {
        O(5);
        return this.f17921a.o();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final long f() {
        O(0);
        return this.f17921a.p();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final long g() {
        O(0);
        return this.f17921a.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        r9.f17921a.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.ads.i15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.Map r10, com.google.android.gms.internal.ads.n05 r11, com.google.android.gms.internal.ads.ez4 r12) {
        /*
            r9 = this;
            r0 = 2
            r9.O(r0)
            com.google.android.gms.internal.ads.uy4 r1 = r9.f17921a
            int r2 = r1.y()
            int r2 = r1.E(r2)
            java.lang.Object r3 = r11.f12536d
            java.lang.Object r4 = r11.f12534b
            r5 = r3
        L13:
            int r6 = r9.b()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5b
            boolean r7 = r1.b()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L5b
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L46
            if (r6 == r0) goto L3b
            boolean r6 = r9.X()     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.google.android.gms.internal.ads.e05 r6 = new com.google.android.gms.internal.ads.e05     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
            throw r6     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
        L37:
            r10 = move-exception
            goto L64
        L39:
            r6 = move-exception
            goto L4e
        L3b:
            com.google.android.gms.internal.ads.l25 r6 = r11.f12535c     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
            java.lang.Object r5 = r9.S(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
            goto L13
        L46:
            com.google.android.gms.internal.ads.l25 r6 = r11.f12533a     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
            r7 = 0
            java.lang.Object r4 = r9.S(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.d05 -> L39
            goto L13
        L4e:
            boolean r7 = r9.X()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L55
            goto L13
        L55:
            com.google.android.gms.internal.ads.e05 r10 = new com.google.android.gms.internal.ads.e05     // Catch: java.lang.Throwable -> L37
            r10.<init>(r8, r6)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L5b:
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.uy4 r10 = r9.f17921a
            r10.a(r2)
            return
        L64:
            com.google.android.gms.internal.ads.uy4 r11 = r9.f17921a
            r11.a(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vy4.h(java.util.Map, com.google.android.gms.internal.ads.n05, com.google.android.gms.internal.ads.ez4):void");
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final long i() {
        O(1);
        return this.f17921a.s();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final int j() {
        O(0);
        return this.f17921a.r();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final boolean k() {
        O(0);
        return this.f17921a.u();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final int l() {
        O(5);
        return this.f17921a.t();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final qy4 m() {
        O(2);
        return this.f17921a.x();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final String n() {
        O(2);
        return this.f17921a.v();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final String o() {
        O(2);
        return this.f17921a.w();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final int p() {
        O(0);
        return this.f17921a.z();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void q(List list) {
        int k7;
        int i7 = this.f17922b & 7;
        if (i7 == 2) {
            uy4 uy4Var = this.f17921a;
            int y7 = uy4Var.y();
            U(y7);
            int c8 = uy4Var.c() + y7;
            do {
                list.add(Float.valueOf(uy4Var.o()));
            } while (uy4Var.c() < c8);
            return;
        }
        if (i7 != 5) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
        do {
            uy4 uy4Var2 = this.f17921a;
            list.add(Float.valueOf(uy4Var2.o()));
            if (uy4Var2.b()) {
                return;
            } else {
                k7 = uy4Var2.k();
            }
        } while (k7 == this.f17922b);
        this.f17924d = k7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final int r() {
        O(5);
        return this.f17921a.A();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void s(List list) {
        int k7;
        int i7 = this.f17922b & 7;
        if (i7 == 0) {
            do {
                uy4 uy4Var = this.f17921a;
                list.add(Boolean.valueOf(uy4Var.u()));
                if (uy4Var.b()) {
                    return;
                } else {
                    k7 = uy4Var.k();
                }
            } while (k7 == this.f17922b);
            this.f17924d = k7;
            return;
        }
        if (i7 != 2) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
        uy4 uy4Var2 = this.f17921a;
        int c8 = uy4Var2.c() + uy4Var2.y();
        do {
            list.add(Boolean.valueOf(uy4Var2.u()));
        } while (uy4Var2.c() < c8);
        T(c8);
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final long t() {
        O(1);
        return this.f17921a.B();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void u(Object obj, n15 n15Var, ez4 ez4Var) {
        O(3);
        R(obj, n15Var, ez4Var);
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void v(List list) {
        int k7;
        int i7;
        if (list instanceof j05) {
            j05 j05Var = (j05) list;
            int i8 = this.f17922b & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var = this.f17921a;
                int y7 = uy4Var.y();
                V(y7);
                int c8 = uy4Var.c() + y7;
                do {
                    j05Var.f(uy4Var.B());
                } while (uy4Var.c() < c8);
                return;
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                j05Var.f(uy4Var2.B());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new d05("Protocol message tag had invalid wire type.");
                }
                uy4 uy4Var3 = this.f17921a;
                int y8 = uy4Var3.y();
                V(y8);
                int c9 = uy4Var3.c() + y8;
                do {
                    list.add(Long.valueOf(uy4Var3.B()));
                } while (uy4Var3.c() < c9);
                return;
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Long.valueOf(uy4Var4.B()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final int w() {
        O(0);
        return this.f17921a.y();
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void x(List list) {
        int k7;
        int i7 = this.f17922b & 7;
        if (i7 == 1) {
            do {
                uy4 uy4Var = this.f17921a;
                list.add(Double.valueOf(uy4Var.n()));
                if (uy4Var.b()) {
                    return;
                } else {
                    k7 = uy4Var.k();
                }
            } while (k7 == this.f17922b);
            this.f17924d = k7;
            return;
        }
        if (i7 != 2) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
        uy4 uy4Var2 = this.f17921a;
        int y7 = uy4Var2.y();
        V(y7);
        int c8 = uy4Var2.c() + y7;
        do {
            list.add(Double.valueOf(uy4Var2.n()));
        } while (uy4Var2.c() < c8);
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final void y(List list) {
        int k7;
        int i7;
        if (list instanceof tz4) {
            tz4 tz4Var = (tz4) list;
            int i8 = this.f17922b & 7;
            if (i8 == 2) {
                uy4 uy4Var = this.f17921a;
                int y7 = uy4Var.y();
                U(y7);
                int c8 = uy4Var.c() + y7;
                do {
                    tz4Var.I(uy4Var.t());
                } while (uy4Var.c() < c8);
                return;
            }
            if (i8 != 5) {
                throw new d05("Protocol message tag had invalid wire type.");
            }
            do {
                uy4 uy4Var2 = this.f17921a;
                tz4Var.I(uy4Var2.t());
                if (uy4Var2.b()) {
                    return;
                } else {
                    i7 = uy4Var2.k();
                }
            } while (i7 == this.f17922b);
        } else {
            int i9 = this.f17922b & 7;
            if (i9 == 2) {
                uy4 uy4Var3 = this.f17921a;
                int y8 = uy4Var3.y();
                U(y8);
                int c9 = uy4Var3.c() + y8;
                do {
                    list.add(Integer.valueOf(uy4Var3.t()));
                } while (uy4Var3.c() < c9);
                return;
            }
            if (i9 != 5) {
                throw new d05("Protocol message tag had invalid wire type.");
            }
            do {
                uy4 uy4Var4 = this.f17921a;
                list.add(Integer.valueOf(uy4Var4.t()));
                if (uy4Var4.b()) {
                    return;
                } else {
                    k7 = uy4Var4.k();
                }
            } while (k7 == this.f17922b);
            i7 = k7;
        }
        this.f17924d = i7;
    }

    @Override // com.google.android.gms.internal.ads.i15
    public final int z() {
        O(0);
        return this.f17921a.C();
    }
}
