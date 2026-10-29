package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class a82 extends b82 {

    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray f4799h;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4800c;

    /* renamed from: d, reason: collision with root package name */
    private final z81 f4801d;

    /* renamed from: e, reason: collision with root package name */
    private final TelephonyManager f4802e;

    /* renamed from: f, reason: collision with root package name */
    private final r72 f4803f;

    /* renamed from: g, reason: collision with root package name */
    private ox f4804g;

    static {
        SparseArray sparseArray = new SparseArray();
        f4799h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), dv.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        dv dvVar = dv.CONNECTING;
        sparseArray.put(ordinal, dvVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), dvVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), dvVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), dv.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        dv dvVar2 = dv.DISCONNECTED;
        sparseArray.put(ordinal2, dvVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), dvVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), dvVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), dvVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), dvVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), dv.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), dvVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), dvVar);
    }

    a82(Context context, z81 z81Var, r72 r72Var, n72 n72Var, v2.p1 p1Var) {
        super(n72Var, p1Var);
        this.f4800c = context;
        this.f4801d = z81Var;
        this.f4803f = r72Var;
        this.f4802e = (TelephonyManager) context.getSystemService("phone");
    }

    static final /* synthetic */ dv f(Bundle bundle) {
        return (dv) f4799h.get(m13.a(m13.a(bundle, "device"), "network").getInt("active_network_state", -1), dv.UNSPECIFIED);
    }

    private static final ox g(boolean z7) {
        return z7 ? ox.ENUM_TRUE : ox.ENUM_FALSE;
    }

    public final void b(boolean z7) {
        p64.r(this.f4801d.a(new Bundle()), new z72(this, z7), cm0.f6506g);
    }

    final /* synthetic */ xu c(Bundle bundle) {
        tu tuVar;
        su e02 = xu.e0();
        int i7 = bundle.getInt("cnt", -2);
        int i8 = bundle.getInt("gnt", 0);
        if (i7 == -1) {
            this.f4804g = ox.ENUM_TRUE;
        } else {
            this.f4804g = ox.ENUM_FALSE;
            if (i7 == 0) {
                e02.E(vu.CELL);
            } else if (i7 != 1) {
                e02.E(vu.NETWORKTYPE_UNSPECIFIED);
            } else {
                e02.E(vu.WIFI);
            }
            switch (i8) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    tuVar = tu.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    tuVar = tu.THREE_G;
                    break;
                case 13:
                    tuVar = tu.LTE;
                    break;
                default:
                    tuVar = tu.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            e02.F(tuVar);
        }
        return (xu) e02.A();
    }

    final /* synthetic */ byte[] d(boolean z7, ArrayList arrayList, xu xuVar, dv dvVar) {
        bv I0 = av.I0();
        I0.P(arrayList);
        Context context = this.f4800c;
        I0.F(g(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        I0.G(r2.t.j().e(context, this.f4802e));
        r72 r72Var = this.f4803f;
        I0.N(r72Var.f());
        I0.O(r72Var.j());
        I0.H(r72Var.d());
        I0.J(dvVar);
        I0.Q(xuVar);
        I0.I(this.f4804g);
        I0.M(g(z7));
        I0.K(r72Var.b());
        I0.L(r2.t.o().a());
        I0.E(g(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return ((av) I0.A()).e();
    }

    final /* synthetic */ r72 e() {
        return this.f4803f;
    }
}
