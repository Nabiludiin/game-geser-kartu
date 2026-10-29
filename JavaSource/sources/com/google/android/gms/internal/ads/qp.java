package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: MyApplication */
public final class qp extends bq {
    public qp(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", akVar, i7, 73);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        try {
            int i7 = 1;
            boolean booleanValue = ((Boolean) this.f5899e.invoke(null, this.f5895a.b())).booleanValue();
            ak akVar = this.f5898d;
            if (true == booleanValue) {
                i7 = 2;
            }
            akVar.m0(i7);
        } catch (InvocationTargetException unused) {
            this.f5898d.m0(3);
        }
    }
}
