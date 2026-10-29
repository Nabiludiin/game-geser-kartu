package k3;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: MyApplication */
final class o extends n4.l {

    /* renamed from: b, reason: collision with root package name */
    private final Context f24517b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f24518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g gVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f24518c = gVar;
        this.f24517b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        g gVar = this.f24518c;
        int i8 = gVar.i(this.f24517b);
        if (gVar.m(i8)) {
            this.f24518c.r(this.f24517b, i8);
        }
    }
}
