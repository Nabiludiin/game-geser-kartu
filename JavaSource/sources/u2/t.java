package u2;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.mr0;

/* compiled from: MyApplication */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f26541a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f26542b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f26543c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f26544d;

    public t(mr0 mr0Var) {
        this.f26542b = mr0Var.getLayoutParams();
        ViewParent parent = mr0Var.getParent();
        this.f26544d = mr0Var.S();
        if (!(parent instanceof ViewGroup)) {
            throw new r("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f26543c = viewGroup;
        this.f26541a = viewGroup.indexOfChild(mr0Var.Z());
        viewGroup.removeView(mr0Var.Z());
        mr0Var.q1(true);
    }
}
