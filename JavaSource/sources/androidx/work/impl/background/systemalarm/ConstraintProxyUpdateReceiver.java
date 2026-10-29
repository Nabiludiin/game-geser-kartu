package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import e1.j;
import n1.g;

/* compiled from: MyApplication */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final String f3015a = j.f("ConstrntProxyUpdtRecvr");

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Intent f3016q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f3017r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f3018s;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3016q = intent;
            this.f3017r = context;
            this.f3018s = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f3016q.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3016q.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3016q.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3016q.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                j.c().a(ConstraintProxyUpdateReceiver.f3015a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g.a(this.f3017r, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(this.f3017r, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(this.f3017r, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(this.f3017r, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3018s.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z7, boolean z8, boolean z9, boolean z10) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z8).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z10);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            f1.j.k(context).p().b(new a(intent, context, goAsync()));
        } else {
            j.c().a(f3015a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
