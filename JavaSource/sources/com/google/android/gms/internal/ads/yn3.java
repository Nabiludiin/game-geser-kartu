package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: MyApplication */
final class yn3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final Map f19694f;

    yn3(ak akVar, dn3 dn3Var, Map map, nu3 nu3Var) {
        super("xLMBD0ZYDeFbDZVCzCownSP8NNmORP0EKF5jeEnOGlb2W22XICiCfQYSI28gi51p", "CL6HTaJ4+bHVCQXLR1XCftwOp39gWYfgPib+AnvHUWA=", akVar, dn3Var, nu3Var.a(118));
        this.f19694f = map;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        Map map = this.f19694f;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (akVar) {
            try {
                akVar.t0(((Long) objArr[0]).longValue());
                long longValue = ((Long) objArr[1]).longValue();
                if (longValue >= 0) {
                    akVar.a0(longValue);
                }
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 >= 0) {
                    akVar.b0(longValue2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
