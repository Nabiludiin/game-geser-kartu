package e;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.e;

/* compiled from: MyApplication */
public final class d extends a {
    @Override // e.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, e eVar) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
    }

    @Override // e.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i7, Intent intent) {
        return new androidx.activity.result.a(i7, intent);
    }
}
