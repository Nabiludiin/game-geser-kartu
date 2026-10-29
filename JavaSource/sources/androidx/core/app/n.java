package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: MyApplication */
public abstract class n {

    /* compiled from: MyApplication */
    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(n nVar) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(n nVar) {
        return a.b(nVar);
    }

    static RemoteInput[] b(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nVarArr.length];
        for (int i7 = 0; i7 < nVarArr.length; i7++) {
            n nVar = nVarArr[i7];
            remoteInputArr[i7] = a(null);
        }
        return remoteInputArr;
    }
}
