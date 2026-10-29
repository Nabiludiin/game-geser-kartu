package t4;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.p5;
import com.google.android.gms.measurement.internal.w6;

/* compiled from: MyApplication */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final m f26415a;

    public n(m mVar) {
        p3.o.m(mVar);
        this.f26415a = mVar;
    }

    public final void a(Context context, Intent intent) {
        w6 O = w6.O(context, null, null);
        p5 a8 = O.a();
        if (intent == null) {
            a8.r().a("Receiver called with null intent");
            return;
        }
        O.c();
        String action = intent.getAction();
        a8.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                a8.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            a8.w().a("Starting wakeful intent.");
            this.f26415a.a(context, className);
        }
    }
}
