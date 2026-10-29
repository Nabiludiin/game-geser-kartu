package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tu0 extends or0 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e9->B:43:0x00eb, LOOP_START, PHI: r0
  0x00e9: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003d, B:43:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tu0.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.or0
    public final jn0 k(jn0 jn0Var) {
        int i7 = jn0Var.f10655c;
        if (i7 != 3) {
            if (i7 == 2) {
                return jn0.f10652e;
            }
            if (i7 != 268435456 && i7 != 21 && i7 != 1342177280 && i7 != 22 && i7 != 1610612736 && i7 != 4) {
                throw new lp0("Unhandled input format:", jn0Var);
            }
        }
        return new jn0(jn0Var.f10653a, jn0Var.f10654b, 2);
    }
}
