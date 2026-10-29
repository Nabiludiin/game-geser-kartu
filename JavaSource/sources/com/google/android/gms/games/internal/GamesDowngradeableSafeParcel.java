package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.util.j;

/* compiled from: MyApplication */
public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    protected static boolean P0(Integer num) {
        if (num == null) {
            return false;
        }
        return j.a(num.intValue());
    }
}
