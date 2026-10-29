package p3;

import android.app.Activity;
import android.content.Intent;

/* compiled from: MyApplication */
final class a0 extends c0 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Intent f25112q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Activity f25113r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ int f25114s;

    a0(Intent intent, Activity activity, int i7) {
        this.f25112q = intent;
        this.f25113r = activity;
        this.f25114s = i7;
    }

    @Override // p3.c0
    public final void a() {
        Intent intent = this.f25112q;
        if (intent != null) {
            this.f25113r.startActivityForResult(intent, this.f25114s);
        }
    }
}
