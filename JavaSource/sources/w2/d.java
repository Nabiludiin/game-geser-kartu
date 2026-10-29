package w2;

import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class d extends Thread {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Context f27060q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f27061r;

    d(g gVar, Context context, String str) {
        this.f27060q = context;
        this.f27061r = str;
        Objects.requireNonNull(gVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new v(this.f27060q, null).c(this.f27061r, null);
    }
}
