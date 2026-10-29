package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.kb0;
import s2.u1;
import s2.y3;

/* compiled from: MyApplication */
public class LiteSdkInfo extends u1 {
    public LiteSdkInfo(Context context) {
    }

    @Override // s2.v1
    public kb0 getAdapterCreator() {
        return new gb0();
    }

    @Override // s2.v1
    public y3 getLiteSdkVersion() {
        return new y3(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.7.0");
    }
}
