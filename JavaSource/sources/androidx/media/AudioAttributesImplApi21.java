package androidx.media;

import android.media.AudioAttributes;

/* compiled from: MyApplication */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f2560a;

    /* renamed from: b, reason: collision with root package name */
    int f2561b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2560a.equals(((AudioAttributesImplApi21) obj).f2560a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2560a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2560a;
    }
}
