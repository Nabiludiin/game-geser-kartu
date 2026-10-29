package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: MyApplication */
abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f1631a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f1632b = new Object();

    static Bundle a(i.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d8 = aVar.d();
        bundle.putInt("icon", d8 != null ? d8.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(n nVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        for (int i7 = 0; i7 < nVarArr.length; i7++) {
            n nVar = nVarArr[i7];
            bundleArr[i7] = b(null);
        }
        return bundleArr;
    }
}
