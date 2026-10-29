package v2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: MyApplication */
final class x implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Context f26880q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f26881r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ boolean f26882s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f26883t;

    x(y yVar, Context context, String str, boolean z7, boolean z8) {
        this.f26880q = context;
        this.f26881r = str;
        this.f26882s = z7;
        this.f26883t = z8;
        Objects.requireNonNull(yVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        r2.t.g();
        Context context = this.f26880q;
        AlertDialog.Builder o7 = f2.o(context);
        o7.setMessage(this.f26881r);
        if (this.f26882s) {
            o7.setTitle("Error");
        } else {
            o7.setTitle("Info");
        }
        if (this.f26883t) {
            o7.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            o7.setPositiveButton("Learn More", new w(this, context));
            o7.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        o7.create().show();
    }
}
