package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class f40 extends n2.g {

    /* renamed from: a, reason: collision with root package name */
    private final e40 f8025a;

    /* renamed from: c, reason: collision with root package name */
    private final m20 f8027c;

    /* renamed from: b, reason: collision with root package name */
    private final List f8026b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final k2.w f8028d = new k2.w();

    /* renamed from: e, reason: collision with root package name */
    private final List f8029e = new ArrayList();

    public f40(e40 e40Var) {
        l20 l20Var;
        this.f8025a = e40Var;
        m20 m20Var = null;
        try {
            List e8 = e40Var.e();
            if (e8 != null) {
                for (Object obj : e8) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        l20Var = queryLocalInterface instanceof l20 ? (l20) queryLocalInterface : new j20(iBinder);
                    } else {
                        l20Var = null;
                    }
                    if (l20Var != null) {
                        this.f8026b.add(new m20(l20Var));
                    }
                }
            }
        } catch (RemoteException e9) {
            w2.p.d("", e9);
        }
        try {
            List x7 = this.f8025a.x();
            if (x7 != null) {
                for (Object obj2 : x7) {
                    s2.g2 j8 = obj2 instanceof IBinder ? s2.f2.j8((IBinder) obj2) : null;
                    if (j8 != null) {
                        this.f8029e.add(new s2.h2(j8));
                    }
                }
            }
        } catch (RemoteException e10) {
            w2.p.d("", e10);
        }
        try {
            l20 g8 = this.f8025a.g();
            if (g8 != null) {
                m20Var = new m20(g8);
            }
        } catch (RemoteException e11) {
            w2.p.d("", e11);
        }
        this.f8027c = m20Var;
        try {
            if (this.f8025a.m() != null) {
                new f20(this.f8025a.m());
            }
        } catch (RemoteException e12) {
            w2.p.d("", e12);
        }
    }

    @Override // n2.g
    public final String a() {
        try {
            return this.f8025a.c();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // n2.g
    public final List b() {
        return this.f8026b;
    }

    @Override // n2.g
    public final String c() {
        try {
            return this.f8025a.f();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // n2.g
    public final n2.d d() {
        return this.f8027c;
    }

    @Override // n2.g
    public final String e() {
        try {
            return this.f8025a.j();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // n2.g
    public final String f() {
        try {
            return this.f8025a.i();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // n2.g
    public final Double g() {
        try {
            double l7 = this.f8025a.l();
            if (l7 == -1.0d) {
                return null;
            }
            return Double.valueOf(l7);
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // n2.g
    public final String h() {
        try {
            return this.f8025a.k();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // n2.g
    public final String i() {
        try {
            return this.f8025a.n();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // n2.g
    public final k2.w j() {
        try {
            e40 e40Var = this.f8025a;
            if (e40Var.o() != null) {
                this.f8028d.b(e40Var.o());
            }
        } catch (RemoteException e8) {
            w2.p.d("Exception occurred while getting video controller", e8);
        }
        return this.f8028d;
    }

    @Override // n2.g
    public final Object k() {
        try {
            w3.a z7 = this.f8025a.z();
            if (z7 != null) {
                return w3.b.r0(z7);
            }
            return null;
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }
}
