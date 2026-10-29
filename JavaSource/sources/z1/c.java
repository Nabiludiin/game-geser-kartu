package z1;

import android.content.Context;

/* compiled from: MyApplication */
final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27819a;

    /* renamed from: b, reason: collision with root package name */
    private final i2.a f27820b;

    /* renamed from: c, reason: collision with root package name */
    private final i2.a f27821c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27822d;

    c(Context context, i2.a aVar, i2.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f27819a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f27820b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f27821c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f27822d = str;
    }

    @Override // z1.h
    public Context b() {
        return this.f27819a;
    }

    @Override // z1.h
    public String c() {
        return this.f27822d;
    }

    @Override // z1.h
    public i2.a d() {
        return this.f27821c;
    }

    @Override // z1.h
    public i2.a e() {
        return this.f27820b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f27819a.equals(hVar.b()) && this.f27820b.equals(hVar.e()) && this.f27821c.equals(hVar.d()) && this.f27822d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f27819a.hashCode() ^ 1000003) * 1000003) ^ this.f27820b.hashCode()) * 1000003) ^ this.f27821c.hashCode()) * 1000003) ^ this.f27822d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f27819a + ", wallClock=" + this.f27820b + ", monotonicClock=" + this.f27821c + ", backendName=" + this.f27822d + "}";
    }
}
