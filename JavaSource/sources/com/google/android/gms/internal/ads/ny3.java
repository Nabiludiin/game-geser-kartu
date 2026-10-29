package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: MyApplication */
public abstract class ny3 {
    public static jy3 a(jy3 jy3Var) {
        return !(jy3Var instanceof my3) ? jy3Var instanceof ky3 ? jy3Var : jy3Var instanceof Serializable ? new ky3(jy3Var) : new my3(jy3Var) : jy3Var;
    }
}
