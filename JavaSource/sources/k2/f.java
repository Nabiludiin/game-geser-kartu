package k2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.k40;
import com.google.android.gms.internal.ads.l40;
import com.google.android.gms.internal.ads.re0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.z10;
import s2.d4;
import s2.f5;
import s2.i3;
import s2.o0;
import s2.r0;
import s2.t4;
import s2.u4;

/* compiled from: MyApplication */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final f5 f24392a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f24393b;

    /* renamed from: c, reason: collision with root package name */
    private final o0 f24394c;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f24395a;

        /* renamed from: b, reason: collision with root package name */
        private final r0 f24396b;

        public a(Context context, String str) {
            Context context2 = (Context) p3.o.n(context, "context cannot be null");
            r0 c8 = s2.z.b().c(context, str, new gb0());
            this.f24395a = context2;
            this.f24396b = c8;
        }

        public f a() {
            try {
                return new f(this.f24395a, this.f24396b.c(), f5.f26092a);
            } catch (RemoteException e8) {
                w2.p.d("Failed to build AdLoader.", e8);
                return new f(this.f24395a, new d4().j8(), f5.f26092a);
            }
        }

        public a b(NativeAd.c cVar) {
            try {
                this.f24396b.Y1(new re0(cVar));
                return this;
            } catch (RemoteException e8) {
                w2.p.g("Failed to add google native ad listener", e8);
                return this;
            }
        }

        public a c(d dVar) {
            try {
                this.f24396b.J5(new t4(dVar));
                return this;
            } catch (RemoteException e8) {
                w2.p.g("Failed to set AdListener.", e8);
                return this;
            }
        }

        public a d(com.google.android.gms.ads.nativead.c cVar) {
            try {
                this.f24396b.k5(new z10(4, cVar.e(), -1, cVar.d(), cVar.a(), cVar.c() != null ? new u4(cVar.c()) : null, cVar.f(), cVar.b(), cVar.g(), cVar.h(), cVar.i() - 1));
                return this;
            } catch (RemoteException e8) {
                w2.p.g("Failed to specify native ad options", e8);
                return this;
            }
        }

        public final a e(n2.n nVar) {
            try {
                this.f24396b.Y1(new l40(nVar));
                return this;
            } catch (RemoteException e8) {
                w2.p.g("Failed to add google native ad listener", e8);
                return this;
            }
        }

        public final a f(String str, n2.l lVar, n2.k kVar) {
            k40 k40Var = new k40(lVar, kVar);
            try {
                this.f24396b.Z3(str, k40Var.a(), k40Var.b());
                return this;
            } catch (RemoteException e8) {
                w2.p.g("Failed to add custom template ad listener", e8);
                return this;
            }
        }

        public final a g(n2.e eVar) {
            try {
                this.f24396b.k5(new z10(eVar));
                return this;
            } catch (RemoteException e8) {
                w2.p.g("Failed to specify native ad options", e8);
                return this;
            }
        }
    }

    f(Context context, o0 o0Var, f5 f5Var) {
        this.f24393b = context;
        this.f24394c = o0Var;
        this.f24392a = f5Var;
    }

    private final void c(final i3 i3Var) {
        Context context = this.f24393b;
        uy.a(context);
        if (((Boolean) u00.f16526c.e()).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.jc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: k2.y
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        f.this.b(i3Var);
                    }
                });
                return;
            }
        }
        try {
            this.f24394c.U0(this.f24392a.a(context, i3Var));
        } catch (RemoteException e8) {
            w2.p.d("Failed to load ad.", e8);
        }
    }

    public void a(g gVar) {
        c(gVar.f24399a);
    }

    final /* synthetic */ void b(i3 i3Var) {
        try {
            this.f24394c.U0(this.f24392a.a(this.f24393b, i3Var));
        } catch (RemoteException e8) {
            w2.p.d("Failed to load ad.", e8);
        }
    }
}
