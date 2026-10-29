package v2;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.Objects;

/* compiled from: MyApplication */
final class w implements DialogInterface.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Context f26874q;

    w(x xVar, Context context) {
        this.f26874q = context;
        Objects.requireNonNull(xVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        r2.t.g();
        f2.B(this.f26874q, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
