package v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.uy;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public final class j1 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f26780d;

    /* renamed from: e, reason: collision with root package name */
    private Context f26781e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26779c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f26778b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f26777a = new i1(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f26778b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((BroadcastReceiver) arrayList.get(i7)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(Context context) {
        try {
            if (this.f26779c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f26781e = applicationContext;
            if (applicationContext == null) {
                this.f26781e = context;
            }
            uy.a(this.f26781e);
            this.f26780d = ((Boolean) s2.b0.c().d(uy.f17194r4)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) s2.b0.c().d(uy.ac)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f26781e.registerReceiver(this.f26777a, intentFilter);
            } else {
                this.f26781e.registerReceiver(this.f26777a, intentFilter, 4);
            }
            this.f26779c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f26780d) {
            this.f26778b.put(broadcastReceiver, intentFilter);
            return;
        }
        uy.a(context);
        if (!((Boolean) s2.b0.c().d(uy.ac)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f26780d) {
            this.f26778b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
