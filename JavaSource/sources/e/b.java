package e;

import android.content.Context;
import android.content.Intent;
import e.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class b extends a {
    static Intent e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // e.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        return e(strArr);
    }

    @Override // e.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a.C0083a b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new a.C0083a(Collections.EMPTY_MAP);
        }
        r.a aVar = new r.a();
        boolean z7 = true;
        for (String str : strArr) {
            boolean z8 = androidx.core.content.a.a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z8));
            if (!z8) {
                z7 = false;
            }
        }
        if (z7) {
            return new a.C0083a(aVar);
        }
        return null;
    }

    @Override // e.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map c(int i7, Intent intent) {
        if (i7 != -1) {
            return Collections.EMPTY_MAP;
        }
        if (intent == null) {
            return Collections.EMPTY_MAP;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i8 = 0; i8 < length; i8++) {
            hashMap.put(stringArrayExtra[i8], Boolean.valueOf(intArrayExtra[i8] == 0));
        }
        return hashMap;
    }
}
