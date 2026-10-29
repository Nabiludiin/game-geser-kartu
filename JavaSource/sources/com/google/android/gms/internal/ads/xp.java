package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xp extends bq {
    public xp(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", akVar, i7, 48);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        ak akVar = this.f5898d;
        akVar.j0(3);
        boolean booleanValue = ((Boolean) this.f5899e.invoke(null, this.f5895a.b())).booleanValue();
        synchronized (akVar) {
            try {
                if (booleanValue) {
                    akVar.j0(2);
                } else {
                    akVar.j0(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
