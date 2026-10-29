package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: MyApplication */
public final class xo extends bq {
    public xo(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", akVar, i7, 49);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        ak akVar = this.f5898d;
        akVar.k0(3);
        try {
            int i7 = 1;
            if (true == ((Boolean) this.f5899e.invoke(null, this.f5895a.b())).booleanValue()) {
                i7 = 2;
            }
            akVar.k0(i7);
        } catch (InvocationTargetException e8) {
            if (!(e8.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e8;
            }
        }
    }
}
