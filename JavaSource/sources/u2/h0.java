package u2;

import android.app.Activity;
import android.os.Bundle;
import v2.n1;

/* compiled from: MyApplication */
public final class h0 extends a0 {
    public h0(Activity activity) {
        super(activity);
    }

    @Override // u2.a0, com.google.android.gms.internal.ads.cf0
    public final void x7(Bundle bundle) {
        n1.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.L = 4;
        this.f26489q.finish();
    }
}
