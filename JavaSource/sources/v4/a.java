package v4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import l3.f;
import p3.c;
import p3.j0;
import p3.o;

/* compiled from: MyApplication */
public class a extends p3.g implements u4.e {
    public static final /* synthetic */ int M = 0;
    private final boolean I;
    private final p3.d J;
    private final Bundle K;
    private final Integer L;

    public a(Context context, Looper looper, boolean z7, p3.d dVar, Bundle bundle, f.b bVar, f.c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.I = true;
        this.J = dVar;
        this.K = bundle;
        this.L = dVar.i();
    }

    public static Bundle r0(p3.d dVar) {
        dVar.h();
        Integer i7 = dVar.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (i7 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i7.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // p3.c
    protected final Bundle F() {
        if (!D().getPackageName().equals(this.J.e())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.e());
        }
        return this.K;
    }

    @Override // p3.c
    protected final String J() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p3.c
    protected final String K() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // u4.e
    public final void i(p3.j jVar, boolean z7) {
        try {
            ((g) I()).D2(jVar, ((Integer) o.m(this.L)).intValue(), z7);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // u4.e
    public final void n(f fVar) {
        o.n(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b8 = this.J.b();
            ((g) I()).H2(new j(1, new j0(b8, ((Integer) o.m(this.L)).intValue(), "<<default account>>".equals(b8.name) ? i3.a.a(D()).b() : null)), fVar);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.x2(new l(1, new k3.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    @Override // p3.c, l3.a.f
    public final int o() {
        return k3.k.f24503a;
    }

    @Override // u4.e
    public final void q() {
        try {
            ((g) I()).C1(((Integer) o.m(this.L)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // p3.c, l3.a.f
    public final boolean t() {
        return this.I;
    }

    @Override // u4.e
    public final void u() {
        e(new c.d());
    }

    @Override // p3.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
