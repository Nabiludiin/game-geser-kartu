package l2;

import android.content.Context;
import k2.h;
import k2.k;
import k2.w;
import k2.x;
import p3.o;

/* compiled from: MyApplication */
public final class b extends k {
    public b(Context context) {
        super(context, 0);
        o.n(context, "Context cannot be null");
    }

    public h[] getAdSizes() {
        return this.f24420q.j();
    }

    public d getAppEventListener() {
        return this.f24420q.l();
    }

    public w getVideoController() {
        return this.f24420q.B();
    }

    public x getVideoOptions() {
        return this.f24420q.b();
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f24420q.s(hVarArr);
    }

    public void setAppEventListener(d dVar) {
        this.f24420q.u(dVar);
    }

    public void setManualImpressionsEnabled(boolean z7) {
        this.f24420q.v(z7);
    }

    public void setVideoOptions(x xVar) {
        this.f24420q.a(xVar);
    }
}
