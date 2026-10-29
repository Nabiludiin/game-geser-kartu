package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import e1.j;
import e1.l;
import e1.t;

/* compiled from: MyApplication */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3062a = j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.c().a(f3062a, "Requesting diagnostics", new Throwable[0]);
        try {
            t.d(context).b(l.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e8) {
            j.c().b(f3062a, "WorkManager is not initialized", e8);
        }
    }
}
