package c4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.HashSet;
import java.util.Set;
import l3.f;
import p3.c;
import q4.w;
import y3.b;
import z3.a;

/* compiled from: MyApplication */
public class s extends p3.g {
    private final w I;
    private final String J;
    private PlayerEntity K;
    private GameEntity L;
    private final o M;
    private boolean N;
    private final Binder O;
    private final long P;
    private boolean Q;
    private final b.a R;
    private Bundle S;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MyApplication */
    static abstract class a extends c4.e {

        /* renamed from: q, reason: collision with root package name */
        private final m3.d f3509q;

        a(m3.d dVar) {
            this.f3509q = (m3.d) p3.o.n(dVar, "Holder must not be null");
        }

        final void O(Object obj) {
            this.f3509q.b(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MyApplication */
    static final class b extends e implements l3.h, l3.j {

        /* renamed from: s, reason: collision with root package name */
        private final e4.b f3510s;

        b(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.f3510s = new e4.b(dataHolder);
            } finally {
                dataHolder.close();
            }
        }
    }

    /* compiled from: MyApplication */
    private static final class c extends a {
        c(m3.d dVar) {
            super(dVar);
        }

        @Override // c4.e, c4.g
        public final void i4(int i7, String str) {
            O(new d(i7, str));
        }
    }

    /* compiled from: MyApplication */
    private static final class d implements a.InterfaceC0159a {

        /* renamed from: q, reason: collision with root package name */
        private final Status f3511q;

        /* renamed from: r, reason: collision with root package name */
        private final String f3512r;

        d(int i7, String str) {
            this.f3511q = y3.e.b(i7);
            this.f3512r = str;
        }

        @Override // l3.j
        public final Status x0() {
            return this.f3511q;
        }
    }

    /* compiled from: MyApplication */
    private static abstract class e extends m3.f {
        e(DataHolder dataHolder) {
            super(dataHolder, y3.e.b(dataHolder.Q0()));
        }
    }

    public s(Context context, Looper looper, p3.d dVar, b.a aVar, f.b bVar, f.c cVar) {
        super(context, looper, 1, dVar, bVar, cVar);
        this.I = new r(this);
        this.N = false;
        this.Q = false;
        this.J = dVar.e();
        this.O = new Binder();
        this.M = o.a(this, dVar.d());
        this.P = hashCode();
        this.R = aVar;
        if (aVar.f27690i) {
            return;
        }
        if (dVar.g() != null || (context instanceof Activity)) {
            u0(dVar.g());
        }
    }

    private static void t0(RemoteException remoteException) {
        c4.d.c("GamesGmsClientImpl", "service died", remoteException);
    }

    private static void v0(m3.d dVar, SecurityException securityException) {
        if (dVar != null) {
            dVar.a(y3.c.b(4));
        }
    }

    final void A0() {
        if (a()) {
            try {
                ((k) I()).C4();
            } catch (RemoteException e8) {
                t0(e8);
            }
        }
    }

    @Override // p3.c
    public Bundle C() {
        try {
            Bundle P7 = ((k) I()).P7();
            if (P7 == null) {
                return P7;
            }
            P7.setClassLoader(s.class.getClassLoader());
            this.S = P7;
            return P7;
        } catch (RemoteException e8) {
            t0(e8);
            return null;
        }
    }

    @Override // p3.c
    protected Bundle F() {
        String locale = D().getResources().getConfiguration().locale.toString();
        Bundle b8 = this.R.b();
        b8.putString("com.google.android.gms.games.key.gamePackageName", this.J);
        b8.putString("com.google.android.gms.games.key.desiredLocale", locale);
        b8.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.M.e()));
        b8.putInt("com.google.android.gms.games.key.API_VERSION", 6);
        b8.putBundle("com.google.android.gms.games.key.signInOptions", v4.a.r0(o0()));
        return b8;
    }

    @Override // p3.c
    protected String J() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // p3.c
    protected String K() {
        return "com.google.android.gms.games.service.START";
    }

    @Override // p3.c
    public /* synthetic */ void P(IInterface iInterface) {
        k kVar = (k) iInterface;
        super.P(kVar);
        if (this.N) {
            this.M.g();
            this.N = false;
        }
        b.a aVar = this.R;
        if (aVar.f27683b || aVar.f27690i) {
            return;
        }
        try {
            kVar.N7(new u(new m(this.M.f())), this.P);
        } catch (RemoteException e8) {
            t0(e8);
        }
    }

    @Override // p3.c
    public void Q(k3.b bVar) {
        super.Q(bVar);
        this.N = false;
    }

    @Override // p3.c
    protected void S(int i7, IBinder iBinder, Bundle bundle, int i8) {
        if (i7 == 0 && bundle != null) {
            bundle.setClassLoader(s.class.getClassLoader());
            boolean z7 = bundle.getBoolean("show_welcome_popup");
            this.N = z7;
            this.Q = z7;
            this.K = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            this.L = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.S(i7, iBinder, bundle, i8);
    }

    @Override // p3.c
    public boolean T() {
        return true;
    }

    @Override // p3.g, l3.a.f
    public Set c() {
        return H();
    }

    @Override // p3.c, l3.a.f
    public void e(c.InterfaceC0119c interfaceC0119c) {
        this.K = null;
        this.L = null;
        super.e(interfaceC0119c);
    }

    @Override // p3.c, l3.a.f
    public void h() {
        this.N = false;
        if (a()) {
            try {
                k kVar = (k) I();
                kVar.C4();
                this.I.a();
                kVar.K(this.P);
            } catch (RemoteException unused) {
                c4.d.b("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.h();
    }

    @Override // p3.c, l3.a.f
    public void l(c.e eVar) {
        try {
            x0(new c4.c(eVar));
        } catch (RemoteException unused) {
            eVar.a1();
        }
    }

    @Override // p3.c, l3.a.f
    public int o() {
        return k3.k.f24503a;
    }

    @Override // p3.g
    protected Set p0(Set set) {
        HashSet hashSet = new HashSet(set);
        boolean contains = set.contains(y3.b.f27663d);
        Scope scope = y3.b.f27664e;
        boolean contains2 = set.contains(scope);
        if (set.contains(y3.b.f27667h)) {
            p3.o.r(!contains, "Cannot have both %s and %s!", "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty");
            return hashSet;
        }
        p3.o.r(contains || contains2, "Games APIs requires %s function.", "https://www.googleapis.com/auth/games_lite");
        if (contains2 && contains) {
            hashSet.remove(scope);
        }
        return hashSet;
    }

    public final Intent r0(String str, int i7, int i8) {
        try {
            return ((k) I()).u3(str, i7, i8);
        } catch (RemoteException e8) {
            t0(e8);
            return null;
        }
    }

    final void s0(IBinder iBinder, Bundle bundle) {
        if (a()) {
            try {
                ((k) I()).o6(iBinder, bundle);
            } catch (RemoteException e8) {
                t0(e8);
            }
        }
    }

    @Override // p3.c, l3.a.f
    public boolean t() {
        return this.R.f27693l == null;
    }

    public final void u0(View view) {
        this.M.b(view);
    }

    public final void w0(m3.d dVar, String str, long j7, String str2) {
        try {
            ((k) I()).B4(dVar == null ? null : new c4.b(dVar), str, j7, str2);
        } catch (SecurityException e8) {
            v0(dVar, e8);
        }
    }

    @Override // p3.c
    protected /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new j(iBinder);
    }

    public final void x0(m3.d dVar) {
        this.I.a();
        try {
            ((k) I()).X1(new t(dVar));
        } catch (SecurityException e8) {
            v0(dVar, e8);
        }
    }

    public final void y0(m3.d dVar, String str) {
        try {
            ((k) I()).l2(dVar == null ? null : new c(dVar), str, this.M.e(), this.M.d());
        } catch (SecurityException e8) {
            v0(dVar, e8);
        }
    }

    public final Intent z0() {
        try {
            return ((k) I()).d1();
        } catch (RemoteException e8) {
            t0(e8);
            return null;
        }
    }
}
