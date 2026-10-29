package v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: MyApplication */
final class i1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j1 f26775a;

    i1(j1 j1Var) {
        Objects.requireNonNull(j1Var);
        this.f26775a = j1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f26775a.d(context, intent);
    }
}
