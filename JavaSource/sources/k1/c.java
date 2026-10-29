package k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import e1.j;

/* compiled from: MyApplication */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    private static final String f24351h = j.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f24352g;

    /* compiled from: MyApplication */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, o1.a aVar) {
        super(context, aVar);
        this.f24352g = new a();
    }

    @Override // k1.d
    public void e() {
        j.c().a(f24351h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f24356b.registerReceiver(this.f24352g, g());
    }

    @Override // k1.d
    public void f() {
        j.c().a(f24351h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f24356b.unregisterReceiver(this.f24352g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
