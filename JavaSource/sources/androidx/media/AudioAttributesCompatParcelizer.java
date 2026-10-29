package androidx.media;

import androidx.versionedparcelable.a;

/* compiled from: MyApplication */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f2559a = (AudioAttributesImpl) aVar.v(audioAttributesCompat.f2559a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(audioAttributesCompat.f2559a, 1);
    }
}
