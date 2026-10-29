package u2;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* compiled from: MyApplication */
final class s extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    final v2.u f26539q;

    /* renamed from: r, reason: collision with root package name */
    boolean f26540r;

    public s(Context context, String str, String str2, String str3) {
        super(context);
        v2.u uVar = new v2.u(context, str);
        this.f26539q = uVar;
        uVar.d(str2);
        uVar.c(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26540r) {
            return false;
        }
        this.f26539q.a(motionEvent);
        return false;
    }
}
