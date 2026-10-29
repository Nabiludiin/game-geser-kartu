package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ap extends bq {
    public ap(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", akVar, i7, 5);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        ak akVar = this.f5898d;
        akVar.r0(-1L);
        akVar.s0(-1L);
        int[] iArr = (int[]) this.f5899e.invoke(null, this.f5895a.b());
        synchronized (akVar) {
            try {
                akVar.r0(iArr[0]);
                akVar.s0(iArr[1]);
                int i7 = iArr[2];
                if (i7 != Integer.MIN_VALUE) {
                    akVar.S(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
