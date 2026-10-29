package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: MyApplication */
public final class o0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f24835a;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f24836b;

    public o0(n0 n0Var) {
        this.f24836b = n0Var;
    }

    public final void a(Context context) {
        this.f24835a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f24835a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f24835a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f24836b.a();
            b();
        }
    }
}
