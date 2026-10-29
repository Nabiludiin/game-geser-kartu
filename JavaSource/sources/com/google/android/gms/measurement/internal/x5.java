package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: MyApplication */
final class x5 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final pd f22844a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22845b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22846c;

    x5(pd pdVar) {
        p3.o.m(pdVar);
        this.f22844a = pdVar;
    }

    public final void a() {
        pd pdVar = this.f22844a;
        pdVar.O0();
        pdVar.b().h();
        if (this.f22845b) {
            return;
        }
        pdVar.e().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f22846c = pdVar.E0().m();
        pdVar.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f22846c));
        this.f22845b = true;
    }

    public final void b() {
        pd pdVar = this.f22844a;
        pdVar.O0();
        pdVar.b().h();
        pdVar.b().h();
        if (this.f22845b) {
            pdVar.a().w().a("Unregistering connectivity change receiver");
            this.f22845b = false;
            this.f22846c = false;
            try {
                pdVar.e().unregisterReceiver(this);
            } catch (IllegalArgumentException e8) {
                this.f22844a.a().o().b("Failed to unregister the network broadcast receiver", e8);
            }
        }
    }

    final /* synthetic */ pd c() {
        return this.f22844a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        pd pdVar = this.f22844a;
        pdVar.O0();
        String action = intent.getAction();
        pdVar.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            pdVar.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m7 = pdVar.E0().m();
        if (this.f22846c != m7) {
            this.f22846c = m7;
            pdVar.b().t(new w5(this, m7));
        }
    }
}
