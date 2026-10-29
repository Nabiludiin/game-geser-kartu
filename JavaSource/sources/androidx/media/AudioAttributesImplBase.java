package androidx.media;

import java.util.Arrays;

/* compiled from: MyApplication */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f2562a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f2563b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f2564c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f2565d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f2563b;
    }

    public int b() {
        int i7 = this.f2564c;
        int c8 = c();
        if (c8 == 6) {
            i7 |= 4;
        } else if (c8 == 7) {
            i7 |= 1;
        }
        return i7 & 273;
    }

    public int c() {
        int i7 = this.f2565d;
        return i7 != -1 ? i7 : AudioAttributesCompat.a(false, this.f2564c, this.f2562a);
    }

    public int d() {
        return this.f2562a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f2563b == audioAttributesImplBase.a() && this.f2564c == audioAttributesImplBase.b() && this.f2562a == audioAttributesImplBase.d() && this.f2565d == audioAttributesImplBase.f2565d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2563b), Integer.valueOf(this.f2564c), Integer.valueOf(this.f2562a), Integer.valueOf(this.f2565d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2565d != -1) {
            sb.append(" stream=");
            sb.append(this.f2565d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f2562a));
        sb.append(" content=");
        sb.append(this.f2563b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2564c).toUpperCase());
        return sb.toString();
    }
}
