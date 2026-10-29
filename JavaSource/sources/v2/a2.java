package v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: MyApplication */
final class a2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f2 f26718a;

    /* synthetic */ a2(f2 f2Var, byte[] bArr) {
        Objects.requireNonNull(f2Var);
        this.f26718a = f2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.f26718a.a0(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f26718a.a0(false);
        }
    }
}
