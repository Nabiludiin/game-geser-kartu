package k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import e1.j;

/* compiled from: MyApplication */
public class f extends d {

    /* renamed from: j, reason: collision with root package name */
    static final String f24362j = j.f("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f24363g;

    /* renamed from: h, reason: collision with root package name */
    private b f24364h;

    /* renamed from: i, reason: collision with root package name */
    private a f24365i;

    /* compiled from: MyApplication */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            j.c().a(f.f24362j, "Network broadcast received", new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }
    }

    /* compiled from: MyApplication */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.c().a(f.f24362j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.c().a(f.f24362j, "Network connection lost", new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }
    }

    public f(Context context, o1.a aVar) {
        super(context, aVar);
        this.f24363g = (ConnectivityManager) this.f24356b.getSystemService("connectivity");
        if (j()) {
            this.f24364h = new b();
        } else {
            this.f24365i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // k1.d
    public void e() {
        if (!j()) {
            j.c().a(f24362j, "Registering broadcast receiver", new Throwable[0]);
            this.f24356b.registerReceiver(this.f24365i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            j.c().a(f24362j, "Registering network callback", new Throwable[0]);
            this.f24363g.registerDefaultNetworkCallback(this.f24364h);
        } catch (IllegalArgumentException | SecurityException e8) {
            j.c().b(f24362j, "Received exception while registering network callback", e8);
        }
    }

    @Override // k1.d
    public void f() {
        if (!j()) {
            j.c().a(f24362j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f24356b.unregisterReceiver(this.f24365i);
            return;
        }
        try {
            j.c().a(f24362j, "Unregistering network callback", new Throwable[0]);
            this.f24363g.unregisterNetworkCallback(this.f24364h);
        } catch (IllegalArgumentException | SecurityException e8) {
            j.c().b(f24362j, "Received exception while unregistering network callback", e8);
        }
    }

    i1.b g() {
        NetworkInfo activeNetworkInfo = this.f24363g.getActiveNetworkInfo();
        boolean z7 = false;
        boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i7 = i();
        boolean a8 = androidx.core.net.a.a(this.f24363g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z7 = true;
        }
        return new i1.b(z8, i7, a8, z7);
    }

    @Override // k1.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public i1.b b() {
        return g();
    }

    boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.f24363g.getNetworkCapabilities(this.f24363g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e8) {
            j.c().b(f24362j, "Unable to validate active network", e8);
            return false;
        }
    }
}
