package com.google.android.gms.common.util;

import android.os.StrictMode;

/* compiled from: MyApplication */
public abstract class x {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (n.j()) {
            StrictMode.setVmPolicy(w.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
