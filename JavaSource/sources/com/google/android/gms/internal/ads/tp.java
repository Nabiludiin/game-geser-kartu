package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final StackTraceElement[] f16276h;

    public tp(ko koVar, String str, String str2, ak akVar, int i7, int i8, StackTraceElement[] stackTraceElementArr) {
        super(koVar, "ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", akVar, i7, 45);
        this.f16276h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.f16276h;
        if (stackTraceElementArr != null) {
            zn znVar = new zn((String) this.f5899e.invoke(null, stackTraceElementArr));
            ak akVar = this.f5898d;
            synchronized (akVar) {
                try {
                    akVar.G(znVar.f20231b.longValue());
                    if (znVar.f20232c.booleanValue()) {
                        akVar.l0(true != znVar.f20233d.booleanValue() ? 2 : 1);
                    } else {
                        akVar.l0(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
