package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* compiled from: MyApplication */
final class tt3 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ vt3 f16361a;

    tt3(vt3 vt3Var) {
        Objects.requireNonNull(vt3Var);
        this.f16361a = vt3Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        vt3 vt3Var = this.f16361a;
        synchronized (vt3Var) {
            vt3Var.f(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        vt3 vt3Var = this.f16361a;
        synchronized (vt3Var) {
            vt3Var.f(null);
        }
    }
}
